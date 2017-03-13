package com.java;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.java.objects.ResultDetails;
import org.junit.Assert;

public class AppTestType{

	public enum AppKeyWords{

		//tweaked
		AMPLOGIN,FACETS_TOYOTA,CHANGEPASSWORD,

		//new
		MYOPERATION,WAITFORTHIS,VERIFYTHIS,VISIBLE,NOTVISIBLE,CHECKED,VERIFYNOT,AMPLOGOUT,SEARCHLOTINEQWITHEQID,SWITCHWINDOW, FACETS_COMPARISON, 
		
		//Toyota
		SIGNIN_TOYOTA, TOYOTALOGOUT, VERIFYINSPECTSTATUS, PRICEUNITSCOUNT, PASSEDUNITSCOUNT, SEARCHWITHUNITID, SEARCHWITHSERIALNUM, VERIFYSOLDTAB, GETDATE, PREINSPECTTOREPAIR, PREINSPECTTOHOLD, INSPECTTOHOLD, INSPECTTOREPAIR,
		VERIFYHOLDSTATUS, LEASEDTOHOLD, LEASEDTOREPAIR, BUTTONSENABLED, RETURNEDUNITSHOLD, RETURNEDUNITSREPAIR, DEALERPASSEDUNITS, BUTTONSDISABLED, TOYOTAFORESEE, VERIFYDEALERSTATUSHOLD, VERIFYDEALERSTATUSREPAIR, 
		VERIFYDEALERSTATUSPASS, ADVANCEDSEARCH, BOUGHTUNITSCOUNT, EXPIREDTOAUCTION, EXPIREDTOLIVEAUCTION, SEARCHINRETURNUNITFIELD, 
		
		//keywords only(using in switch cases)
		CATEGORY,SOURCESITE, MAKE,MODEL,COUNTRY,STATE,POSTALCODE,UNITID,SNVIN
		}
	final int MAX_STALE_ELEMENT_RETRIES = 5;
	int retries=0;
	int add = 100;
	public static String eqid_1;

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	String Time = cal.getTime().toString();
	String ParantWindow="";

	//public enum Click{CLICKIT,LNK}

	public enum keywords{fposition, sposition, tposition, USR, LGN}
	public String getvalue, Value1, Value2, Value3, Value4, Value5, Value6, Value7, Value8, Value9, ListingsID,Listingtitle, AssetID,ListingID, LOTNUMBER,EMAIL; //ID
	public int result2, result1, result4, result5, result6, result7, result8, result9;


	//private String getvalue;
	//private String user;
	WebDriver driver1;
	int adding = 100;
	String convertadding = String.valueOf(adding);

	//WebDriver drivermmtool;

	// UNCOMMENT COMPARE METHOD WHEN WORKING WITH IT.

	TestType tt;

	public AppTestType(TestType tt){
		this.tt = tt;
	}

	private ResultDetails resultDetails = new ResultDetails();

	public ResultDetails performAction(WebDriver webdriver, String fieldText, String value, String action, String fieldName) {
		try {
			AppKeyWords keys = AppKeyWords.valueOf(action.toUpperCase());
			switch (keys) {

			case AMPLOGIN:
				AMPLOGIN(webdriver, fieldText);
				break;
			case AMPLOGOUT:
				AMPLOGOUT(webdriver);
				break;
			case FACETS_TOYOTA:
				FACETS_TOYOTA(webdriver,fieldText,value);				
			case CHANGEPASSWORD:
				CHANGEPASSWORD(webdriver, fieldText, value);
				break;
			case MYOPERATION:
				MYOPERATION(webdriver, fieldText,value);
				break;	
			case WAITFORTHIS:
				WAITFORTHIS(webdriver, fieldText,value);
				break;
			case VERIFYTHIS:
				VERIFYTHIS(webdriver , fieldText,  value);
				break;
			case VISIBLE:
				VISIBLE(webdriver , fieldText,  value);
				break;
			case NOTVISIBLE:
				NOTVISIBLE(webdriver , fieldText,  value);
				break;
			case CHECKED:
				CHECKED(webdriver, fieldText);
				break;
			case VERIFYNOT:
				VERIFYNOT(webdriver , fieldText,  value);
				break;   
			case SEARCHLOTINEQWITHEQID:
				SEARCHLOTINEQWITHEQID(webdriver,value);
				break;
			case SWITCHWINDOW:
				SWITCHWINDOW(webdriver, fieldText);
				break;				
			case SIGNIN_TOYOTA:
				SIGNIN_TOYOTA(webdriver, fieldText, value);
				break;
			case TOYOTALOGOUT:
				TOYOTALOGOUT(webdriver);
				break;
			case VERIFYINSPECTSTATUS:
				VERIFYINSPECTSTATUS(webdriver);
				break;
			case PRICEUNITSCOUNT:
				PRICEUNITSCOUNT(webdriver);
				break;
			case PASSEDUNITSCOUNT:
				PASSEDUNITSCOUNT(webdriver);
				break;
			case SEARCHWITHUNITID:
				SEARCHWITHUNITID(webdriver);
				break;
			case SEARCHWITHSERIALNUM:
				SEARCHWITHSERIALNUM(webdriver);
				break;
			case VERIFYSOLDTAB:
				VERIFYSOLDTAB(webdriver);
				break;
			case GETDATE:
				GETDATE(webdriver);
				break;
			case PREINSPECTTOREPAIR:
				PREINSPECTTOREPAIR(webdriver);
				break;
			case PREINSPECTTOHOLD:
				PREINSPECTTOHOLD(webdriver);
				break;
			case INSPECTTOHOLD:
				INSPECTTOHOLD(webdriver);
				break;
			case INSPECTTOREPAIR:
				INSPECTTOREPAIR(webdriver);
				break;
			case VERIFYHOLDSTATUS:
				VERIFYHOLDSTATUS(webdriver);
				break;
			case LEASEDTOHOLD:
				LEASEDTOHOLD(webdriver);
				break;
			case LEASEDTOREPAIR:
				LEASEDTOREPAIR(webdriver);
				break;
			case BUTTONSENABLED:
				BUTTONSENABLED(webdriver);
				break;
			case RETURNEDUNITSHOLD:
				RETURNEDUNITSHOLD(webdriver);
				break;
			case RETURNEDUNITSREPAIR:
				RETURNEDUNITSREPAIR(webdriver);
				break;
			case DEALERPASSEDUNITS:
				DEALERPASSEDUNITS(webdriver);
				break;
			case BUTTONSDISABLED:
				BUTTONSDISABLED(webdriver);
				break;
			case TOYOTAFORESEE:
				TOYOTAFORESEE(webdriver);
				break;
			case VERIFYDEALERSTATUSHOLD:
				VERIFYDEALERSTATUSHOLD(webdriver);
				break;
			case VERIFYDEALERSTATUSREPAIR:
				VERIFYDEALERSTATUSREPAIR(webdriver);
				break;
			case VERIFYDEALERSTATUSPASS:
				VERIFYDEALERSTATUSPASS(webdriver);
				break;
			case ADVANCEDSEARCH:
				ADVANCEDSEARCH(webdriver,fieldText,value);
				break;
			case BOUGHTUNITSCOUNT:
				BOUGHTUNITSCOUNT(webdriver);
				break;
			case EXPIREDTOAUCTION:
				EXPIREDTOAUCTION(webdriver);
				break;
			case EXPIREDTOLIVEAUCTION:
				EXPIREDTOLIVEAUCTION(webdriver);
				break;
			case SEARCHINRETURNUNITFIELD:
				SEARCHINRETURNUNITFIELD(webdriver);
				break;
			}			
		}catch(Exception e){
			resultDetails.setErrorMessage(e.getMessage());
		}
		return resultDetails;
	}
	
