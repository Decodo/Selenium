<p align="center">
    <a href="https://decodo.com/"><img src="https://github.com/user-attachments/assets/209d01f2-3931-4e77-a6f3-0028b1ee2b72"></a>
  </a>
</p>

<p align="center">
    <a href="https://github.com/Decodo/Decodo"> Main Repository </a>
</p>

### Disclaimer

Selenium is a browser automation tool. This repository only covers Selenium setup for the Node.js (Javascript) programming language.

To continue further development with this tool, make sure to read the official Selenium [documentation](https://github.com/SeleniumHQ/selenium/tree/master/javascript/node/selenium-webdriver).

*Unfortunately, Selenium itself doesn't support `username:password` authentication for `HTTP/HTTPs` proxies; therefore you'll need to have your IP whitelisted.*

You can do that by following the guidelines listed [here](https://help.decodo.com/docs/residential-authentication-methods).

### Prerequisites

- [Node](https://nodejs.org/en/download/)
- [Selenium](https://github.com/SeleniumHQ/selenium/tree/master/javascript/node/selenium-webdriver#installation)

Optional:
- [Chrome WebDriver](https://www.npmjs.com/package/chromedriver#building-and-installing)
- [Firefox WebDriver](https://www.npmjs.com/package/geckodriver#install)

You'll need to install at least one of the above WebDrivers in the [Installation](#installation) part.

### Installation

1. Once you have all the required prerequisites ready, create your project folder:

```
mkdir node_selenium
cd node_selenium
npm init
npm install selenium-webdriver
```
<img width="364" alt="image" src="https://github.com/user-attachments/assets/01f682e9-a429-4f9b-bc5b-5883c529cb4c" />

2. When the project directory is set up, you'll need to install one of the WebDrivers from the [Prerequisites](#prerequisites) section.

*Firefox*

<img width="312" alt="image" src="https://github.com/user-attachments/assets/4936486c-f432-4087-9647-13eda8bd7f17" />

*Chrome*

<img width="335" alt="image" src="https://github.com/user-attachments/assets/10d9911a-f822-45ac-8dee-3c50aead3bc0" />

3. Download the example script according to the WebDriver you are using with one of these commands: 

*Firefox*

```curl https://raw.githubusercontent.com/Decodo/Selenium/master/nodejs/firefox/example.js > example.js```

*Chrome*

```curl https://raw.githubusercontent.com/Decodo/Selenium/master/nodejs/chrome/example.js > example.js```

4. Your project folder should now be populated with the *example.js* file.

### Configuration

To configure the example script with a different endpoint, simply edit the `let addr =` line in within punctuation marks('') as in the example:

<img width="573" alt="image" src="https://github.com/user-attachments/assets/be0d025c-48ee-4290-b06b-2a65b7295e24" />

You can test the script by running the `node example.js` command while in your project folder.

A browser window will appear with the targeted website, and a proxy IP should be visible in the console output:

<img width="684" alt="image" src="https://github.com/user-attachments/assets/e008dd28-7df3-4c6b-ab3e-94384b06e8b4" />

## Need help?
Email - sales@decodo.com
<br><a href="https://direct.lc.chat/12092754/">Live chat 24/7</a>
