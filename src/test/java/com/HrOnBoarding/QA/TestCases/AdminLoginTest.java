package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.AdminLoginPage;
import com.redhu.Base.TestBase;

public class AdminLoginTest extends TestBase {
	AdminLoginPage adminLogin;

	public AdminLoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		adminLogin = new AdminLoginPage();

	}
     @Test
	public void verifyAdminLogin() {
		adminLogin.adminLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));

	}
     
     @AfterMethod
     public void tearDown(){
    	 driver.quit();
    	 
     }
	
	

}
