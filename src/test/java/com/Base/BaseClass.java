
package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	 public static WebDriver launchBrowser(String browsername) {
	    	switch (browsername) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
	        case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
		    case "Internetexplorer":
			     WebDriverManager.iedriver().setup();
			     driver=new InternetExplorerDriver();
			      break; }
	    	
			return driver; }
	 
	   public static void launchUrl(String url)//Launch Url
	   {driver.get(url);
	   driver.manage().window().maximize();}
       
       public static void locatorwait(int time)
       {driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);}
       
       public static String getUrl()
       {String url = driver.getCurrentUrl();
	       return url;}
       
       public static void fillTextbox(WebElement e,String txt)//sendkeys
       { e.sendKeys(txt);}
       
       public static void fillTextWithEnter(WebElement e,String txt)//sendkeys with enter
       {e.sendKeys(txt,Keys.ENTER);}
       
    	public static void btclick(WebElement e){//click
    	e.click();}
    	   
    	public static String getAppTitle(){//gettitle
    		return driver.getTitle();}
    	   
    	public static String getText(WebElement e)   {//gettext
    		return e.getText();}
    	
    	public static String getAttributevalue(WebElement e){//getattribute
    		return e.getAttribute("value");
    	}
    	// Action class
    	public static void movetoElement1(WebElement target){//movetoelement
    		
    		Actions a=new Actions(driver);
    		a.moveToElement(target).perform();}
    	
    	public static void rightClick(WebElement target){//rightclick
        		
        		Actions a=new Actions(driver);
        		a.contextClick(target).perform();}
    		
        public static void clickelement(WebElement target){//click
        		
        		Actions a=new Actions(driver);
        		a.click(target).perform();}		
    		
        public static void dragandDrop(WebElement src,WebElement des){//drag and drop
    		
    		Actions a=new Actions(driver);
    		a.dragAndDrop(src,des).perform();}		
        public static void doubleclick(WebElement target){//doubleclick
    		
    		Actions a=new Actions(driver);
    		a.doubleClick(target).perform();}
        //Select class
         public static void selectByIndex(WebElement e,int i) {//selectindex
    			Select s=new Select(e);
    			s.selectByIndex(i);
			}
        public static void selectByValue(WebElement e,String value) {//selectvalue
    		    Select  s=new Select(e);
    			s.selectByValue(value);
			}
    		
        public static void selectByText(WebElement e,String text) {//selectText
		    Select  s=new Select(e);
			s.selectByVisibleText(text);
		}	
        public static void deselectByIndex(WebElement e,int i) {//deselectbyindex
		    Select  s=new Select(e);
			s.deselectByIndex(i);
		}
        public static void deselectByvalue(WebElement e,String value) {//deselectbyvalue
		    Select  s=new Select(e);
			s.deselectByValue(value);
		}
        public static void deselectByText(WebElement e,String text) {//deselectText
		    Select  s=new Select(e);
			s.deselectByVisibleText(text);}
        public static void deselectAll(WebElement e) {//deselectall
		    Select  s=new Select(e);
			s.deselectAll();}
    	
      public static void getAlloptions(WebElement e){//getallOptions(Issue)
    	  Select s=new Select(e);
    	  List<WebElement> op = s.getOptions();
    		  for(WebElement w:op) {
    			 System.out.println(w.getText());}}
    		 
    	 
    	  
      public static String getFirstselectedoptions(WebElement e){//get first selected Options
    	  Select s=new Select(e);
    	  WebElement Op1 = s.getFirstSelectedOption();
    	  
    		  return Op1.getText();}
      
      public static void getAllSelectedOptions(WebElement e){//issue get all selected 
    	  
    	  Select s=new Select(e);
    	  List<WebElement> allselect = s.getAllSelectedOptions();
    	  for(WebElement all: allselect) {
    		  System.out.println(all.getText());}}

     public static boolean isMultiple(WebElement e){
			Select s=new Select(e);
			s.isMultiple();
			return true;
		}
      
      //navigation
	public static void navigateto(String url) {
    	driver.navigate().to(url);}
	
    public static void navigatefrwd() {
    	driver.navigate().forward();}
    	
    public static void navigateback() {
    	driver.navigate().back();
    }
    
    public static void refresh() {
    	driver.navigate().refresh();
    } 
      
      // webelement boolean methods
     public static boolean isDisplayed(WebElement e) {
    	 e.isDisplayed();
    	 return true;
     }
     public static boolean isEnabled(WebElement e) {
    	 e.isEnabled();
    	 return true;
     }
     public static boolean isSelected(WebElement e) {
    	 e.isSelected();
    	 return true;}
     //Switch to alert
     public static void acceptAlert() {
    	 Alert a=driver.switchTo().alert();
    	 a.accept();
     }
     public static void dismissAlert() {
    	 Alert a=driver.switchTo().alert();
    	 a.dismiss();
     }
     public static void promptalert(String s) {
    	 Alert a=driver.switchTo().alert();
    	 a.sendKeys(s);
    	}
    public static  String getAlert(){
    	 Alert a=driver.switchTo().alert();
    	return a.getText();
    }
    //screenshot
    public static String capture(String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
     
    	 //javascript executor
    public static void jssetvalue(WebElement w,String name)	{ 
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 js.executeScript("arguments[0].setAttribute('value','"+name+"')", w);} 

	public static void jsclick(WebElement e) {//click
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);}
		
	public static void jsScrolldown(WebElement e)//scrolldown
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", e);}
	
	public static void jsScrollUp(WebElement e) {//scrollup
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)", e);
    	 
     }
	public static String jsgetText(WebElement e){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)obj;
		return s;}
	
	//frames	
	public static void framebyindex(int i){
    driver.switchTo().frame(i);}
	public static void framebyidorname(String s) {
	driver.switchTo().frame(s);}
	public static void framebyWebelement(WebElement e) {
	driver.switchTo().frame(e);}
	
	//Window Handles
	public static void getWindowHandle(int i) {
		String parent = driver.getWindowHandle();
	    Set<String> child = driver.getWindowHandles();
		List<String>li=new LinkedList<>();
		li.addAll(child);
		String id = li.get(i);
		driver.switchTo().window(id);
		
		
	}
	public static String getData(String file,int r,int c,String sheet) throws IOException {
		
		   
			File loc=new File("F:\\CucumberTesng\\TestNg\\src\\test\\java\\com\\utilities\\"+file+".xlsx");
			//file input
			FileInputStream fi=new FileInputStream(loc);
	        //workbook
			Workbook w=new XSSFWorkbook(fi);
			//sheet
			Sheet s=w.getSheet(sheet);
			//row
			Row row=s.getRow(r);

		     Cell cell=row.getCell(c);
		     //System.out.println(cell);
		     
		    int cellType = cell.getCellType();
		   // System.out.println(cellType);
		    String value=null;
		    
		    if(cellType==1) {
		    		 value = cell.getStringCellValue();
		    		
		    		}
		    		else {
		    			if(DateUtil.isCellDateFormatted(cell)) {
		    				Date datevalue = cell.getDateCellValue();
		    				value =new SimpleDateFormat("dd-MM-YYYY").format(datevalue);
		    			}
		    		else {
		    			
		    				value = String.valueOf((long)cell.getNumericCellValue());
		    		}}
			return value;}
		    
		
	       
         
}






