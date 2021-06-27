package test;

import org.testng.annotations.Test;

import page.HomePage;
import page.LoginPage;
import page.VerifyCart;

public class ProductSelectionTest extends BaseClass{
	@Test
	public void Logintest()
	{
		LoginPage obj=new LoginPage();
		HomePage obj1=new HomePage();
		VerifyCart obj2=new VerifyCart();
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		String product=sheet.getRow(1).getCell(2).getStringCellValue();		
		obj.LoginTest(username, password);			
        obj1.ProductTest(product);
		obj2.VerifyCartitem(product);
		
	}
	
	

}
