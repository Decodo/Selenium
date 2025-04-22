using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

class Program
{
    static void Main(string[] args)
    {
        ChromeOptions options = new ChromeOptions();            //Configures the Chromedriver

        var proxy = new Proxy
        {
            Kind = ProxyKind.Manual,
            IsAutoDetect = false,
            HttpProxy = "http://gate.decodo.com:7000"       //Proxy host:port configuration
        };
        options.Proxy = proxy;

        IWebDriver driver = new ChromeDriver(options);          //Initializes the configured Chromedriver
        driver.Navigate().GoToUrl("http://ip.decodo.com/"); //Target website
        var getBody = driver.FindElement(By.TagName("body"));   //Select desired Element from your target website
        var getBodyText = getBody.Text;

        Console.WriteLine(getBodyText);

        driver.Quit();
    }
}
