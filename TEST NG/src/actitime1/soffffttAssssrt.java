package actitime1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soffffttAssssrt 
{
	@Test
	public void creatcustomerTest()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("step_1");
		System.out.println("step_2");
		System.out.println("step_3");
		s.assertEquals("x", "y");
		System.out.println("step_4");
		System.out.println("step_5");
		s.assertAll();
	}
}
