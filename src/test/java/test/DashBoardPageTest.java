package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;

import util.BrowserFactory;

public class DashBoardPageTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToCreateCustomer() throws InterruptedException  {

		driver = BrowserFactory.init();

		
		
		 DashBoardPage dashboardPage = PageFactory.initElements(driver,DashBoardPage.class);
		 
		 dashboardPage.verifyDashboardHeader();
		 
		 dashboardPage.clickOnMonthBox();
		 
		 dashboardPage.clickOnJanuary();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnFebruary();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnMarch();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnApril();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnMay();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnJune();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnJuly();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnAugust();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnSeptember();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnOctober();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnNovember();
		 Thread.sleep(2000);
		 dashboardPage.clickOnMonthBox();
		 dashboardPage.clickOnDecember();
		 
		 
	}
}
