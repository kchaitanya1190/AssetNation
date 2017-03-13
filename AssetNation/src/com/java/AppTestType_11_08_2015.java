package com.java;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Properties;
import java.util.Random;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Date;















import org.apache.bcel.generic.RETURN;
//import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import com.java.objects.*;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.commands.GetText;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.script.*;



 public class AppTestType_11_08_2015{

	public enum AppKeyWords{
		LNK,BTN,XPH,EXACTOFFER,AMPTOOL,USR,COMPARE,SOURCESITE, LISTELEMENTS, NEWUSERREGISTRATION, CONTENTMNGR, TYPE,CSS, NAME, listing, ACCEPTDLG,
		ELISTINGS, APPROVEDLG,SEARCHFILTERS, FORGOTPASSWORD,SEARCHGLB, MAXINEVENTPAGE, VERIFYUSERINAMP, DELCOOKIES, READCSV, RANDOMMOBILE, REDIRECT, AMPLOGIN, COMMERCIALLISTINGS, GETDATETIME, MAKEOFFERFROMWATCHLIST, BROWSEALLEVENTS, BROWSEALLLISTINGS,MAKE,FACETS, MODEL, COUNTRY, STATE, ELEMENTPRESENT, SER, AGRI, SEARCHRESULTS, TRANS, CONS, ENER, USERTAB, LOGOUT, COMPARELISTINGS, GETLISTINGSCOUNT,
		MAXOFFERINDETAILSPAGE, EXACTOFFERINDETAILSPAGE, MAXOFFERINSEARCHRESULTSPAGE, EXACTOFFERINSEARCHRESULTSPAGE, ADDTOWATCHLIST, MAXOFFERFROMEVENTS, EXACTOFFERFROMEVENTS, BINOFFERFROMSEARCH, BINOFFERFROMLISTINGPAGE,VISITOR,MAKEOFFERBTN,CLOSINGTODAY,DSALE,NEWLISTINGS,EVENTS,ALERTINEMAILPREF,CONFIRMOFFER,LISTVIEWTITLE,
		OFFERS,CHANGEPASSWORD,FROMSEARCH,EA,VERIFYSITEMAPCOUNT,CLICKONNEXTCONFIRMATION,EQITQUESFWDTOSELLER,BUYINGSALESINMYONE,WATCHINGINMYONE,COMMERCIAL,BUYINGMYOFFER,BUYINGQA,MYSALES,LITEUSERREGISTRATION,SUBMITTEDASSET,PENDINGLISTING, DEFAULTOFFER,SELLERPAGE,FORWARDTOPM,DRAFTLISTING, FORWARDTOMM,FORWARDTOSELLER,FORWARDTOSTORAGE, MYBUYING,BUYINGINMYONE,PROFILE, FROMLISTING,USERLOGIN, BROWSEALL,GETUSERDETAILS, BROWSEE1, SEARCH, POSTALCODE, QA, SAVESEARCH, NAVIGATETOLISTINGDETAILSPAGE, USERAMP, PULLDOWNMENUS, SAVE, RECENT, WATCH, OFFERINEVENTSPAGE, OFFERFROMWATCHLIST, DEVLOGIN, LOGIN, WRNGEMAIL, WRNGPWD, WRGNEMAILPWD, MOUSEHOVER, USERPULLDOWN,LOTSTAB, VERIFYQAINAMP, REJECTQUES, LOADNEWUSERREG, AUTOSUGGEST, EMAILPREF, RBA, EO, Events, Closingtoday, DSale, NewListings, SELECTALL, UNCHECKONE, SEARCHPAGE, LISTINGPAGE, E1RBA, E1RBAINSEARCH, E1, E1INSEARCH, RBAINSEARCH, ALLEQUIPMENTLINK, CATEGORY, BUY, MYOFFERS, SELLERCHOICE, PAYMENTS, REMOVALS, HISTORY, SCHCE, MYEVENTS, EXACTINEVENTPAGE, MAXOFFER,AGREETERMS,
		MYOPERATION,SIGNIN,SIGNOUT,WAITFORTHIS,VERIFYTHIS}
		
	
     final int MAX_STALE_ELEMENT_RETRIES = 5;
     int retries=0;
     int add = 100;
     
     
     
     
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String Time = cal.getTime().toString();
		
	//public enum Click{CLICKIT,LNK}
	
	public enum keywords{fposition, sposition, tposition, USR, LGN}


	
public String getvalue, Value1, Value2, Value3, Value4, Value5, Value6, Value7, Value8, Value9, ListingsID,Listingtitle, AssetID,ListingID, LOTNUMBER,ID;
public int result2, result1, result4, result5, result6, result7, result8, result9;



//private String getvalue;
//private String user;
WebDriver driver1;
int adding = 100;
String convertadding = String.valueOf(adding);



//WebDriver drivermmtool;

// UNCOMMENT COMPARE METHOD WHEN WORKING WITH IT.


	
	TestType tt;
	
	public AppTestType_11_08_2015(TestType tt){
		this.tt = tt;
		
		
		
	}
	
	private ResultDetails resultDetails = new ResultDetails();
	
	
	
	public ResultDetails performAction(WebDriver webdriver, String fieldText, String value, String action, String fieldName) {
		try {
			
			

			AppKeyWords keys = AppKeyWords.valueOf(action.toUpperCase());
			switch (keys) {
			
			case BUYINGQA:
				BUYINGQA(webdriver);
				break;
						 	
            case REDIRECT:
            	REDIRECT(webdriver, fieldText);
            	break;
				
			case CLICKONNEXTCONFIRMATION:
				CLICKONNEXTCONFIRMATION(webdriver);
				break;
			case EQITQUESFWDTOSELLER:
				EQITQUESFWDTOSELLER(webdriver, fieldText);
				
			case BUYINGSALESINMYONE:
				BUYINGSALESINMYONE(webdriver, fieldText);
				break;
				
			case VERIFYSITEMAPCOUNT:
				VERIFYSITEMAPCOUNT(webdriver);
				break;
										
			case BUYINGMYOFFER:
				BUYINGMYOFFER(webdriver);
				break;
			
            case FORWARDTOMM:
            	FORWARDTOMM(webdriver, fieldText);
            	break;
            	
            case WATCHINGINMYONE:
            WATCHINGINMYONE(webdriver, fieldText);
            break;
            	
            case LITEUSERREGISTRATION:
                LITEUSERREGISTRATION(webdriver,fieldText);
                break;
            case MYSALES:
            	MYSALES(webdriver, fieldText, value);
            	break;
            	
            case FORWARDTOPM:
            	FORWARDTOPM(webdriver, fieldText);
            	break;
            case FORWARDTOSELLER:
            	FORWARDTOSELLER(webdriver, fieldText);
            	break;
            case FORWARDTOSTORAGE:
            	FORWARDTOSTORAGE(webdriver, fieldText);
            	break;
            	
            case PENDINGLISTING:
            	PENDINGLISTING(webdriver, fieldText, value);
            	break;
            	
            case DEFAULTOFFER:
            	DEFAULTOFFER(webdriver, fieldText, value);
            	break;          	
                       	
            case SUBMITTEDASSET:
            	SUBMITTEDASSET(webdriver, fieldText, value);
            	break;                       
                
                    case NEWUSERREGISTRATION:
                    	NEWUSERREGISTRATION(webdriver, fieldText, value);
                    	break;
                    	
                    case CONTENTMNGR:
                    	CONTENTMNGR(webdriver);
                    	break;
                 
			           
                    case ELISTINGS:
                    	ELISTINGS(webdriver);
                    	break;
                    	 case APPROVEDLG:
                    	APPROVEDLG(webdriver);
                    	break;
                    	
                    case DRAFTLISTING:
                    	DRAFTLISTING(webdriver, fieldText);
                    	break;
                    case MAXINEVENTPAGE:
                    	MAXINEVENTPAGE(webdriver);
                    	break;
                    	
                    case VERIFYUSERINAMP:
                    	VERIFYUSERINAMP(webdriver, fieldText, value);
                    	break;
                    	
                    case READCSV:
                    	READCSV(webdriver);
                    	break;
                    	
                    case RANDOMMOBILE:
                    	RANDOMMOBILE(webdriver);
                    	break;
                    	
                    case AMPLOGIN:
                    	AMPLOGIN(webdriver, fieldText);
                    	break;
                    	
                    case COMMERCIALLISTINGS:
                    	COMMERCIALLISTINGS(webdriver, fieldText, value);
                    	break;
                    	
                    case GETDATETIME:
                    	GETDATETIME();
                    	break;
                    case BROWSEALLEVENTS:
                    	BROWSEALLEVENTS(webdriver);
                    	break;
                    case BROWSEALLLISTINGS:
                    	BROWSEALLLISTINGS(webdriver, fieldText);
                    	break;
                    case FACETS:
                    	FACETS(webdriver,fieldText,value);
                    	
                    	break;
                    case SEARCHRESULTS:
                    	SEARCHRESULTS(webdriver, fieldText, value);                         	
                    	break;
                    
                      	
                    case MAXOFFERINDETAILSPAGE:
                    	MAXOFFERINDETAILSPAGE(webdriver);
                    	break;
                    	
                    case EXACTOFFERINDETAILSPAGE:
                    	EXACTOFFERINDETAILSPAGE(webdriver);
                    	break;
                    	
                    case MAXOFFERINSEARCHRESULTSPAGE:
                    	MAXOFFERINSEARCHRESULTSPAGE(webdriver);
                    	break;
                    case EXACTOFFERINSEARCHRESULTSPAGE:
                    	EXACTOFFERINSEARCHRESULTSPAGE(webdriver);
                    	break;
                    case ADDTOWATCHLIST:
                    	ADDTOWATCHLIST(webdriver, fieldText);
                    	break;
                    	                    	
                    case EXACTINEVENTPAGE:
                    	EXACTINEVENTPAGE(webdriver);
                    	break;
                  
                    case CHANGEPASSWORD:
                    	CHANGEPASSWORD(webdriver, fieldText);
                    	break;
                    	
                    case QA:
                    	QA(webdriver);
                    	break;
                    	
                  case NAVIGATETOLISTINGDETAILSPAGE:
                    	NAVIGATETOLISTINGDETAILSPAGE(webdriver);
                    	break;
                    case USERAMP:
                    	USERAMP(webdriver);
                    	break;
                      case MOUSEHOVER:
                    	MOUSEHOVER(webdriver, fieldText);
                    	break;
                    case VERIFYQAINAMP:
                    	VERIFYQAINAMP(webdriver, fieldText);
                    	break;
                    case REJECTQUES:
                    	REJECTQUES(webdriver, value);
                    	break;
                    case LOADNEWUSERREG:
                    	LOADNEWUSERREG(webdriver);
                    	break;
                    
                    case MAKEOFFERBTN:
                    	MAKEOFFERBTN(webdriver, fieldText);
                    	break;
                    case LISTVIEWTITLE:
                    	LISTVIEWTITLE(webdriver, fieldText);
                    	break;
                    case AGREETERMS:
                    	AGREETERMS(webdriver);
                    	break;
                    	
                    case MYOPERATION:
                    	MYOPERATION(webdriver, fieldText,value);
                    	break;
                    case SIGNIN:
                    	SIGNIN(webdriver, fieldText,value);
                    	break;
                    case SIGNOUT:
                    	SIGNOUT(webdriver);
                    	break;
                    case WAITFORTHIS:
                    	WAITFORTHIS(webdriver, fieldText,value);
                    	break;
                    case VERIFYTHIS:
                    	VERIFYTHIS(webdriver , fieldText,  value);
                    	break;
                    	
             		}			
		}catch(Exception e){
			resultDetails.setErrorMessage(e.getMessage());
		}
		return resultDetails;
	}

	
	public void GETDATETIME(){
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime())); //2014/08/06 16:00:22
	}
	
	
	public void VERIFYSITEMAPCOUNT(WebDriver driver) {
	    try {
	     WebElement lots = driver.findElement(By.id("e1NumFound"));
	     WebElement auctions = driver.findElement(By.id("e1AuctionsFound"));
	     WebElement events = driver.findElement(By.id("e1ResultsFound"));
	     String count;
	    //to get text of lots or auctions or events count 
	      if(lots.isDisplayed())
	        {
	     count=driver.findElement(By.id("e1NumFound")).getText();
	       }
	       else if (auctions.isDisplayed())
	         {
	     count=driver.findElement(By.id("e1AuctionsFound")).getText();
	         }
	       else  
	         {
	     count=driver.findElement(By.id("e1ResultsFound")).getText();
	           }
	      
	      
	      String convertcount = count.replace(",", "");
	            int sitemapcount=Integer.parseInt(convertcount);
	            System.out.println("count is :"+sitemapcount);
	            
	            if(sitemapcount > 0)
	            resultDetails.setFlag(true);
	         else
	            resultDetails.setFlag(false);
	      
	   }
	   
	     catch(Exception e ) {

	       resultDetails.setFlag(false);
	      }
	     }
      
  
  public void SUBMITTEDASSET(WebDriver driver, String fieldText, String value) {
	  
	  try {
		  		  
	  ELISTINGS(driver);
	  
	  driver.get(value);
	  driver.manage().deleteAllCookies();
	   driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
		  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("userAgreementBtn")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.linkText("Imports")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("SelfService")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	  
	   String assettitle = driver.findElement(By.xpath("//td[4]")).getText();
	  
	  if(Listingtitle.equalsIgnoreCase(assettitle) ) {
		  
		AssetID = driver.findElement(By.xpath("//td[2]/a")).getText();
		
		System.out.println(AssetID);
		
		resultDetails.setFlag(true);
	  }
	  
	  	  
	  } catch(Exception e ) {
		  
		  resultDetails.setFlag(false);
	  }
	  
  }  
	  
	 
     public void CONTENTMNGR(WebDriver driver){ //assigning content manager and converting to LOT
	  
	  
	  try {		  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		  driver.findElement(By.linkText("Imports")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  driver.findElement(By.linkText("Self Service")).click();
		  Thread.sleep(10000);
		  		  
		  String category = driver.findElement(By.xpath("//td[5]")).getText();
		  Thread.sleep(10000);
		  System.out.println(category);
		  
		  if(category.equalsIgnoreCase("Personal Autos & Pickups")) {
			  
			  System.out.println("entered if block");
			  
			  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
			  Thread.sleep(10000);
			  
			 Select manager = new Select (driver.findElement(By.xpath("//div/select")));
			 manager.selectByVisibleText("Rhoda Francis");
			 
			 Thread.sleep(10000);
			 
			 driver.switchTo().alert().accept();
			 	 
			 Thread.sleep(10000); 
				  		 
			 
				  driver.findElement(By.linkText("Convert")).click();  
				  Thread.sleep(10000);
				  
				  driver.findElement(By.id("id_button_createlot")).click();
				  
				  driver.switchTo().alert().accept();
				  Thread.sleep(10000);			  				  
				  
				 
				  
				  resultDetails.setFlag(true);
		  }				 
		  
		  		  else {
			 
			  		  
		  			 Thread.sleep(10000);
			  
				 Select manager = new Select (driver.findElement(By.xpath("//div/select")));
				 manager.selectByVisibleText("Rhoda Francis");
					  			  
				 Thread.sleep(10000);
				 
				 driver.switchTo().alert().accept();
				 	 
				 Thread.sleep(10000);			  
			  
			  driver.findElement(By.linkText("Convert")).click();  
			  
			  Thread.sleep(10000);
			  
			  String ParentHandle = driver.getWindowHandle();
			  driver.findElement(By.id("id_href_edit_faimcategory")).click();
			  
			  for(String winHandle : driver.getWindowHandles()) {
				  
				  driver.switchTo().window(winHandle);
			  }
				 		  				  
				  Select industry = new Select (driver.findElement(By.id("id_frm_sel_industry")));
				  industry.selectByVisibleText("Agriculture");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				  
				  Select categorie = new Select (driver.findElement(By.id("id_frm_sel_category")));
				  categorie.selectByVisibleText("Agricultural");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				  
				  Select subcategorie = new Select (driver.findElement(By.id("id_frm_sel_subcategory")));
				  subcategorie.selectByVisibleText("Farmland");
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				  
				  driver.findElement(By.id("id_button_select")).click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 		  
				  
				  driver.switchTo().window(ParentHandle);
						  
				  Thread.sleep(10000);
			 	 
			 	 if(driver.findElement(By.id("id_button_createlot"))!=null ) {
			 		 
			 		 System.out.println("Entered Loop");
	 		 
					  driver.findElement(By.id("id_button_createlot")).click();
					  Thread.sleep(10000);

					  driver.switchTo().alert().accept();
					  Thread.sleep(10000);							  

					  resultDetails.setFlag(true);	
 
			 	 }
			 	  
			  }
		  
		  	   					  
	  }catch (Exception e) {
		  
		  resultDetails.setErrorMessage("Create Lot button is not displayed");
		  resultDetails.setFlag(false);
	  }
	  
	   }
  
  
  
  public void AMPLOGIN(WebDriver driver, String field) {
	  
	String fieldText = field;  
  	  
try {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	  driver.navigate().refresh();
	  
	  driver.manage().deleteAllCookies();
	  driver.navigate().refresh();
	  
		  driver.get(field); // Change again back to staging AMP Site.
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
		  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("userAgreementBtn")).click();
		  resultDetails.setFlag(true);
}

catch (Exception e ){
	
	resultDetails.setFlag(false);
	
	}
	  
  }
      
  public void VERIFYUSERINAMP(WebDriver driver, String fieldText, String value){
	  
	  String field = fieldText;
	  
try {
		  	  
		  driver.get(field); 
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("aurid")).sendKeys(value);
		  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.cssSelector("input.submitbutton")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  driver.findElement(By.id("userAgreementBtn")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  driver.findElement(By.linkText("Users")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  String VerifyUser = driver.findElement(By.xpath("//tr[4]/td/table/tbody/tr[3]/td[2]")).getText();
		  
		  System.out.println(VerifyUser);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  
		  
//		  driver.findElement(By.xpath("//td/a")).click();
//		  
//		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
//		  
//		    		   driver.findElement(By.linkText("Approve User")).click();
//		    		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
//		    		   
//	    		   driver.switchTo().alert().accept();
 	    		     		         		   
	    		       		      		   	    		   
	    		   driver.manage().deleteAllCookies();
	    		   driver.navigate().refresh();
	    		   
	    		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	    			  driver.findElement(By.id("userAgreementBtn")).click();
	    			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	    		       		   
		  		  
			  resultDetails.setFlag(true);
		
	  
}	  catch (Exception e){
			  
			  resultDetails.setFlag(false);
			  resultDetails.setErrorMessage("user is not created");
		  }
	  
  }
public void ELISTINGS(WebDriver driver){  //Equipment and Accessories listings creation from selfservice.
	  
	  
	  try {
		  		  
		  driver.findElement(By.cssSelector("a.topLink > span")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		  driver.findElement(By.xpath("//input[@value='Equipment & Accessories']")).click();
		  
		  driver.findElement(By.id("chkCustomBuilt")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select industry = new Select (driver.findElement(By.id("select_industry")));
		  industry.selectByVisibleText("Vehicles & Buses");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select category = new Select (driver.findElement(By.id("select_category")));
		  category.selectByVisibleText("Cars");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select subcategory = new Select (driver.findElement(By.id("select_subcategory")));
		  subcategory.selectByVisibleText("Car");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
		  driver.findElement(By.name("6")).sendKeys("SKODA");
		  
		  driver.findElement(By.name("3")).sendKeys("SK4");
		  
		  driver.findElement(By.name("2")).sendKeys("2014");
		  
		  driver.findElement(By.name("4")).sendKeys("125");
		  
		  driver.findElement(By.id("confirm_changes")).click();
		  
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("title")).sendKeys("  " + Time);
		  Listingtitle = driver.findElement(By.id("title")).getAttribute("value");
		  
		  System.out.println(Listingtitle);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
			 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  
		  driver.findElement(By.id("reserveAmount")).sendKeys("100");
		  
		  driver.findElement(By.id("buyItNowPrice")).sendKeys("200");
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  	 
		  WebDriverWait wait = new WebDriverWait(driver, 30000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Save & Submit Listing']")));
		  
		  driver.findElement(By.xpath("//input[@value='Save & Submit Listing']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  Calendar currentdate = Calendar.getInstance();
		  DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		  TimeZone obj = TimeZone.getTimeZone("CST");
		  
		  TimeZone obj1 = TimeZone.getTimeZone("EST");
		  
		  
		  formatter.setTimeZone(obj);
		  System.out.println("Local:: " +currentdate.getTime());
		  System.out.println("CST:: "+ formatter.format(currentdate.getTime()));
		  
		  
		  
			driver.findElement(By.xpath("//input[@value='Payment Options >']")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
			  driver.switchTo().alert().accept();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		  driver.findElement(By.id("customer_first_name")).sendKeys("aditya");
			
			driver.findElement(By.id("customer_last_name")).sendKeys("charan");
			
			driver.findElement(By.id("cc_number")).sendKeys("4444333322221111"); 
			
			driver.findElement(By.id("cc_cvv2")).sendKeys("564");
			  
			  
			  Select month = new Select(driver.findElement(By.id("cc_exp_month")));
			  month.selectByVisibleText("01 - January");
			  
			  Select Year = new Select(driver.findElement(By.id("cc_exp_year")));
			  Year.selectByVisibleText("2021");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  driver.findElement(By.xpath("//li/div/input[2]")).click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  driver.findElement(By.cssSelector("a.logo")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  driver.findElement(By.xpath("//a[@id='iduser']/span")).click();
			  
			  driver.findElement(By.linkText("Sign Out")).click();
			  driver.manage().deleteAllCookies();
			  driver.navigate().refresh();
			    
	  
		  
		  resultDetails.setFlag(true); }
		  
		  catch(StaleElementReferenceException e) {
				 
				 if(retries < MAX_STALE_ELEMENT_RETRIES ){
					 
					 retries++;
					 	 }
				 
				 else {
					 
					 throw e;
				 }
		  
		  
		  
	  }catch(Exception e ){
		  
		  
		  resultDetails.setFlag(false);
		  
		  
	  }
	  
  }
  
  
  
public void COMMERCIALLISTINGS(WebDriver driver, String fieldText, String value) {
	  
	  try {
		  
		  String field = fieldText;
		  
		  driver.findElement(By.cssSelector("a.topLink > span")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  		  
		  driver.findElement(By.xpath("//input[@value='Commercial Materials']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  driver.findElement(By.id("textarea")).sendKeys("Test");
		  
		 driver.findElement(By.id("confirm_changes")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.id("title")).sendKeys(" " + Time);
		 
		 Listingtitle = driver.findElement(By.id("title")).getAttribute("value");
		 System.out.println(Listingtitle);
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.id("reserveAmount")).sendKeys("100");
		 
		 driver.findElement(By.id("buyItNowPrice")).sendKeys("200");
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.xpath("//input[@value='Save & Submit Listing']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		  		 
		driver.findElement(By.xpath("//input[@value='Payment Options >']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		  
		  driver.switchTo().alert().accept();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		
		driver.findElement(By.id("customer_first_name")).sendKeys("aditya");
		
		driver.findElement(By.id("customer_last_name")).sendKeys("charan");
		
		driver.findElement(By.id("cc_number")).sendKeys("4444333322221111"); 
		
		driver.findElement(By.id("cc_cvv2")).sendKeys("564");
		  
		  
		  Select month = new Select(driver.findElement(By.id("cc_exp_month")));
		  month.selectByVisibleText("01 - January");
		  
		  Select Year = new Select(driver.findElement(By.id("cc_exp_year")));
		  Year.selectByVisibleText("2021");
		  	  
		  
		  driver.findElement(By.xpath("//input[@value='Make Payment']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  driver.findElement(By.cssSelector("a.logo")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		driver.findElement(By.id("uname")).click();
		
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		 driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
		  	  
		
		resultDetails.setFlag(true);
		  
	  }
	  
	  catch(StaleElementReferenceException e) {
			 
			 if(retries < MAX_STALE_ELEMENT_RETRIES ){
				 
				 retries++;
				 	 }
			 
			 else {
				 
				 throw e;
			 }
	  }
	  
	   
	  catch (Exception e) {
		  
		  resultDetails.setFlag(false);
		  
	  }
	  
}
  
       
  public void APPROVEDLG(WebDriver driver) {
	  
	  
	  try {

		  String parent = driver.getWindowHandle();
		  
		  System.out.println(parent);
		  
		  
		  driver.findElement(By.linkText("Approve")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  driver.switchTo().window("changeSTatus");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  		  
		 driver.findElement( By.name("reason")).sendKeys("approve");
		 
		 driver.findElement(By.name("verify")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Approve']")).click();
 
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.switchTo().window(parent);
		 
		 LOTNUMBER = driver.findElement(By.xpath("//td[4]")).getText();
		  System.out.println(LOTNUMBER);
		    	 
		   driver.findElement(By.linkText("Logout")).click();
		    
		    driver.manage().deleteAllCookies();
			 driver.navigate().refresh();
			 
			 	 
		 resultDetails.setFlag(true);
  }
	  
	  
	  catch (Exception e ) {
		  
		  resultDetails.setFlag(false);
	  }
  }
  
  
 public void AMPTOOL(WebDriver driver, String fieldText, String value) {
	  
	  String fieldType = fieldText.substring(0, 3);
		String field = fieldText.substring(3, fieldText.length());
	  
	  
	  try {	  
		  
		  AppKeyWords ampkey = AppKeyWords.valueOf(fieldType.toUpperCase());			
			
			switch(ampkey){
					
			case USR:
								  
				  try {				  
					  
					  				  
					  driver.findElement(By.linkText(field)).click();
					  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					   
					  resultDetails.setErrorMessage("Link is clicked");
					  
					  
					  
					  
					  				  
					 /* see if manually entering the email id will accept and enters in the field
					  * try changing hte locators, may be u selected wrong one?
					  * try directly from AMP by creating separate method.
					  */
					  
					 
//					 driver.findElement(By.cssSelector("input[name='email']")).sendKeys(Fname+lname+inc+ID);
//					 
//					 System.out.println(Fname+lname+inc+ID);
//					 
//					 driver.findElement(By.cssSelector("td > input[type='button']")).click();
					
				
			}
				  
		  
		   catch(Exception e){
				  
				  
				  resultDetails.setFlag(false);				  
			  }
				  
				  break;
			  
			}  		  
		  		  
		  Thread.sleep(6000);
		  
		 driver.findElement(By.linkText("Logout")).click();
		  
	  } catch (Exception e ) {}
	  
	  
	  resultDetails.setFlag(true);
  }
 
   
 public  void NEWUSERREGISTRATION(WebDriver driver, String fieldText, String value) throws FileNotFoundException{
	    
	    
	    try {        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get(fieldText);
	           
	     String pwd="Equipment1$";
	      
	     String phone="";
	     
	        String Email="";
	     String Fname = "val";
	     String lname ="test";
	     String validation="";
	     long inc = Math.round(Math.random()*100000); // generates 5 digit number.

	     String ID="@yahoo.in";
	     
	     
	      Random random = new Random();
	      long dphone = Math.round(random.nextFloat()*Math.pow(10,12)); 
	    
	    // long dphone = (long) Math.floor(Math.random()*9000000000L)+1000000000L; // Generates 10 digit random number to enter into daytime phone field
	     
	      
	      
	      Email = Fname+lname+inc+ID;
	      
	      driver.findElement(By.id("emailaddress")).sendKeys(Email); 
	      
	         
	      System.out.println(Email);
	      
	            
	     
	     phone = Long.toString(dphone);
	     
	    
	     driver.findElement(By.id("firstname")).sendKeys(Fname);
	        
	       
	     driver.findElement(By.id("lastname")).sendKeys(lname);
	        
	     
	     driver.findElement(By.id("phone")).sendKeys(phone);
	         
	     
	     driver.findElement(By.id("newPassword")).sendKeys(pwd);
	     
	     driver.findElement(By.id("confirmPassword")).sendKeys(pwd);
	     
	     driver.findElement(By.id("submit_joinnow")).click();
	     //condition to check the email is already existing or not
	     if(driver.findElement(By.xpath("//*[@class='reg_error']")).isDisplayed()) {
	    
	       if(driver.findElement(By.xpath("//*[@class='reg_error']")).getText().contains("Email Address already exists in the system")){
	       inc = Math.round(Math.random()*100000);
	       Email = Fname+lname+inc+ID;
	       driver.findElement(By.id("emailaddress")).clear();
	       driver.findElement(By.id("emailaddress")).sendKeys(Email);
	       driver.findElement(By.id("submit_joinnow")).click();
	       
	        }
	      }   //condition to check the email is already existing
	     
	     WebDriverWait wait=new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkmail")));
	     
	  driver.manage().deleteAllCookies();    
	     
	     driver.navigate().refresh();
	        
	       driver.get(value); 
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
	      
	      driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
	      driver.findElement(By.cssSelector("input.submitbutton")).click();
	      
	      Thread.sleep(10000);
	      
	      driver.findElement(By.id("userAgreementBtn")).click();
	      Thread.sleep(10000);
	      
	      driver.findElement(By.linkText("Users")).click();
	      Thread.sleep(10000);
	      
	      driver.findElement(By.name("email")).sendKeys(Email);
	      driver.findElement(By.xpath("//input[@value='Search']")).click();  
	      String VerifyUser = driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[2]")).getText();
	      
	      if(VerifyUser.equalsIgnoreCase(Email)); {
	       
	       System.out.println("User Verified");
	           
	      }
	      resultDetails.setFlag(true); 
	          }
	     
	     catch (Exception e )
	     {
	      resultDetails.setFlag(false);
	      
	      resultDetails.setWarningMessage("Registration failed");
	     
	      
	     }   
	            
	    }
  
  
  public void RANDOMMOBILE (WebDriver driver){
	  
	  try {
		  
		  int i;
		  
		  for (i=0;i<=50;i++){
		  
		 // long dphone = (long) Math.floor(Math.random()*9000000000L)+1000000000L; // generates a random mobile number to be used in registration in load testing.
		  
			  Random random = new Random();
				 long phone = Math.round(random.nextFloat()*Math.pow(10,12));	  
			  
		  System.out.println(phone);
		  
		  }
		  
		  resultDetails.setFlag(true);
		  
	  } catch (Exception e ) {
		  
		  resultDetails.setFlag(false);
	  }
	  	  
	  	    }
  
  
  
  
  public void LOADNEWUSERREG(WebDriver driver) {
	  
try {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  int i;
		  
		  for (i=0;i<=50;i++){
		
			  driver.get("https://staging.equipmentone.com/registration?bypassCaptcha=1");
		 		 
				 String pwd="Equipment1$";
				  
				 String phone="";
				 
				 String Email="";
				 String Fname = "Load";
				 String lname ="test";
				 String validation="";
				 long inc = Math.round(Math.random()*1000);

				 String ID="@yahoo.in";
				 
				 
				  Random random = new Random();
					 long dphone = Math.round(random.nextFloat()*Math.pow(10,12));	
				
				// long dphone = (long) Math.floor(Math.random()*9000000000L)+1000000000L; // Generates 10 digit random number to enter into daytime phone field
				 
				
				
					 
					 Email = Fname+lname+inc+ID;
					 
					 driver.findElement(By.id("emailaddress")).sendKeys(Email); 
					 
					 System.out.println(Email);
					 		 		 
				 
				 phone = Long.toString(dphone);
				 
				
				 driver.findElement(By.id("firstname")).sendKeys(Fname);
				 		 
				 	 
				 driver.findElement(By.id("lastname")).sendKeys(lname);
				 		 
				 
				 driver.findElement(By.id("phone")).sendKeys(phone);
				   		
				 
				 driver.findElement(By.id("newPassword")).sendKeys(pwd);
				 
				 driver.findElement(By.id("confirmPassword")).sendKeys(pwd);
				 
				 driver.findElement(By.id("submit_joinnow")).click();
				 
				 WebDriverWait wait = new WebDriverWait(driver, 30);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkmail")));
				 					 
				 driver.navigate().refresh();
				 		 
			 	 
				 
				 if(Email.equalsIgnoreCase("Email Address already exists in the system")) {
					 
					 driver.get("https://staging.equipmentone.com/registration?bypassCaptcha=1");
					 
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		 
					 String password="Equipment1$";
					  
					 String myphone="";
					 
					 String myEmail="";
					 String myFname = "Value";
					 String mylname ="test";
					 String myvalidation="";
					 long myinc = Math.round(Math.random()*1000);

					 String myID="@yahoo.in";
					 
					 
					  Random myrandom = new Random();
						 long mydphone = Math.round(random.nextFloat()*Math.pow(10,12));	
					
					// long dphone = (long) Math.floor(Math.random()*9000000000L)+1000000000L; // Generates 10 digit random number to enter into daytime phone field
					 
					
					
						 
						 myEmail = myFname+mylname+myinc+myID;
						 
						 driver.findElement(By.id("emailaddress")).sendKeys(myEmail); 
						 
						 System.out.println(myEmail);
						 		 		 
					 
					 myphone = Long.toString(mydphone);
					 
					
					 driver.findElement(By.id("firstname")).sendKeys(myFname);
					 		 
					 	 
					 driver.findElement(By.id("lastname")).sendKeys(mylname);
					 		 
					 
					 driver.findElement(By.id("phone")).sendKeys(myphone);
					   		
					 
					 driver.findElement(By.id("newPassword")).sendKeys(password);
					 
					 driver.findElement(By.id("confirmPassword")).sendKeys(password);
					 
					 driver.findElement(By.id("submit_joinnow")).click();
					 
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkmail")));
					 
					 					  		 				 
					 driver.navigate().refresh();
						 
					 
					 
				 }
				 
	  
		  }
		  
		  resultDetails.setFlag(true);
  } catch (Exception e ) {
	  
	  resultDetails.setFlag(false);
  }
  }
  
  
  
  
  public void COMPARE (WebDriver driver, String action){
  

	  
	  List<WebElement> results = driver.findElements(By.id("results"));
	  
	  for (WebElement rel: results){
		  
		  rel.getText();
		  
		  //System.out.println(rel.getText());
		  
		  
		    WebElement compare = driver.findElement(By.className("compare"));   
		    
		  	
		    keywords comparecheck = keywords.valueOf(action.toUpperCase());
		    
		    switch(comparecheck){
		    
		    
		    case fposition:
		    	
		    	try {
		    		
		    		if(compare.isDisplayed()) {
		    			
		    			driver.findElement(By.cssSelector("input.selectoff")).click();
		    		}
		    		
		    				    		
		    	} catch (Exception e ) {
		    		
		    		
		    	}
		    
		    break;
		    
		    
		    case sposition:
		    	
		    
		    	
		    			    	
		    	break;
		    	
		    	
		    case tposition:
		    	
		    	break;
		    
		    }
		   
		    
	  }
	  
	  
  }

 
 
 
 public void MAXINEVENTPAGE(WebDriver driver) {
	 
	 try {
		 
		 
  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/event?eventid']"));
		  
		  Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
		   
		   String offer = driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div/span")).getText();
			 
			 System.out.println(offer);
			  
			  String Max = offer.substring(1, offer.length() -2);
			  
			  if(Max.indexOf(',')> -1) {
			  
				  System.out.println("Field has comma");
			  String convert = Max.replace(",", ""); 
			  
			  String dot = convert.replace(".", "");
			  int mymaxoffer = Integer.parseInt(dot);
			  int finaladding = add + mymaxoffer;
			  
			  String convadd = String.valueOf(finaladding);
			  		  
			   System.out.println(convadd);
			      
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);
			   
			   
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				  	  Thread.sleep(10000);
				  
				  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				  Thread.sleep(10000);
			   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
			   Thread.sleep(10000);
			   
			   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
			   
			   if(isPresent==true) {
				   
				   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
			   }
			   
			   else {
			   
			      
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
				      
			   }
			   
			  }
			   		   	   		  
			  else {
				  
				  System.out.println("field does not have comma");
				  
				  String mydot = Max.replace(".", "");
				  
				   System.out.println(mydot);
				   
				   int mymaxoffer = Integer.parseInt(mydot);
					  int finaladding = add + mymaxoffer;
					  
					  String convadd = String.valueOf(finaladding);
				   
					  driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);
				   		   
				   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				   Thread.sleep(10000);
					  
					  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				   
				   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
				   Thread.sleep(10000);
				   
				   
				   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
				   
				   if(isPresent==true) {
					   
					   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   Thread.sleep(10000);
				   }
				   
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
				   
				     	  		  
					  	  }			  
			   	  		  		  
			  resultDetails.setFlag(true);
				  
			  } catch (Exception e ) {
				  
				  resultDetails.setFlag(false);
				resultDetails.setErrorMessage("Listing is not available or Closed");  
			  }
		
  
 }
  
public void EXACTINEVENTPAGE(WebDriver driver) {
	 
	 try {
		 
		 
  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/event?eventid']"));
		  
		  Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
		   
		   String offer = driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div/span")).getText();
			 
			 System.out.println(offer);
			  
			  String Max = offer.substring(1, offer.length() -2);
			  
			  if(Max.indexOf(',')> -1) {
			  
				  System.out.println("Field has comma");
			  String convert = Max.replace(",", ""); 
			  
			  String dot = convert.replace(".", "");
			  int mymaxoffer = Integer.parseInt(dot);
			  int finaladding = add + mymaxoffer;
			  
			  String convadd = String.valueOf(finaladding);
			  		  
			   System.out.println(convadd);
			   
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[4]/span[2]/input")).click();
			   
			   Thread.sleep(10000);
			      
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);
			   
			   
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				  	  Thread.sleep(10000);
				  
				  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				  Thread.sleep(10000);
			   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
			   Thread.sleep(10000);
			   
			   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
			   
			   if(isPresent==true) {
				   
				   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
			   }
			   
			   else {
			   
			      
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
				      
			   }
			   
			  }
			   		   	   		  
			  else {
				  
				  System.out.println("field does not have comma");
				  
				  String mydot = Max.replace(".", "");
				  
				   System.out.println(mydot);
				   
				   int mymaxoffer = Integer.parseInt(mydot);
					  int finaladding = add + mymaxoffer;
					  
					  String convadd = String.valueOf(finaladding);
					  
					  driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[4]/span[2]/input")).click();
					   
					   Thread.sleep(10000);
				   
					  driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);
				   		   
				   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				   Thread.sleep(10000);
					  
					  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				   
				   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
				   Thread.sleep(10000);
				   
				   
				   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
				   
				   if(isPresent==true) {
					   
					   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   Thread.sleep(10000);
				   }
				   
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
				   
				     	  		  
					  	  }			  
			   	  		  		  
			  resultDetails.setFlag(true);
				  
			  } catch (Exception e ) {
				  
				  resultDetails.setFlag(false);
				resultDetails.setErrorMessage("Listing is not available or Closed");  
			  }
		
   }
 
  
 
 public void READCSV(WebDriver driver) {
	 
	 
	    driver.get("http://mmtool.staging.assetnation.com"); // Change again back to staging AMP Site.
	    driver.manage().deleteAllCookies();
		  driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
		  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("userAgreementBtn")).click();
		  
		  driver.findElement(By.linkText("Users")).click();
	 
	 /* reading of Excel file and saving into Array. */
		  
		  
		  Scanner s = new Scanner(System.in);
		  
		  try {
	         
	        File f = new File("E:/JMeter/fullusers.txt");
	        
	        Scanner numScan = new Scanner(f);
	         
	        String line;
	         
	        while (numScan.hasNext())
	        {
	            line = numScan.nextLine();
	            System.out.print(line + " ");
	        
	         
		   driver.findElement(By.name("email")).sendKeys(line);
		  
	      driver.findElement(By.xpath("//input[@value='Search']")).click();
	      
	      driver.findElement(By.xpath("//td/a")).click();
	      Thread.sleep(10000);
	    		   
	      String ParentHandle = driver.getWindowHandle();
	 		driver.findElement(By.linkText("Approve User")).click();
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	 		driver.switchTo().alert().accept();
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  for(String winHandle : driver.getWindowHandles()) {
				  
				  System.out.println("Entered For Loop");
				  driver.switchTo().window(winHandle);
	 						  }

		 		Thread.sleep(10000);
		 		driver.switchTo().alert().accept();
		 		Thread.sleep(10000);
		 			driver.switchTo().window(ParentHandle);
	         
	       				 		  
	    		   driver.findElement(By.linkText("Users")).click();
	    		   
	    		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	         
	    	  	    		   	        }
	        
	        resultDetails.setFlag(true);
	        
		  } catch (Exception e ) {
			  
			  
		  }
	    		    	   	    
	    }
 
  public void BROWSEALLEVENTS(WebDriver driver) {
	 
	  
	 try {
			WebElement element = driver.findElement(By.linkText("ALL EQUIPMENT"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[2].click()", element);
	 
	 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	 
	 driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	 
	 String EO = driver.findElement(By.cssSelector("span.e1Count")).getText();
	 System.out.println(EO);
	 
	 String EOCount = EO.substring(EO.indexOf("(")+1, EO.lastIndexOf(")"));
	 
	 System.out.println(EOCount);
	 	 
	 String match = driver.findElement(By.id("e1ResultsFound")).getText();
	 System.out.println(match);
	 
	 //String matchcount = match.replaceAll("\\D+", ""); //This will extracts only integers from the string.
	 
	 //System.out.println(matchcount);
	 
	 
	 if(EOCount.equalsIgnoreCase(match)){
	 		 
		 System.out.println("count matched!!");
		 
	 	 resultDetails.setFlag(true); }
	  }
  
 catch (Exception e) {
	 
	 resultDetails.setFlag(false);
 }
 }
  
 
 public void BROWSEALLLISTINGS(WebDriver driver, String fieldText) { // code need to be updated if RBA do not have ',' in count.
	 
	 String fieldType = fieldText;
		String field = fieldText;
		try {
			AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
		 	 
		switch(cdf){	
			
		case BROWSEALL: 
			 driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			
				  Thread.sleep(10000);
		 
		 driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
		 Thread.sleep(10000);
		  
		  String BLEO = driver.findElement(By.cssSelector("span.e1Count")).getText();
			 System.out.println(BLEO);
			 Thread.sleep(10000);
			 
			 String BLEOCount = BLEO.substring(BLEO.indexOf("(")+1, BLEO.lastIndexOf(")"));
			 System.out.println(BLEOCount);
			 Thread.sleep(10000);
			 
			 String BLRBA =  driver.findElement(By.cssSelector("span.rbaCount")).getText();
			 System.out.println(BLRBA);
			 
			 String BLRBACount = BLRBA.substring(BLRBA.indexOf("(")+1, BLRBA.lastIndexOf(")"));
			 System.out.println(BLRBACount);
										 
		 int EOConversion = Integer.parseInt(BLEOCount);
		 int RBAConversion = Integer.parseInt(BLRBACount);
		 
		 int finalcount = EOConversion + RBAConversion;
		 
		 System.out.println(finalcount);
		 		 		  
		 String strfinalcount = String.valueOf(finalcount);
		 
		 String BLmatch = driver.findElement(By.id("e1NumFound")).getText();
		 String eventmatch = driver.findElement(By.id("e1ResultsFound")).getText();
		 String Auctionmatch = driver.findElement(By.id("e1AuctionsFound")).getText();
		  
		 
		 String BLmatchCount = BLmatch.replace(",", "");
		 
		 int myBLmatchCount = Integer.parseInt(BLmatchCount);
		 int myeventmatch = Integer.parseInt(eventmatch);
		 int myauctioncount = Integer.parseInt(Auctionmatch);
		 
		 int finalcounts = myBLmatchCount + myeventmatch + myauctioncount;
		 
		 String myfinalcounts = String.valueOf(finalcounts);
		 
		if(strfinalcount.equalsIgnoreCase(myfinalcounts)) {
			
			System.out.println("Count matched!!");
		
			resultDetails.setFlag(true);
		
		}
		 
		break;
		
		case BROWSEE1:
			
			try {
				
				
	//////*    System.out.println("clicking on 1 link");
				try{
				driver.findElement(By.xpath("//li[@class='dropdown mega navBarText']/a[text()='All Equipment ']")).click();
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//*[@class='dropdown-toggle' and contains(text(),'All Equipment ')]")).click();
				}
				Thread.sleep(2500);
				//driver.findElement(By.xpath("(//a[contains(text(),'EquipmentOne Lots')])[2]")).click();
				
				driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/all-equipment");
				
				driver.findElement(By.linkText("Source Site")).click();
				driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();
				
				//suman
				
				/*driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[11]/div[2]/div/ul/li[2]/input")).click();
				Thread.sleep(10000);*/
				Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
				System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).size());
				String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).getText();
				System.out.println(E1Count);
				String EOCount = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
				Integer count1=Integer.parseInt(EOCount);
				System.out.println("count1 is: "+count1);
				
				Thread.sleep(5000);
				System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.id("e1NumFound")).size());
				System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
				String listingcount = driver.findElement(By.id("e1NumFound")).getText();
				String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();
				
				//System.out.println(nextlistingcount);
				String listingcount2=listingcount.replace(",", "");
				String nextlistingcount2=nextlistingcount.replace(",", "");
				int convlistingcount = Integer.parseInt(listingcount2);
				int convnextlistingcount = Integer.parseInt(nextlistingcount2);
				
				System.out.println("lot count is: "+convlistingcount);
				System.out.println("event count is: "+convnextlistingcount);
				
				int myfinalcount = convlistingcount + convnextlistingcount;
				String compfinalcount = String.valueOf(myfinalcount);
				
				System.out.println(myfinalcount);
				System.out.println(compfinalcount);
				
				//if(EOCount.equalsIgnoreCase(compfinalcount)) {   //suman
				
				if(count1<=0 || myfinalcount<=0 || count1!=myfinalcount)
					resultDetails.setFlag(false);
					
				else
					resultDetails.setFlag(true);
				
				
			} catch (Exception e) {
				//System.out.println(e);
				resultDetails.setFlag(false);
				e.printStackTrace();
			}
						
			break;
			
			
		case MYEVENTS:
			
			try {
				
				driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String count = driver.findElement(By.cssSelector("span.e1Count")).getText();
				String EOCount = count.substring(count.indexOf("(")+1, count.lastIndexOf(")"));
				System.out.println(EOCount);
				
				String e1resultsfound = driver.findElement(By.id("e1ResultsFound")).getText();
				
				if(EOCount.equalsIgnoreCase(e1resultsfound)) {
					
					System.out.println("Events count matched!");
					resultDetails.setFlag(true);
				}
				
				
			 
	 
		}catch (Exception e) {
		 
		 resultDetails.setFlag(false);
		 
	 }
			break;
			
 }
		}catch(Exception e ) {
	 
	 resultDetails.setFlag(false);
 }
		}
		
 
 public void FACETS (WebDriver driver, String fieldText, String value) {
	 
	 String fieldType = fieldText;
		String field = fieldText;
		try {
			AppKeyWords FCT = AppKeyWords.valueOf(fieldType.toUpperCase());
			
	  switch (FCT) {
	  	  
	  case MAKE:
		  
		  try {

			  // suman
			  // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			  driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/all-equipment");
			  Thread.sleep(2000);
			  driver.findElement(By.linkText("Make")).click();
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
			  resultDetails.setFlag(false);
		  }
	  
		  break;
		  
		  
	  case CATEGORY:
		  
		  try {
			  
			  driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  			  
			  driver.findElement(By.xpath("//li/input")).click();
			  
			  String Categorycount = driver.findElement(By.xpath("//div[10]/div/div/ul/li/a")).getText();
				 String RBCategorycount = Categorycount.substring(Categorycount.indexOf("(")+1, Categorycount.lastIndexOf(")"));
				 System.out.println(RBCategorycount);
				 
				 String categoryfinal = driver.findElement(By.id("e1NumFound")).getText();			 				 
				 if(RBCategorycount.equalsIgnoreCase(categoryfinal)) {
					 
					 resultDetails.setFlag(true);
					 System.out.println("Counts matched!!!");
				 }
			  
				 			  
		  } catch (Exception e ) {
			  
			  resultDetails.setFlag(false);
		  }
		  
		  break;
		  
	  case MODEL:
		  
		  try {

			  // suman
			  // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			  driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/all-equipment");
			  Thread.sleep(2000);
			  driver.findElement(By.linkText("Model")).click();
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
			  
			  resultDetails.setFlag(false);
		  }
		  break;
		  
		
	  case COUNTRY:  
		  
		  try {

			  // suman
			  // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			  driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/all-equipment");
			  Thread.sleep(2000);
			  driver.findElement(By.linkText("Country")).click();
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
				  resultDetails.setFlag(true);
			  }
			  else
				  System.out.println("count mis-matched");



		  } catch (Exception e) {
			  System.out.println("entered in catch block " +e);
			  resultDetails.setFlag(false);
		  }
		  
		  break;
		
	  case STATE:
		  		  try {

					  // suman
					  // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
					  driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/all-equipment");
					  Thread.sleep(2000);
					  driver.findElement(By.linkText("State/Province")).click();
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


			  resultDetails.setErrorMessage("The count don't match!");
			  resultDetails.setFlag(false);
		  } 
		  		  break;
		  		  
	  case SOURCESITE:
		  
		  try {
			 
			  driver.findElement(By.xpath("(//a[text()='Transportation'])")).click();

			  Thread.sleep(3000);



			  String msg=driver.findElement(By.id("e1SitesFound")).getText();
			  driver.findElement(By.linkText("Source Site")).click();
			  Thread.sleep(2500);

			  if(!msg.contains("Ritchie Bros"))
				  driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
			  Thread.sleep(1500);
			  if(!msg.contains("SalvageSale"))
				  driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();

			  Thread.sleep(5000);

			  //String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
			  System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).size());
			  String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).getText();
			  System.out.println(E1Count);
			  String EOCountt = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
			  Integer count1=Integer.parseInt(EOCountt);
			  System.out.println("count1 is: "+count1);
			  
			//  suman
			  
			  System.out.println("size2 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:RBA']/span[3])[2]")).size());
			  String RBCount = driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[3])[2]")).getText();
			  System.out.println(E1Count);
			  String RBCountt = RBCount.substring(RBCount.indexOf("(")+1, RBCount.lastIndexOf(")"));
			  Integer count2=Integer.parseInt(RBCountt);
			  System.out.println("count2 is: "+count2);
			  
			  
			  System.out.println("size3 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:SS']/span[3])[2]")).size());
			  String SSCount = driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[3])[2]")).getText();
			  System.out.println(SSCount);
			  String SSCountt = SSCount.substring(SSCount.indexOf("(")+1, SSCount.lastIndexOf(")"));
			  Integer count3=Integer.parseInt(SSCountt);
			  System.out.println("count3 is: "+count3);
			  Integer totalCount=count1+count2+count3;
			  //suman
			  
			  

			  Thread.sleep(5000);
			  System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.id("e1NumFound")).size());
			  System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
			  String listingcount = driver.findElement(By.id("e1NumFound")).getText();
			  String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();

			  System.out.println(listingcount);
			  System.out.println(nextlistingcount);
			  boolean lotDisplay=driver.findElement(By.id("e1NumFound")).isDisplayed();
			  boolean eventDisplay=driver.findElement(By.id("e1ResultsFound")).isDisplayed();
			  //System.out.println(nextlistingcount);
			  String listingcount2="";
			  int convlistingcount=0;
			  if(lotDisplay)
			  {
				  listingcount2=listingcount.replace(",", "");
				  convlistingcount = Integer.parseInt(listingcount2);
			  }


			  String nextlistingcount2="";
			  int convnextlistingcount =0;
			  if(eventDisplay)
			  {
				  nextlistingcount2=nextlistingcount.replace(",", "");
				  convnextlistingcount = Integer.parseInt(nextlistingcount2);

			  }
			  System.out.println("lot count is: "+convlistingcount);
			  System.out.println("event count is: "+convnextlistingcount);

			  int myfinalcount = convlistingcount + convnextlistingcount;
			  String compfinalcount = String.valueOf(myfinalcount);

			  System.out.println(totalCount);
			  System.out.println(myfinalcount);



			  if(myfinalcount==totalCount) {

				  resultDetails.setFlag(true);
				  System.out.println("Counts matched!");
			  }
			  else
				  resultDetails.setFlag(false);
		  }
		  catch (Exception e) {

			  resultDetails.setFlag(false);
		  }

		  break;
		  
	  case POSTALCODE:
		  
		  try {
			 
			  
			  driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			  
			   WebDriverWait wait = new WebDriverWait(driver, 30000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[11]/div/a/span")));
			  			  			  
			  driver.findElement(By.xpath("//div[11]/div/a/span")).click();
			  
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Search")));
			  
			  driver.findElement(By.linkText("Search")).click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnClose")));
			  
			  driver.findElement(By.id("btnClose")).click();
			  Thread.sleep(10000);
			  resultDetails.setFlag(true);
		  } catch (Exception e) {
			  
			  resultDetails.setFlag(false);
		  }
		
		break;
	  }
	  
 } catch (Exception e) {
	 
	 resultDetails.setFlag(false);
 }
 
		
		
 }
 

 
 
 
 
 public void SEARCHRESULTS(WebDriver driver, String fieldText, String value) {

	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 String fieldType = fieldText;
	 String field = fieldText;
	 try {
		 AppKeyWords SER = AppKeyWords.valueOf(fieldType.toUpperCase());

		 switch(SER) {

		 case AGRI:

			 driver.findElement(By.linkText("AGRICULTURE")).click();
			 //suman
			 Thread.sleep(3000);
			 boolean b=SEARCH_RESULT_COMPARISON(driver);
			 System.out.println(b);
			 if(b) {

				 resultDetails.setFlag(true);
				 System.out.println("Counts matched!");
			 }
			 else
				 resultDetails.setFlag(false);

			 break;

		 case TRANS: 

			 //				driver.findElement(By.xpath("//div[3]/ul/li[4]/a")).click();
			 //				
			 //				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 //				
			 //				 driver.findElement(By.linkText("View all transportation »")).click();
			 //					
			 //				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;

			 // FOR DEV:

			 driver.findElement(By.xpath("(//a[text()='Transportation'])")).click();

			 Thread.sleep(3000);
			 boolean b2=SEARCH_RESULT_COMPARISON(driver);
			 System.out.println(b2);
			 if(b2) {

				 resultDetails.setFlag(true);
				 System.out.println("Counts matched!");
			 }
			 else
				 resultDetails.setFlag(false);

			 break;

			 /*Thread.sleep(10000);
						suman		 
					driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
					Thread.sleep(10000);
					String EOCount = driver.findElement(By.cssSelector("span.e1Count")).getText();
					System.out.println(EOCount);
					String getEOCount = EOCount.substring(EOCount.indexOf("(")+1, EOCount.lastIndexOf(")"));
					System.out.println(getEOCount);
					int convertEOCount = Integer.parseInt(getEOCount);

					String RBCount = driver.findElement(By.cssSelector("span.rbaCount")).getText();
					System.out.println(RBCount);
					String getRBCount = RBCount.substring(RBCount.indexOf("(")+1, RBCount.lastIndexOf(")"));
					System.out.println(getRBCount);




					//String replaceRBCount = getRBCount.replace(",", "");

					int convertRBCount = Integer.parseInt(getRBCount);
					System.out.println(convertRBCount);

					int addcounts = convertRBCount+convertEOCount;
					System.out.println(addcounts);

					String convertcounts = String.valueOf(addcounts);

					String verbiage = driver.findElement(By.id("e1NumFound")).getText();

//					String replaceverbiage = verbiage.replaceAll("\\D+", ""); // extracts only the numeric from the alphanumeric
//					System.out.println(replaceverbiage);

					String verbiagereplace = verbiage.replace(",", "");
					System.out.println(verbiagereplace);

					int convertverbiage = Integer.parseInt(verbiagereplace);

					String verbiageconvert = String.valueOf(convertverbiage);

					if(verbiageconvert.equalsIgnoreCase(convertcounts)) {

						resultDetails.setFlag(true);
						System.out.println("Counts matched!");
					}

					break;
			  */

		 case CONS:		

			 //				driver.findElement(By.xpath("//div[3]/ul/li[2]/a")).click();
			 //				
			 //				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 //				
			 //				 driver.findElement(By.linkText("View all construction »")).click();


			 //FOR DEV:

			 driver.findElement(By.xpath("//a[text()='Construction']")).click();
			 Thread.sleep(3000);
			 boolean b3=SEARCH_RESULT_COMPARISON(driver);
			 System.out.println(b3);
			 if(b3) {

				 resultDetails.setFlag(true);
				 System.out.println("Counts matched!");
			 }
			 else
				 resultDetails.setFlag(false);

			 break;

			 /*Thread.sleep(10000);


					driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
					Thread.sleep(10000);
					String consEOCount = driver.findElement(By.cssSelector("span.e1Count")).getText();
					System.out.println(consEOCount);
					String consgetEOCount = consEOCount.substring(consEOCount.indexOf("(")+1, consEOCount.lastIndexOf(")"));
					System.out.println(consgetEOCount);
					int consconvertEOCount = Integer.parseInt(consgetEOCount);

					String consRBCount = driver.findElement(By.cssSelector("span.rbaCount")).getText();
					System.out.println(consRBCount);
					String consgetRBCount = consRBCount.substring(consRBCount.indexOf("(")+1, consRBCount.lastIndexOf(")"));
					System.out.println(consgetRBCount);

					//String consreplaceRBCount = consgetRBCount.replace(",", "");

					int consconvertRBCount = Integer.parseInt(consgetRBCount);
					System.out.println(consconvertRBCount);

					int consaddcounts = consconvertEOCount+consconvertRBCount;
					System.out.println(consaddcounts);

					String consconvertcounts = String.valueOf(consaddcounts);

					String consverbiage = driver.findElement(By.id("e1NumFound")).getText();

//					String consreplaceverbiage = consverbiage.replaceAll("\\D+", ""); // extracts only the numeric from the alphanumeric
//					System.out.println(consreplaceverbiage);

					String consverbiagereplace = consverbiage.replace(",", "");
					System.out.println(consverbiagereplace);

					int consconvertverbiage = Integer.parseInt(consverbiagereplace);

					String consverbiageconvert = String.valueOf(consconvertverbiage);

					if(consverbiageconvert.equalsIgnoreCase(consconvertcounts)) {

						resultDetails.setFlag(true);
						System.out.println("Counts matched!");
					}
					break;	*/
		 case ENER:

			 //				driver.findElement(By.xpath("//div[3]/ul/li[5]/a")).click();
			 //				
			 //				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 //				
			 //				 driver.findElement(By.linkText("View all energy »")).click();

			 // FOR DEV:

			/* driver.findElement(By.linkText("ENERGY")).click();
			 Thread.sleep(10000);




			 driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
			 Thread.sleep(10000);
			 String EnerEOCount = driver.findElement(By.cssSelector("span.e1Count")).getText();
			 System.out.println(EnerEOCount);
			 String EnergetEOCount = EnerEOCount.substring(EnerEOCount.indexOf("(")+1, EnerEOCount.lastIndexOf(")"));
			 System.out.println(EnergetEOCount);
			 int EnerconvertEOCount = Integer.parseInt(EnergetEOCount);

			 String EnerRBCount = driver.findElement(By.cssSelector("span.rbaCount")).getText();
			 System.out.println(EnerRBCount);

			 String EnergetRBCount = EnerRBCount.substring(EnerRBCount.indexOf("(")+1, EnerRBCount.lastIndexOf(")"));
			 System.out.println(EnergetRBCount);

			 //String EnerreplaceRBCount = EnergetRBCount.replace(",", "");

			 int EnerconvertRBCount = Integer.parseInt(EnergetRBCount);
			 System.out.println(EnerconvertRBCount);

			 int Eneraddcounts = EnerconvertEOCount+EnerconvertRBCount;
			 System.out.println(Eneraddcounts);

			 String Enerconvertcounts = String.valueOf(Eneraddcounts);

			 String Enerverbiage = driver.findElement(By.id("e1NumFound")).getText();

			 //					String Enerreplaceverbiage = Enerverbiage.replaceAll("\\D+", ""); // extracts only the numeric from the alphanumeric
			 //					System.out.println(Enerreplaceverbiage);

			 String Enerverbiagereplace = Enerverbiage.replace(",", "");
			 //					System.out.println(Enerverbiagereplace);

			 int Enerconvertverbiage = Integer.parseInt(Enerverbiagereplace);

			 String Enerverbiageconvert = String.valueOf(Enerconvertverbiage);

			 if(Enerverbiageconvert.equalsIgnoreCase(Enerconvertcounts)) {

				 resultDetails.setFlag(true);
				 System.out.println("Counts matched!");
			 }
			 break;	
*/
			 
			 driver.findElement(By.xpath("//a[text()='Energy']")).click();
			 driver.findElement(By.xpath("//a[@href='/Energy-equipment']")).click();
			 Thread.sleep(3000);
			 boolean b4=SEARCH_RESULT_COMPARISON(driver);
			 System.out.println(b4);
			 if(b4) {

				 resultDetails.setFlag(true);
				 System.out.println("Counts matched!");
			 }
			 else
				 resultDetails.setFlag(false);

			 break;
			 
			 
			 
		 case SEARCH:

			 try {
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 driver.findElement(By.id("search")).sendKeys("trucks");
				 Thread.sleep(1500);
				 //driver.findElement(By.xpath("//[@id='main_search']/button")).click();
				 driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
				 Thread.sleep(3000);

				 driver.findElement(By.linkText("Source Site")).click();
				 Thread.sleep(1500);
				 driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
				 Thread.sleep(1500);
				 driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();

				 //suman

				 /*driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
					Thread.sleep(10000);
					driver.findElement(By.xpath("//div[11]/div[2]/div/ul/li[2]/input")).click();
					Thread.sleep(10000);*/
				 Thread.sleep(5000);

				 //String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
				 System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).size());
				 String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).getText();
				 System.out.println(E1Count);
				 String EOCountt = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
				 Integer count1=Integer.parseInt(EOCountt);
				 System.out.println("count1 is: "+count1);

				 Thread.sleep(5000);
				 System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.id("e1NumFound")).size());
				 System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
				 String listingcount = driver.findElement(By.id("e1NumFound")).getText();
				 String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();

				 //System.out.println(nextlistingcount);

				 String listingcount2=listingcount.replace(",", "");
				 String nextlistingcount2=nextlistingcount.replace(",", "");
				 int convlistingcount = Integer.parseInt(listingcount2);
				 int convnextlistingcount = Integer.parseInt(nextlistingcount2);

				 System.out.println("lot count is: "+convlistingcount);
				 System.out.println("event count is: "+convnextlistingcount);

				 int myfinalcount = convlistingcount + convnextlistingcount;
				 String compfinalcount = String.valueOf(myfinalcount);

				 System.out.println(myfinalcount);
				 System.out.println(compfinalcount);

				 //if(EOCount.equalsIgnoreCase(compfinalcount)) {   //suman

				 if(count1<=0 || myfinalcount<=0 || count1!=myfinalcount)
					 resultDetails.setFlag(false);

				 else
					 resultDetails.setFlag(true);


			 }

			 catch (Exception e) {
				 resultDetails.setFlag(false);
				 e.printStackTrace();
			 }
			 break;

		 }

	 } catch (Exception e) {
		 //System.out.println(e);
		 e.printStackTrace();
		 resultDetails.setFlag(false);
	 }
 }
  
 public String QA(WebDriver driver) throws FileNotFoundException, InterruptedException {
	 
 
	 try {
		 
		 driver.findElement(By.linkText("ALL EQUIPMENT")).click();

Thread.sleep(10000);

		 		  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		  
			 Random r = new Random();
			 
			 int randomvalue = r.nextInt(listings.size());
			 listings.get(randomvalue).click();
			 
			 System.out.println(randomvalue);
		  
		 getvalue = driver.findElement(By.xpath("//div[7]/span")).getText();
		 System.out.println(getvalue);		 	 
		 			 
			 driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
			 Thread.sleep(10000);
			 
			 driver.findElement(By.id("listingQuestion")).click();
			 Thread.sleep(10000);
			 
			 driver.findElement(By.id("listingQuestion")).sendKeys("where is the listing located");
			 Thread.sleep(10000);
			 driver.findElement(By.name("submitq")).click();
			 Thread.sleep(10000);
			 			 
			 driver.findElement(By.xpath("//div/div[2]/div[3]/input")).click();
			 Thread.sleep(10000);
	
//			 
			 resultDetails.setFlag(true);
			  
		 
	 } catch(StaleElementReferenceException e) {
		 
		 if(retries < MAX_STALE_ELEMENT_RETRIES ){
			 
			 retries++;
			 	 }
		 
		 else {
			 
			 throw e;
		 }
		 
		 
	 }
	return getvalue;
	
	 
 }
 
 public void VERIFYQAINAMP(WebDriver driver, String fieldText) throws FileNotFoundException {
	  
	 String field = fieldText;
	 	 
	 try {

		 // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
		 /* driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/equipmentone-listings");
		 driver.findElement(By.linkText("2")).click();

		 Thread.sleep(10000);

		 List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));

		 Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		 Thread.sleep(10000);*/
		 NAVIGATETOLISTINGDETAILSPAGE(driver);

		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();
		 
		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Where is the listing located?";
		 driver.findElement(By.id("listingQuestion")).sendKeys(question);
		 Thread.sleep(1000); 
		 driver.findElement(By.name("submitq")).click();
		 Thread.sleep(4000);	 			 
		 driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		 Thread.sleep(4000);

		 /* driver.findElement(By.id("uname")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.linkText("Sign Out")).click();*/
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();


		 driver.get(field);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();

		 Thread.sleep(2000);

		 System.out.println("Searching for lot id : "+getvalue);
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Lot Q/A")).click();

		if(driver.getPageSource().contains(question))
		 {
		 //driver.navigate().refresh();
		 resultDetails.setFlag(true);
		 }
		else
			System.out.println("question not found in AMP");

}
  catch (Exception e ) {
		 e.printStackTrace();
		 resultDetails.setFlag(false);
		 
//		 FileOutputStream fos = new FileOutputStream("C:/TestProject - DEV/Log File/logfile.txt");
//		  PrintStream ps = new PrintStream(fos);
//		  e.printStackTrace(ps);
	 }
 }
 
 public void REJECTQUES(WebDriver driver, String value) {
	 
try {		 
		 driver.findElement(By.linkText("ALL EQUIPMENT")).click();
		 Thread.sleep(10000);
		 
		 List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		 
		 Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		 	 
		 //WaitforElementPresent.	  
		  
		    	 	  		 
		 WebDriverWait wait = new WebDriverWait(driver, 30000);
		 
		 getvalue =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[7]/span"))).getText();
		 System.out.println(getvalue);
		 
		 Thread.sleep(10000);
		  
		 			 
			 driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
			 
			 Thread.sleep(10000);
			 
			 driver.findElement(By.id("listingQuestion")).click();
			 
				 		 
			 driver.findElement(By.id("listingQuestion")).sendKeys("Where is the listing located");
				
		Thread.sleep(10000);
			 driver.findElement(By.name("submitq")).click();
			 Thread.sleep(10000);
			 
			 driver.findElement(By.xpath("//div/div[2]/div[3]/input")).click();
			 Thread.sleep(10000);
			 
			 driver.findElement(By.xpath("//span")).click();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.linkText("Sign Out")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 		 	 driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
		  
		  driver.get(value);
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
		  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("userAgreementBtn")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  		  		 System.out.println(getvalue);
		  		  		driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();
		 
		 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.linkText("Lot Q/A")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 
		 //		 		 
		 		
		 		 String ParentHandle = driver.getWindowHandle();
		 		driver.findElement(By.linkText("Reject")).click();
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				  for(String winHandle : driver.getWindowHandles()) {
					  
					  System.out.println("Entered For Loop");
					  driver.switchTo().window(winHandle);
		 						  }

			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		driver.findElement(By.id("id_button_rejct")).click(); 
			 				 		 
			 		Thread.sleep(10000);
			 		
			 		driver.switchTo().alert().accept();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		driver.switchTo().window(ParentHandle);
		 		 
		 resultDetails.setFlag(true);
	 
}  

		  		catch(StaleElementReferenceException e) {
					 
					 if(retries < MAX_STALE_ELEMENT_RETRIES ){
						 
						 retries++;
						 	 }
					 
					 else {
						 
						 throw e;
					 }
				}
  catch(Exception e ) {
	 
	 resultDetails.setFlag(false);
e.printStackTrace();
 } 
 }
 
 
 public void FORWARDTOMM (WebDriver driver, String fieldText) {
	 
	 try {

		 NAVIGATETOLISTINGDETAILSPAGE(driver);

		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Could you forward my question to MM?";
		 driver.findElement(By.id("listingQuestion")).sendKeys(question);
		 Thread.sleep(1000); 
		 driver.findElement(By.name("submitq")).click();
		 Thread.sleep(4000);	 			 
		 driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		 Thread.sleep(4000);

		 /* driver.findElement(By.id("uname")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.linkText("Sign Out")).click();*/
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();


		 driver.get(fieldText);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();

		 Thread.sleep(2000);

		 System.out.println("Searching for lot id : "+getvalue);
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Lot Q/A")).click();

		 Thread.sleep(10000);


		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }

		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//td/input[4]")).click();
		 driver.findElement(By.id("id_button_forward")).click();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;

		 driver.switchTo().alert().accept();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.switchTo().window(ParentHandle);

		 resultDetails.setFlag(true);

	 }
 catch(StaleElementReferenceException e) {
	 
	 if(retries < MAX_STALE_ELEMENT_RETRIES ){
		 
		 retries++;
		 	 }
	 
	 else {
		 
		 throw e;
	 }
}
 catch(Exception e ) {
		 
		 resultDetails.setFlag(false);
		 resultDetails.setErrorMessage("MM is not displayed for this listing");
		 e.printStackTrace();
	 }
	 
	 
 }
 
 public void FORWARDTOSELLER (WebDriver driver, String fieldText) {
	 
	 try {
			 
		 NAVIGATETOLISTINGDETAILSPAGE(driver);

		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Could you forward my question to SELLER?";
		 driver.findElement(By.id("listingQuestion")).sendKeys(question);
		 Thread.sleep(1000); 
		 driver.findElement(By.name("submitq")).click();
		 Thread.sleep(4000);	 			 
		 driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		 Thread.sleep(4000);

		 /* driver.findElement(By.id("uname")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.linkText("Sign Out")).click();*/
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();


		 driver.get(fieldText);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();

		 Thread.sleep(2000);

		 System.out.println("Searching for lot id : "+getvalue);
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Lot Q/A")).click();

			 
			 Thread.sleep(10000);
			 
			 	 		
			 		 String ParentHandle = driver.getWindowHandle();
			 		driver.findElement(By.linkText("Forward")).click();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					  for(String winHandle : driver.getWindowHandles()) {
						  
						  System.out.println("Entered For Loop");
						  driver.switchTo().window(winHandle);
			 						  }

				 		Thread.sleep(10000);
				 		driver.findElement(By.xpath("//td/input[4]")).click();
				 		driver.findElement(By.id("id_button_forward")).click();
				 		
				 		driver.findElement(By.id("id_button_forward_seller_location")).click();
				 				 		 
				 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 		
				 		driver.switchTo().alert().accept();
				 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 		driver.switchTo().window(ParentHandle);
			 		 
			 resultDetails.setFlag(true);
			
	 }
	 catch(StaleElementReferenceException e) {
		 
		 if(retries < MAX_STALE_ELEMENT_RETRIES ){
			 
			 retries++;
			 	 }
		 
		 else {
			 
			 throw e;
		 }
	}
	 catch(Exception e ) {
			 
			 resultDetails.setFlag(false);
			 
			resultDetails.setErrorMessage("seller is not displayed for this listing");
			 e.printStackTrace();
		 }
		 
		 
	 }
 
 
 
 public void EQITQUESFWDTOSELLER (WebDriver driver, String fieldText) {
	 
	 try {
			 
		 String field = fieldText;	

		 
		 driver.findElement(By.linkText("ALL EQUIPMENT")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		 Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		 Thread.sleep(10000);
		  
		  
		 getvalue = driver.findElement(By.xpath("//div[7]/span")).getText();
		 System.out.println(getvalue);
		 	 
		 			 
			 driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.id("listingQuestion")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.id("listingQuestion")).sendKeys("Where is the listing located");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;			 
			 driver.findElement(By.name("submitq")).click();
			 Thread.sleep(10000);			 			 
			 driver.findElement(By.xpath("//div/div[2]/div[3]/input")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 
			 driver.findElement(By.id("uname")).click();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.linkText("Sign Out")).click();
		 
		 		 	 driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
			  
		  driver.get(field);
		  driver.manage().deleteAllCookies();
		  driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
			  
		  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
			  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
		  driver.findElement(By.id("userAgreementBtn")).click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  
			  		  		 System.out.println(getvalue);
			  		  		driver.findElement(By.name("search_string")).sendKeys(getvalue);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 driver.findElement(By.cssSelector("button[type='submit']")).click();
			 
			 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
			 
			 driver.findElement(By.linkText("Lot Q/A")).click();
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 
			 	 		
			 		 String ParentHandle = driver.getWindowHandle();
			 		driver.findElement(By.linkText("Forward")).click();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					  for(String winHandle : driver.getWindowHandles()) {
						  
						  System.out.println("Entered For Loop");
						  driver.switchTo().window(winHandle);
			 						  }

				 		Thread.sleep(10000);
				 		driver.findElement(By.xpath("//td/input[4]")).click();
				 		driver.findElement(By.id("id_button_forward")).click();
				 		
				 		driver.findElement(By.id("id_frm_textarea_reply")).sendKeys("change in question forward to seller");
				 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 		
				 		driver.findElement(By.id("id_button_forward_seller_location")).click();
				 				 		 
				 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 		
				 		driver.switchTo().alert().accept();
				 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 		driver.switchTo().window(ParentHandle);
			 		 
			 resultDetails.setFlag(true);
			
	 }
	 catch(StaleElementReferenceException e) {
		 
		 if(retries < MAX_STALE_ELEMENT_RETRIES ){
			 
			 retries++;
			 	 }
		 
		 else {
			 
			 throw e;
		 }
	}
	 catch(Exception e ) {
			 
			 resultDetails.setFlag(false);
			 
			resultDetails.setErrorMessage("seller is not displayed for this listing");
			 e.printStackTrace();
		 }
		 
		 
	 }
	  
	  
 
 public void FORWARDTOSTORAGE (WebDriver driver, String fieldText) {
	 
	 try {

		 NAVIGATETOLISTINGDETAILSPAGE(driver);

		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Could you forward my question to SELLER?";
		 driver.findElement(By.id("listingQuestion")).sendKeys(question);
		 Thread.sleep(1000); 
		 driver.findElement(By.name("submitq")).click();
		 Thread.sleep(4000);	 			 
		 driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		 Thread.sleep(4000);

		 /* driver.findElement(By.id("uname")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.linkText("Sign Out")).click();*/
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();


		 driver.get(fieldText);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();

		 Thread.sleep(2000);

		 System.out.println("Searching for lot id : "+getvalue);
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Lot Q/A")).click();


		 Thread.sleep(10000);


		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//td/input[3]")).click();
		 driver.findElement(By.id("id_button_forward")).click();

		 driver.findElement(By.id("id_button_forward_seller_location")).click();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;

		 driver.switchTo().alert().accept();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.switchTo().window(ParentHandle);

		 resultDetails.setFlag(true);




	 }
	 catch(Exception e ) {
			 
			 resultDetails.setFlag(false);
			 
			resultDetails.setErrorMessage("Storage location is not displayed for this listing");
			 e.printStackTrace();
		 }
		 
		 
	 }
 
 public void FORWARDTOPM (WebDriver driver, String fieldText) {
	 
	 try {

		 NAVIGATETOLISTINGDETAILSPAGE(driver);

		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Could you forward my question to SELLER?";
		 driver.findElement(By.id("listingQuestion")).sendKeys(question);
		 Thread.sleep(1000); 
		 driver.findElement(By.name("submitq")).click();
		 Thread.sleep(4000);	 			 
		 driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		 Thread.sleep(4000);

		 /* driver.findElement(By.id("uname")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.linkText("Sign Out")).click();*/
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();


		 driver.get(fieldText);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();

		 Thread.sleep(2000);

		 System.out.println("Searching for lot id : "+getvalue);
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Lot Q/A")).click();


		 Thread.sleep(10000);


		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//td/input[2]")).click();
		 driver.findElement(By.id("id_button_forward")).click();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;

		 driver.switchTo().alert().accept();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.switchTo().window(ParentHandle);

		 resultDetails.setFlag(true);

	 }
	 catch(StaleElementReferenceException e) {
		 
		 if(retries < MAX_STALE_ELEMENT_RETRIES ){
			 
			 retries++;
			 	 }
		 
		 else {
			 
			 throw e;
		 }
	}
	 catch(Exception e ) {
			 
			 resultDetails.setFlag(false);
			 resultDetails.setErrorMessage("PM is not displayed for this listing");
			 e.printStackTrace();
		 }
		 
		 
	 }
 
