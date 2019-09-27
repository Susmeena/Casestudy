package Casestudy.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserclass {
	static WebDriver driver;
	public static WebDriver openBrowser(String browser) {	
	
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\driver files\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver files\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\driver files\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else
		System.out.println("Invalid browser !!");
	return driver;
	}
}
