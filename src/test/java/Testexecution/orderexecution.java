package Testexecution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.pom.orderscreen;

public class orderexecution extends BaseClass{
	@BeforeMethod
	public void beforeclass() {
		System.out.println("Start the fourthtest");
		locatorwait(20);
}
	@Test
	public void test()  {
		orderscreen  o=new orderscreen();
		System.out.println(getText(o.getAmount()));
		Assert.assertEquals(getText(o.getAmount()), "Total: $17.27","Verify the amount");
		btclick(o.getFinish());
		
}
	@AfterMethod
	public void aftermethod() {
		System.out.println("End the fourth test");
		locatorwait(20);
	}}