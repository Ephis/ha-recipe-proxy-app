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

## Fullscreen Mode (Hiding Home Assistant Header)

By default, the add-on displays within Home Assistant's interface, which includes the sidebar and header navigation. If you want a fullscreen experience without the Home Assistant header, you have the following options:

1. **Kiosk Mode HACS Integration** - Install the [kiosk-mode](https://github.com/NemesisRE/kiosk-mode) integration from HACS to hide the header and sidebar for specific users or panels.

2. **Browser Kiosk Mode** - Access Home Assistant in your browser's kiosk or fullscreen mode (F11 in most browsers).

3. **Direct Access** - If your recipe application is accessible on your network, you can access it directly without going through Home Assistant's ingress.

## Requirements

- Your recipe application must be running and accessible on your network
- The URL must be reachable from the Home Assistant host

## Getting Help

If you have issues with this add-on, please visit the [GitHub repository](https://github.com/Ephis/ha-recipe-proxy-app/issues) to submit an issue.
