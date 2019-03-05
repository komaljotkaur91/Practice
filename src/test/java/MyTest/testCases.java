package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testCases {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void add(){
		int a = 10,b = 2;
		int sum = a+b;
		Assert.assertEquals(14, 12, "Please check the numbers");// hard assertion
		
		System.out.println(sum);
		
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
