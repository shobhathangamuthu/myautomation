package com.acti.Testcases;

import org.testng.annotations.Test;

public class TestValidateLogin2  extends TestBase{

	@Test
	public void testloginfuntionality()
	{
		mshp.clickonSignin();
		mslp.validateSignIn2("dummytest@gmail.com", "Pass@123");
	}
}
