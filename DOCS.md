# Configuration

This add-on creates a proxy to a recipe application server running separately from Home Assistant, allowing you to access it through the Home Assistant sidebar.

**Note:** This add-on does not run your recipe application itself. It only provides a proxy to an existing instance.

## Options

### Option: `server`

The URL of your recipe application server. This should include the protocol (http or https), hostname or IP address, and port number.

**Format:** `http[s]://host:port`

**Examples:**
- `http://recipe-app.local:8080`
- `http://192.168.1.100:8080`
- `https://192.168.1.100:443`

### Option: `proxy_pass_host`

This option determines whether to forward the Home Assistant hostname to your recipe application server.

**Default:** `true`

Set this to `false` if your recipe application is behind an SSL proxy like Traefik or Caddy.

### Option: `proxy_pass_real_ip`

This option determines whether to forward the client's real IP address to your recipe application server.

**Default:** `true`

Set this to `false` if your recipe application restricts access based on specific IP addresses through an upstream proxy.

## Requirements

- Your recipe application must be running and accessible on your network
- The URL must be reachable from the Home Assistant host

## Getting Help

If you have issues with this add-on, please visit the [GitHub repository](https://github.com/Ephis/ha-recipe-proxy-app/issues) to submit an issue.
