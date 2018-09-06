package com.acti.Testcases;

import org.testng.annotations.Test;

public class TestValidateLogin extends TestBase{
	@Test
	public void testloginfuntionality()
	{
		mshp.clickonSignin();
		mslp.validateSignIn();
	}
}
