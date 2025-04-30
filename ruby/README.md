<p align="center">
    <a href="https://decodo.com/"><img src="https://github.com/user-attachments/assets/209d01f2-3931-4e77-a6f3-0028b1ee2b72"></a>
  </a>
</p>

<p align="center">
    <a href="https://github.com/Decodo/Decodo"> Main Repository </a>
</p>

### Disclaimer

Selenium is a browser automation tool. This particular repository only covers Selenium setup for the Ruby programming language.

To continue further development with this tool, read the official Selenium [documentation](https://ruby-doc.org/).

*Unfortunately, Selenium itself doesn't support `username:password` authentication for `HTTP/HTTPs` proxies; therefore, you'll need to have your IP whitelisted.*

You can do that by following the guidelines listed [here](https://help.decodo.com/docs/proxy-authentication).

### Prerequisites

- [Ruby](https://www.ruby-lang.org/en/)
- [Selenium](https://rubygems.org/gems/selenium-webdriver)

### Installation

1. Once you have all the required prerequisites ready, create your project folder:

```
mkdir selenium_ruby
cd selenium_ruby
```
<img width="263" alt="image" src="https://github.com/user-attachments/assets/5b6c6d06-f5d0-4d14-aa9c-a9fcbbcb1feb" />

2. When the project directory is set up, you can now download one of the example scripts for proxy setup with Selenium:

*Firefox*

```curl https://raw.githubusercontent.com/Decodo/Selenium/master/ruby/firefox/example.rb > example.rb```

*Chrome*

```curl https://raw.githubusercontent.com/Decodo/Selenium/master/ruby/chrome/example.rb > example.rb```

3. Your project folder should now be populated with the *example.rb* file.

### Configuration

To configure the endpoint you would like to use, change the example endpoint within the punctuation marks ('') here:

<img width="550" alt="image" src="https://github.com/user-attachments/assets/a3ccdf8e-c050-440a-b097-87027ffeb2f6" />

### Usage

You can test the script by running the `ruby example.rb` command while in your project folder.

A browser window will appear with the targeted website, and a proxy IP should be visible in the console output:

<img width="324" alt="image" src="https://github.com/user-attachments/assets/dadbe3c5-a9e3-41e3-9cfa-c43976fe1527" />

## Need help?
Email - sales@decodo.com
<br><a href="https://direct.lc.chat/12092754/">Live chat 24/7</a>
