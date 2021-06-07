package Testexecution;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.Base.BaseClass;
import com.pom.Loginscreen;

public class parallelexecution extends BaseClass {

	
		
		@Test
		public void chrome() {
		
			launchBrowser("chrome");
			launchUrl("https://www.saucedemo.com/");
			Loginscreen l=new Loginscreen();
			fillTextbox(l.getUsername(), "standard_user");
			Assert.assertEquals(l.getUsername().getAttribute("value"), "standard_user","verify the username+++++++");
			fillTextbox(l.getPassword(), "secret_sauce");
			Assert.assertEquals(l.getPassword().getAttribute("value"), "secret_sauce","verify the password+++++++");
			btclick(l.getLogin());
		}
		@Test
		public void firefox() {
			launchBrowser("firefox");
			launchUrl("https://www.saucedemo.com/");
			Loginscreen l=new Loginscreen();
			fillTextbox(l.getUsername(), "standard_user");
			Assert.assertEquals(l.getUsername().getAttribute("value"), "standard_user","verify the username+++++++");
			fillTextbox(l.getPassword(), "secret_sauce");
			Assert.assertEquals(l.getPassword().getAttribute("value"), "secret_sauce","verify the password+++++++");
			btclick(l.getLogin());
		}
	}


