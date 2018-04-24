package com.logicinvoice.scripts;

import org.testng.annotations.Test;

import com.logicinvoice.generics.BaseTest;
import com.logicinvoice.pompages.LoginPage;

public class TestLogin extends BaseTest
{
	@Test
public void testLogin()
{
	LoginPage lp=new LoginPage(driver);
	lp.setUserName("admin");
	lp.setPassword("123456");
	lp.clickLogin();
}
}
