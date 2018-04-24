
package com.logicinvoice.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.logicinvoice.generics.BaseTest;
import com.logicinvoice.generics.Utility;
import com.logicinvoice.pompages.CustomersPage;
import com.logicinvoice.pompages.DashboardPage;

public class TestCustomer extends BaseTest
{
	
/*	public  TestCustomer() 
	{
		super();
	}*/
	
	@Test
	public void openCustomerPage() throws Exception
	{	
	   Logger log = LogManager.getLogger(TestCustomer.class.getName());
	   log.debug("Creating an object of Dashboard pom class");
		DashboardPage d = new DashboardPage(driver);
		log.info("DashBoardPage class Object created successfully");
		//Mouse on $ menu
		log.debug("Mouse hover on dollar menu");
		d.mouseHoverOnDollarMenu(driver);
		log.info("successfully mouse hover");
		//Cick on Customer menu
		log.debug("click on Customer menu");
		d.clickOnCustomersMenu();
		log.info("click on customers successfully");
		//click on Add button present on Customers Page
		CustomersPage c = new CustomersPage(driver);
		int rowCount = Utility.getRowCount("CustomerDetails");
		for (int i = 1; i <=rowCount; i++) {
			c.clickCustAdd();
			String fn = Utility.getCellValue("CustomerDetails", i, 0);
			String ln = Utility.getCellValue("CustomerDetails", i, 1);
			String cn = Utility.getCellValue("CustomerDetails", i, 2);
			String website = Utility.getCellValue("CustomerDetails", i, 3);
			String email = Utility.getCellValue("CustomerDetails", i, 4);
			String pwd = Utility.getCellValue("CustomerDetails", i, 5);
			String confpwd = Utility.getCellValue("CustomerDetails", i, 6);
			String status = Utility.getCellValue("CustomerDetails", i, 7);
			c.setFirstName(fn);
			c.setLastName(ln);
			c.setCompanyName(cn);
			c.setWebsite(website);
			c.setEmail(email);
			c.setPassword(pwd);
			c.setConfirmPassword(confpwd);
			c.setCustomerStatus(status);
			c.clickCustSave();
			//Assert.fail();
		}
	}
}
