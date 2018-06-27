package com.HrOnBoarding.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class AddRoleByClient extends TestBase {

	@FindBy(xpath = "//button[text()='Client Management']")
	WebElement clientManagement;

	@FindBy(xpath = "//input[@placeholder='Filter by Name']")
	WebElement searchByClientNameTextField;

	@FindBy(xpath = "//td[text()='JeffAuto']")
	WebElement clientName;

	@FindBy(xpath = "//button[text()='Add Role']")
	WebElement addRoleButton;

	@FindBy(xpath = "//input[@value='hr']")
	WebElement hrRadioButton;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameRole;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastNameRole;

	@FindBy(xpath = "//input[@placeholder='Email ID']")
	WebElement emailIDRole;

	@FindBy(xpath = "//input[@formcontrolname='employeeId']")
	WebElement empIDRole;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement addRole;

	public AddRoleByClient() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public void jumpToAddRoleByClientScreen() throws InterruptedException {
		clientManagement.click();
		searchByClientNameTextField.sendKeys("JeffAu");
		Thread.sleep(2000);
		clientName.click();
		Thread.sleep(2000);
		String text = addRoleButton.getText();
		Assert.assertEquals(text, "Add Role", "User is not on Add client screen");

	}

	public void addHRByClient(String firstName, String lastName, String emailID, String empCode)
			throws InterruptedException {
		jumpToAddRoleByClientScreen();
		Thread.sleep(2000);
		addRoleButton.click();
		Thread.sleep(2000);
		hrRadioButton.click();
		firstNameRole.sendKeys(firstName);
		LastNameRole.sendKeys(lastName);
		emailIDRole.sendKeys(emailID);
		empIDRole.sendKeys(empCode);
		addRole.click();

	}
}
