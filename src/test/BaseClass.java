package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	public static  WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	XSSFWorkbook wbook;
	 XSSFSheet sheet;
	@BeforeTest
	public void setup() throws IOException
	{
		System.getProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		report=new ExtentReports("swaglabreport.html") ;
		FileInputStream file=new  FileInputStream("exceldata.xlsx");
		wbook=new  XSSFWorkbook(file);
		sheet=wbook.getSheetAt(0);
		
	
	}
	
	@AfterTest
	public void teardown()
	{
		
		report.endTest(test);
		report.flush();
		driver.close();
	}

	
	

}
