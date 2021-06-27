package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;

public class HomePage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	// ============Webelement==============static xpath only works for pagefactory//
	/*
	 * @FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-backpack']")
	 * WebElement addtocart;
	 */
	// ===========constructor===//
	public HomePage() {

		driver = BaseClass.driver;
		report = BaseClass.report;
		test = BaseClass.test;
		PageFactory.initElements(driver, this);

	}
	// ===========Method=================//

	public void ProductTest(String product) {
		test = report.startTest("ITemCart page  of swaglab");
		System.out.println("Click on the addcartbutton");
		WebElement addtocart = driver.findElement(By.xpath("//*[text()='" + product + "']/following::button[1]"));
		addtocart.click();

		test.log(LogStatus.PASS, "Clicked the itemsuccessfully");
		System.out.println("Click on the addcart");

	}

}
