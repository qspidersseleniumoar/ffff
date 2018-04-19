package actitime1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.com_actitime_genericlib;

public class annotation_usage extends com_actitime_genericlib
{
	
	@Test
	public void verifyHomePageTest()
	{
		String expval ="actiTIME - Enter Time-Track";
		
		// capture the title of the Home page
		String actTitle = driver.getTitle();
		
		//Verify Home page
		Assert.assertEquals(actTitle, expval);
		System.out.println("Home page is verified===>PASS");
		System.out.println("=======END======");
		System.err.println(driver.manage().window().getSize());
	}
	
	@Test
	public void verifyLogoTest()
	{
		boolean actstat = driver.findElement(By.xpath("//div[@class='logo-container']/img")).isDisplayed();
		
		//verify the Logo
		
		Assert.assertTrue(actstat);
	}
}