public void MAXOFFERINDETAILSPAGE(WebDriver driver) {
	 
	try {
		  
		driver.findElement(By.linkText("ALL EQUIPMENT")).click();
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  
		  // Loops through the listings in search results page and clicks the first listing available on the page.
		  
		  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		  
		  Random r = new Random();
		  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		  listings.get(randomValue).click();
		  Thread.sleep(10000);
		  
		   	String offer = driver.findElement(By.xpath("//span/div[2]/div/span")).getText();
		 
		 System.out.println(offer);
		  
		  String Max = offer.substring(1, offer.length() -2);
		  
		  if(Max.indexOf(',')> -1) {
		  
			  System.out.println("Field has comma");
		  String convert = Max.replace(",", ""); 
		  
		  String dot = convert.replace(".", "");
		  int mymaxoffer = Integer.parseInt(dot);
		  int finaladding = add + mymaxoffer;
		  
		  String convadd = String.valueOf(finaladding);
		  		  
		   System.out.println(convadd);
		      
		   ListingsID = driver.findElement(By.xpath("//div[7]/span")).getText();
		   System.out.println(ListingsID);
		   
		   driver.findElement(By.cssSelector("input.jsOfferInput")).sendKeys(convadd);
		   
		   WebDriverWait wait = new WebDriverWait(driver, 40000);
		   
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/button")));
		   
	driver.findElement(By.xpath("//div[3]/button")).click();
		   
		   
		   		  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			  	driver.findElement(By.cssSelector("input.jsOfferInput.e1ConfirmInput")).sendKeys(convadd);
				  
			  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/button")));
			  	
			  	
			   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
			   
			   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 	   				   
				   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
				   
				   if(isPresent==true) {
					   
					   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
					   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   Thread.sleep(10000);
				   }
				   
				   else {
					   
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   Thread.sleep(10000);
					      
				   }
		  }
				   		  			  
			  
			  
		   		   	   		  
		  else {
			  
			  System.out.println("field does not have comma");
			  
			  String mydot = Max.replace(".", "");
			  
			   System.out.println(mydot);
			   
			   int getmaxoffer = Integer.parseInt(mydot);
				  int addingfinal = add + getmaxoffer;
				  
				  String myconvadd = String.valueOf(addingfinal);
			   
				  driver.findElement(By.xpath("//div[3]/input")).sendKeys(myconvadd);
			   		   
				  WebDriverWait wait = new WebDriverWait(driver, 30000);
				   
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/button")));
				   
				   driver.findElement(By.xpath("//div[3]/button")).click();
				  				  
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	  
			  	driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(myconvadd);
			  	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/button")));
			  	
			  	
				   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
				  
			  				  	
			  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
			   			     		  	  
				     					   
					   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
					   
					   if(isPresent==true) {
						   
						   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
						   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						   driver.findElement(By.xpath("//li[9]/button")).click();
						   Thread.sleep(10000);
					   }
					   					   else {
					   						   
					   						Thread.sleep(10000);
					   						driver.findElement(By.xpath("//li[9]/button")).click();
						   Thread.sleep(10000);
						      
					   }				   
				  }			  
			  	  			   
		  
		   	  		  		  
		  resultDetails.setFlag(true);
		   
		  }
	
	
	catch(StaleElementReferenceException e) {
		 
		 if(retries < MAX_STALE_ELEMENT_RETRIES ){
			 
			 retries++;
			 	 }
		 
		 else {
			 
			 throw e;
		 }
	}
			 
	catch(Exception e) {
		 
		 resultDetails.setFlag(false);
		 e.printStackTrace();
	 }
	 	 
}
 
 public void EXACTOFFERINDETAILSPAGE(WebDriver driver) {
	 
	 try {
		  
			driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			 
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  
			  // Loops through the listings in search results page and clicks the first listing available on the page.
			 // suman
			  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
			  
			  Random r = new Random();
			  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
			  listings.get(randomValue).click();
			  		  
			  Thread.sleep(10000);
			  String offer = driver.findElement(By.xpath("//span/div[2]/div/span")).getText();
			 
			 System.out.println(offer);
			  
			  String Max = offer.substring(1, offer.length() -2);
			  
			  ListingsID = driver.findElement(By.xpath("//div[7]/span")).getText();
			  
			  if(Max.indexOf(',')> -1) {
			  
				  System.out.println("Field has comma");
			  String convert = Max.replace(",", ""); 
			  
			  String dot = convert.replace(".", "");
			  
			   System.out.println(dot);
			   			   
			   int mymaxoffer = Integer.parseInt(dot);
				  int finaladding = add + mymaxoffer;
				  
				  String convadd = String.valueOf(finaladding);
			      
			   driver.findElement(By.xpath("//span[2]/input")).click();
			   
			   
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   
			   driver.findElement(By.xpath("//div[3]/input")).sendKeys(convadd);
			   
			   WebDriverWait wait = new WebDriverWait(driver, 30000);
			   
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/input")));
			   
			   driver.findElement(By.xpath("//div[3]/button")).click();
				  			  	  
						  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  
				  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				  
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/input")));
				  
				  
				  driver.findElement(By.cssSelector("div.e1ConfirmButton button.e1Buttons.jsConfirmOffer.e1OrangeShadow")).click();
			   Thread.sleep(20000);
			   
			   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
			   
			   if(isPresent==true) {
				   
				   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
				   
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[9]/button")));
				   
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
			   }
			   
			   else {
			   
			      				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
				      
			   }
			   
			  }
			   		   	   		  
			  else {
				  
				  System.out.println("field does not have comma");
				  
				  String mydot = Max.replace(".", "");
				  
				   System.out.println(mydot);
				   
				   int mymaxoffer = Integer.parseInt(mydot);
					  int finaladding = add + mymaxoffer;
					  
					  String convadd = String.valueOf(finaladding);
					  
				   driver.findElement(By.xpath("//span[2]/input")).click();
				   Thread.sleep(10000);
				   		   
				   driver.findElement(By.xpath("//div[3]/input")).sendKeys(convadd);
				   
				   WebDriverWait wait = new WebDriverWait(driver, 30000);
				   
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/input")));
				   
				   
				   driver.findElement(By.cssSelector("div.e1OfferButton.jsOfferLive button.e1Buttons.e1OrangeShadow.jsMakeOffer")).click();
				   
				   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				   
				  	  					  
					  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
					  
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/input")));
					  
					  driver.findElement(By.cssSelector("div.e1ConfirmButton button.e1Buttons.jsConfirmOffer.e1OrangeShadow")).click();
				   	  Thread.sleep(20000);
				   
				   
				   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
				   
				   if(isPresent==true) {
					   
					   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
					   
					   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[9]/button")));
					   
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   
					   Thread.sleep(10000);
				   }
				   else {
				   
					   	driver.findElement(By.xpath("//li[9]/button")).click();
					   
					   Thread.sleep(10000);  				     	  		  
				 	  }			  
			  }
				  				  resultDetails.setFlag(true);
				  
			  }
		
		catch(StaleElementReferenceException e) {
			 
			 if(retries < MAX_STALE_ELEMENT_RETRIES ){
				 
				 retries++;
				 	 }
			 
			 else {
				 
				 throw e;
			 }
		}
				 
		catch(Exception e) {
			 
			 resultDetails.setFlag(false);
		 }
		 	 
	}
 
 
 
 public void BUYINGSALESINMYONE(WebDriver driver, String fieldText) {
	 
	 String field = fieldText;
	 
	   AppKeyWords ampkey = AppKeyWords.valueOf(field.toUpperCase());			
		
		switch(ampkey){
				
		case MAXOFFER:
			
			try {
			
			MAXOFFERINDETAILSPAGE(driver);
			
			
			driver.findElement(By.xpath("//li[@id='e1lnk_myone']/a")).click();
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[2]/ul/li/a")).click();
			Thread.sleep(10000);
						
			if(driver.getPageSource().contains(ListingsID)) {
				
				resultDetails.setErrorMessage("listing is displayed in myone> buying");
				
				resultDetails.setFlag(true);
			}
			
			} catch (Exception e ) {
				
				resultDetails.setFlag(false);
				
				break;
			}
			
		case EXACTOFFER:
			try {
				
				EXACTOFFERINDETAILSPAGE(driver);
				
				driver.findElement(By.xpath("//li[@id='e1lnk_myone']/a")).click();
				
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[2]/ul/li/a")).click();
				Thread.sleep(10000);
				
				String LISTINGIDINMYONE= driver.findElement(By.xpath("//div[12]/div/div[5]/div/div/div[2]/div/div/div[2]")).getText();
				
				
				if(LISTINGIDINMYONE.equalsIgnoreCase(ListingsID)) {
					
					resultDetails.setErrorMessage("listing is displayed in myone> buying");
					
				}
				
				} catch (Exception e ) {
					
					resultDetails.setFlag(false);
				}
			
			break;
			}
			
		}
	 
 
 public void MAXOFFERINSEARCHRESULTSPAGE(WebDriver driver){
	 
	 try {
		  
			driver.findElement(By.linkText("ALL EQUIPMENT")).click();
			 
			  Thread.sleep(10000);
			  
			  // Loops through the listings in search results page and clicks the first listing available on the page.
			  
			  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
			  
			  Random r = new Random();
			  int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
			  listings.get(randomValue);
			  
			  WebDriverWait wait = new WebDriverWait(driver, 30000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[2]/span[2]/div[3]/div/span")));
			  
			  String offer = driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div/span")).getText();
			 
			 System.out.println(offer);
			  
			  String Max = offer.substring(1, offer.length() -2);
			  
			  if(Max.indexOf(',')> -1) {
			  
				  System.out.println("Field has comma");
			  String convert = Max.replace(",", ""); 
			  
			  String dot = convert.replace(".", "");
			  
			   System.out.println(dot);
			   int mymaxoffer = Integer.parseInt(dot);
				  int finaladding = add + mymaxoffer;
				  
				  String convadd = String.valueOf(finaladding);
				  
				  driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);
			   
			   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				  	  
			   
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/input")));
				  
				  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/button")));
				  
			   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
			   Thread.sleep(10000);
			   
			   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
			   
			   if(isPresent==true) {
				   
				   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
				   
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[9]/button")));
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
					  resultDetails.setFlag(true);
			   }
			   
			   else {
			   
			      
				   driver.findElement(By.xpath("//li[9]/button")).click();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					  resultDetails.setFlag(true);
			   }
			   
			  }
			   		   	   		  
			  else {
				  
				  System.out.println("field does not have comma");
				  
				  String mydot = Max.replace(".", "");
				  
				   System.out.println(mydot);
				   int mymaxoffer = Integer.parseInt(mydot);
					  int finaladding = add + mymaxoffer;
					  
					  String convadd = String.valueOf(finaladding);
					  driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/input")).sendKeys(convadd);		   
					  
				   driver.findElement(By.xpath("//span[2]/span[2]/div[3]/div[3]/button")).click();
				   
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/input")));
					  
					  driver.findElement(By.xpath("//div[5]/div[3]/input")).sendKeys(convadd);
					  
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]/div[3]/button")));
				   driver.findElement(By.xpath("//div[5]/div[3]/button")).click();
				   Thread.sleep(10000);
				   
				   
				   boolean isPresent = driver.findElement(By.cssSelector("input.jsTermsAgree")).isDisplayed();
				   
				   if(isPresent==true) {
					   
					   driver.findElement(By.cssSelector("input.jsTermsAgree")).click();
					   
					   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[9]/button")));
					   driver.findElement(By.xpath("//li[9]/button")).click();
					   Thread.sleep(10000);
						  resultDetails.setFlag(true);
				   }
				   
				   driver.findElement(By.xpath("//li[9]/button")).click();
				   Thread.sleep(10000);
					  resultDetails.setFlag(true);
				     	  		  
				  		  }			  
			  }
		
		catch(StaleElementReferenceException e) {
			 
			 if(retries < MAX_STALE_ELEMENT_RETRIES ){
				 
				 retries++;
				 	 }
			 
			 else {
				 
				 throw e;
			 }
		}
				 
		catch(Exception e) {
			 
			 resultDetails.setFlag(false);
		 }
		 	 
	}
 
 
  
