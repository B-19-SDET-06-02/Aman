package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoopla
{
	String path;
	int a;
	public void acc()
	{
		path=System.getProperty("user.dir")+"\\browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.zoopla.co.uk/");
		drive.findElement(By.id("search-input-location")).sendKeys("London");
		drive.findElement(By.id("search-submit")).click();
		List<WebElement> al= drive.findElements(By.className("featured-listing-price"));
	     a=al.size();
	    System.out.println(a);
	    for(int i=0;i<al.size();i++)
	    {
    	System.out.println(al.get(i).getText());
    
	    }
	   
		drive.close();
		
	}
	public static void main(String[] args) 
	{
		zoopla oo=new zoopla();
		oo.acc();
	}
		
}
		// TODO Auto-generated method stub

