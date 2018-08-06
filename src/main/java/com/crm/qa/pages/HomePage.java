package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page factory:
	@FindBy(xpath = "//td[contains(text(),'User: prashant harne')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Combined Form')]")
	WebElement newCombinedForm;

	@FindBy(xpath = "//a[contains(text(),'Full Search Form')]")
	WebElement newFullSearchForm;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'New Deal')]")
	WebElement newDealLink;

	@FindBy(xpath = "//a[contains(text(),'Products')]")
	WebElement newProduct;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	@FindBy(xpath = "//a[contains(text(),'New Task')]")
	WebElement newTaskLink;

	@FindBy(xpath = "//a[contains(@href,'https://www.freecrm.com/index.cfm?logout=1')]")
	WebElement logOut;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}

	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}

	public void clickOnNewCombinedForm() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newCombinedForm.click();
	}

	public void clickOnNewFullSearchForm() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newFullSearchForm.click();
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public void clickOnNewDealLink() {
		Actions action = new Actions(driver);
		action.moveToElement(dealsLink).build().perform();
		newDealLink.click();
	}

	public void clickOnNewProduct() {
		Actions action = new Actions(driver);
		action.moveToElement(dealsLink).build().perform();
		newProduct.click();
	}

	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

	public void clickOnNewTaskLink() {
		Actions action2 = new Actions(driver);
		action2.moveToElement(tasksLink).build().perform();
		newTaskLink.click();
	}
	
	public LoginPage clickOnLogoutButton() {
		logOut.click();
		return new LoginPage();
	}
}
