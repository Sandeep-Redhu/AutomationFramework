package com.TakeAClass.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TakeAClass.qa.Base.TestBase;

public class SettingPage extends TestBase {

	// creation of object repositry

	@FindBy(xpath = "//span[@class='icon-user-dropdown']")
	WebElement userDropDownAerrow;

	@FindBy(xpath = "//a[@href='/users/signout']")
	WebElement logoutButton;

	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement changePasswordButton;
	
	@FindBy(name="user[current_password]")
	WebElement oldPasswordTextField;
	
	@FindBy(name="user[password]")
	WebElement newPasswordTextField;
	
	@FindBy(name="user[password_confirmation]")
	WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//input[@value='Change']")
	WebElement changePasswordSubmitButton;
	
	
	// initiallization of object repositry
	public SettingPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	// Actions
	public void userLogout() throws InterruptedException {
		userDropDownAerrow.click();
		Thread.sleep(2000);
		logoutButton.click();
		String crtUrl = driver.getCurrentUrl();
		Assert.assertEquals(crtUrl, "http://staging.takeaclass.com/users/login", "User is not logout successfully");
		
	}
	
	public void changeUserPassword() throws InterruptedException{
		userDropDownAerrow.click();
		Thread.sleep(2000);
		changePasswordButton.click();
		Thread.sleep(2000);
		oldPasswordTextField.sendKeys("takeaclass");
		newPasswordTextField.sendKeys("takeaclass");
		confirmPasswordTextField.sendKeys("takeaclass");
		changePasswordSubmitButton.click();
	}
	
}
