package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table 
{
String path,title;
public void acc()
	{
		path=System.getProperty("user.dir")+"\\browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("file:///D:/amanjava/html/Extrnl%20(2).html");
        String a=drive.findElement(By.xpath("//table[@id='abc']")).getText();
        System.out.println(a);
		
	}

	public static void main(String[] args) 
	{
		table oo=new table();
		oo.acc();
		// TODO Auto-generated method stub

	}

}