	public void AMPLOGIN(WebDriver driver, String fieldText) {

		String field = fieldText;  
		System.out.println("In AMPLOGIN method");
		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();

			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
			System.out.println("redirecting to AMP url");
			driver.get(field); // Change again back to staging AMP Site.
			driver.manage().deleteAllCookies();
			ParantWindow=driver.getWindowHandle();
			driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

			driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//input[@value='Login']")).click();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//try-catch block is to catch an exceptional scenario where AMP user is not correctly logged-in
			try{
				driver.findElement(By.id("userAgreementBtn")).click();
				resultDetails.setFlag(true);
			}
			catch(Exception e){
				System.out.println("AMP Login was unsuccessful,clicking on logout and again logging in");
				driver.findElement(By.linkText("logout")).click();
				driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

				driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
				driver.findElement(By.xpath("//input[@value='Login']")).click();

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.id("userAgreementBtn")).click();
				resultDetails.setFlag(true);
			}
		}

		catch (Exception e ){

			resultDetails.setFlag(false);

		}

	}
	public void AMPLOGOUT(WebDriver driver) {  

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.linkText("Logout")).click();
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("aurid")));
			resultDetails.setFlag(true);
		}

		catch (Exception e ){
			System.out.println("Logout Failed in AMP");
			resultDetails.setFlag(false);

		}

	}

	public void FACETS_TOYOTA(WebDriver driver, String fieldText, String value) {

		String fieldType = fieldText;
		String field = fieldText;
		try {
			AppKeyWords FCT = AppKeyWords.valueOf(fieldType.toUpperCase());			
			//ALLEQUIPMENTPAGE(driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (FCT) {

			case MAKE:

				try {

					driver.findElement(By.xpath("(//a[text()='Make'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='Make']/ul/li[1]/span/input)[2]")).click();

					Thread.sleep(1000);

					String Makecount = driver.findElement(By.xpath("(//*[@id='Make']/ul/li[1])[2]")).getText();

					System.out.println(Makecount);

					String RBMakecount = Makecount.substring(Makecount.indexOf("(")+1, Makecount.lastIndexOf(")"));
					Integer totalCount=Integer.parseInt(RBMakecount);
					System.out.println("Expected count: "+totalCount);
					boolean result=FACETS_COMPARISON(driver,totalCount);

					if(result)
					{
						resultDetails.setFlag(true);
					}
					else
						System.out.println("count mis-matched");



				} catch (Exception e ) {

					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}

				break;


			case CATEGORY:

				try {
					
                     driver.findElement(By.xpath("(//a[text()='Category'])[2]")).click();
					 Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='Category']/ul/li[1]/span/input)[2]")).click();
					 Thread.sleep(2000);
					String Categorycount = driver.findElement(By.xpath("(//*[@id='Category']/ul/li[1])[2]")).getText();
					String FirstCategorycount = Categorycount.substring(Categorycount.indexOf("(")+1, Categorycount.lastIndexOf(")"));
					System.out.println(FirstCategorycount);

					String categoryfinal = driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();			 				 
					if(FirstCategorycount.equalsIgnoreCase(categoryfinal)) {
						System.out.println("Counts matched!!!");
					}
					resultDetails.setFlag(true);

				} catch (Exception e ) {
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}

				break;

			case MODEL:

				try {
					
					driver.findElement(By.xpath("(//a[text()='Model'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='Model']/ul/li[1]/span/input)[2]")).click();

					Thread.sleep(1000);

					String Makecount = driver.findElement(By.xpath("(//*[@id='Model']/ul/li[1])[2]")).getText();

					System.out.println(Makecount);

					String RBMakecount = Makecount.substring(Makecount.indexOf("(")+1, Makecount.lastIndexOf(")"));
					Integer totalCount=Integer.parseInt(RBMakecount);
					System.out.println("Expected count: "+totalCount);
					Thread.sleep(3000);
					boolean result=FACETS_COMPARISON(driver,totalCount);

					if(result)
					{
						resultDetails.setFlag(true);
					}
					else
						System.out.println("count mis-matched");



				} catch (Exception e) {
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}
				break;


			case COUNTRY:  

				try {
					
                     driver.findElement(By.xpath("(//a[text()='Model'])[2]")).click();
					Thread.sleep(2000);
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//a[text()='Country'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='Country']/ul/li[1]/span/input)[2]")).click();

					Thread.sleep(1000);

					String Makecount = driver.findElement(By.xpath("(//*[@id='Country']/ul/li[1])[2]")).getText();

					System.out.println(Makecount);

					String RBMakecount = Makecount.substring(Makecount.indexOf("(")+1, Makecount.lastIndexOf(")"));
					Integer totalCount=Integer.parseInt(RBMakecount);
					System.out.println("Expected count: "+totalCount);
					Thread.sleep(3000);
					boolean result=FACETS_COMPARISON(driver,totalCount);

					if(result)
					{
						System.out.println("count matched");
						resultDetails.setFlag(true);
					}
					else
						System.out.println("count mis-matched");



				} catch (Exception e) {
					System.out.println("entered in catch block " +e);
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}

				break;

			case STATE:
				try {
					
                     driver.findElement(By.xpath("(//a[text()='Model'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//a[text()='State/Province'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='State/Province']/ul/li[1]/span/input)[2]")).click();

					Thread.sleep(1000);

					String Makecount = driver.findElement(By.xpath("(//*[@id='State/Province']/ul/li[1])[2]")).getText();

					System.out.println(Makecount);

					String RBMakecount = Makecount.substring(Makecount.indexOf("(")+1, Makecount.lastIndexOf(")"));
					Integer totalCount=Integer.parseInt(RBMakecount);
					System.out.println("Expected count: "+totalCount);
					Thread.sleep(3000);
					boolean result=FACETS_COMPARISON(driver,totalCount);

					if(result)
					{
						resultDetails.setFlag(true);
					}
					else
						System.out.println("count mis-matched");



				} catch (Exception e) {


					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				} 
				break;
			}

		} catch (Exception e) {
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false);
		}
	}

	public void CHANGEPASSWORD(WebDriver driver, String fieldText,String value) {

		try {

			String field = fieldText;

			driver.get(field);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;

			driver.findElement(By.id("new_password")).sendKeys(value);
			driver.findElement(By.id("confirm_passwd")).sendKeys(value);
			driver.findElement(By.xpath("//button[text()='SAVE']")).click();
			Thread.sleep(10000);
			resultDetails.setFlag(true);

		} catch (Exception e) {

			resultDetails.setFlag(false);
		}
	}
	public void MYOPERATION(WebDriver driver, String fieldText, String value){
		//It is used where framework actions doesn't work 
		//We need to proviede SND<Text to enter> in the value fields to perform "Sendkeys"
		//We need to proviede CLK in the value fields to perform "Click"
		try{ 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String f = fieldText;
			String oper=value;

			String attribute=f.substring(0,3);
			String locator=f.substring(3,f.length());

			String operation=oper.substring(0,3);
			String val=oper.substring(3,oper.length());

			if(operation.equalsIgnoreCase("CLK")){
				switch (attribute) {
				case "IDI":
					driver.findElement(By.id(locator)).click();
					resultDetails.setFlag(true);
					break;
				case "XPH":
					driver.findElement(By.xpath(locator)).click();
					resultDetails.setFlag(true);
					break;
				case "LNK":
					driver.findElement(By.linkText(locator)).click();
					resultDetails.setFlag(true);
					break;
				case "PLK":
					driver.findElement(By.partialLinkText(locator)).click();
					resultDetails.setFlag(true);
					break;
				default:
					System.out.println("Invalid Locator attribute");
					break;
				}

			}

			else if(operation.equalsIgnoreCase("SND")){

				switch (attribute) {
				case "IDI":
					driver.findElement(By.id(locator)).clear();
					driver.findElement(By.id(locator)).sendKeys(val);
					resultDetails.setFlag(true);
					break;
				case "XPH":
					driver.findElement(By.xpath(locator)).clear();
					driver.findElement(By.xpath(locator)).sendKeys(val);
					resultDetails.setFlag(true);
					break;
				case "LNK":
					driver.findElement(By.linkText(locator)).clear();
					driver.findElement(By.linkText(locator)).sendKeys(val);
					resultDetails.setFlag(true);
					break;
				default:
					System.out.println("Invalid Locator attribute");
					break;
				}

			} 
			else if(operation.equalsIgnoreCase("MTE")){
				switch (attribute) {
				case "IDI":
					new Actions(driver).moveToElement(driver.findElement(By.id(locator))).perform();
					break;
				case "XPH":
					new Actions(driver).moveToElement(driver.findElement(By.xpath(locator))).perform();
					resultDetails.setFlag(true);
					break;
				case "LNK":
					new Actions(driver).moveToElement(driver.findElement(By.linkText(locator))).perform();
					resultDetails.setFlag(true);
					break;
				default:
					System.out.println("Invalid Locator attribute");
					break;
				}

			}
			else if(operation.equalsIgnoreCase("SEL")){
				switch (attribute) {

				case "XPH":
					new Select(driver.findElement(By.xpath(locator))).selectByVisibleText(val);
					resultDetails.setFlag(true);
					break;
				case "IDI":
					new Select(driver.findElement(By.id(locator))).selectByVisibleText(val);
					resultDetails.setFlag(true);
					break;
				}
			}
				else if(operation.equalsIgnoreCase("CLR")){
				switch (attribute) {

				case "XPH":
					driver.findElement(By.xpath(locator)).clear();
					break;
				case "IDI":
					driver.findElement(By.id(locator)).clear();
					resultDetails.setFlag(true);
					break;

			}
		}
		}
		catch(Exception e){
			resultDetails.setFlag(false);
			e.printStackTrace();
		}
	}
	public boolean FACETS_COMPARISON(WebDriver driver,Integer totalCount)
	{
		try{

			boolean lotDisplay=driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).isDisplayed();
			boolean eventDisplay=driver.findElement(By.id("e1ResultsFound")).isDisplayed();
			boolean auctionDisplay=driver.findElement(By.id("e1AuctionsFound")).isDisplayed();

			String listingcount="";
			Integer convlistingcount=0;
			if(lotDisplay)
			{
				listingcount=driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText().replaceAll("\\D+", "");
				convlistingcount = Integer.parseInt(listingcount);
			}
			System.out.println(convlistingcount);

			String eventcount="";
			Integer conveventcount =0;
			if(eventDisplay)
			{
				eventcount=driver.findElement(By.id("e1ResultsFound")).getText().replaceAll("\\D+", "");
				conveventcount = Integer.parseInt(eventcount);

			}
			System.out.println(conveventcount);
			String auctioncount="";
			Integer convauctioncount =0;
			if(auctionDisplay)
			{
				auctioncount=driver.findElement(By.id("e1AuctionsFound")).getText().replaceAll("\\D+", "");
				convauctioncount = Integer.parseInt(auctioncount);

			}
			System.out.println(convauctioncount);
			Integer SumCount=convlistingcount+conveventcount+convauctioncount;
			System.out.println("Actual count: "+SumCount);
			if(SumCount.equals(totalCount))
				return true;
			else
				return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public void WAITFORTHIS(WebDriver driver,String fieldText, String value)
	{
		//Used to verify the text in any specific Loctor or Message
		//<XPH or LNK or IDI or TXT or MSG><Locator> in fieldText 
		//Time in milliseconds in Value
		try{ 

			String f = fieldText;
			String time=value;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			int timevalue=Integer.parseInt(time);
			driver.manage().timeouts().implicitlyWait(timevalue, TimeUnit.MILLISECONDS);

			if(locatorType.equalsIgnoreCase("XPH")){

				if(driver.findElements(By.xpath(locatorValue)).size()>0)
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){

				if(driver.findElements(By.linkText(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){

				if(driver.findElements(By.id(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("MSG")){

				int j=0;
				int t=timevalue/1000;
				for(int i=0;i<t;i++)
				{
					if(driver.findElement(By.xpath("//*[contains(text(),'"+locatorValue+"')]")).isDisplayed())
					{
						j=1;
						break;
					}
					Thread.sleep(1000);

				}
				if(j==1)
					resultDetails.setFlag(true);



			}
			else if(locatorType.equalsIgnoreCase("PLK")){

				if(driver.findElements(By.partialLinkText(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			} 
			else
			{
				Thread.sleep(Integer.parseInt(time));
				resultDetails.setFlag(true);
			}

		}

		catch(Exception e){
			resultDetails.setErrorMessage(fieldText+"Locator Not Found");
			resultDetails.setFlag(false);

		}
	}

	public void VERIFYTHIS(WebDriver driver,String fieldText, String value){
		//Used to verify the text in any specific Loctor or Message
		//<XPH or LNK or IDI or TXT><Locator> or MSG in fieldText 
		//Text or Message to be verified in Value
		try{ 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			String f = fieldText;
			String val=value;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			if(locatorType.equalsIgnoreCase("XPH")){	   
				System.out.println("Expected Value is: "+val);
				System.out.println("Actual Value is: "+driver.findElement(By.xpath(locatorValue)).getText());
				if(driver.findElement(By.xpath(locatorValue)).getText().equalsIgnoreCase(val))
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){

				if(driver.findElement(By.linkText(locatorValue)).getText().equalsIgnoreCase(val))
					resultDetails.setFlag(true);

			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){
				System.out.println("Expect text is: "+val);
				System.out.println("actual text is: "+driver.findElement(By.id(locatorValue)).getText());
				if(driver.findElement(By.id(locatorValue)).getText().equalsIgnoreCase(val))
					resultDetails.setFlag(true);

			}
			else if(locatorType.equalsIgnoreCase("MSG")){
				Thread.sleep(2000);
				int j=0;
				for(int i=0;i<20;i++)
				{
					if(driver.findElement(By.xpath("//*[contains(text(),'"+val+"')]")).isDisplayed())
					{
						j=1;
						break;
					}
					Thread.sleep(1000);

				}
				if(j==1)
					resultDetails.setFlag(true);



			}

			else if(locatorType.equalsIgnoreCase("TTL")){
				int j=0;
				for(int i=0;i<20;i++)
				{
					if(driver.getTitle().equalsIgnoreCase(val))
					{
						j=1;
						break;
					}
					Thread.sleep(1000);

				}
				if(j==1)
					resultDetails.setFlag(true);

			}
			else if(locatorType.equalsIgnoreCase("URL")){
				int j=0;
				/* if(fieldText.contains("contains"))
		    	   {
		    		   for(int i=0;i<20;i++)
		    		   {
		    			   if(driver.getCurrentUrl().contains(value))
		    			   {
		    				   j=1;
		    				   break;
		    			   }
		    			   Thread.sleep(1000);

		    		   }
		    	   }
		    	   else
		    	   {*/
				for(int i=0;i<20;i++)
				{
					if(driver.getCurrentUrl().equalsIgnoreCase(val))
					{
						j=1;
						break;
					}
					Thread.sleep(1000);

				}
				// }
				if(j==1)
					resultDetails.setFlag(true);
			}
		}

		catch(Exception e){

			resultDetails.setErrorMessage(fieldText+" Text is not matching with that of the locator (or) the locator not found");
			e.printStackTrace();
			resultDetails.setFlag(false);
		}

	}
	public void VISIBLE(WebDriver driver,String fieldText, String value){
		//To verify whether a locator is visible
		//FieldText---Locator
		//value----Time in ms
		try{
			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			String val1=value;
			int val=Integer.parseInt(val1);
			driver.manage().timeouts().implicitlyWait(val, TimeUnit.MILLISECONDS);
			if(locatorType.equalsIgnoreCase("XPH")){
				//System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
				if(driver.findElement(By.xpath(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){

				if(driver.findElement(By.linkText(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){

				if(driver.findElement(By.id(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("MSG")){

				if(driver.findElement(By.xpath("//*[contains(text(),'"+locatorValue+"')]")).isDisplayed())
					resultDetails.setFlag(true);
			}
		}
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Element is Not Visible");  
			resultDetails.setFlag(false);

		}


	}

	public void NOTVISIBLE(WebDriver driver,String fieldText,String value){
		//To verify whetheer a locator is NOT visible
		//FieldText---Locator
		//value----Time in ms
		try{
			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			String val1=value;
			int val=Integer.parseInt(val1);
			driver.manage().timeouts().implicitlyWait(val, TimeUnit.MILLISECONDS);
			if(locatorType.equalsIgnoreCase("XPH")){
				//System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
				if(!driver.findElement(By.xpath(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){

				if(!driver.findElement(By.linkText(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){

				if(!driver.findElement(By.id(locatorValue)).isDisplayed())
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("MSG")){

				if(!driver.findElement(By.xpath("//*[contains(text(),'"+locatorValue+"')]")).isDisplayed())
					resultDetails.setFlag(true);
			}
		}
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Element is Visible");  
			resultDetails.setFlag(false);
		}

	}
	public void VERIFYNOT(WebDriver driver,String fieldText,String value){
		//To verify that the locator doesn't exist
		//FieldText---Locator
		//value----Time in ms
		//Give lesser Time like 2000,or else the execution will wait that much time
		try{ 

			String f = fieldText;
			String time=value;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			int timevalue=Integer.parseInt(time);

			driver.manage().timeouts().implicitlyWait(timevalue, TimeUnit.MILLISECONDS);

			if(locatorType.equalsIgnoreCase("XPH")){
				if(driver.findElements(By.xpath(locatorValue)).size()==0)
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){

				if(driver.findElements(By.linkText(locatorValue)).size()==0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){

				if(driver.findElements(By.id(locatorValue)).size()==0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("MSG")){

				int j=0;
				int t=timevalue/1000;
				for(int i=0;i<t;i++)
				{
					if(driver.findElements(By.xpath("//*[contains(text(),'"+locatorValue+"')]")).size()==0)
					{
						j=1;
						break;
					}
					Thread.sleep(1000);

				}
				if(j==1)
					resultDetails.setFlag(true);



			}
			else if(locatorType.equalsIgnoreCase("PLK")){

				if(driver.findElements(By.partialLinkText(locatorValue)).size()==0)
					resultDetails.setFlag(true);


			}  

		}
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Element is Present");  
			resultDetails.setFlag(false);
		}

	}
	public void CHECKED(WebDriver driver,String fieldText){
		//To verify that a checkbox is checked
		//FieldText---Locator
		try{
			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			if(locatorType.equalsIgnoreCase("XPH")){
				//System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
				if(driver.findElement(By.xpath(locatorValue)).isSelected())
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("IDI")){

				if(driver.findElement(By.id(locatorValue)).isSelected())
					resultDetails.setFlag(true);

			}
		}

		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Element is not checked");  
			resultDetails.setFlag(false);
		}
	}
	public void SEARCHLOTINEQWITHEQID(WebDriver driver,String pagename)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try{
			Thread.sleep(5000);
			if(pagename.equalsIgnoreCase("LotDetailsPage"))
			{
				eqid_1=driver.findElement(By.xpath("//div[@class='e2lot-result rgbold jsLotID']")).getText();
				System.out.println("Lot id is:" +eqid_1);
			}
			else if(pagename.equalsIgnoreCase("SEARCHRESULTPAGE"))
			{
				eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
				System.out.println("Lot id is:" +eqid_1);
			}
			else if(pagename.equalsIgnoreCase("HOMEPAGE"))	
			{
				eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
				System.out.println("Lot id is:" +eqid_1);
				//moving to home page
				driver.findElement(By.xpath("//a/img[@class='logo-img img-responsive']")).click();
			}
			else if(pagename.equalsIgnoreCase("MYONEPAGE"))
			{
				eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
				System.out.println("Lot id is:" +eqid_1);
				//moving to MyOne page
				driver.findElement(By.xpath("(//a[contains(text(),'MyOne')])[2]")).click();
			}
			Thread.sleep(5000);
			//searching with above lot id
			driver.findElement(By.id("search")).sendKeys(eqid_1);
			driver.findElement(By.xpath("//*[@id='main_search']/button")).click();
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='search-tags']/ul/li[text()='"+eqid_1+"'])[2]")));


			String actual_eqid=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
			//checking the size of search result elements, first 2 are invisible elements and each lot is having 2 more elements, so size should not exceed 4
			int size=driver.findElements(By.xpath("(//div[@class='rgbold jsLotID myone-black'])")).size();
			System.out.println("Size is: "+size);
			if(size==4 && actual_eqid.equalsIgnoreCase(eqid_1))
				System.out.println("Lot id's matched");
				resultDetails.setFlag(true);

		}
		catch(Exception e)
		{
			System.out.println(e);
			resultDetails.setFlag(false);
		}

	}
	public void SWITCHWINDOW(WebDriver driver,String WindowNumber) {

		try {
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			Thread.sleep(5000);	
			String mainwindow=driver.getWindowHandle();
			try{
			driver.findElement(By.xpath("//span[@class='auction-text']")).click();
			Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			for(String winHandle : driver.getWindowHandles()) {
				if(!mainwindow.equals(winHandle))
				{
					Thread.sleep(5000);
					driver.switchTo().window(winHandle);
					TOYOTAFORESEE(driver);
					String adminuser=driver.findElement(By.id("iduser")).getText();
					if(adminuser.equalsIgnoreCase("Toyota Admin"))
					{
						System.out.println("Successfully navigated with logged in user");
					}
					else
					{
						System.out.println("Unsuccessful navigation");
					}
					TOYOTALOGOUT(driver);
					driver.close();
			}
			}
			driver.switchTo().window(mainwindow);
		}
		else
		{
			if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
				Thread.sleep(5000);	
			String mainwindow=driver.getWindowHandle();
			try{
			driver.findElement(By.xpath("//span[@class='auction-text']")).click();
			Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			for(String winHandle : driver.getWindowHandles()) {
				if(!mainwindow.equals(winHandle))
				{
					Thread.sleep(5000);
					driver.switchTo().window(winHandle);
					TOYOTAFORESEE(driver);
					String dealeruser=driver.findElement(By.id("iduser")).getText();
					if(dealeruser.equalsIgnoreCase("Jesse Barbes"))
					{
						System.out.println("Successfully navigated with logged in user");
					}
					else
					{
						System.out.println("Unsuccessful navigation");
					}
					TOYOTALOGOUT(driver);
					driver.close();
			}
			}
			driver.switchTo().window(mainwindow);
			}
		}
		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}   
    public void SIGNIN_TOYOTA(WebDriver driver, String fieldText, String value)
	{
			try{
				WebDriverWait wait= new WebDriverWait(driver, 20);
				// wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//driver.manage().deleteAllCookies();
				ParantWindow=driver.getWindowHandle();
				System.out.println("ParantWindow is: "+ParantWindow);
				// driver.findElement(By.linkText("Sign In")).click();
				driver.findElement(By.name("josso_username")).clear();
				driver.findElement(By.name("josso_username")).sendKeys(fieldText);
				driver.findElement(By.name("josso_password")).clear();
				driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
				try{
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[text()='Sign In']")).click();
					Thread.sleep(5000);
					String jsusername=driver.findElement(By.id("jsuserNme")).getText();
					System.out.println(jsusername);
					String[] user=jsusername.split(": ");
					System.out.println(user);
					String welcome=user[0];
					String username=user[1];
					System.out.println(welcome);
					System.out.println(username);
					if(username.equalsIgnoreCase(value))
					{
						System.out.println("Successfully Logged in");
					}
					else{
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.findElement(By.linkText("Log Out")).click();
						wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("josso_password")));
						driver.findElement(By.name("josso_username")).clear();
						driver.findElement(By.name("josso_username")).sendKeys(fieldText);
						driver.findElement(By.name("josso_password")).clear();
						driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
						driver.findElement(By.xpath("//button[text()='Sign In']")).click();
					}
				}
				catch(Exception elementnotfoundexException)
				{
					driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
					Thread.sleep(2000);
					String username=driver.findElement(By.id("iduser")).getText();
					System.out.println(username);
				    if(username.equalsIgnoreCase(value))
					{
						System.out.println("Successfully Logged in");
					}
					else{
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.findElement(By.linkText("Sign Out")).click();
						wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("josso_password")));
						driver.findElement(By.name("josso_username")).clear();
						driver.findElement(By.name("josso_username")).sendKeys(fieldText);
						driver.findElement(By.name("josso_password")).clear();
						driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
						driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
					}
				}
				resultDetails.setFlag(true);
			}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}

	} 
	public void TOYOTALOGOUT(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			try{
			driver.findElement(By.linkText("Log Out")).click();
			}
			catch(Exception elementnotfoundexException)
			{
				driver.findElement(By.linkText("Sign Out")).click();
			}
				resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void VERIFYINSPECTSTATUS(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
			driver.findElement(By.xpath("//input[@name='account_iobj_number']")).sendKeys("143141");
			driver.findElement(By.xpath("//input[contains(@id,'liens') and @value='0']")).click();
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@id,'full_maintenance') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'attachments') and @value='0']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[@name='class']")).sendKeys("IV");
			driver.findElement(By.xpath("//input[@name='max_fork_height']")).sendKeys("143");
			driver.findElement(By.xpath("//input[@name='lowered_height']")).sendKeys("12");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='power_type']"))).selectByVisibleText("Electric");
			new Select(driver.findElement(By.xpath("//select[@name='mast_Type']"))).selectByVisibleText("FSV");
			new Select(driver.findElement(By.xpath("//select[@name='tire_Type']"))).selectByVisibleText("Cushion-Nonmarking");
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			new Select(driver.findElement(By.xpath("//select[@name='faim_type_code']"))).selectByVisibleText("Electric Forklift");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@id,'battery') and @value='1']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'charger') and @value='1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			new Select(driver.findElement(By.xpath("//select[@name='location_dealer_id']"))).selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'ORDER INSPECTION')])[1]")).click();
			Thread.sleep(5000);
			String resunitid=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[2]")).getText();
			if(resunitid.equalsIgnoreCase(unitid))
			{
				System.out.println("Unit Id's matched");
			}
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("jbarbes@bellforklift.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String status=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(status.equalsIgnoreCase("Inspect"))
			{
				System.out.println("Status changed to "+status+" Successfully");
				resultDetails.setFlag(true);
			}	
		}
			catch(Exception e)
		    {
			e.printStackTrace();
		    }
	}
	public void PRICEUNITSCOUNT(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			//WebDriverWait wait= new WebDriverWait(driver, 20);
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Price Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//a[@class='welllink ng-binding'])[3]")).click();
			Thread.sleep(2000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Price Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'PRE')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Price Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Price Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a-1) && c==(b-1))
			{
				System.out.println("Price unit Count is decremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void PASSEDUNITSCOUNT(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try{
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
			driver.findElement(By.xpath("//input[@name='account_iobj_number']")).clear();
			driver.findElement(By.xpath("//input[@name='account_iobj_number']")).sendKeys("143141");
			driver.findElement(By.xpath("//input[contains(@id,'liens') and @value='0']")).click();
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@id,'full_maintenance') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'attachments') and @value='0']")).click();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).clear();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[@name='class']")).sendKeys("IV");
			driver.findElement(By.xpath("//input[@name='max_fork_height']")).sendKeys("143");
			driver.findElement(By.xpath("//input[@name='lowered_height']")).sendKeys("12");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='power_type']"))).selectByVisibleText("Electric");
			new Select(driver.findElement(By.xpath("//select[@name='mast_Type']"))).selectByVisibleText("FSV");
			new Select(driver.findElement(By.xpath("//select[@name='tire_Type']"))).selectByVisibleText("Cushion-Nonmarking");
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			new Select(driver.findElement(By.xpath("//select[@name='faim_type_code']"))).selectByVisibleText("Electric Forklift");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@id,'battery') and @value='1']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'charger') and @value='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//select[@name='location_dealer_id']/option[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='location_contact']")).sendKeys("KEN");
			driver.findElement(By.xpath("//input[@name='location_email']")).sendKeys("ken@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).click();
			Thread.sleep(2000);
			String passedstatus=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(passedstatus.equalsIgnoreCase("Pre-inspection"))
			{
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(c==(b+1) && d==(a+1))
			{
				System.out.println("Passed unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		else
		{
			if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
		    Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).clear();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			new Select(driver.findElement(By.xpath("//select[@name='location_dealer_id']"))).selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).click();
			Thread.sleep(2000);
			String passedstatus=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(passedstatus.equalsIgnoreCase("Pre-inspection"))
			{
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(c==(b+1) && d==(a+1))
			{
				System.out.println("Passed unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
		}
		}
		}
		}		
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void SEARCHWITHUNITID(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String resunitid=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[2]")).getText();
			if(resunitid.equalsIgnoreCase(unitid))
			{
				System.out.println("Unit Id's matched");
				resultDetails.setFlag(true);
			}
		}
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void SEARCHWITHSERIALNUM(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String serialnum=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[6])[1]")).getText();
			System.out.println("Serial Number is:" +serialnum);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(serialnum);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String resserialnum=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[6]")).getText();
			if(resserialnum.equalsIgnoreCase(serialnum))
			{
				System.out.println("Serial Number's matched");
				resultDetails.setFlag(true);
			}
		}
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void VERIFYSOLDTAB(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			String residualvalue=driver.findElement(By.xpath("//span[@name='Residual_Value']")).getText();
			System.out.println("Residual Value is:" +residualvalue);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			new Select(driver.findElement(By.xpath("//select[@name='location_dealer_id']"))).selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'BUY')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM PURCHASE')]")).click();
			Thread.sleep(2000);
			String unitstatus=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(unitstatus.equalsIgnoreCase("Purchased"))
			{
				System.out.println("Status has been changed to "+unitstatus+" Successfully");
			}
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			String soldprice=driver.findElement(By.xpath("//p[@class='dataresult ng-pristine ng-untouched ng-valid ng-binding']")).getText();
			System.out.println("Sold price is:" +soldprice);
			if(residualvalue.equalsIgnoreCase(soldprice))
			{
				System.out.println("Sold price is matched with Residual value");
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void GETDATE(WebDriver driver){
		try{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).click();
		Thread.sleep(3000);
		String date2 = driver.findElement(By.xpath("(//span[@class='ng-binding'])[2]")).getText();
		System.out.println(date2);
		if(date1.equalsIgnoreCase(date2))
		{
			resultDetails.setFlag(true);
		}
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false);
		}
	}
	public void PREINSPECTTOREPAIR(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("20-PREINSPECT");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count4);
			int d=Integer.parseInt(count4);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[6]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Repair"))
			{
			 System.out.println("The status of an unit is successfully changed from Pre-inspect to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count5=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count5);
			int e=Integer.parseInt(count5);
			String count6=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count6);
			int f=Integer.parseInt(count6);
			String count7=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count7);
			int g=Integer.parseInt(count7);
			String count8=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count8);
			int h=Integer.parseInt(count8);
			if(f==(d+1) && h==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				if(e==(c-1) && g==(a-1))
				{
					System.out.println("Passed unit Count is decremented by one in body page and start screen");
				}
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void PREINSPECTTOHOLD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("20-PREINSPECT");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count4);
			int d=Integer.parseInt(count4);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Hold"))
			{
			System.out.println("The status of an unit is successfully changed from Pre-inspect to"+" "+Status);
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count5=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count5);
			int e=Integer.parseInt(count5);
			String count6=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count6);
			int f=Integer.parseInt(count6);
			String count7=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count7);
			int g=Integer.parseInt(count7);
			String count8=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count8);
			int h=Integer.parseInt(count8);
			if(f==(d+1) && h==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				if(e==(c-1) && g==(a-1))
				{
					System.out.println("Passed unit Count is decremented by one in body page and start screen");
				}
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void INSPECTTOHOLD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("21-INSPECT");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Hold"))
			{
			System.out.println("The status of an unit is successfully changed from Inspect to"+" "+Status);
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void INSPECTTOREPAIR(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("21-INSPECT");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[6]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Repair"))
			{
			 System.out.println("The status of an unit is successfully changed from Inspect to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void VERIFYHOLDSTATUS(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("jbarbes@bellforklift.com ");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String status=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(status.equalsIgnoreCase("Hold"))
			{
				System.out.println("Status changed to "+status+" Successfully");
				resultDetails.setFlag(true);
			}	
		}		
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void LEASEDTOHOLD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).click();
			Thread.sleep(5000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Hold"))
			{
			System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		else
		{
			if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'HOLD')]")).click();
			Thread.sleep(5000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Hold"))
			{
			System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void LEASEDTOREPAIR(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[6]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Repair"))
			{
			System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
			}
			else
		{
			if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(3000);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[5]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Repair"))
			{
			System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a+1) && c==(b+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		}
			}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void BUTTONSENABLED(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	    if(driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).isEnabled())	 
			{
				System.out.println("Pass button is enabled");
				if(driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[2]")).isEnabled())
				{
					System.out.println("Repair button is enabled");
				}
				if(driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).isEnabled())
				{ 
					System.out.println("hold button is enabled");
				}
				if(driver.findElement(By.xpath("//a[@class='jsTabEdit']")).isEnabled())
				{
					System.out.println("edit link is enabled");
                    resultDetails.setFlag(true);
				}
	        }			
			else
			{
				System.out.println("buttons are disabled");
        	}
        }
			else
			{
				if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	    if(driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).isEnabled())	 
			{
				System.out.println("Pass button is enabled");
				if(driver.findElement(By.xpath("//button[contains(text(),'REPAIR')]")).isEnabled())
				{
					System.out.println("Repair button is enabled");
				}
				if(driver.findElement(By.xpath("//button[contains(text(),'HOLD')]")).isEnabled())
				{ 
					System.out.println("hold button is enabled");
				}
				if(driver.findElement(By.xpath("//a[@class='jsTabEdit']")).isEnabled())
				{
					System.out.println("edit link is enabled");
                    resultDetails.setFlag(true);
				}
	        }			
			else
			{
				System.out.println("buttons are disabled");
        	}
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void RETURNEDUNITSHOLD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).click();
			Thread.sleep(2000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Hold"))
			{
			 System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("jbarbes@bellforklift.com ");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(c==(b+1) && d==(a+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void RETURNEDUNITSREPAIR(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			Thread.sleep(3000);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[6]")).click();
			Thread.sleep(3000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Repair"))
			{
			 System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("jbarbes@bellforklift.com ");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[1]")).getText();
			System.out.println("Returned Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(c==(b+1) && d==(a+1))
			{
				System.out.println("Returned unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void DEALERPASSEDUNITS(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.linkText("Log Out")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
			driver.findElement(By.xpath("//input[@name='account_iobj_number']")).sendKeys("143141");
			driver.findElement(By.xpath("//input[contains(@id,'liens') and @value='0']")).click();
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'full_maintenance') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'attachments') and @value='0']")).click();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[@name='class']")).sendKeys("IV");
			driver.findElement(By.xpath("//input[@name='max_fork_height']")).sendKeys("143");
			driver.findElement(By.xpath("//input[@name='lowered_height']")).sendKeys("12");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='power_type']"))).selectByVisibleText("Electric");
			new Select(driver.findElement(By.xpath("//select[@name='mast_Type']"))).selectByVisibleText("FSV");
			new Select(driver.findElement(By.xpath("//select[@name='tire_Type']"))).selectByVisibleText("Cushion-Nonmarking");
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			new Select(driver.findElement(By.xpath("//select[@name='faim_type_code']"))).selectByVisibleText("Electric Forklift");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@id,'battery') and @value='1']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'charger') and @value='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//select[@name='location_dealer_id']/option[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='location_contact']")).sendKeys("KEN");
			driver.findElement(By.xpath("//input[@name='location_email']")).sendKeys("ken@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("jbarbes@bellforklift.com ");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			String Status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			if(Status.equalsIgnoreCase("Pre-inspection"))
			{
			 System.out.println("The status of an unit is successfully changed from Leased to"+" "+Status);
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[3]")).getText();
			System.out.println("Passed Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(c==(b+1) && d==(a+1))
			{
				System.out.println("Passed unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void BUTTONSDISABLED(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).click();
				if(driver.findElement(By.xpath("(//button[contains(text(),'HOLD')])[2]")).isEnabled())
				{ 
					System.out.println("hold button is enabled");
				}
				else
				{
					System.out.println("hold button is disabled");
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[text()='SAVE'])[6]")).click();
				Thread.sleep(3000);
				if(driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[2]")).isEnabled())
				{
					System.out.println("Repair button is enabled");
				}
				else
				{
					System.out.println("Repair button is disabled");
				}
			resultDetails.setFlag(true);
        }            
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void SETFORESEE(WebDriver driver) 
	{  

		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://qa.equipmentone.com/#acscommand=fstest");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
			driver.findElement(By.xpath("//input[@name='tablet_web']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@name='mobile_web']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@name='browse']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@value='Set']")).click();
			Thread.sleep(1000);
			driver.get("http://qa.equipmentone.com");
			resultDetails.setFlag(true);
			}
		catch (Exception e )
		{
		System.out.println("values are not set");
		resultDetails.setFlag(false);
		}
	}
	public void TOYOTAFORESEE(WebDriver driver) 
	{  

		try {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://toyota-qa.equipmentone.com/#acscommand=fstest");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//input[@value='Clear']")).click();
			driver.findElement(By.xpath("//input[@name='tablet_web']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@name='mobile_web']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@name='browse']")).sendKeys("0");
			driver.findElement(By.xpath("//input[@value='Set']")).click();
			Thread.sleep(1000);
			driver.get("http://toyota-qa.equipmentone.com");
			resultDetails.setFlag(true);
			}
		catch (Exception e )
		{
		System.out.println("values are not set");
		resultDetails.setFlag(false);
		}
	}
	public void VERIFYDEALERSTATUSHOLD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try{
			Thread.sleep(2000);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'HOLD')]")).click();
			Thread.sleep(5000);
			String dealerstatus=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(dealerstatus.equalsIgnoreCase("Hold"))
			{
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String status=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(status.equalsIgnoreCase(dealerstatus))
			{
				System.out.println("Status changed to "+status+" Successfully");
			}
			resultDetails.setFlag(true);
		}
		}		
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void VERIFYDEALERSTATUSREPAIR(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			Thread.sleep(2000);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'REPAIR')])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//textarea[@name='Repair_Comments'])[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[5]")).click();
			Thread.sleep(3000);
			String dealerstatus=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(dealerstatus.equalsIgnoreCase("Repair"))
			{
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String status=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(status.equalsIgnoreCase(dealerstatus))
			{
				System.out.println("Status changed to "+status+" Successfully");
				resultDetails.setFlag(true);
			}	
			}
		}		
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void VERIFYDEALERSTATUSPASS(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			Thread.sleep(2000);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
		    Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).clear();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			new Select(driver.findElement(By.xpath("//select[@name='location_dealer_id']"))).selectByIndex(2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'PASS')])[1]")).click();
			Thread.sleep(5000);
			String dealerstatus=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(dealerstatus.equalsIgnoreCase("Pre-inspection"))
			{
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("josso_username")).clear();
			driver.findElement(By.name("josso_username")).sendKeys("toyotaadmin@jarus.com");
			driver.findElement(By.name("josso_password")).clear();
			driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@name='searchkey'])[1]")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			String status=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[1]")).getText();
			if(status.equalsIgnoreCase(dealerstatus))
			{
				System.out.println("Status changed to "+status+" Successfully");
				resultDetails.setFlag(true);
			}
		}	
		}		
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
	public void ADVANCEDSEARCH(WebDriver driver, String fieldText, String value) {

		String fieldType = fieldText;
		String field = fieldText;
		try {
			AppKeyWords ADV = AppKeyWords.valueOf(fieldType.toUpperCase());			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (ADV) {

			case UNITID:

			try {
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Advanced Search'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Unit_ID']")).sendKeys(unitid);
			driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
			String resunitid=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[2]")).getText();
			if(resunitid.equalsIgnoreCase(unitid))
			{
				System.out.println("Unit Id's matched");
				resultDetails.setFlag(true);
			}
			}
			else
			{
				if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Advanced Search'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Unit_ID']")).sendKeys(unitid);
			driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
			String resunitid=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[2]")).getText();
			if(resunitid.equalsIgnoreCase(unitid))
			{
				System.out.println("Unit Id's matched");
				resultDetails.setFlag(true);
			}
			}
			}
			}
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
			break;
			
			case SNVIN:
			
			try {
			String user=driver.findElement(By.id("jsuserNme")).getText();
			if(user.equalsIgnoreCase("Welcome: Toyota Admin"))
			{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String vin=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[6])[1]")).getText();
			System.out.println("SN/VIN is:" +vin);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Advanced Search'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='VIN_Serial']")).sendKeys(vin);
			driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
			String resvin=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[6]")).getText();
			if(resvin.equalsIgnoreCase(vin))
			{
				System.out.println("SN/VIN is matched");
				resultDetails.setFlag(true);
			}
			}
			else
			{
				if(user.equalsIgnoreCase("Welcome: Jesse Barbes"))
			{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String vin=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[6])[1]")).getText();
			System.out.println("SN/VIN is:" +vin);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Advanced Search'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='VIN_Serial']")).sendKeys(vin);
			driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
			String resvin=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[6]")).getText();
			if(resvin.equalsIgnoreCase(vin))
			{
				System.out.println("SN/VIN is matched");
				resultDetails.setFlag(true);
			}
			}
			}
			}
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
			break;
		}
		} catch (Exception e) {
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false);
		}
	}
	public void BOUGHTUNITSCOUNT(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			//WebDriverWait wait= new WebDriverWait(driver, 20);
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Bought Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Bought Unit Count on body page is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//input[@name='searchkey'])[1]")).sendKeys("01-Leased");
			driver.findElement(By.xpath("//button[@class='fa fa-search search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='btn btn-default essdate-picker'])[3]")).click();
			driver.findElement(By.xpath("//*[@ng-click='move(1)']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			String locationdealername=driver.findElement(By.xpath("//div[@class='item']")).getText();
			if(locationdealername.equalsIgnoreCase("Milea Truck Sales of Queens, Inc."))
			{
			driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='option selected active' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
			Thread.sleep(2000);
			}
			else
			{
				driver.findElement(By.xpath("//*[contains(@id,'data_row')]/div[1]/div[2]/form/div[1]/div[1]/div[1]/p[2]/div/div[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='option' and @data-value='Milea Truck Sales of Queens, Inc.'])[1]")).click();
				Thread.sleep(2000);
			}
			new Select(driver.findElement(By.xpath("//select[@name='location_dealer_id']"))).selectByIndex(2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Equipment')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='jsTabEdit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).clear();
			driver.findElement(By.xpath("//input[@name='miles_drive_hours']")).sendKeys("1431");
			driver.findElement(By.xpath("//input[contains(@id,'modified_') and @value='0']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'operable_')and @value='1']")).click();
			new Select(driver.findElement(By.xpath("//select[@name='type_operation']"))).selectByVisibleText("Automotive");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[text()='SAVE'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'BUY')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM PURCHASE')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[2]")).getText();
			System.out.println("Bought Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[2]")).getText();
			System.out.println("Bought Unit Count on Start screen is:" +count4);
			int d=Integer.parseInt(count4);
			if(d==(a-1) && c==(b-1))
			{
				System.out.println("Bought unit Count is incremented by one in body page and start screen");
				resultDetails.setFlag(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void EXPIREDTOAUCTION(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			//WebDriverWait wait= new WebDriverWait(driver, 20);
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on Start Screen is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//a[@class='welllink ng-binding'])[5]")).click();
			Thread.sleep(2000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on body page is:" +count4);
			int d=Integer.parseInt(count4);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn btn-block btn-market ess-btn-blue']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(10000);
			String status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			System.out.println("Status of the unit successfully moved from Expired to"+ status);
			if(status.equalsIgnoreCase("Online Auction"))
			{
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count5=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on body page is:" +count5);
			int e=Integer.parseInt(count5);
			String count6=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on body page is:" +count6);
			int f=Integer.parseInt(count6);
			String count7=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on Start screen is:" +count7);
			int g=Integer.parseInt(count7);
			String count8=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on Start screen is:" +count8);
			int h=Integer.parseInt(count8);
			if(g==(a+1) && e==(c+1))
			{
				System.out.println("Auction unit Count is incremented by one in body page and start screen");
				if(h==(b-1) && f==(d-1))
				{
					System.out.println("Expired unit Count is decremented by one in body page and start screen");
				}
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void EXPIREDTOLIVEAUCTION(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			//WebDriverWait wait= new WebDriverWait(driver, 20);
			String count1=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on Start Screen is:" +count1);
			int a=Integer.parseInt(count1);
			String count2=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on Start Screen is:" +count2);
			int b=Integer.parseInt(count2);
			driver.findElement(By.xpath("(//a[@class='welllink ng-binding'])[5]")).click();
			Thread.sleep(2000);
			String count3=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on body page is:" +count3);
			int c=Integer.parseInt(count3);
			String count4=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on body page is:" +count4);
			int d=Integer.parseInt(count4);
			driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn btn-block repair ess-btn-blue']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'CONFIRM STATUS CHANGE')]")).click();
			Thread.sleep(10000);
			String status=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[1])[1]")).getText();
			System.out.println("Status of the unit successfully moved from Expired to"+ status);
			if(status.equalsIgnoreCase("Live Auction"))
			{
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			String count5=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on body page is:" +count5);
			int e=Integer.parseInt(count5);
			String count6=driver.findElement(By.xpath("(//span[@class='badge template-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on body page is:" +count6);
			int f=Integer.parseInt(count6);
			String count7=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[4]")).getText();
			System.out.println("Auction Unit Count on Start screen is:" +count7);
			int g=Integer.parseInt(count7);
			String count8=driver.findElement(By.xpath("(//span[@class='badge template-well-badge ng-binding'])[5]")).getText();
			System.out.println("Expired Unit Count on Start screen is:" +count8);
			int h=Integer.parseInt(count8);
			if(g==(a+1) && e==(c+1))
			{
				System.out.println("Auction unit Count is incremented by one in body page and start screen");
				if(h==(b-1) && f==(d-1))
				{
					System.out.println("Expired unit Count is decremented by one in body page and start screen");
				}
				resultDetails.setFlag(true);
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void SEARCHINRETURNUNITFIELD(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String unitid=driver.findElement(By.xpath("(//tr[contains(@id,'essrow')]/td[2])[1]")).getText();
			System.out.println("Unit Id is:" +unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='responsive-img']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='returnuinit']")).sendKeys(unitid);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
			String resunitid=driver.findElement(By.xpath("//tr[contains(@id,'essrow')]/td[2]")).getText();
			if(resunitid.equalsIgnoreCase(unitid))
			{
				System.out.println("Unit Id's matched");
				resultDetails.setFlag(true);
			}
		}
			catch(Exception e)
		    {
			e.printStackTrace();
			resultDetails.setFlag(false);
		    }
	}
}