package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class LoginScreenTest extends TestBase {
	LoginScreen Login;

	public LoginScreenTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		Login = new LoginScreen();

	}

	@Test(enabled = true)
	public void DoAdminLogin() {
		Login.DoLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
	}

	@Test(enabled = true)
	public void DoClientLogin() {
		Login.DoLogin(prop.getProperty("ClientEmailAddress"), prop.getProperty("ClientPassword"));

	}

	@Test(enabled = true)
	public void verifyForgotPasswordLinkIsAvailable() {
		Login.forgotPasswordIsDisplay();
	}

	@Test(enabled = true)
	public void verifyRememberMeLinkIsAvailable() {

		Login.rememberMeIsDisplay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
