package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;
import test.ProductSelectionTest;

public class VerifyCart {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	// ============Webelement==============static xpath only works for pagefactory//
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cart;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement verifycartitem;

	// ===========constructor===//
	public VerifyCart() {

		driver = BaseClass.driver;
		report = ProductSelectionTest.report;
		test = ProductSelectionTest.test;
		PageFactory.initElements(driver, this);

	}
	// ===========Method=================//

	public void VerifyCartitem(String product) {
		test = report.startTest("VErifying items in swaglab");
		cart.click();
		String itemname = verifycartitem.getText();
		System.out.println("itemname is :" + itemname);
		if (itemname.equalsIgnoreCase(product)) {
			test.log(LogStatus.PASS, "succesfully items are added to cart");
		} else {
			test.log(LogStatus.FAIL, "item which not added to cart");
		}
		System.out.println("Click on the addcart");

	}

}
