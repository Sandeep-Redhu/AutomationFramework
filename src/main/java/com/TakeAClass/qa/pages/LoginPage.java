package com.TakeAClass.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TakeAClass.qa.Base.TestBase;

public class LoginPage extends TestBase {

	// creation of object Repository

	@FindBy(xpath = "//a[@class='nav-link']")
	WebElement userLoginButton;

	@FindBy(name = "user[email]")
	WebElement emailField;
	
	//

	@FindBy(name = "user[password]")
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='commit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//span[@class='icon-user-dropdown']")
	WebElement userDropDownAerrow;

	// initilization of object reporitry
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String getTitle() {
		return driver.getTitle();
	}

	public void userLogin(String us, String psd) {

		userLoginButton.click();
		emailField.sendKeys(us);
		passwordField.sendKeys(psd);
		loginButton.click();
		//writing to validate is user has login or not
		String crntUrl = driver.getCurrentUrl();
		Assert.assertEquals(crntUrl, "http://staging.takeaclass.com/users/classes", "User is not login properly");

	}

}
