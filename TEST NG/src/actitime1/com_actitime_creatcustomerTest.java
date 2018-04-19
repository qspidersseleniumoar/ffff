package actitime1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.com_actitime_genericlib;

public class com_actitime_creatcustomerTest extends com_actitime_genericlib
{
	@Test
	public void creatcustomerTest()
	{
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("fazal_011");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
}
