package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;

public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	// ============Webelement==============//
	@FindBy(id = "user-name")
	WebElement un;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	// ===========constructor===//
	public LoginPage() {

		driver = BaseClass.driver;
		report = BaseClass.report;
		test = BaseClass.test;
		PageFactory.initElements(driver, this);

	}
	// ===========Method=================//

	public void LoginTest(String username, String password) {

		test = report.startTest("Login page of swaglab");
		un.sendKeys(username);
		test.log(LogStatus.PASS, "Successfully username entered ");
		pwd.sendKeys(password);
		test.log(LogStatus.PASS, "Successfully password entered ");
		loginbutton.click();
		test.log(LogStatus.PASS, "Successfully clicked login button  ");
		System.out.print("after login button");

	}

}
