server {
    listen 5000 default_server;

    include /etc/nginx/includes/server_params.conf;

    allow   172.30.32.2;
    deny    all;

    location / {
        # Proxy to backend
        proxy_pass {{ .server }};

        # Set headers
        proxy_set_header X-Ingress-Path {{ .entry }};
        {{ if .proxy_pass_host }}
        proxy_set_header Host $http_host;
        {{ end }}
        {{ if .proxy_pass_real_ip }}
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Real-IP $remote_addr;
        {{ end }}

        # Disable compression for sub_filter to work
        proxy_set_header Accept-Encoding "";

        # Buffer the response
        proxy_buffering on;
        proxy_buffer_size 128k;
        proxy_buffers 8 128k;

        # Use sub_filter to rewrite paths (built into nginx core)
        sub_filter_types text/html;
        sub_filter_once off;
        sub_filter_last_modified off;

        # Replace Angular base href tag
        sub_filter '<base href="/">' '<base href="{{ .entry }}/">';
        sub_filter '<base href="/angular/">' '<base href="{{ .entry }}/">';

        # Rewrite absolute paths in HTML
        sub_filter 'src="/' 'src="{{ .entry }}/';
        sub_filter 'href="/' 'href="{{ .entry }}/';
        sub_filter "src='/" "src='{{ .entry }}/";
        sub_filter "href='/" "href='{{ .entry }}/";

        include /etc/nginx/includes/proxy_params.conf;
    }
}
