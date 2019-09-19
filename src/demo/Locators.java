package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	String path;
	public void locate()
	{
		path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("https://www.facebook.com");
		
	}
	

	public static void main(String[] args) 
	{
		Locators oo=new Locators();
	    oo.locate();
		// TODO Auto-generated method stub

	}

}
