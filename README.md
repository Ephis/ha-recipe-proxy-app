# Home Assistant Recipe Proxy Add-on Repository

This repository contains a Home Assistant add-on that provides a proxy to local recipe applications.

## Add-ons

This repository contains the following add-on:

### [Recipe Proxy](./recipe_proxy)

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

A proxy to access your local recipe application through the Home Assistant sidebar.

## Installation

1. Navigate to the **Add-on Store** in your Home Assistant instance
2. Click the menu icon (three dots) in the top right corner
3. Select **Repositories**
4. Add this repository URL: `https://github.com/Ephis/ha-recipe-proxy-app`
5. Find "Recipe Proxy" in the add-on store and install it

## Configuration

After installation, configure the add-on with:
- **server**: The URL of your recipe application (e.g., `http://recipe-app.local:8080`)
- **proxy_pass_host**: Forward hostname to your app (default: `true`)
- **proxy_pass_real_ip**: Forward client IP addresses (default: `true`)

## Support

For issues and questions, please use the [GitHub Issues](https://github.com/Ephis/ha-recipe-proxy-app/issues).

## License

MIT License - see LICENSE file for details

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
