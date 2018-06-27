package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.ClientManagementByAdmin;
import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class ClientManagementByAdminTest extends TestBase {

	ClientManagementByAdmin clientManageObj;
	LoginScreen login;

	public ClientManagementByAdminTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		clientManageObj = new ClientManagementByAdmin();
		login = new LoginScreen();
	}

	@Test
	public void searcClientByName() throws InterruptedException {

		login.DoLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		Thread.sleep(2000);
		clientManageObj.searchByClientName(prop.getProperty("ClientName"));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
