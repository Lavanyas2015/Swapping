package Testexecution;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.pom.Homescreen;



public class Homeexecution extends BaseClass{
	Homescreen h;
	@BeforeMethod
	public void beforeclass() {
		System.out.println("start the second test");
		locatorwait(20);
	}
		
	@Test
	public void test() throws InterruptedException {
		h=new Homescreen();
clickelement(h.getBurgermenu());
Thread.sleep(1000);
	btclick(h.getClose());
	selectByIndex(h.getDropdown(), 1);
	getAlloptions(h.getDropdown());
	
	
		}
	@Test
	public void test1() throws InterruptedException {
	     btclick(h.getAddtocart());
	     
	     btclick(h.getCart());
	
		}
	@AfterMethod
	public void aftermethod() {
		System.out.println("End the second test");
		locatorwait(20);
	}}
	
