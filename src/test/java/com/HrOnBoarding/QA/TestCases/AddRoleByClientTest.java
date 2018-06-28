package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.AddRoleByClient;
import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class AddRoleByClientTest extends TestBase {

	AddRoleByClient roleAddObj;
	LoginScreen lgn;

	public AddRoleByClientTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		roleAddObj = new AddRoleByClient();
		lgn = new LoginScreen();
	}

	@Test(priority= 1)
	public void addHRByClient() throws InterruptedException {
		
         System.out.println("I am running test case add HR - **********************");
		lgn.DoLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		Thread.sleep(2000);
		roleAddObj.addHRByClient(prop.getProperty("firstNameHR"), prop.getProperty("lastNameHR"),
				prop.getProperty("emailIdHR"), prop.getProperty("empCodeRoleHR"));

	}
	
	
	@Test(priority = 2)
	public void addPayRollByClient() throws InterruptedException{
		
        System.out.println("I am running test case add Payroll - **********************");

		
		lgn.DoLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		Thread.sleep(2000);
		
		roleAddObj.addPayRollByClient(prop.getProperty("firstNamePayRoll"), prop.getProperty("lastNamePayRoll"),
				prop.getProperty("emailIdPayRoll"), prop.getProperty("empCodeRolePayRoll"));

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
