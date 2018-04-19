package actitime2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.com_actitime_genericlib;

public class com_actitime_creatcustomer2Test extends com_actitime_genericlib
{
	//public static WebDriver driver;
	@Test
	public void creatcustomer1Test ()
	{
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("fazal_011");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	@Test
	public void creatcustomer2Test ()
	{
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("fazal_012");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	@Test
	public void creatcustomer3Test ()
	{
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("fazal_013");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
}
