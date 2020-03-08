package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SecoundMavenClass {
 @Test
	public void test1()
	
	{
	 System.setProperty("webdriver.chrome.driver", "D:\\seleniumDrivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); // as soon as object is created for the chromedriver class construtor is executed,so basically constuctor has initialize with launch browser method
	      dr.manage().window().maximize();
	      dr.get("http://sampleapp.tricentis.com/101/");
	      dr.findElement(By.xpath("//a[@id='nav_automobile']")).click();
		 WebElement ele=dr.findElement(By.xpath("//select[@id='make']"));
	      Select sel = new Select(ele);
	      sel.selectByIndex(2);
	      dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("23");
	      //dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
	  	dr.findElement(By.id("listprice")).sendKeys("1000");;
		dr.findElement(By.id("licenseplatenumber")).sendKeys("100");
	}
	
}
