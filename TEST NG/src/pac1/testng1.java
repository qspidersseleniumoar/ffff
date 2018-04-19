package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng1 
{
	@BeforeMethod
	public void loginTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=f5zfuogf6gx2");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();

	}
	@Test
	public void createcustemerTest()
	{		
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:8080/login.do;jsessionid=f5zfuogf6gx2");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys("fazal_001");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	driver.quit();
	}
	
	
	
	
	
	

}
