import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Example {

	public static void main(String[] args) {
		
		String ProxyServer = "gate.decodo.com";                                                              //Proxy host:port configuration
		int ProxyPort = 7000;
		
		String sHttpProxy = ProxyServer + ":" + ProxyPort;
		
		Proxy proxy = new Proxy();
		
		proxy.setHttpProxy(sHttpProxy);

		GeckoDriverService service =new GeckoDriverService.Builder()                                            //Initializes Geckodriver configuration
								  .usingDriverExecutable(new File("PATH TO WEBDRIVER")) //Change the path to your Geckodriver
								  .usingAnyFreePort()
								  .usingAnyFreePort()
								  .build();
		FirefoxOptions options = new FirefoxOptions();
		
		options.setCapability("proxy", proxy);
		
		options.merge(options);                                                                                 //Initializes the configured Geckodriver
		
		WebDriver driver=new FirefoxDriver(service, options);
		driver.get("http://ip.decodo.com/");                                                                //Target website
	    WebElement body = driver.findElement(By.tagName("body"));                                                   //Select desired Element from your target website
	    String bodyText = body.getText();
		System.out.println(bodyText);

	}

}
