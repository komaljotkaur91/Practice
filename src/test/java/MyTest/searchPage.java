package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class searchPage {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void mul(){
		int a = 10,b = 2;
		int multi = a*b;
		Assert.assertEquals(18, 20, "Please check the numbers");// hard assertion
		
		System.out.println(multi);
		
	}
	@Test
	public void sub(){
		int a = 10,b = 2;
		int sub = a-b;
		softAssert.assertEquals(12, 8, "Please check the numbers");// soft assertion
		softAssert.assertAll();
		System.out.println(sub);
	}

}
