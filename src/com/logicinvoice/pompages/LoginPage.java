package com.logicinvoice.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//declare the elements
	@FindBy(id="input-username")
	WebElement usernameTB;
	@FindBy(id="input-password")
	WebElement passwordTB;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	//initiallise
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilise the elements
	public void setUserName(String un)
	{
		usernameTB.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		passwordTB.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
}