public void BUYINGQA(WebDriver driver) {
	
	try {
		
		QA(driver);
		driver.findElement(By.linkText("MYONE")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[2]/ul/li[2]/a")).click();
		 Thread.sleep(10000);
		 
		 
		 if(driver.getPageSource().contains(getvalue)) {
			 
			 resultDetails.setFlag(true);
		 }
		 
			 
			
		
	} catch (Exception e ){
		
		resultDetails.setFlag(false);
		resultDetails.setErrorMessage("Qusetion is not displayed in MyONE");
		e.printStackTrace();
	}
	}
  
 public void BUYINGMYOFFER(WebDriver driver) {
	 
	 try {
		 
		 EXACTOFFERINSEARCHRESULTSPAGE(driver);
		 
		 driver.findElement(By.linkText("MYONE")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[2]/ul/li/a")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 String EQID = driver.findElement(By.xpath("//div[12]/div/div[5]/div/div/div[2]/div/div/div[2]")).getText();
		 
		 System.out.println(EQID);
		 
		 if(ID.equalsIgnoreCase(EQID)) {
			 
			 resultDetails.setFlag(true);
		 }
	 }
	 catch(Exception e ) {
		 
		 resultDetails.setFlag(false);
		 resultDetails.setErrorMessage("Listing is not displayed in MyOffers section");
	 }
	 
	  
 }
 
    
 public void EXACTOFFERINSEARCHRESULTSPAGE(WebDriver driver){

	 try {
		 // suman 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/equipmentone-listings");

		 Thread.sleep(1000);
		 driver.findElement(By.linkText("2")).click();//To go to 2nd page of the search results
		 Thread.sleep(10000);

		 //in search result there may be events, so finding first listing(excluding events) to offer exact bid

		 List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		 int j=-1;
		 for(int i=1;i<listings.size();i++)
		 {
			 j++;
			 String s1=listings.get(i).getAttribute("href");
			 String s2[]=s1.split("/listing?");
			 String s3[]=s2[1].split("&");
			 String s4[]=s3[0].split("=");
			 String id=s4[1];
			 System.out.println("listing id is: "+id);
			 System.out.println("listing-"+id);
			 String listingText=driver.findElement(By.id("listing-"+id)).getText();
			 //String Text[]=listingText.split("\n");
			 System.out.println("text in listing is:................... "+listingText);
			 if(listingText.contains("MAX BID"))
			 {
				 break;
			 }


			 i++;

		 }


		 System.out.println("number of listings in page: "+listings.size());

		 //taking first listing (not concidering events)
		 WebElement we=listings.get(j);
		 String href=we.getAttribute("href");
		 System.out.println("href of first listing is: "+href);
		 // (//a[@href='http://e1.dev.assetnation.com/listing?listingid=316696&backToSearchButton=1']/following::*[@class='jsMinOfferjsAmountText'])[1]

		 if(href.contains("http://e1.dev.assetnation.com"))
			 href=href.replaceAll("http://e1.dev.assetnation.com", "");
		 else if(href.contains("https://staging.equipmentone.com/"))
			 href=href.replaceAll("https://staging.equipmentone.com/", "");


		 String min_offer=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMinOffer jsAmountText'])[1]")).getText();
		 String min_offer2=min_offer.substring(1, min_offer.length()-3);
		 String min_offer3=min_offer2.replace(",", "");


		 Integer minOffer=Integer.parseInt(min_offer3);
		 System.out.println("minimum offer is: "+minOffer);
		 Integer bidAmount=add+minOffer;
		 String bidValue=String.valueOf(bidAmount);
		 //clicking on exact bid radio button
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='check-box' and @value='Exact Bid'])[1]")).click();
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='text' and @name='makeoffer'])[1]")).clear();
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='text' and @name='makeoffer'])[1]")).sendKeys(bidValue);
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='button' and @value='PLACE A BID'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='form-control jsOfferInput e1ConfirmInput' and@type='text'])[1]")).sendKeys(bidValue);
		 // String ss=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='form-control jsOfferInput'])[1]")).getText();


		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='button' and @value='CONTINUE'])[1]")).click();
		 Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 //some times we have confirmation check-bos and some times we dont have
		 try{
			 driver.findElement(By.xpath("(//input[@class='jsTermsAgree' and @type='checkbox'])[2]")).click();
		 }
		 catch(Exception e)
		 {
			 System.out.println("there is no confirm check box");
		 }
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='submit' and @value='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 for(int i=0;i<20;i++)
		 {
			 if(driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText().contains("$"))
				 break;
			 Thread.sleep(500);
		 }
		 String MyMaxBid=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText();
		 String MyMaxBid2=MyMaxBid.replace(".00", "");   //$8,200.00
		 String MyMaxBid3=MyMaxBid2.replace("$", "").replace(",", "");


		 System.out.println("bidded value is: "+bidValue);
		 System.out.println("showing my bid value is: "+MyMaxBid3);
		 if(MyMaxBid3.equals(bidValue))
			 resultDetails.setFlag(true); 
		 else
			 System.out.println("bid value is mis-matched");


	 }

	 catch(Exception e) {

		 e.printStackTrace(); 
		 resultDetails.setFlag(false);
	 }

 }
 
      
   public void WATCHINGINMYONE(WebDriver driver, String fieldText) {
	   
	   try {
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ADDTOWATCHLIST(driver, fieldText);
	    System.out.println("Back to  WATCHINGINMYONE method");
	      
	    driver.findElement(By.xpath("//*[@id='e1lnk_myone']/a")).click();
	    
	    driver.findElement(By.xpath("(//a[contains(text(),'Watching')])[2]")).click();
	    
	    if(driver.getPageSource().contains(ListingID)) {
	     System.out.println("listing is found in myone pagesource");
	     resultDetails.setFlag(true);
	    }
	   } catch (Exception e) {
	    System.out.println("Listing added is not displayed in MYOne Watchlist");
	    resultDetails.setFlag(false);
	    
	   }
	   
	    }
	   
	 
	 public void ADDTOWATCHLIST(WebDriver driver, String fieldText) {
	  
	  String fieldType = fieldText;
	  String field = fieldText;
	  try {
	   AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
	    
	  switch(cdf) {
	  
	  case FROMSEARCH:
	   
	   try {

	  
	     
	    }
	    
	    
	   
	   catch (Exception e) {
	    
	    resultDetails.setFlag(false);
	   }
	   
	   break;
	      
	  case FROMLISTING:
	 try {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@class='page-dots']/following::a[1]")).click();//To go to last page of the search results
	  
	  List <WebElement> listings = driver.findElements(By.xpath("//*[@class='e1tooltip icon_watchlist']/preceding::a[@class='jsTitle' and contains(@href,'/listing?listingid')]"));
	  //To store all lots in a list which are NOT ADDED TO WATCH-LIST
	                                     
	   Random r = new Random();
	   int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
	   listings.get(randomValue).click();
	   System.out.println("clicked on a random listing");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    ListingID = driver.findElement(By.xpath("//*[contains(text(),'Lot ID:')]/span")).getText(); 
	    System.out.println(ListingID);
	    
	    driver.findElement(By.linkText("Watch This")).click();
	    System.out.println("clicked on watch this");
	    
	    System.out.println(driver.findElement(By.xpath("//*[@class='e1WatchingThisText']")).getText());
	    if(driver.findElement(By.xpath("//*[@class='e1WatchingThisText']")).getText().equalsIgnoreCase("Watching")){
	     System.out.println("Added to watchlist"); 
	     resultDetails.setFlag(true);
	     }
	    else {
	     resultDetails.setFlag(false);
	     System.out.println("listing is not added to watchlist");  
	    }
	    System.out.println("going out of ADDTOWATCHLIST method");
	   break;
	   
	   }
	     catch(Exception e) {
	  
	    resultDetails.setFlag(false);
	      }
	}
	   } catch (Exception e) {
	  
	    System.out.println("listing is not added to watchlist");
	   }
	 }
		
 

 public void CHANGEPASSWORD(WebDriver driver, String fieldText) {
	 
	 try {
		 
		 String field = fieldText;
		 
		driver.get(field);
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		
		driver.findElement(By.id("new_password")).sendKeys("Equipment1$");
		driver.findElement(By.id("confirm_passwd")).sendKeys("Equipment1$");
		driver.findElement(By.id("submit_savepassword")).click();
			 // Thread.sleep(10000);
		resultDetails.setFlag(true);
		 
	 } catch (Exception e) {
		 
		 resultDetails.setFlag(false);
	 }
 }
 
 

 
 public void NAVIGATETOLISTINGDETAILSPAGE(WebDriver driver) {

	 try {
		//suman
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/equipmentone-listings");

		 Thread.sleep(1000);


		// driver.findElement(By.xpath("//*[@class='page-dots']/following::a[1]")).click();//To go to last page of the search results
		//navigating to second page
		 driver.findElement(By.linkText("2")).click();
		 
		 Thread.sleep(10000);

		 List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		 System.out.println("number of listings in page: "+listings.size());
		 //searching for listing from search result page which may contain events also so excluding events
		 for(int i=1;i<listings.size();i++)
		 {
			
			 String s1=listings.get(i).getAttribute("href");
			 String s2[]=s1.split("/listing?");
			 String s3[]=s2[1].split("&");
			 String s4[]=s3[0].split("=");
			 String id=s4[1];
			 System.out.println("listing id is: "+id);
			 System.out.println("listing-"+id);
			 String listingText=driver.findElement(By.id("listing-"+id)).getText();
			 //String Text[]=listingText.split("\n");
			 System.out.println("text in listing is:................... "+listingText);
			 if(listingText.contains("MAX BID"))
			 {
				 System.out.println("clicking on listing: "+((i/2)+1));
				 listings.get(i).click();
				 break;
			 }
			 
			 
			i++;
			 
		 }
		
		 //waiting upto listing will be loaded
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Back to Search Results']")));
		 //Thread.sleep(10000);
		 if(driver.findElement(By.xpath("//div[contains(@class,'e1OfferConsole')]")).isDisplayed())
			 resultDetails.setFlag(true);
	 } catch(Exception e){
		 e.printStackTrace();
		 resultDetails.setFlag(false);


	 }
 }
 
 
 
 public void USERAMP(WebDriver driver) {
	 
	 
	 try {
		 
		 driver.findElement(By.linkText("Imports")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 
		 driver.findElement(By.linkText("SelfService")).click();
		 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 	  
		 Select manager = new Select (driver.findElement(By.xpath("//div/select")));
		 manager.selectByVisibleText("Amy Kellner");

		 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
		 
		 driver.switchTo().alert().accept();
	 	 
		 	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;	 
			  
			  driver.findElement(By.linkText("Convert")).click();  
			  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;	 
			  resultDetails.setFlag(true);
		 
	 } catch(Exception e) {
		 
		 resultDetails.setFlag(false);
	 }
 }
 
public void MOUSEHOVER(WebDriver driver, String fieldText) {
	
	String fieldType = fieldText;
	String field = fieldText;
	
	try {
	AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
	
	switch(cdf) {
	
	case RBA:
		
		try {
			// clicks hidden RBA link
			WebElement element = driver.findElement(By.xpath("//ul/ul/li[2]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	              
	           String count = driver.findElement(By.id("e1NumFound")).getText();
	           String display = count + "Listings on Ritchie Bros. Auctioneers";
	           System.out.println(display);
	              
	              resultDetails.setFlag(true);
			
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}
		
		break;
	case EO:
try {
			// clicks hidden EO Link
			WebElement element = driver.findElement(By.xpath("//ul/ul/li/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              Thread.sleep(10000);
	              resultDetails.setFlag(true);
			
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}		
		break;
	case EVENTS:
		
try {
	// clicks hidden events link		
			WebElement element = driver.findElement(By.xpath("//ul/ul/li[3]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); ;
	              
	              
	              String eventcount = driver.findElement(By.cssSelector("span.e1Count")).getText();
	              
	            		  String RBeventcount = eventcount.substring(eventcount.indexOf("(")+1, eventcount.lastIndexOf(")"));
				  System.out.println(RBeventcount);
	            		  
	            		             		  
	              
	              String count = driver.findElement(By.id("e1ResultsFound")).getText();
		           String display = count + "Events on EquipmentOne";
		           System.out.println(display);
		           
		           if(RBeventcount.equalsIgnoreCase(count)) {
		        	   
		        	   System.out.println("count matched!!");   
		        	   		           }
		           resultDetails.setFlag(true);           	              
			
		} catch (Exception e ) {
			
			System.out.println("Counts do not match!");
			
			resultDetails.setFlag(false);
		}	
		
		break;
	case CLOSINGTODAY:
try {
			// clicks hidden closingtoday link
			WebElement element = driver.findElement(By.xpath("//ul/ul/li[4]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	              resultDetails.setFlag(true);
			
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}		
		break;
	case DSALE:
try {
			//clicks hidden definate sale link
			WebElement element = driver.findElement(By.xpath("//ul/ul/li[5]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	              
	              String count = driver.findElement(By.xpath("//div[2]/ul/li/div/div/div")).getText();
	              
	              if (count.equalsIgnoreCase("Definite Sale")) {
	            	  System.out.println(count);
	              resultDetails.setFlag(true);
	              }
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}			
		break;
	case NEWLISTINGS:
		
try {
			//clicks hidden newlistings link
			WebElement element = driver.findElement(By.xpath("//ul/ul/li[6]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	              resultDetails.setFlag(true);
			
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}			
		break;
		
	case ALLEQUIPMENTLINK:
		
		try {
			//clicks hidden All Equipment link
			WebElement element = driver.findElement(By.xpath("//div/div/div/div[2]/a"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", element);
	        
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	              resultDetails.setFlag(true);
			
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}			
		break;
		
		
	}  	 	 resultDetails.setFlag(true); 
    	  }
      
     catch (Exception e) {
    	 
    	 resultDetails.setFlag(false);
     }
     }


public void MAKEOFFERBTN(WebDriver driver, String fieldText) throws IOException {
	
	String fieldType = fieldText;
	String field = fieldText;
	
	
	AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
	
	switch(cdf) {
	
	case VISITOR:
try {
			
			List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
			  
			  for (int i=0; i < listings.size(); i++) {
			  		  
			  WebElement requiredlisting = listings.get(i);
			  requiredlisting.click();
			  
			  if(driver.findElements(By.cssSelector("input.primary_200")).size() != 0) {
				  
System.out.println("Sign In to Make Offer button available");


				}
			  resultDetails.setFlag(true);
			}
			
} catch(StaleElementReferenceException e) {
	 
	 if(retries < MAX_STALE_ELEMENT_RETRIES ){
		 
		 retries++;
		 	 }
	 
	 else {
		 
		 throw e;
	 }
	 
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
			
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/TestProject - DEV/Log File/logfile.txt", true)));
			FileOutputStream fos = new FileOutputStream("C:/TestProject - DEV/Log File/logfile.txt");
			  PrintStream ps = new PrintStream(fos);
		e.printStackTrace(ps);
		
		
			  
		}
		
		break;
		
	}
	
}

public void ASKQUESTION(WebDriver driver, String fieldText, String value) {
		
	try {
		 int i;
		  List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
		  
			
			  for(i=0; i<listings.size();i++) {
			 			 
			  WebElement requiredlisting = listings.get(i);
			   requiredlisting.click();
			   			   
			   getvalue = driver.findElement(By.xpath("//div[7]/span")).getText();
				 System.out.println(getvalue);
				 	 
				 			 
					 driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 
					 driver.findElement(By.id("listingQuestion")).click();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 driver.findElement(By.id("listingQuestion")).sendKeys("where is the listing located");
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 driver.findElement(By.name("submitq")).click();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 			 
					 driver.findElement(By.xpath("//div/div[2]/div[3]/input")).click();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					
				driver.findElement(By.cssSelector("span")).click();
								 
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 driver.findElement(By.linkText("Sign Out")).click();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					 driver.manage().deleteAllCookies();
					 driver.navigate().refresh();
					 driver.get(fieldText);
					 driver.manage().deleteAllCookies();
					 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
					  
					  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
					  driver.findElement(By.xpath("//input[@value='Login']")).click();
					  
					  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					  
					  driver.findElement(By.id("userAgreementBtn")).click();
					  
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 
					  System.out.println(getvalue);
		  		  		driver.findElement(By.id("quicksearch")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.cssSelector("input.quicksearch_go")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	 		  
		 driver.findElement(By.linkText("Lot Q/A")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		  	 	 		
		 		 String ParentHandle = driver.getWindowHandle();
		 		driver.findElement(By.linkText("Forward")).click();
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				  for(String winHandle : driver.getWindowHandles()) {
					  
					  System.out.println("Entered For Loop");
					  driver.switchTo().window(winHandle);
		 						  }

			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		driver.findElement(By.xpath("//td/input[4]")).click();
			 		driver.findElement(By.id("id_button_forward")).click();
			 		
			 		driver.findElement(By.id("id_button_forward_seller_location")).click();
			 				 		 
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		
			 		driver.switchTo().alert().accept();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			 		driver.switchTo().window(ParentHandle);
			 		driver.findElement(By.xpath("//ul/ul/li/a")).click();
			 		
			 		driver.findElement(By.xpath("//td[2]/a")).click();
			 		String seller = driver.findElement(By.id("id_frm_Email_Address")).getAttribute("value");
			 		
			 		driver.findElement(By.linkText("Logout")).click();
			 		driver.manage().deleteAllCookies();
			 		driver.navigate().refresh();
			 		driver.get(value);
			 		driver.findElement(By.id("sign")).click();
					
					 driver.findElement(By.id("loginfield")).sendKeys(seller);
					  driver.findElement(By.id("pwdfield")).sendKeys("Equipment1$");
					  driver.findElement(By.cssSelector("input.secondary_110")).click();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					driver.findElement(By.linkText("MYONE")).click();
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 		
			 				 		
		 		 
		 resultDetails.setFlag(true);
					
			   
	}
	
	
} catch(Exception e ) {
	
	resultDetails.setFlag(false);
	}
	
	
}


public void MYSALES(WebDriver driver, String fieldText, String value) {
	
	
	try {
		
			driver.manage().deleteAllCookies();
		  
		  driver.get(value);
		  driver.manage().deleteAllCookies();
		   driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
			  
			  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
			  driver.findElement(By.xpath("//input[@value='Login']")).click();
			  
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  
			  driver.findElement(By.id("userAgreementBtn")).click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		CONTENTMNGR(driver);
		APPROVEDLG(driver);
		
		driver.get(fieldText);
		
		driver.findElement(By.id("sign")).click();
		
		 driver.findElement(By.id("loginfield")).sendKeys("automationuser@adityacharan.co.in");
		  driver.findElement(By.id("pwdfield")).sendKeys("Equipment1$");
		  driver.findElement(By.cssSelector("input.secondary_110")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		driver.findElement(By.linkText("MYONE")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  	String ListingID = driver.findElement(By.xpath("//div[12]/div/div[5]/div/div/div[2]/div/div/div[2]")).getText();
		  	
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(ListingID);
		
		System.out.println(LOTNUMBER);
		
		if(LOTNUMBER.equalsIgnoreCase(ListingID)) {
		
				resultDetails.setFlag(true);
			}
	}
	
	catch(Exception e ) {
		
		resultDetails.setFlag(false);
		e.printStackTrace();
	}
	
}


public void PENDINGLISTING(WebDriver driver, String fieldText, String value) {
	
	String field = fieldText;
	
	
		try {
			
			ELISTINGS(driver);
			
			driver.manage().deleteAllCookies();
			  
			  driver.get(value);
			  driver.manage().deleteAllCookies();
			   driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");
				  
				  driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
				  driver.findElement(By.xpath("//input[@value='Login']")).click();
				  
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  
				  driver.findElement(By.id("userAgreementBtn")).click();
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  driver.findElement(By.linkText("Imports")).click();
				  Thread.sleep(10000);
				  driver.findElement(By.linkText("Self Service")).click();
				  Thread.sleep(10000);
				  	  
			   String assettitle = driver.findElement(By.xpath("//td[4]")).getText();
			   
			   System.out.println(assettitle);
			  
			  if(Listingtitle.equalsIgnoreCase(assettitle) ) {
				  
				  System.out.println("listing exists");
				
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  driver.findElement(By.linkText("Logout")).click();
														  
					  driver.manage().deleteAllCookies();
					  driver.navigate().refresh();
			  }		
			  						  		    
				driver.get(field);
				
				driver.findElement(By.id("sign")).click();
				
				 driver.findElement(By.id("loginfield")).sendKeys("automationuser@adityacharan.co.in");
				  driver.findElement(By.id("pwdfield")).sendKeys("Equipment1$");
				  driver.findElement(By.cssSelector("input.secondary_110")).click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				driver.findElement(By.linkText("MYONE")).click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				 driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[3]/ul/li/a")).click();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 driver.findElement(By.xpath("//div[13]/ul/li[2]/a")).click();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 String TitleInPendingtab = driver.findElement(By.xpath("//div[75]/div/ul/li/h4/a")).getText();
				 
				 if(TitleInPendingtab.equalsIgnoreCase(Listingtitle)) {
					 
					System.out.println("listing exists");
				 }
				 
				 resultDetails.setFlag(true);
				
		} catch (Exception e ) {
		
		e.printStackTrace();
		resultDetails.setFlag(false);
		resultDetails.setErrorMessage("listing is not displayed in Pendingtab");
	}
}






public void DRAFTLISTING(WebDriver driver, String fieldText) {
	
	String fieldType = fieldText;
	String field = fieldText;
	
	try {
	AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
	
	switch(cdf){
	
	case EA:
				try {
			
							
			driver.findElement(By.cssSelector("a.topLink > span")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		  
		  driver.findElement(By.xpath("//input[@value='Equipment & Accessories']")).click();
		  
		  driver.findElement(By.id("chkCustomBuilt")).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select industry = new Select (driver.findElement(By.id("select_industry")));
		  industry.selectByVisibleText("Vehicles & Buses");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select category = new Select (driver.findElement(By.id("select_category")));
		  category.selectByVisibleText("Cars");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select subcategory = new Select (driver.findElement(By.id("select_subcategory")));
		  subcategory.selectByVisibleText("Car");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
		  driver.findElement(By.name("6")).sendKeys("SKODA");
		  
		  driver.findElement(By.name("3")).sendKeys("SK4");
		  
		  driver.findElement(By.name("2")).sendKeys("2014");
		  
		  driver.findElement(By.name("4")).sendKeys("125");
		  
		  driver.findElement(By.id("confirm_changes")).click();
		  
		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		  
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		  
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
		    			    
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("title")).sendKeys("  " + Time);
		  String title = driver.findElement(By.id("title")).getText();
	
		  driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
			 
		  Thread.sleep(10000);
		  
		  driver.findElement(By.linkText("MYONE")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[3]/ul/li/a")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("//div[15]/ul/li/a")).click();
		  Thread.sleep(10000);
		  
		  if(driver.getPageSource().contains(title)) {
			  
			  resultDetails.setFlag(true);
			  System.out.println("listing is displayed");
		  }
		  
		} catch (Exception e ) {
			
			e.printStackTrace();
			resultDetails.setFlag(false);
			resultDetails.setErrorMessage("Listing is not displayed in Drafts tab");
		}
		
		
	break;
	
	case COMMERCIAL:
		
		try {
			
			 driver.findElement(By.cssSelector("a.topLink > span")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  		  
			  driver.findElement(By.xpath("//input[@value='Commercial Materials']")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.findElement(By.id("textarea")).sendKeys("Test");
			  
			 driver.findElement(By.id("confirm_changes")).click();
			 
			 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.findElement(By.id("title")).sendKeys(" " + Time);
			 String title = driver.findElement(By.id("title")).getText();
			 
			 driver.findElement(By.xpath("//input[@value='Save & Continue']")).click();
			 
Thread.sleep(10000);
			  
			  driver.findElement(By.linkText("MYONE")).click();
			  Thread.sleep(10000);
			  
			  driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/ul/li[3]/ul/li/a")).click();
			  Thread.sleep(10000);
			  driver.findElement(By.xpath("//div[15]/ul/li/a")).click();
			  Thread.sleep(10000);
			  
			  if(driver.getPageSource().contains(title)) {
				  
				  resultDetails.setFlag(true);
				  System.out.println("listing is displayed");
			  }
			
					} catch(Exception e ) {
						
						e.printStackTrace();
						resultDetails.setFlag(false);
						resultDetails.setErrorMessage("Listing is not displayed in Drafts tab");
					}
		
				break;
	}
	}
	catch (Exception e ) {
		
		resultDetails.setFlag(false);
		resultDetails.setErrorMessage("EA or Commercial listings are not displayed");
	}
	}
	

public void LISTVIEWTITLE(WebDriver driver, String fieldText) {
	
	String fieldType = fieldText;
	String field = fieldText;
	
	try {
	AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
	
	switch(cdf){
		
	case E1RBA:
		
		try {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  
			  String BLEO = driver.findElement(By.cssSelector("span.e1Count")).getText();
				 System.out.println(BLEO);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 
				 String BLEOCount = BLEO.substring(BLEO.indexOf("(")+1, BLEO.lastIndexOf(")"));
				 System.out.println(BLEOCount);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 
				 String BLRBA =  driver.findElement(By.cssSelector("span.rbaCount")).getText();
				 System.out.println(BLRBA);
				 
				 String BLRBACount = BLRBA.substring(BLRBA.indexOf("(")+1, BLRBA.lastIndexOf(")"));
				 System.out.println(BLRBACount);									 
			 int EOConversion = Integer.parseInt(BLEOCount);
			 int RBAConversion = Integer.parseInt(BLRBACount);
			 
			 int finalcount = EOConversion + RBAConversion;
			 
			 System.out.println(finalcount);
			 		 		  
			 String strfinalcount = String.valueOf(finalcount);
			 
			 String BLmatch = driver.findElement(By.id("e1NumFound")).getText();
			 String eventmatch = driver.findElement(By.id("e1ResultsFound")).getText();
			 
			 
			 	 	  		 
			 String BLmatchCount = BLmatch.replace(",", "");
			 
			 int myBLmatchCount = Integer.parseInt(BLmatchCount);
			 int myeventmatch = Integer.parseInt(eventmatch);
			 
			 int finalcounts = myBLmatchCount + myeventmatch;
			 
//			 driver.findElement(By.id("span.rbacount")).getText();
//			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
//			 
//			 String matchcount = BLmatch.replace(",", "");
//			 
			 
			 
			 String myfinalcounts = String.valueOf(finalcounts);
			 
			if(strfinalcount.equalsIgnoreCase(myfinalcounts)) {
				
				System.out.println("Count matched!!");
				
			System.out.println(myBLmatchCount+"Listings on EquipmentOne and Ritchie Bros. Auctioneers");
			System.out.println(myeventmatch+"Events on EquipmentOne");
			resultDetails.setFlag(true);
		} } catch (Exception e) {
			
			resultDetails.setFlag(false);
		}
		
		break;
		
	case E1RBAINSEARCH:
		
		try {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			driver.findElement(By.xpath("//div[11]/div[2]/a/span")).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
			  
			  String BLEO = driver.findElement(By.cssSelector("span.e1Count")).getText();
				 System.out.println(BLEO);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 
				 String BLEOCount = BLEO.substring(BLEO.indexOf("(")+1, BLEO.lastIndexOf(")"));
				 System.out.println(BLEOCount);
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
				 
				 String BLRBA =  driver.findElement(By.cssSelector("span.rbaCount")).getText();
				 System.out.println(BLRBA);
				 
				 String BLRBACount = BLRBA.substring(BLRBA.indexOf("(")+1, BLRBA.lastIndexOf(")"));
				 System.out.println(BLRBACount);									 
			 int EOConversion = Integer.parseInt(BLEOCount);
			 int RBAConversion = Integer.parseInt(BLRBACount);
			 
			 int finalcount = EOConversion + RBAConversion;
			 
			 System.out.println(finalcount);
			 		 		  
			 String strfinalcount = String.valueOf(finalcount);
			 
			 String BLmatch = driver.findElement(By.id("e1NumFound")).getText();
 String BLmatchCount = BLmatch.replace(",", "");
			 
 
 
			 int myBLmatchCount = Integer.parseInt(BLmatchCount);
		
			 if(strfinalcount.equalsIgnoreCase(BLmatchCount)) {
					
					System.out.println("Count matched!!");
					
				System.out.println(myBLmatchCount+"Listings on EquipmentOne and Ritchie Bros. Auctioneers");
				resultDetails.setFlag(true);
				}
		} catch (Exception e ) {
			
			resultDetails.setFlag(false);
		}
			 	
		break;
		
	case E1:
		
		
		
		break;
	case RBA:
		break;
	case E1INSEARCH:
		break;
	case RBAINSEARCH:
		break;
	
	
	}
	
} catch (Exception e ) {
	
	resultDetails.setFlag(false);
}
}

public void DEFAULTOFFER(WebDriver driver, String fieldText, String value){
	
	try {
		String field = fieldText;
		
		String defaultoffer = driver.findElement(By.xpath(field)).getText();
		
		String Max = defaultoffer.substring(1, defaultoffer.length() -2);
		  
		  if(Max.indexOf(',')> -1) {
		  
			  System.out.println("Field has comma");
		  String convert = Max.replace(",", ""); 
		  
		  String dot = convert.replace(".", "");
		  System.out.println(dot);
		  
		  String offer = driver.findElement(By.xpath(value)).getText();
			 
			 			  
			  String CurrentHighOffer = offer.substring(1, offer.length() -2);
			  
			  if(Max.indexOf(',')> -1) {
			  
				  System.out.println("Field has comma");
			  String replceoffer = CurrentHighOffer.replace(",", ""); 
			  
			  String replacedot = replceoffer.replace(".", "");
			  
			   System.out.println(replacedot);
		  
			   int currenthighoffer = Integer.parseInt(replacedot);
			   int currentoffer = Integer.parseInt(dot);
			   
			   if ( currentoffer > currenthighoffer) {
				   
				   
				   System.out.println("Default offer is greater than current offer");
				   resultDetails.setFlag(true);   
			   }
			   
			   
		  
	} } 
	}catch (Exception e ){
		
		resultDetails.setFlag(false);
	}
}


public void CLICKONNEXTCONFIRMATION(WebDriver driver) throws AWTException {
	
	 try {
		 driver.findElement(By.linkText("Sign Out")).click();
		 
		 		 Thread.sleep(2000);
		 		driver.switchTo().alert().accept();
		 		 
//		 Runtime.getRuntime().exec("C:/TestProject - DEV/test.exe");
		 		   resultDetails.setFlag(true);
	        
	    } 
	 catch (UnhandledAlertException e){
			 Robot rb =new Robot();
			 rb.keyPress(KeyEvent.VK_SPACE);
		 }
	 catch (InterruptedException e) {
	            	
	    	e.printStackTrace();
	    }
	 
	}

  public void config() {
    	  
    	  
    	  Properties prop = new Properties();
    	  
    	  try {
    		  
    		  
    	  InputStream is = new FileInputStream("C:/TestProject - DEV/Config/config.properties");
    	  prop.load(is);
    	  is.close();
    	  Value1= prop.getProperty("value1");
    	  result1 = Integer.parseInt(Value1);
    	  Value2= prop.getProperty("value2");
    	  
    	  result2 = Integer.parseInt(Value2);
    	  
    	  Value3= prop.getProperty("value3");
    	  Value4= prop.getProperty("value4");
    	  result4 = Integer.parseInt(Value4);
    	  Value5 = prop.getProperty("value5");
    	  //System.out.println(Value5);
    	  result5 = Integer.parseInt(Value5);
    	  Value6 = prop.getProperty("value6");
    	  result6 = Integer.parseInt(Value6);
    	  
    	  Value7 = prop.getProperty("value7");
    	  result7 = Integer.parseInt(Value7);
    	  
    	  Value8 = prop.getProperty("value8");
    	  result8 = Integer.parseInt(Value8);
    	  
    	  Value9= prop.getProperty("value9");
    	  result9=Integer.parseInt(Value9);
    	      	     	      	  
      }
    	  
    	  catch (Exception e ) {}
      
      resultDetails.setFlag(true);
 }
  
  public void REDIRECT(WebDriver driver,String fieldText) {
		 
		 try {
			 String field = fieldText;
			 
			 driver.get(field);
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 resultDetails.setFlag(true);
			 
		 } catch (Exception e ) {
			 
			 resultDetails.setFlag(false);
			 resultDetails.setErrorMessage("URL is not redirected");
		 }
	 }
	 
  
  
  public  void LITEUSERREGISTRATION(WebDriver driver, String fieldText) throws FileNotFoundException{
	    
	    
	    try {        
	          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get(fieldText);
	               
	     String pwd="Equipment1$";
	      
	     String phone="";
	     
	     String Email="";
	     String Fname = "Lite";
	     String lname ="test";
	     String validation="";
	     long inc = Math.round(Math.random()*100000); // generates 3 digit number.

	     String ID="@yahoo.in";
	     
	     
	      Random random = new Random();
	      long dphone = Math.round(random.nextFloat()*Math.pow(10,12)); 
	    
	    // long dphone = (long) Math.floor(Math.random()*9000000000L)+1000000000L; // Generates 10 digit random number to enter into daytime phone field
	          
	      
	      Email = Fname+lname+inc+ID;
	      
	      driver.findElement(By.id("emailaddress")).sendKeys(Email); 
	      
	         
	      System.out.println(Email);
	      
	                
	     phone = Long.toString(dphone);
	     
	    
	     driver.findElement(By.id("firstname")).sendKeys(Fname);
	        
	       
	     driver.findElement(By.id("lastname")).sendKeys(lname);
	        
	     
	     driver.findElement(By.id("phone")).sendKeys(phone);
	         
	     
	     driver.findElement(By.id("newPassword")).sendKeys(pwd);
	     
	     driver.findElement(By.id("confirmPassword")).sendKeys(pwd);
	     
	     driver.findElement(By.id("submit_joinnow")).click();
	     
	    //condition to check the email is already existing or not
	     if(driver.findElement(By.xpath("//*[@class='reg_error']")).isDisplayed()) {
	    
	       if(driver.findElement(By.xpath("//*[@class='reg_error']")).getText().contains("Email Address already exists in the system")){
	       inc = Math.round(Math.random()*100000);
	       Email = Fname+lname+inc+ID;
	       driver.findElement(By.id("emailaddress")).clear();
	       driver.findElement(By.id("emailaddress")).sendKeys(Email);
	       driver.findElement(By.id("submit_joinnow")).click();
	       
	        }
	      }   //condition to check the email is already existing or not
	     
	     WebDriverWait wait=new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkmail")));
	     System.out.println("confirmation touch screen found");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//a[@class='logo']")).click();
	    
	     driver.manage().deleteAllCookies();
	     driver.findElement(By.id("sign")).click();
	     driver.findElement(By.id("signinfield")).sendKeys(Email);
	     driver.findElement(By.id("passwordfield")).sendKeys(pwd);
	     driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	     //To verify exceptional casse where previously a signout is not happened corrctly and the cookie is remembered
	     
	     if(!driver.findElement(By.id("uname")).getText().equalsIgnoreCase("Lite Test")){
	 
	      SIGNOUT(driver);
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.id("sign")).click();
	       driver.findElement(By.id("signinfield")).sendKeys(Email);
	       driver.findElement(By.id("passwordfield")).sendKeys(pwd);
	       driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	     }
	    
	      
	   
	       resultDetails.setFlag(true);
	     
	    }
	      catch (Exception e )
	      {
	       resultDetails.setFlag(false);
	       
	        e.printStackTrace();
	       
	      }   
	             
	     }
	public void AGREETERMS(WebDriver driver){
		try{
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    System.out.println("size is:"+driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).size());
		    if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).size()==1)
		      {
		        driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).click();
		            driver.findElement(By.xpath("//input[@value='Submit']")).click();
		            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		            driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
		            //resultDetails.setFlag(true);
		      }
		    resultDetails.setFlag(true);
		   }
		  catch(Exception e)
		  {
		   resultDetails.setFlag(false);
		      e.printStackTrace();
		  }
	  }
	
	public boolean SEARCH_RESULT_COMPARISON(WebDriver driver)
	{
		try{

			String msg=driver.findElement(By.id("e1SitesFound")).getText();
			driver.findElement(By.linkText("Source Site")).click();
			Thread.sleep(2500);
			
			if(msg.contains("Ritchie Bros"))
				driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
			Thread.sleep(1500);
			if(msg.contains("SalvageSale"))
				driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();

			Thread.sleep(5000);

			//String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
			System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).size());
			String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).getText();
			System.out.println(E1Count);
			String EOCountt = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
			Integer count1=Integer.parseInt(EOCountt);
			System.out.println("count1 is: "+count1);

			Thread.sleep(5000);
			System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.id("e1NumFound")).size());
			System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
			String listingcount = driver.findElement(By.id("e1NumFound")).getText();
			String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();

			System.out.println(listingcount);
			System.out.println(nextlistingcount);
			//suman
			boolean lotDisplay=driver.findElement(By.id("e1NumFound")).isDisplayed();
			boolean eventDisplay=driver.findElement(By.id("e1ResultsFound")).isDisplayed();
			boolean auctionDisplay=driver.findElement(By.id("e1AuctionsFound")).isDisplayed();
			//System.out.println(nextlistingcount);
			String listingcount2="";
			int convlistingcount=0;
			if(lotDisplay)
			{
				listingcount2=listingcount.replace(",", "");
				convlistingcount = Integer.parseInt(listingcount2);
			}


			String nextlistingcount2="";
			int convnextlistingcount =0;
			if(eventDisplay)
			{
				nextlistingcount2=nextlistingcount.replace(",", "");
				convnextlistingcount = Integer.parseInt(nextlistingcount2);

			}
			
			String auctionCount="";
			int auctionCount2 =0;
			if(auctionDisplay)
			{
				auctionCount=driver.findElement(By.id("e1AuctionsFound")).getText().replace(",", "");
				auctionCount2 = Integer.parseInt(auctionCount);

			}
			
			
			System.out.println("lot count is: "+convlistingcount);
			System.out.println("event count is: "+convnextlistingcount);
			System.out.println("auction count is: "+auctionCount2);

			Integer myfinalcount = convlistingcount + convnextlistingcount+auctionCount2;
			String compfinalcount = String.valueOf(myfinalcount);

			System.out.println(count1);
			System.out.println(myfinalcount);

			if(count1<=0 || (!count1.equals(myfinalcount)))
				return false;

			else
				return true;

		}
			catch(Exception e)
			{
				return false;
			}
	}
	public void MYOPERATION(WebDriver driver, String fieldText, String value){
		  //It is used where framework actions doesn't work 
		  //We need to proviede SND<Text to enter> in the value fields to perform "Sendkeys"
		  //We need to proviede CLK in the value fields to perform "Click"
		 try{ 
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
		   case "XPH":
		    driver.findElement(By.xpath(locator)).click();
		    break;
		   case "LNK":
		    driver.findElement(By.linkText(locator)).click();
		    break;
		   default:
		    System.out.println("Invalid Locator attribute");
		    break;
		     }
		   
		      }
		    else if(operation.equalsIgnoreCase("SND")){
		   
		   switch (attribute) {
		   case "IDI":
		    driver.findElement(By.id(locator)).sendKeys(val);
		   case "XPH":
		    driver.findElement(By.xpath(locator)).sendKeys(val);
		    break;
		   case "LNK":
		    driver.findElement(By.linkText(locator)).sendKeys(val);
		    break;
		   default:
		    System.out.println("Invalid Locator attribute");
		    break;
		     }
		   
		      } 
		          resultDetails.setFlag(true);
		  
		      }
		 catch(Exception e){
		    resultDetails.setFlag(false);
		       e.printStackTrace();
		     }
		 }
	public boolean FACETS_COMPARISON(WebDriver driver,Integer totalCount)
	{
		try{
			
			 boolean lotDisplay=driver.findElement(By.id("e1NumFound")).isDisplayed();
			  boolean eventDisplay=driver.findElement(By.id("e1ResultsFound")).isDisplayed();
			  boolean auctionDisplay=driver.findElement(By.id("e1AuctionsFound")).isDisplayed();
			  
			  String listingcount="";
				Integer convlistingcount=0;
				if(lotDisplay)
				{
					listingcount=driver.findElement(By.id("e1NumFound")).getText().replaceAll("\\D+", "");
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
	
	public void SIGNIN(WebDriver driver, String fieldText, String value)
	{

		try{
			WebDriverWait wait= new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
				
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("signinfield")).clear();
		driver.findElement(By.id("signinfield")).sendKeys(fieldText);
		driver.findElement(By.id("passwordfield")).clear();
		driver.findElement(By.id("passwordfield")).sendKeys(value);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//
		//agree terms
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).size()==1)
	      {
	        driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).click();
	            driver.findElement(By.xpath("//input[@value='Submit']")).click();
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
	            //resultDetails.setFlag(true);
	      }
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		//
		System.out.println("to confirm sign in successfully, looking for sign out link");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));

		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}

	}
	
	public void SIGNOUT(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try{
			String url=driver.getCurrentUrl();
			String url2=url.toUpperCase();
			if(url2.contains("LISTINGID"))
			{
				driver.findElement(By.id("uname")).click();
				Thread.sleep(2000);
				
			}
			
			driver.findElement(By.linkText("Sign Out")).click();
			if(driver.findElement(By.linkText("Sign In")).isDisplayed())
			resultDetails.setFlag(true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	
	public void WAITFORTHIS(WebDriver driver,String fieldText, String value)
	 {
	   try{ 
	     
	   String f = fieldText;
	   String time=value;
	    String locatorType=f.substring(0,3);
	     String locatorValue=f.substring(3,f.length());
	     Integer timevalue=Integer.valueOf(time);
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
	       
	       
	   }
	   
	    catch(Exception e){
	       resultDetails.setFlag(false);
	          e.printStackTrace();
	        }
	 }
	
	
	public void VERIFYTHIS(WebDriver driver,String fieldText, String value){

		   try{ 
		     
		   String f = fieldText;
		   String val=value;
		     String locatorType=f.substring(0,3);
		     String locatorValue=f.substring(3,f.length());
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		    
		       if(locatorType.equalsIgnoreCase("XPH")){
		        
		        if(driver.findElement(By.xpath(locatorValue)).getText().equalsIgnoreCase(val))
		         resultDetails.setFlag(true);
		       }
		       else if(locatorType.equalsIgnoreCase("LNK")){
		      
		        if(driver.findElement(By.linkText(locatorValue)).getText().equalsIgnoreCase(val))
		         resultDetails.setFlag(true);
		           
		     
		         }
		       else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){
		        
		        if(driver.findElement(By.id(locatorValue)).getText().equalsIgnoreCase(val))
		         resultDetails.setFlag(true);
		           
		     
		         }
		       else if(locatorType.equalsIgnoreCase("MSG")){
		        
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
		   }
		   
		    catch(Exception e){
		       resultDetails.setFlag(false);
		          e.printStackTrace();
		        }
		 
		 }
	
	
	
 }
 
