# Home Assistant Recipe Proxy Add-on

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

## About

This add-on creates a proxy to a recipe application server run separately from Home Assistant so that you can have the benefit of access in the sidebar without running your recipe app as an add-on.

**Note:** This add-on does not run your recipe application itself. It only provides a proxy to an existing recipe application running elsewhere on your network.

## Installation

1. Add this repository to your Home Assistant add-on store
2. Install the "Recipe Proxy" add-on
3. Configure the add-on with your recipe application's URL
4. Start the add-on
5. Access your recipe application through the Home Assistant sidebar

## Configuration

**server:** The URL of your recipe application server (e.g., `http://recipe-app.local:8080` or `https://192.168.1.100:8080`)

**proxy_pass_host:** Forward the Home Assistant hostname to your recipe application. Set to `false` if your recipe application is behind an SSL proxy like Traefik or Caddy. (Default: `true`)

**proxy_pass_real_ip:** Forward the client's real IP address to your recipe application. Set to `false` if your recipe application restricts access based on IP addresses through an upstream proxy. (Default: `true`)

## Support

For issues, please visit the [GitHub repository](https://github.com/Ephis/ha-recipe-proxy-app/issues).

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
