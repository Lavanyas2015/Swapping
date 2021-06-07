package Testexecution;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.pom.Cartscreen;

public class cartclass extends BaseClass {
	@BeforeMethod
	public void beforeclass() {
		System.out.println("start the third test");
		locatorwait(20);
}   
	@Parameters({"firstname","lastname","zipcode"})
	@Test
	public void test(String firstname,String lastname, String zipcode) throws InterruptedException {
		
		Cartscreen c=new Cartscreen();
		System.out.println(getText(c.getDesc()));
		btclick(c.getCheckout());
		fillTextbox(c.getFirstname(), firstname);
		fillTextbox(c.getLastname(), lastname);
		fillTextbox(c.getPostalcode(), zipcode);
		btclick(c.getCon());
}
	@AfterMethod
	public void aftermethod() {
		System.out.println("End the third test");
		locatorwait(20);
	}
}