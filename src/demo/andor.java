package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class andor
{
	String path;
	public void acc()
	{
		path=System.getProperty("user.dir")+"\\browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("https://www.facebook.com");
		
		//by and method
		drive.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("admin");
		
		//by or method
		drive.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("admin");
		
		//by starts
		drive.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click(); 
		
		drive.findElement(By.xpath("//td[text()='email']"));
		
		drive.close();
	}
	public static void main(String[] args)
	{
		andor oo=new andor();
		oo.acc();
	}
		// TODO Auto-generated method stub

}
