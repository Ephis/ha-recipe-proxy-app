server {
    listen 5000 default_server;

    include /etc/nginx/includes/server_params.conf;

    allow   172.30.32.2;
    deny    all;

    location / {
        # Proxy to backend
        proxy_pass {{ .server }}/;

        # Set headers
        proxy_set_header X-Ingress-Path {{ .entry }};
        {{ if .proxy_pass_host }}
        proxy_set_header Host $http_host;
        {{ end }}
        {{ if .proxy_pass_real_ip }}
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Real-IP $remote_addr;
        {{ end }}

        # Disable compression so sub_filter works
        proxy_set_header Accept-Encoding "";

        # Rewrite absolute paths in responses
        sub_filter_types text/html text/css text/javascript application/javascript;
        sub_filter 'href="/' 'href="{{ .entry }}/';
        sub_filter 'src="/' 'src="{{ .entry }}/';
        sub_filter "href='/" "href='{{ .entry }}/";
        sub_filter "src='/" "src='{{ .entry }}/";
        sub_filter 'url(/' 'url({{ .entry }}/';
        sub_filter "url('/" "url('{{ .entry }}/";
        sub_filter 'url("/' 'url("{{ .entry }}/';
        sub_filter_once off;

        include /etc/nginx/includes/proxy_params.conf;
    }
}
