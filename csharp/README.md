<p align="center">
    <a href="https://decodo.com/"><img src="https://github.com/user-attachments/assets/209d01f2-3931-4e77-a6f3-0028b1ee2b72"></a>
  </a>
</p>

<p align="center">
    <a href="https://github.com/Decodo/Decodo"> Main Repository </a>
</p>

### Disclaimer

Selenium is a browser automation tool. This particular repository only covers Selenium setup for the C# programming language.

To continue further development with this tool, read the Selenium [documentation](https://seleniumhq.github.io/selenium/docs/api/dotnet/index.html) for C#.

*Unfortunately, Selenium itself doesn't support `username:password` authentication for `HTTP/HTTPs` proxies; therefore you will need to have your IP whitelisted.*

You can do that by following the guidelines listed [here](https://help.decodo.com/docs/residential-authentication-methods).

### Prerequisites

To run these particular examples, use Visual Studio 19 to download WebDrivers and the Selenium package itself using C# NuGet:

* [Visual Studio with Visual Basic](https://docs.microsoft.com/en-us/visualstudio/ide/quickstart-visual-basic-console?view=vs-2019)

If you are using something else, you'll need to download these packages separately:

- [Selenium](https://www.seleniumhq.org/download/)
- [Chrome WebDriver](https://chromedriver.chromium.org/downloads)
- [Firefox WebDriver](https://github.com/mozilla/geckodriver/releases)

You'll need at least one of the above drivers to continue with the next steps.

### Installation

This particular code was built with [Visual Studio with Visual Basic](https://docs.microsoft.com/en-us/visualstudio/ide/quickstart-visual-basic-console?view=vs-2019), which will be used to build and launch the application.

You can run it using these steps:

1. Create a new Console Application.
2. Navigate to the projects directory using the Terminal/Command Prompt.
3. Run the cURL command to download the code or copy it directly from the repository by clicking on the preferred WebDriver hyperlink above.

[*Firefox*](https://raw.githubusercontent.com/Decodo/Selenium/master/csharp/firefox/example.cs)

```
curl https://raw.githubusercontent.com/Decodo/Selenium/master/csharp/firefox/example.cs > example.cs
```

[*Chrome*](https://raw.githubusercontent.com/Decodo/Selenium/master/csharp/chrome/example.cs)

```
curl https://raw.githubusercontent.com/Decodo/Selenium/master/csharp/chrome/example.cs > example.cs
```

4. You should see a new file named example.cs in your project folder.

### Configuration

To configure the proxy, simply change the following string in the code depending on the WebDriver:

*Firefox*

```
HttpProxy = "gate.decodo.com:7000"
```

*Chrome*
```
HttpProxy = "http://gate.decodo.com:7000"
```

### Testing

If everything is done correctly, the selected WebDriver will appear with a new IP from the proxy service after running the code. You'll also get a printed output of the IP in the Console:

<img width="365" alt="image" src="https://github.com/user-attachments/assets/1b075865-56a6-4f1d-bc99-370eef2ac837" />

## Need help?
Email - sales@decodo.com
<br><a href="https://direct.lc.chat/12092754/">Live chat 24/7</a>
