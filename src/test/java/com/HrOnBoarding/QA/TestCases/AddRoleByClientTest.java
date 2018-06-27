package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
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

	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		roleAddObj = new AddRoleByClient();
		lgn = new LoginScreen();
	}

	@Test
	public void addHRByClient() throws InterruptedException {

		lgn.DoLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		Thread.sleep(2000);
		roleAddObj.jumpToAddRoleByClientScreen();
		Thread.sleep(2000);
		roleAddObj.addHRByClient(prop.getProperty("firstNameHR"), prop.getProperty("lastNameHR"),
				prop.getProperty("emailIdHR"), prop.getProperty("empCodeRoleHR"));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
