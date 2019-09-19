package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser
{
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\amanjava\\selenium\\chromedriver_win32 - 1\\chromedriver.exe");//path of chrome driver
		WebDriver driver=new ChromeDriver(); //launch chrome driver
		
		//lauch application on chrome driver
		driver.get("https://www.facebook.com");
		
	}

	public static void main(String[] args)
	{
		openbrowser oo=new openbrowser();
		oo.launch();
		// TODO Auto-generated method stub

	}

}
