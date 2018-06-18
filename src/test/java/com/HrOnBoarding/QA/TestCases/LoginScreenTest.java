package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class LoginScreenTest extends TestBase {
	LoginScreen adminLogin;

	public LoginScreenTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		adminLogin = new LoginScreen();

	}

	@Test(enabled = true)
	public void verifyAdminLogin() {
		adminLogin.adminLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
	}

	@Test
	public void verifyForgotPasswordLinkIsAvailable() {
		adminLogin.forgotPasswordIsDisplay();

	}

	@Test
	public void verifyRememberMeLinkIsAvailable() {

		adminLogin.rememberMeIsDisplay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
