package com.HrOnBoarding.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class ClientManagementByAdmin extends TestBase {

	@FindBy(xpath = "//button[text()='Client Management']")
	WebElement clientManagement;

	@FindBy(xpath = "//input[@placeholder='Filter by Name']")
	WebElement searchByClientNameTextField;

	@FindBy(xpath = "//td[text()='JeffAuto']")
	WebElement clientName;
	
	@FindBy(xpath = "//a[@class='page-link']")
	WebElement paginationlink;

	public ClientManagementByAdmin() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public void searchByClientName(String ClientName) throws InterruptedException {
		clientManagement.click();
		Thread.sleep(2000);
		searchByClientNameTextField.click();
		searchByClientNameTextField.sendKeys(ClientName);
		Thread.sleep(2000);
		String SearchResult = clientName.getText();
		Assert.assertEquals(SearchResult, "JeffAuto", "Search filter is not working properly.");
	}
	
	public void paginationLink() throws InterruptedException{
		clientManagement.click();
		Thread.sleep(2000);
		
		
		
		
	}
	

}
