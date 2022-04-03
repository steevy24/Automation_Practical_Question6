package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardPage extends BasePage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement DASHBOARD_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TAGGLE_ALL_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/a[1]")
	WebElement REMOVE_FIRST_CUSTOMER_ELEMENT;

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_BUTTON_ELEMENT;
	
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement ADD_CATEGORY_BOX_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADD_CATEGORY_BUTTON_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
	WebElement MONTHS_BOX_ELEMENT;
	
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[2]")
	WebElement JANUARY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[3]")
	WebElement FEBRUARY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[4]")
	WebElement MARCH_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[5]")
	WebElement APRIL_ELEMENT;

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[6]")
	WebElement MAY_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[7]")
	WebElement JUNE_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[8]")
	WebElement JULY_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[9]")
	WebElement AUGUST_ELEMENT;
	
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[10]")
	WebElement SEPTEMBER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[11]")
	WebElement OCTOBER_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[12]")
	WebElement NOVEMBER_ELEMENT;
	
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[13]")
	WebElement DECEMBER_ELEMENT;
	
	
	


	
	
	
	
	
	
	
	
	
	public void verifyDashboardHeader() {

		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "NSS-TODO List v 1.1", "Wrong Page");

	}

	public void clickToggleAllButton() {
		TAGGLE_ALL_ELEMENT.click();
	}

	public void clickRemoveCustomer() {
		REMOVE_FIRST_CUSTOMER_ELEMENT.click();
	}
	
	
	public void clickonRemoveButton() {
		REMOVE_BUTTON_ELEMENT.click();
	}

	
	public void addCategoryBox() {
		ADD_CATEGORY_BOX_ELEMENT.sendKeys("TECHFIOSQA2022A");
	}
	
	
	public void addCategoryButton() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
	}
	
	public void verifyCategorytEntered() {
		if (driver.getPageSource().contains("TECHFIOSQA2022A")) {
			
			System.out.println("Category present");
		}
		
		else {System.out.println("Category not present");}
		
	}
	public void clickOnMonthBox() {
		MONTHS_BOX_ELEMENT.click();
	}
	
	public void clickOnJanuary() {
		JANUARY_ELEMENT.click();
	}
	
	public void clickOnFebruary() {
		FEBRUARY_ELEMENT.click();
	}
	
	public void clickOnMarch() {
		MARCH_ELEMENT.click();
	}
	public void clickOnApril() {
		APRIL_ELEMENT.click();
	}
	
	public void clickOnMay() {
		MAY_ELEMENT.click();
	}
	public void clickOnJune() {
		JUNE_ELEMENT.click();
	}
	
	public void clickOnJuly() {
		JULY_ELEMENT.click();
	}
	
	public void clickOnAugust() {
		AUGUST_ELEMENT.click();
	}
	public void clickOnSeptember() {
		SEPTEMBER_ELEMENT.click();
	}
	
	public void clickOnOctober() {
		OCTOBER_ELEMENT.click();
	}
	
	public void clickOnNovember() {
		NOVEMBER_ELEMENT.click();
	}
	
	public void clickOnDecember() {
		DECEMBER_ELEMENT.click();
	}
	
	
	
	
	
	}