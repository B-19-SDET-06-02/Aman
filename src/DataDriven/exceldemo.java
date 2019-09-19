package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.IIOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceldemo
{
	String uname,path;
	public void get() throws IOException
	{

		path=System.getProperty("user.dir")+"\\browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("https://www.facebook.com");
		
		FileInputStream fs= new FileInputStream("browsers\\testdata\\text.xls");
		HSSFWorkbook wb= new HSSFWorkbook(fs);
		HSSFSheet sheet= wb.getSheet("data");
		HSSFRow row=sheet.getRow(2);
		HSSFCell cell=row.getCell(1);
		//uname=cell.getStringCellValue();
		//System.out.println("User name is:"+uname);
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			HSSFRow row1= sheet.getRow(i);
			uname=row1.getCell(0).toString();
			path=row1.getCell(1).toString();
			
			drive.findElement(By.id("email")).clear();
			drive.findElement(By.id("pass")).clear();
			
			drive.findElement(By.id("email")).sendKeys(uname);
			drive.findElement(By.id("pass")).sendKeys(path);
		    drive.findElement(By.id("loginbutton")).click();
		    
		    drive.navigate().back();
		}
		
	}
	

	public static void main(String[] args) throws IOException
	{
		exceldemo oo=new exceldemo();
		oo.get();
		// TODO Auto-generated method stub

	}

}
