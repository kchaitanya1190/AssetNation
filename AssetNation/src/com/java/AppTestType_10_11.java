package com.java;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
//import org.junit.Assert;



 public class AppTestType_10_11{

	public enum AppKeyWords{
		LNK,BTN,XPH,EXACTOFFER,AMPTOOL,USR,COMPARE,SOURCESITE, LISTELEMENTS, NEWUSERREGISTRATION, CONTENTMNGR, TYPE,CSS, NAME, listing, ACCEPTDLG,
		ELISTINGS, APPROVEDLG,SEARCHFILTERS, FORGOTPASSWORD,SEARCHGLB, MAXINEVENTPAGE, DELCOOKIES, READCSV, RANDOMMOBILE, REDIRECT, AMPLOGIN, COMMERCIALLISTINGS, GETDATETIME, MAKEOFFERFROMWATCHLIST, BROWSEALLEVENTS, BROWSEALLLISTINGS,MAKE,FACETS, MODEL, COUNTRY, STATE, SER, AGRI, SEARCHRESULTS, TRANS, CONS, USERTAB, COMPARELISTINGS, GETLISTINGSCOUNT,
		MAXOFFERINDETAILSPAGE, EXACTOFFERINDETAILSPAGE, MAXOFFERINSEARCHRESULTSPAGE, EXACTOFFERINSEARCHRESULTSPAGE, ADDTOWATCHLIST, MAXOFFERFROMEVENTS, EXACTOFFERFROMEVENTS, BINOFFERFROMSEARCH, BINOFFERFROMLISTINGPAGE,VISITOR,MAKEOFFERBTN,CLOSINGTODAY,DSALE,NEWLISTINGS,EVENTS,ALERTINEMAILPREF,CONFIRMOFFER,LISTVIEWTITLE,
		OFFERS,CHANGEPASSWORD,FROMSEARCH,EA,NONZEROCOUNT,ACCEPTALERT,EQITQUESFWDTOSELLER,BUYINGSALESINMYONE,WATCHINGINMYONE,COMMERCIAL,BUYINGMYOFFER,BUYINGQA,MYSALES,LITEUSERREGISTRATION,SUBMITTEDASSET,PENDINGLISTING, DEFAULTOFFER,SELLERPAGE,FORWARDTOPM,DRAFTLISTING, FORWARDTOMM,FORWARDTOSELLER,FORWARDTOSTORAGE, MYBUYING,BUYINGINMYONE,PROFILE, FROMLISTING, BROWSEALL,GETUSERDETAILS, BROWSEE1, SEARCH, POSTALCODE, QA, SAVESEARCH, NAVIGATETOLISTINGDETAILSPAGE, USERAMP, PULLDOWNMENUS, SAVE, RECENT, WATCH, OFFERINEVENTSPAGE, OFFERFROMWATCHLIST, DEVLOGIN, LOGIN, WRNGEMAIL, WRNGPWD, WRGNEMAILPWD, MOUSEHOVER, USERPULLDOWN,LOTSTAB, VERIFYQAINAMP, REJECTQUES, LOADNEWUSERREG, AUTOSUGGEST, EMAILPREF, RBA, EO, Events, Closingtoday, DSale, NewListings, SELECTALL, UNCHECKONE, SEARCHPAGE, LISTINGPAGE, E1RBA, E1RBAINSEARCH, E1, E1INSEARCH, RBAINSEARCH, ALLEQUIPMENTLINK, CATEGORY, BUY, MYOFFERS, SELLERCHOICE, PAYMENTS, REMOVALS, HISTORY, SCHCE, MYEVENTS, EXACTINEVENTPAGE, MAXOFFER,AGREETERMS,
		MYOPERATION,SIGNIN,SIGNOUT,WAITFORTHIS,VERIFYTHIS,MAXBIDFROMEVENTPAGE,NAVIGATETO,EXACTBIDFROMEVENTPAGE,EXACTBIDFROMWATCHINGPAGE,MAXBIDFROMWATCHINGPAGE,
		BIDAMOUNTCALCULATION,E1LISTINGSELECTION,VISIBLE,NOTVISIBLE,CHECKED,UNCHECKED,VERIFYNOT,NEWLITEUSERLOGIN,APPROVEUSER,ADDINGTOWATCHLIST,SUBCATEGORYSELECTION,
		AMPLOGOUT,BIDONOWNLOT,ALLEQUIPMENTPAGE,SEARCHLOTINAMP,SEARCHLOTINEQWITHEQID, ENER,AssetNation}
		
	
     final int MAX_STALE_ELEMENT_RETRIES = 5;
     int retries=0;
     int add = 100;
     public static String eqid_1="suman";
     
     
     
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String Time = cal.getTime().toString();
		
	//public enum Click{CLICKIT,LNK}
	
	public enum keywords{fposition, sposition, tposition, USR, LGN}


	
public String getvalue, Value1, Value2, Value3, Value4, Value5, Value6, Value7, Value8, Value9, ListingsID,Listingtitle, AssetID,ListingID, LOTNUMBER,ID,EMAIL;
public int result2, result1, result4, result5, result6, result7, result8, result9;



//private String getvalue;
//private String user;
WebDriver driver1;
int adding = 100;
String convertadding = String.valueOf(adding);



//WebDriver drivermmtool;

// UNCOMMENT COMPARE METHOD WHEN WORKING WITH IT.


	
	TestType tt;
	
	public AppTestType_10_11(TestType tt){
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
				
			case ACCEPTALERT:
				ACCEPTALERT(webdriver);
				break;
			case EQITQUESFWDTOSELLER:
				EQITQUESFWDTOSELLER(webdriver, fieldText);
				
			case BUYINGSALESINMYONE:
				BUYINGSALESINMYONE(webdriver, fieldText);
				break;
				
			case NONZEROCOUNT:
				NONZEROCOUNT(webdriver);
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
                LITEUSERREGISTRATION(webdriver,fieldText,value);
            case NEWLITEUSERLOGIN:
            	NEWLITEUSERLOGIN(webdriver,fieldText,value);
                
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
                    	
                    case READCSV:
                    	READCSV(webdriver);
                    	break;
                    	
                    case RANDOMMOBILE:
                    	RANDOMMOBILE(webdriver);
                    	break;
                    	
                    case AMPLOGIN:
                    	AMPLOGIN(webdriver, fieldText);
                    	break;
                    case AMPLOGOUT:
                    	AMPLOGOUT(webdriver);
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
                    	REJECTQUES(webdriver, fieldText);
                    	break;
                    case LOADNEWUSERREG:
                    	LOADNEWUSERREG(webdriver, fieldText, value);
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
                    case MAXBIDFROMEVENTPAGE:
                    	MAXBIDFROMEVENTPAGE(webdriver);
                    	break;
                    case EXACTBIDFROMEVENTPAGE:
                    	EXACTBIDFROMEVENTPAGE(webdriver);
                    	break;
                    case EXACTBIDFROMWATCHINGPAGE:
                    	EXACTBIDFROMWATCHINGPAGE(webdriver);
                    	break;
                    case MAXBIDFROMWATCHINGPAGE:
                    	MAXBIDFROMWATCHINGPAGE(webdriver);
                    	break;
                    case BIDAMOUNTCALCULATION:
                    	BIDAMOUNTCALCULATION(webdriver, fieldText);
                    	break;	
                    	
                    case NAVIGATETO:
                    	NAVIGATETO(webdriver, fieldText);
                    	break;
                    case E1LISTINGSELECTION:
                    	E1LISTINGSELECTION(webdriver,value);
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
                    case UNCHECKED:
                    	UNCHECKED(webdriver, fieldText);
                    	break;
                    case VERIFYNOT:
                    	VERIFYNOT(webdriver , fieldText,  value);
                    	break;   
                    case APPROVEUSER:
                    	APPROVEUSER(webdriver , fieldText,  value);
                    	break;
                    case ADDINGTOWATCHLIST:
                    	ADDINGTOWATCHLIST(webdriver);
                    	break;
                    case SUBCATEGORYSELECTION:
                    	SUBCATEGORYSELECTION(webdriver,fieldText,value);
                    	break;
                    case BIDONOWNLOT:
                    	BIDONOWNLOT(webdriver,fieldText,value);
                    	break;
                    case ALLEQUIPMENTPAGE:
                    	ALLEQUIPMENTPAGE(webdriver);
                    	break;  
                    case SEARCHLOTINAMP:
                    	SEARCHLOTINAMP(webdriver,fieldText, value);
                    	break;
                    case SEARCHLOTINEQWITHEQID:
                    	SEARCHLOTINEQWITHEQID(webdriver,value);
                    	break;
                    case AssetNation:
                    	AssetNation(webdriver);
                    
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
	
	
	public void NONZEROCOUNT(WebDriver driver) {
	    try {
	     WebElement lots = driver.findElement(By.id("e1NumFound"));
	     WebElement auctions = driver.findElement(By.id("e1AuctionsFound"));
	     WebElement events = driver.findElement(By.id("e1ResultsFound"));
	     String count="";
	    //to get text of lots or auctions or events count 
	      if(lots.isDisplayed())
	        {
	     count=driver.findElement(By.id("e1NumFound")).getText();
	       }
	       else if (auctions.isDisplayed())
	         {
	     count=driver.findElement(By.id("e1AuctionsFound")).getText();
	         }
	       else  if (events.isDisplayed())
	         {
	     count=driver.findElement(By.id("e1ResultsFound")).getText();
	           }
	      
	      
	      String convertcount = count.replace(",", "");
	            int sitemapcount=Integer.parseInt(convertcount);
	            System.out.println("count is :"+sitemapcount);
	            
	            if(sitemapcount > 0)
	            resultDetails.setFlag(true);
	         else{
	        	 resultDetails.setErrorMessage("Zero lots Found");
	        	 System.out.println("Non Zero Count");
	            resultDetails.setFlag(false);
	         }
	      
	   }
	   
	     catch(Exception e ) {
	    	 resultDetails.setErrorMessage("Zero lots Found");
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
  
  
  
  public void AMPLOGIN(WebDriver driver, String fieldText) {
	  
	String field = fieldText;  
  	  
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
		  
		  	 
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Save & Submit Listing']")));
		  
		  driver.findElement(By.xpath("//input[@value='Save & Submit Listing']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  Calendar currentdate = Calendar.getInstance();
		  DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		  TimeZone obj = TimeZone.getTimeZone("CST");
		  
		  
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
  
  
  
  
  public void LOADNEWUSERREG(WebDriver driver,String fieldText, String value) {
	   
	  try {
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get(fieldText);
	      int num=Integer.parseInt(value);
	      int i;
	      
	      for (i=0;i<=num;i++){
	    
	    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	     driver.get(fieldText);
	 	               
	 	     String pwd="Equipment1$";
	 	      
	 	     String phone="";
	 	     String Email="";
	 	     String Fname = "Load";
	 	     String lname ="Test";
	 	     String validation="";
	 	     long inc = Math.round(Math.random()*100000); // generates 5 digit number.
	 	     String ID="@yahoo.in";
	 	     
	 	      Random random = new Random();
	 	      long dphone = Math.round(random.nextFloat()*Math.pow(10,12)); 
	 	    
	 	      Email = Fname+lname+inc+ID;
	 	      
	 	      driver.findElement(By.id("emailaddress")).sendKeys(Email);    
	 	      System.out.println(Email);
	 	              
	 	     phone = Long.toString(dphone);

	 	     driver.findElement(By.id("firstname")).sendKeys(Fname);
	          driver.findElement(By.id("lastname")).sendKeys(lname);
	 	     driver.findElement(By.id("phone")).sendKeys(phone);
	 	     driver.findElement(By.id("newPassword")).sendKeys(pwd);
	 	     driver.findElement(By.id("confirmPassword")).sendKeys(pwd);
	 	     driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	 	     
	 	     
	 	     
	 	    //condition to check the email is already exist
	 	     if(driver.findElements(By.xpath("//*[@class='error-txt']")).size()>0) {
	 	    	 
	 	    	 
	 	    //If the email" Email Address already exists"
	 	       if(driver.findElement(By.xpath("//*[@class='error-txt']")).getText().contains("Email Address already exists in the system")){
	 	       inc = inc++;
	 	       Email = Fname+lname+inc+"test"+ID;
	 	       driver.findElement(By.id("emailaddress")).clear();
	 	       driver.findElement(By.id("emailaddress")).sendKeys(Email);
	 	       driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	 	       }
	 	       
	 	       
	 	    // If the phone number already exist
	 	       if(driver.findElement(By.xpath("//*[@class='error-txt']")).getText().contains("Another user has the same daytime phone number")){
	 	    	   phone=phone+random.nextInt(9);
	 	       driver.findElement(By.id("phone")).clear();
	 	       driver.findElement(By.id("phone")).sendKeys(phone);
	 	       driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	 	       
	 	        }
	 	      }   
	 	     
	 	     //Verifying that user is successfully registered
	 	     WebDriverWait wait=new WebDriverWait(driver, 20);
	 	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-user famember-icon']"))); //verifying the "Activate your membership" icon 
	 	     System.out.println("Successfully Registered");
	         
	       
	 	    System.out.println(Email);
	      }
	      
	      resultDetails.setFlag(true);
	    } catch (Exception e ) {
	    	e.printStackTrace();
	     
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			AppKeyWords cdf = AppKeyWords.valueOf(fieldType.toUpperCase());
		 	 
		switch(cdf){	
			
		case BROWSEALL: 
			try{
				
				ALLEQUIPMENTPAGE(driver);
				Thread.sleep(2500);
				driver.findElement(By.xpath("(//*[contains(@class,'source-site')]/a)[2]")).click();
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String E1Count = driver.findElement(By.xpath("(//span[@class='e1Count'])[2]")).getText();
				String RBACount = driver.findElement(By.xpath("(//*[@class='rbaCount'])[2]")).getText();
				String SSCount = driver.findElement(By.xpath("(//*[@class='salvagesaleCount'])[2]")).getText();

				String EOCount1 = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
				String RBACount1 = RBACount.substring(RBACount.indexOf("(")+1, RBACount.lastIndexOf(")"));
				String SSCount1 = SSCount.substring(SSCount.indexOf("(")+1, SSCount.lastIndexOf(")"));
				System.out.println("EOCount1:"+EOCount1);
				System.out.println("RBACount1:"+RBACount1);
				System.out.println("SSCount1:"+SSCount1);
				Integer E1=Integer.parseInt(EOCount1);
				Integer RBA=Integer.parseInt(RBACount1);
				Integer SS=Integer.parseInt(SSCount1);
				int count1=E1+RBA+SS;
				String SearchFinalCount=String.valueOf(count1);

				String LotCount = driver.findElement(By.id("e1NumFound")).getText();
				String EventCount = driver.findElement(By.id("e1ResultsFound")).getText();
				String AuctionCount = driver.findElement(By.id("e1AuctionsFound")).getText();
				

				String LotCount1=LotCount.replace(",", "");
				String EventCount1=EventCount.replace(",", "");
				String AuctionCount1=AuctionCount.replace(",", "");
				
				int Lots = Integer.parseInt(LotCount1);
				int Events = Integer.parseInt(EventCount1);
				int Auctions = Integer.parseInt(AuctionCount1);
				
				int myfinalcount = Lots+Events+Auctions;
				String ResultsFinalCount = String.valueOf(myfinalcount);
				
				System.out.println("myfinalcount:"+myfinalcount);
				System.out.println("count1:"+count1);
				
				//if(EOCount.equalsIgnoreCase(compfinalcount)) {   //suman
				
				if(count1<=0 || myfinalcount<=0 || count1!=myfinalcount)
					resultDetails.setFlag(false);
					
				else
					resultDetails.setFlag(true);
			}
				
 catch (Exception e) {
				//System.out.println(e);
				resultDetails.setFlag(false);
				e.printStackTrace();
			}
						
			break;
		
		case BROWSEE1:
			
			try {
				
				
	//////*    System.out.println("clicking on 1 link");
				ALLEQUIPMENTPAGE(driver);
				Thread.sleep(2500);
				//driver.findElement(By.xpath("(//a[contains(text(),'EquipmentOne Lots')])[2]")).click();
				driver.findElement(By.xpath("(//*[contains(@class,'source-site')]/a)[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();
				
				//suman

				Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String E1Count = driver.findElement(By.xpath("(//span[@class='e1Count'])[2]")).getText();
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
			try{
				
				SUBCATEGORYSELECTION(driver,"XPH//*[@class='dropdown mega navBarText']/a[starts-with(text(),'All Equipment')]","XPH//*[@class='mega-nav level1']/li/a[starts-with(text(),'Events')]");
			Thread.sleep(2500);
			driver.findElement(By.xpath("(//*[contains(@class,'source-site')]/a)[2]")).click();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String E1Count = driver.findElement(By.xpath("(//span[@class='e1Count'])[2]")).getText();
		
			String EOCount1 = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
			System.out.println("EOCount1:"+EOCount1);

			Integer E1=Integer.parseInt(EOCount1);

			int count1=E1;
			String SearchFinalCount=String.valueOf(count1);

			String EventCount = driver.findElement(By.id("e1ResultsFound")).getText();
			

			String EventCount1=EventCount.replace(",", "");

			int Events = Integer.parseInt(EventCount1);
			
			int myfinalcount = Events;
			String ResultsFinalCount = String.valueOf(myfinalcount);
			
			System.out.println("myfinalcount:"+myfinalcount);
			System.out.println("count1:"+count1);
			
			//if(EOCount.equalsIgnoreCase(compfinalcount)) {   //suman
			
			if(count1<=0 || myfinalcount<=0 || count1!=myfinalcount)
				resultDetails.setFlag(false);
				
			else
				resultDetails.setFlag(true);
		}
			
catch (Exception e) {
			//System.out.println(e);
			resultDetails.setFlag(false);
			e.printStackTrace();
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
			ALLEQUIPMENTPAGE(driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  switch (FCT) {
	  	  
	  case MAKE:
		  
		  try {

			  // suman
			  // driver.findElement(By.linkText("ALL EQUIPMENT")).click();
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
			  Thread.sleep(3000);
			  String msg=driver.findElement(By.id("e1SitesFound")).getText();
			  driver.findElement(By.linkText("Source Site")).click();
			  Thread.sleep(2500);

			  if(msg.contains("Ritchie Bros"))
				  driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[1]/input)[2]")).click();
			  Thread.sleep(3000);
			  if(msg.contains("SalvageSale"))
				  driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();

			  Thread.sleep(3000);

			  //String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
			  System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).size());
			  String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:E1']/span[3])[2]")).getText();
			  System.out.println(E1Count);
			  String EOCountt = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
			  Integer count1=Integer.parseInt(EOCountt);
			  System.out.println("count1 is: "+count1);
			  
			  Integer totalCount=count1;
			  //suman
			  
			  

			  Thread.sleep(5000);
			  System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.id("e1NumFound")).size());
			  System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
			  String listingcount = driver.findElement(By.id("e1NumFound")).getText();
			  String eventcount = driver.findElement(By.id("e1ResultsFound")).getText();

			  System.out.println(listingcount);
			  System.out.println(eventcount);
			  boolean lotDisplay=driver.findElement(By.id("e1NumFound")).isDisplayed();//To verify lot count if displayed or not
			  boolean eventDisplay=driver.findElement(By.id("e1ResultsFound")).isDisplayed();
			  
			  String listingcount2="";
			  int convlistingcount=0;
			  if(lotDisplay)
			  {
				  listingcount2=listingcount.replace(",", "");
				  convlistingcount = Integer.parseInt(listingcount2);
			  }


			  String eventcount2="";
			  int conveventcount =0;
			  if(eventDisplay)
			  {
				  eventcount2=eventcount.replace(",", "");
				  conveventcount = Integer.parseInt(eventcount2);

			  }
			  System.out.println("lot count is: "+convlistingcount);
			  System.out.println("event count is: "+conveventcount);

			  int myfinalcount = convlistingcount + conveventcount;
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
			   WebDriverWait wait = new WebDriverWait(driver, 30);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='Zip']/a)[2]")));
			  			  			  
			  driver.findElement(By.xpath("(//*[@id='Zip']/a)[2]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("(//button[contains(@class,'zip_search')])[2]")).click();
			  Thread.sleep(1000);
              if(driver.findElement(By.xpath("//*[@class='zip_code']/../div/ul/li")).getText().equalsIgnoreCase("Required Field.")){
            	  
    			  resultDetails.setFlag(true);
              }
			 
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

			

		 case CONS:		

			

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

			
		 case ENER:

			
			 try{
			 driver.findElement(By.xpath("(//a[contains(text(),'Energy')])[4]")).click();
			 }
			 catch (Exception e){
				 driver.findElement(By.xpath("http://e1.dev.assetnation.com/energy-equipment")).click();
			 }
			 
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
			 try{
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 driver.findElement(By.id("search")).sendKeys("trucks");
				 Thread.sleep(1500);
				 //driver.findElement(By.xpath("//[@id='main_search']/button")).click();
				 driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
				 Thread.sleep(3000);
				 boolean b5=SEARCH_RESULT_COMPARISON(driver);
				 System.out.println(b5);
				 if(b5) {

					 resultDetails.setFlag(true);
					 System.out.println("Counts matched!");
				 }
				 else
					 resultDetails.setFlag(false);
			 }
			 catch(Exception e){
				 resultDetails.setFlag(false);
				 e.printStackTrace();
			 }

				 break;		 

	 }
		 }catch (Exception e) {
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
		 String question="Where is the listing located?"+Time;
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
 
 public void REJECTQUES(WebDriver driver, String fieldText) {
	 
try {		 
	NAVIGATETOLISTINGDETAILSPAGE(driver);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

	 System.out.println(getvalue);
	 // SUMAN

	 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("listingQuestion")).click();
	 String question="Can You Reject This Question?";
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
	 WebDriverWait wait= new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Reject")));
 		 
		 		
		 		 String ParentHandle = driver.getWindowHandle();
		 		driver.findElement(By.linkText("Reject")).click();
				  for(String winHandle : driver.getWindowHandles()) {
					  
					  System.out.println("Entered For Loop");
					  driver.switchTo().window(winHandle);
		 						  }

			 		driver.findElement(By.id("id_button_rejct")).click(); 
			 				 		 
			 		Thread.sleep(10000);
			 		
			 		driver.switchTo().alert().accept();
			 		Thread.sleep(2000);
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));

		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }

		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//*[contains(@onclick,'FORWARDED TO MM')]")).click();
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		 driver.findElement(By.xpath("//button")).click();

		 driver.findElement(By.linkText("Lot Q/A")).click();
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));
			 	 		
			 		 String ParentHandle = driver.getWindowHandle();
			 		driver.findElement(By.linkText("Forward")).click();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					  for(String winHandle : driver.getWindowHandles()) {
						  
						  System.out.println("Entered For Loop");
						  driver.switchTo().window(winHandle);
			 						  }

				 		Thread.sleep(10000);
				 		driver.findElement(By.xpath("//*[contains(@onclick,'FORWARDED TO SELLER')]")).click();
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
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));
			 	 		
			 		 String ParentHandle = driver.getWindowHandle();
			 		driver.findElement(By.linkText("Forward")).click();
			 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
					  for(String winHandle : driver.getWindowHandles()) {
						  
						  System.out.println("Entered For Loop");
						  driver.switchTo().window(winHandle);
			 						  }

				 		Thread.sleep(10000);
				 		driver.findElement(By.xpath("//*[contains(@onclick,'FORWARDED TO SELLER')]")).click();
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 getvalue = driver.findElement(By.xpath("//*[@id='ONengine']/div[7]/span")).getText();

		 System.out.println(getvalue);
		 // SUMAN

		 driver.findElement(By.xpath("//input[@type='button' and @value='Ask it Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("listingQuestion")).click();
		 String question="Could you forward my question to Storage Location?";
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

		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));

		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[contains(@onclick,'FORWARDED TO LOCATION')]")).click();
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		 driver.findElement(By.linkText("Lot Q/A")).click();
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));


		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.linkText("Forward")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 for(String winHandle : driver.getWindowHandles()) {

			 System.out.println("Entered For Loop");
			 driver.switchTo().window(winHandle);
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[contains(@onclick,'FORWARDED TO PM')]")).click();
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
			   		   
				  WebDriverWait wait = new WebDriverWait(driver, 30);
				   
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
			   
			   WebDriverWait wait = new WebDriverWait(driver, 30);
			   
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
				   
				   WebDriverWait wait = new WebDriverWait(driver, 30);
				   
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
		 else if(href.contains("http://e1.dev.assetnation.com"))
			 href=href.replaceAll("http://e1.dev.assetnation.com", "");


		 String min_offer=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMinOffer jsAmountText'])[1]")).getText();
		 String min_offer2=min_offer.substring(1, min_offer.length()-3);
		 String min_offer3=min_offer2.replace(",", "");


		 Integer minOffer=Integer.parseInt(min_offer3);
		 System.out.println("minimum offer is: "+minOffer);
		 Integer bidAmount=add+minOffer;
		 String bidValue=String.valueOf(bidAmount);
		 //clicking on Place a Bid button

		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='text' and @name='makeoffer'])[1]")).clear();
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='text' and @name='makeoffer'])[1]")).sendKeys(bidValue);
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='button' and @value='PLACE A BID'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='form-control jsOfferInput e1ConfirmInput' and@type='text'])[1]")).sendKeys(bidValue);
		 // String ss=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='form-control jsOfferInput'])[1]")).getText();


		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='button' and @value='CONTINUE'])[1]")).click();
		 Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 //some times we have confirmation check-box and some times we dont have
		 try{
			 driver.findElement(By.xpath("(//input[@class='jsTermsAgree' and @type='checkbox'])[2]")).click();
		 }
		 catch(Exception e)
		 {
			 System.out.println("there is no confirm check box");
		 }
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//*[@type='submit' and @value='Submit'])[1]")).click();
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
		 else if(href.contains("http://e1.dev.assetnation.com/"))
			 href=href.replaceAll("http://e1.dev.assetnation.com/", "");


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
		 //some times we have confirmation check-box and some times we dont have
		 try{
			 driver.findElement(By.xpath("(//input[@class='jsTermsAgree' and @type='checkbox'])[2]")).click();
		 }
		 catch(Exception e)
		 {
			 System.out.println("there is no confirm check box");
		 }
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//*[@type='submit' and @value='Submit'])[1]")).click();
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
	  
	  driver.findElement(By.linkText("2")).click();//To go to 2nd page of the search results
	  
	   driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist']/../../a[1])[1]")).click();;
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
	     System.out.println("listing is not added to watchlist1");  
	    }
	    System.out.println("going out of ADDTOWATCHLIST method");
	   break;
	   
	   }
	 
      catch(Exception e) {
		 
		  e.printStackTrace();
	      }
	 
	    }

	   } catch (Exception e) {
		  e.printStackTrace();
	    System.out.println("listing is not added to watchlist2");
	    resultDetails.setFlag(false);
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


		// driver.findElement(By.xpath("(//*[@class='page-dots']/following::a)[1]")).click();//To go to last page of the search results
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


public void ACCEPTALERT(WebDriver driver) {
	
	 try {
		 driver.findElement(By.linkText("Sign Out")).click();
		 driver.switchTo().alert().accept();
		 		 Thread.sleep(2000);
		 		resultDetails.setFlag(true);
	        
	    } 
	 catch (Exception e){
		 e.printStackTrace();
		 resultDetails.setFlag(false);
		 /*Robot rb =new Robot();
			 rb.keyPress(KeyEvent.VK_SPACE);*/ //Will be used when alert.accept() is not handy.
			 
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
	 
  
  
  public void  LITEUSERREGISTRATION(WebDriver driver, String fieldText, String value) {
	    //Lite user registration
	    
	    try {   
	    	driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get(fieldText);
	               
	     String pwd="Equipment1$";
	      
	     String phone="";
	     String Email="";
	     String Fname = value;
	     String lname ="Test";
	     String validation="";
	     long inc = Math.round(Math.random()*100000); // generates 5 digit number.
	     String ID="@yahoo.in";
	     
	      Random random = new Random();
	      long dphone = Math.round(random.nextFloat()*Math.pow(10,12)); 
	    
	      Email = Fname+lname+inc+ID;
	      
	      driver.findElement(By.id("emailaddress")).sendKeys(Email);    
	      System.out.println(Email);
	              
	     phone = Long.toString(dphone);

	     driver.findElement(By.id("firstname")).sendKeys(Fname);
         driver.findElement(By.id("lastname")).sendKeys(lname);
	     driver.findElement(By.id("phone")).sendKeys(phone);
	     driver.findElement(By.id("newPassword")).sendKeys(pwd);
	     driver.findElement(By.id("confirmPassword")).sendKeys(pwd);
	     driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	     
	     
	     
	    //condition to check the email is already exist
	     if(driver.findElements(By.xpath("//*[@class='error-txt']")).size()>0) {
	    	 
	    	 
	    //If the email" Email Address already exists"
	       if(driver.findElement(By.xpath("//*[@class='error-txt']")).getText().contains("Email Address already exists in the system")){
	       inc = inc++;
	       Email = Fname+lname+inc+"test"+ID;
	       driver.findElement(By.id("emailaddress")).clear();
	       driver.findElement(By.id("emailaddress")).sendKeys(Email);
	       driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	       }
	       
	       
	    // If the phone number already exist
	       if(driver.findElement(By.xpath("//*[@class='error-txt']")).getText().contains("Another user has the same daytime phone number")){
	    	   phone=phone+random.nextInt(9);
	       driver.findElement(By.id("phone")).clear();
	       driver.findElement(By.id("phone")).sendKeys(phone);
	       driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	       
	        }
	      }   
	     
	     //Verifying that user is successfully registered
	     WebDriverWait wait=new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-user famember-icon']"))); //verifying the "Activate your membership" icon 
	     System.out.println("Successfully Registered");
	     EMAIL=Email;

	   resultDetails.setFlag(true);
	     
	    }
	    
	    catch (Exception e )
	      {
	    	resultDetails.setFlag(false);
	       
	        e.printStackTrace();
	       
	      }   
	             
	     }
  
  public void NEWLITEUSERLOGIN(WebDriver driver, String fieldText, String value) {
	  //Lite user registration
	    //Registration URL in FieldText
	    //First Name in value field 
	  try{
		  
	     LITEUSERREGISTRATION(driver,fieldText,value);
	     
	       String user= value+" Test";
	       driver.findElement(By.id("sign")).click();
	       driver.findElement(By.name("josso_username")).sendKeys(EMAIL);
	       driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	       driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	       
	       
	     //To verify exceptional casse where previously a signout is not happened corrctly and the cookie is remembered
	     
	     if(!driver.findElement(By.id("iduser")).getText().equalsIgnoreCase(user)){
	 
	      SIGNOUT(driver);
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.id("sign")).click();
	       driver.findElement(By.name("josso_username")).sendKeys(EMAIL);
	       driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	       driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
         }
	  }
	  catch(Exception e)
	  {
	   resultDetails.setFlag(false);
	      e.printStackTrace();
	  }
	     }
  
  public  void NEWUSERREGISTRATION(WebDriver driver, String fieldText, String value) {
	    //NEW user registration
	    //Registration URL in FieldText field
	    //AMP URL in value field 
	    
	    try {        
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        String value1="Val";
	    	LITEUSERREGISTRATION(driver,fieldText,value1);
	    	
	       driver.manage().deleteAllCookies();    
	       driver.navigate().refresh();	
	       
	       driver.get(value); 
	       AMPLOGIN(driver, value);  
	      driver.findElement(By.linkText("Users")).click(); 
	      driver.findElement(By.name("email")).sendKeys(EMAIL);
	      driver.findElement(By.xpath("//input[@value='Search']")).click();  
	      String VerifyUser = driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[2]")).getText();
	      
	      if(VerifyUser.equalsIgnoreCase(EMAIL)); {
	       
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
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		
			try{
			WebDriverWait wait= new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("josso_username")).clear();
		driver.findElement(By.name("josso_username")).sendKeys(fieldText);
		driver.findElement(By.name("josso_password")).clear();
		driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
		driver.findElement(By.xpath("//*[@value='SIGN IN']")).click();
		System.out.println("size is   :"+driver.findElements(By.id("iduser")).size());
		if(driver.findElements(By.id("iduser")).size()>0){
			System.out.println("1111111111");
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).size()>0)
		      {
		        driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).click();
		            driver.findElement(By.xpath("//input[@value='Submit']")).click();
		            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		            driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
		            wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
		      }
			//to confirm successful sign in as valid user,verifying the name displayed next to "Hello" text
			
			if(driver.findElement(By.id("iduser")).getText().equalsIgnoreCase(value))
				System.out.println("Successfully Logged in");
			else{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Sign Out")).click();
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("josso_password")));
				driver.findElement(By.name("josso_username")).clear();
				driver.findElement(By.name("josso_username")).sendKeys(fieldText);
				driver.findElement(By.name("josso_password")).clear();
				driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
				driver.findElement(By.xpath("//*[@value='SIGN IN']")).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.id("iduser")));
				
				
			}
			
		}
		//
		//agree terms-This piece of code is to verify agree terms checkbox after re logging(not logged in as the valid user)
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).size()==1)
	      {
	        driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox' and @name='useragreetoterms']")).click();
	            driver.findElement(By.xpath("//input[@value='Submit']")).click();
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
	            wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
	      }

		  resultDetails.setFlag(true);
		  }
			
			
			//This catch is used to catch the error "You are NOT authorized to access Site" in E1 Login//
			/////////////////////////////////////
			catch(Exception e1){
				
				
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
                if(driver.getPageSource().contains("You are NOT authorized to access Site")){
                	System.out.println("You are NOT authorized to access Site error message is displayed");
                	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.navigate().to("http://e1.dev.assetnation.com");
					SIGNIN(driver, fieldText, value);
			         }
                
			}
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
	       
	   }
	   
	    catch(Exception e){
	       resultDetails.setFlag(false);
	          e.printStackTrace();
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
		    	   //System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
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
		       else if(locatorType.equalsIgnoreCase("URL")){
			        int j=0;
			        for(int i=0;i<20;i++)
			        {
			        if(driver.getCurrentUrl().equalsIgnoreCase(val))
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
		       System.out.println("locator not found");
		          e.printStackTrace();
		          resultDetails.setFlag(false);
		        }
		 
		 }
	
	public void MAXBIDFROMEVENTPAGE(WebDriver driver) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List <WebElement> events = driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/event?eventid')]"));
			System.out.println("event size is: "+events.size());
			Random r = new Random();
			/*int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
*/			WebDriverWait wait=new WebDriverWait(driver, 20);
			

			//selecting random event and trying to bid on first listing, if the event doesn't have open listings it will try with next event
			for(int i=0;i<events.size();i++)
			{
				events.get(r.nextInt(events.size())).click();
				Thread.sleep(8000);
			if(driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).isDisplayed())
			{
				driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
				BIDDING_IN_LISTINGDETAILSPAGE(driver);
				resultDetails.setFlag(true);
				break;	
			}
			//go back to event page
			else
				driver.navigate().back();
				
			

			}

			

		} catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);
			
		}


	}
	
	public void EXACTBIDFROMEVENTPAGE(WebDriver driver) {

		try {
			System.out.println("Enterd to EXACTBIDFROMEVENTPAGE ");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List <WebElement> events = driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/event?eventid')]"));
			System.out.println("event size is: "+events.size());
			Random r = new Random();
			/*int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
*/			WebDriverWait wait=new WebDriverWait(driver, 20);
			

			//selecting random event and trying to bid on first listing, if the event doesn't have open listings it will try with next event
			for(int i=0;i<events.size();i++)
			{
				events.get(r.nextInt(events.size())).click();
				Thread.sleep(8000);
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))));
			if(driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).isDisplayed())
			{
				driver.findElement(By.xpath("(//*[@type='radio' and @value='Exact Bid'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
				BIDDING_IN_LISTINGDETAILSPAGE(driver);
				resultDetails.setFlag(true);
				break;	
			}
			//go back to event page
			else
				driver.navigate().back();
				
			

			}

			

		} catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);
			
		}


	}
	public void EXACTBIDFROMWATCHINGPAGE(WebDriver driver) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/equipmentone-listings");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			Thread.sleep(1000);
			//navigation to next page
			driver.findElement(By.linkText("2")).click();
			//Thread.sleep(5000)
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to add to')])[1]")));
			//clicking on first binocular icon which is not yet watching
			driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to add to')])[1]")).click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='MyONE '])[2]")));
			driver.findElement(By.xpath("(//a[text()='MyONE '])[2]")).click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Watching")));
			
			driver.findElement(By.partialLinkText("Watching")).click();
			if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))).isDisplayed())
			{
				driver.findElement(By.xpath("(//*[@type='radio' and @value='Exact Bid'])[2]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
				BIDDING_IN_LISTINGDETAILSPAGE(driver);			
				resultDetails.setFlag(true);
			}
			else
			{
				System.out.println("there is no place a bid button in watchlist section");
			}
		} 
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);

		}


	}
	
	public void MAXBIDFROMWATCHINGPAGE(WebDriver driver) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("http://e1.dev.assetnation.com/all-equipment/equipmentone-listings");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			Thread.sleep(1000);
			//navigation to next page
			driver.findElement(By.linkText("2")).click();
			//Thread.sleep(5000)
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to add to')])[1]")));
			//clicking on first binocular icon which is not yet watching
			driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to add to')])[1]")).click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='MyONE '])[2]")));
			driver.findElement(By.xpath("(//a[text()='MyONE '])[2]")).click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Watching")));
			
			driver.findElement(By.partialLinkText("Watching")).click();
			if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))).isDisplayed())
			{
				
			
			driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
			BIDDING_IN_LISTINGDETAILSPAGE(driver);			
			resultDetails.setFlag(true);
			}
			else
			{
				System.out.println("there is no 'place a bid button' in watchlist section");
			}
		} 
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);

		}


	}
	
	public void BIDDING_IN_LISTINGDETAILSPAGE(WebDriver driver) {

		try {
			int k=0;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText'])[2]")).getText();
			
			String offer1=offer_withdollar.replace("$", "");
			String offer=offer1.substring(0, offer1.length()-3).replace(",", "");
			Integer a=Integer.parseInt(offer);
			System.out.println("you need to enter: "+offer);
			
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
			driver.findElement(By.xpath("(//input[@class='btn btn-primary jsConfirmOffer'])[2]")).click();
			
			//CHECKING CALCULATION PART
			Thread.sleep(4000);
			String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 text-right myone-green jsBidTotal'])[2]")).getText();
			Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
			/*int act_amount=(int) total_amount2;
			int exp_amount=(int) (a*1.1);
			
			if(act_amount!=exp_amount)
				k=1;*/
			
			//some times we have confirmation check-box and some times we dont have
			 try{
				 driver.findElement(By.xpath("(//input[@class='jsTermsAgree' and @type='checkbox'])[2]")).click();
			 }
			 catch(Exception e)
			 {
				 System.out.println("there is no confirm check box");
			 }
			 Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@class='btn btn-primary jsSubmitOffer'])[2]")).click();
			//verifying my max amount
			Thread.sleep(3000);
			String nextoffer=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText'])[2]")).getText();
			if(offer_withdollar.equalsIgnoreCase(nextoffer))   //if(offer_withdollar.equalsIgnoreCase(nextoffer) || k==1)
				resultDetails.setFlag(false);
			else
				resultDetails.setFlag(true);

		} catch (Exception e ) {
			e.printStackTrace();
			resultDetails.setFlag(false);
			resultDetails.setErrorMessage("unsuccessful bid");  
		}


	}
	
	
	public void BIDAMOUNTCALCULATION(WebDriver driver,String fieldText) {

		try {



			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 25);
			String page=fieldText;
			switch (page) {

			case "LOTPAGE":

				if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))).isDisplayed())
				{
					driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();


					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText'])[2]")).getText();

					String offer1=offer_withdollar.replace("$", "");
					String offer=offer1.substring(0, offer1.length()-3).replace(",", "");
					Integer a=Integer.parseInt(offer);
					System.out.println("you need to enter: "+offer);

					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
					driver.findElement(By.xpath("(//input[@class='btn btn-primary jsConfirmOffer'])[2]")).click();

					//CHECKING CALCULATION PART
					Thread.sleep(4000);
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 text-right myone-green jsBidTotal'])[2]")).getText();
					Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					int t1=(int) (a+a*0.1);
					int t2=  (int) total_amount2;

					System.out.println("Expected total amount including buyer premium is: "+t1);
					System.out.println("Actual amount is: "+t2);


					if(t1==t2){
						resultDetails.setFlag(true);}

				}
				else
				{
					System.out.println("there is no 'place a bid button");
				}

				break;


			case "LOTDETAILSPAGE":	
				if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),'Place Bid')])"))).isDisplayed())
				{
					driver.findElement(By.xpath("(//*[contains(text(),'Place Bid')])")).click();


					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer'])")).getText();

					String offer1=offer_withdollar.replace("$", "");
					String offer=offer1.substring(0, offer1.length()-3).replace(",", "");
					Integer a=Integer.parseInt(offer);
					System.out.println("you need to enter: "+offer);

					driver.findElement(By.xpath("(//input[@class='jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
					driver.findElement(By.xpath("(//button[@class='e1Buttons jsConfirmOffer e1OrangeShadow'])[1]")).click();

					//CHECKING CALCULATION PART
					Thread.sleep(4000);
					String total_amount=driver.findElement(By.xpath("(//*[@class='jsBidTotal'])[1]")).getText();
					Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					int t1=(int) (a+a*0.1);
					int t2=  (int) total_amount2;

					System.out.println("Expected total amount including buyer premium is: "+t1);
					System.out.println("Actual amount is: "+t2);


					if(t1==t2){
						resultDetails.setFlag(true);}

				}
				else
				{
					System.out.println("there is no 'place a bid button");
				}
				break;


			}	
		} 
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);

		}


	}
	
	/*public void BIDAMOUNTCALCULATION_FROMLISTINGDETAILSPAGE(WebDriver driver) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 25);
			if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'Place Bid')])[2]"))).isDisplayed())
			{
				driver.findElement(By.xpath("(//*[contains(@value,'Place Bid')])[2]")).click();


				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer'])")).getText();

				String offer1=offer_withdollar.replace("$", "");
				String offer=offer1.substring(0, offer1.length()-3).replace(",", "");
				Integer a=Integer.parseInt(offer);
				System.out.println("you need to enter: "+offer);

				driver.findElement(By.xpath("(//input[@class='jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
				driver.findElement(By.xpath("(//button[@class='e1Buttons jsConfirmOffer e1OrangeShadow'])[2]")).click();

				//CHECKING CALCULATION PART
				Thread.sleep(4000);
				String total_amount=driver.findElement(By.xpath("(//*[@class='jsBidTotal'])[1]")).getText();
				Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
				int t1=(int) (a+a*0.1);
				int t2=  (int) total_amount2;
				
				System.out.println("Expected total amount including buyer premium is: "+t1);
				System.out.println("Actual amount is: "+t2);
				
				
				if(t1==t2){
					resultDetails.setFlag(true);}

			}
			else
			{
				System.out.println("there is no 'place a bid button");
			}
		} 
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);

		}


	}
	*/
	
	
	
	
	public void NAVIGATETO(WebDriver driver,String fieldText)
	{
		driver.navigate().to(fieldText);
		resultDetails.setFlag(true);
	}
	
	public void E1LISTINGSELECTION(WebDriver driver,String value) throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int k=0;
		for(int i=0;i<10;i++){
			if(driver.findElements(By.xpath("(//a[@class='jsImageLink' and contains(@href,'/listing?listingid')])[1]")).size()>0)
			{
				if(value.equalsIgnoreCase("CLK"))
					driver.findElement(By.xpath("(//a[@class='jsImageLink' and contains(@href,'/listing?listingid')])[1]")).click();
				k=1;
				break;
			}
			else{
				driver.findElement(By.xpath("(//*[text()='Next Page'])[1]")).click();
				
			}
			
			Thread.sleep(10000);
		}
		if(k==1)
			resultDetails.setFlag(true);
		
	}
	public void VISIBLE(WebDriver driver,String fieldText, String value){
		//To verify whetheer a locator is visible
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
	public void UNCHECKED(WebDriver driver,String fieldText){
		       //To verify that a checkbox is UNchecked
				//FieldText---Locator
		try{
			  String f = fieldText;
			     String locatorType=f.substring(0,3);
			     String locatorValue=f.substring(3,f.length());
			       if(locatorType.equalsIgnoreCase("XPH")){
			    	   //System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
			         if(!driver.findElement(By.xpath(locatorValue)).isSelected())
			         resultDetails.setFlag(true);
			       }
			       else if(locatorType.equalsIgnoreCase("IDI")){
			        
			        if(!driver.findElement(By.id(locatorValue)).isSelected())
			         resultDetails.setFlag(true);
			         
			         }
	           }
	
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Element is checked");  
			resultDetails.setFlag(false);
		}
    }
	public void APPROVEUSER(WebDriver driver,String fieldText,String value){
	         //To Handle Approve User Popup 
			//FieldText---The User's FullName   and Value-----OK or Cancel
	try{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText(fieldText)).click();
		Thread.sleep(2000);
		String parentwindow=driver.getWindowHandle();
		     if(value.equalsIgnoreCase("OK")){ 
		    	 driver.findElement(By.linkText("Approve User")).click(); 
		    	 Thread.sleep(2000);

		         driver.switchTo().alert().accept();
		    	 
		         for(String win :driver.getWindowHandles()){
		         driver.switchTo().window(win);
		         try{
			         driver.switchTo().alert().accept();
			    	 }
			    	 catch (NoAlertPresentException e){
			    		Robot robot = new Robot();
			    		robot.keyPress(KeyEvent.VK_SPACE);
		                Thread.sleep(3000);
			    	 }

		         }
		         Thread.sleep(20000);
		         driver.switchTo().window(parentwindow);
		         WebDriverWait wait=new WebDriverWait(driver, 20);
		         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_frm_Email_Address")));
		         String Email=driver.findElement(By.id("id_frm_Email_Address")).getText();
		         driver.findElement(By.name("email")).sendKeys(EMAIL);
			     driver.findElement(By.xpath("//input[@value='Search']")).click();  
			     
			     String Type=driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[6]")).getText();
			     String Active_Status=driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[6]")).getText();
			     String BStatus=driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[6]")).getText();
			     String SStatus=driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[6]")).getText();
			     
		if(Type.equalsIgnoreCase("L") && Active_Status.equalsIgnoreCase("Active") && BStatus.equalsIgnoreCase("Approved") && SStatus.equalsIgnoreCase("Approved")){
		         resultDetails.setFlag(true);
		       }
		     }
		       else if(value.equalsIgnoreCase("CANCEL")){
		    	   driver.findElement(By.linkText("Approve User")).click();
		    	   Thread.sleep(2000);
		    	   //Robot robot = new Robot();
			         // Simulate SPACE KEY press to click on OK button
			         //robot.keyPress(KeyEvent.VK_ESCAPE);
		    	   driver.switchTo().alert().dismiss();
		         resultDetails.setFlag(true);
		         
		         }
        
	}

	catch (Exception e ) {

		e.printStackTrace(); 
		resultDetails.setFlag(false);
	 }
  }
	
	public void ADDINGTOWATCHLIST(WebDriver driver){
	      
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   try{
	      if(driver.findElements(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to remove from')])[1]")).size()>0)
	       System.out.println("already there are some lots in watchlist section");
	      else
	         driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to add to')])[1]")).click();
	      resultDetails.setFlag(true); 
	          }

	   catch (Exception e ) {

	    e.printStackTrace();
	    resultDetails.setErrorMessage("Element is checked");  
	    resultDetails.setFlag(false);
	   }
	  }
	 
	 public void SUBCATEGORYSELECTION(WebDriver driver,String fieldText,String value){
	    try{
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     String category= fieldText.substring(3, fieldText.length());
	     String subcat=value.substring(3, value.length());
	     new Actions(driver).moveToElement(driver.findElement(By.xpath(category))).perform();
	     Thread.sleep(1500);
	     try{
	      driver.findElement(By.xpath(subcat)).click();
	     }
	     catch(Exception e1)
	     {
	      driver.findElement(By.xpath(category)).click();
	   Thread.sleep(3000);
	      new Actions(driver).moveToElement(driver.findElement(By.xpath(category))).perform();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath(subcat)).click();
	     }
	     resultDetails.setFlag(true);
	    }
	    catch (Exception e2 ) {

	     e2.printStackTrace();
	     resultDetails.setErrorMessage("Unable to click on sub category");  
	     resultDetails.setFlag(false);
	    }
	  }
	 public void BIDONOWNLOT(WebDriver driver,String fieldText,String value){
	      try{
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       AMPLOGIN(driver, value);
	       driver.findElement(By.linkText("Lots")).click();
	       Thread.sleep(4000);
	       new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
	       new Select(driver.findElement(By.xpath("//select[@name='offerSrhListingStatus']"))).selectByVisibleText("Approved");
	       driver.findElement(By.xpath("//input[@name='find_button']")).click();
	       driver.findElement(By.xpath("//*[@id='renderView']/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/a")).click();
	       String EQID=driver.findElement(By.xpath("//td[@class='listdatabold' and text()='Lot Number:']/../td[4]")).getText();
	       System.out.println("EQID is: "+EQID);
	       driver.findElement(By.xpath("//td[@class='listdatabold' and text()='Seller:']/../td[2]/a")).click();
	       Thread.sleep(5000);
	       String SellerMailID=driver.findElement(By.id("id_frm_Email_Address")).getAttribute("value");
	       System.out.println("SellerMailID is: "+SellerMailID);
	       AMPLOGOUT(driver);
	       driver.get(fieldText);
	       WebDriverWait wait=new WebDriverWait(driver, 30);
	       
	       driver.findElement(By.name("josso_username")).clear();
	    driver.findElement(By.name("josso_username")).sendKeys(SellerMailID);
	    driver.findElement(By.name("josso_password")).clear();
	    driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	    driver.findElement(By.xpath("//*[@value='SIGN IN']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("search")).sendKeys(EQID);
	    driver.findElement(By.xpath("//*[@id='main_search']/button")).click();
	    Thread.sleep(4000);
	    //driver.findElement(By.xpath("(//*[@name='makeoffer'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//*[@name='makeoffer'])[2]")).sendKeys("99999999999");
	    driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys("99999999999");
	    driver.findElement(By.xpath("(//input[@class='btn btn-primary jsConfirmOffer'])[2]")).click();
	    Thread.sleep(4000);
	    if(driver.findElement(By.tagName("html")).getText().contains("You are attempting to place a bid on a lot you own, this is not allowed."))
	     resultDetails.setFlag(true);
	    
	    
	       
	      }
	      catch (Exception e2 ) {

	       e2.printStackTrace();
	       resultDetails.setErrorMessage("something went wrong");  
	       resultDetails.setFlag(false);
	      }
	    }
	 public void ALLEQUIPMENTPAGE(WebDriver driver){
		   try{
			   try{
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'All Equipment')]")).click();
		     System.out.println("clicked on All Equipment Link");
		     resultDetails.setFlag(true);
			   }
		   catch(Exception e)
		   {
		    driver.navigate().to("http://e1.dev.assetnation.com/all-equipment");
		    resultDetails.setFlag(true);
		   }
		   
		  }
		   catch(Exception e)
		   {
			   resultDetails.setFlag(false);
		   }
	 }
	 public String FINDLOTID(WebDriver driver,String value) throws Exception
	 {
		 String EQID = null;
		// try{
		       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		       AMPLOGIN(driver, value);
		       driver.findElement(By.linkText("Lots")).click();
		       Thread.sleep(4000);
		       new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
		       new Select(driver.findElement(By.xpath("//select[@name='offerSrhListingStatus']"))).selectByVisibleText("Approved");
		       driver.findElement(By.xpath("//input[@name='find_button']")).click();
		       driver.findElement(By.xpath("//*[@id='renderView']/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/a")).click();
		       EQID=driver.findElement(By.xpath("//td[@class='listdatabold' and text()='Lot Number:']/../td[4]")).getText();
		       System.out.println("EQID is: "+EQID);
		       driver.findElement(By.xpath("//*[@name='search_string']")).sendKeys(EQID);
		       driver.findElement(By.xpath("//button[text()='Search']")).click();
		       
		/*}
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }*/
		 return EQID;
		
	 }
	 
	 
	 public void SEARCHLOTINAMP(WebDriver driver,String fieldText,String value)
	  {
	   String EQID = null;
	   try{
	      String AMPUrl=fieldText;
	      String AMPPage=value.toUpperCase();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	         
	         
	        
	         
	         switch (AMPPage) {
	         
	         
	      case "LOTS2":
	       
	       EQID=FINDLOTID(driver,AMPUrl);
	          Thread.sleep(4000);
	       driver.findElement(By.linkText("Lots")).click();
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//*[text()='Lot Number:']/../td[2]/input")).sendKeys(EQID);
	          driver.findElement(By.xpath("//input[@name='find_button']")).click();
	          if(driver.findElement(By.xpath("//*[@id='renderView']/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/a")).getText().contains(EQID))
	           resultDetails.setFlag(true);
	          break;
	          
	          
	          
	          
	      case "HOME":
	      case "LOTS": 
	       
	       EQID=FINDLOTID(driver,AMPUrl);
	          Thread.sleep(4000);
	       driver.findElement(By.linkText(value)).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@name='search_string']")).sendKeys(EQID);
	       driver.findElement(By.xpath("//button[text()='Search']")).click();
	       if(driver.findElement(By.xpath("//td[@class='listdatabold' and text()='Lot Number:']/../td[4]")).getText().equalsIgnoreCase(EQID))
	        resultDetails.setFlag(true);
	       break;
	         
	       
	       
	         
	      case "VENUE": 
	       
	       AMPLOGIN(driver, AMPUrl);
	          driver.findElement(By.linkText("Lots")).click();
	          Thread.sleep(4000);
	          new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
	          driver.findElement(By.xpath("//input[@name='find_button']")).click();
	          int size=driver.findElements(By.xpath("//a[contains(@href,'/o_details.cfm?id=')]")).size();
	          for(int i=1;i<=size;i++)
	          {
	          
	          if(driver.findElement(By.xpath("//a[contains(@href,'/o_details.cfm?id=')]")).getText().contains("(EQ"))
	        resultDetails.setFlag(true);
	        
	          else
	          {
	           resultDetails.setFlag(false);
	           break;
	          }
	          }
	       break;
	       
	       
	       
	         
	      case "STATUS": 
	       
	       AMPLOGIN(driver, AMPUrl);
	          driver.findElement(By.linkText("Lots")).click();
	          Thread.sleep(4000);
	          new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
	          new Select(driver.findElement(By.xpath("//select[@name='offerSrhListingStatus']"))).selectByVisibleText("Approved");
	          
	          driver.findElement(By.xpath("//input[@name='find_button']")).click();
	          size=driver.findElements(By.xpath("//a[contains(@href,'/o_details.cfm?id=')]")).size();
	          for(int i=1;i<size*2;i++)
	          {
	          
	          if(driver.findElement(By.xpath("//*[@id='renderView']/table[2]/tbody/tr["+i+"]/td[1]/table/tbody/tr[3]/td")).getText().equalsIgnoreCase("Approved"))
	          {
	           resultDetails.setFlag(true);
	           i++;//because, there is one more empry row in table after each and every lot row. So we are skipping that empty row
	          }
	        
	          else
	          {
	           resultDetails.setFlag(false);
	           break;
	          }
	          }
	       break;
	       
	       
	       
	       
	      case "WITHOUTBUYITNOW": 
	       
	       AMPLOGIN(driver, AMPUrl);
	          driver.findElement(By.linkText("Lots")).click();
	          Thread.sleep(4000);
	          new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
	          new Select(driver.findElement(By.xpath("//select[@name='offerSrhListingStatus']"))).selectByVisibleText("Approved");
	          System.out.println("is buy it now selected currently: "+driver.findElement(By.xpath("(//*[@name='offerSrhBuyItNowAllowed'])[2]")).isSelected());
	          if(driver.findElement(By.xpath("(//*[@name='offerSrhBuyItNowAllowed'])[2]")).isSelected())
	           driver.findElement(By.xpath("(//*[@name='offerSrhBuyItNowAllowed'])[2]")).click();
	          
	          driver.findElement(By.xpath("//input[@name='find_button']")).click();
	          size=driver.findElements(By.xpath("//a[contains(@href,'/o_details.cfm?id=')]")).size();
	          driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	          for(int i=1;i<size*2;i++)
	          {
	         
	          if(driver.findElements(By.xpath("//*[@id='renderView']/table[2]/tbody/tr["+i+"]/td[1]/table/tbody/tr[2]/td/img[contains(@src,'buyitnow')]")).size()==0)
	          {
	           resultDetails.setFlag(true);
	           i++; //because, there is one more empry row in table after each and every lot row. So we are skipping that empty row
	          }
	        
	          else
	          {
	           System.out.println("Lot displayed with BIN");
	           resultDetails.setFlag(false);
	           break;
	          }
	          }
	          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       break;
	       
	       
	       
	       
	      case "WITHBUYITNOW": 
	       
	       AMPLOGIN(driver, AMPUrl);
	          driver.findElement(By.linkText("Lots")).click();
	          Thread.sleep(4000);
	          new Select(driver.findElement(By.xpath("//select[@name='venueID']"))).selectByVisibleText("EquipmentOne");
	          new Select(driver.findElement(By.xpath("//select[@name='offerSrhListingStatus']"))).selectByVisibleText("Approved");
	          if(driver.findElement(By.xpath("//*[@name='offerSrhBuyItNowAllowed']")).isSelected())
	           driver.findElement(By.xpath("//*[@name='offerSrhBuyItNowAllowed']")).click();
	          
	          driver.findElement(By.xpath("//input[@name='find_button']")).click();
	          size=driver.findElements(By.xpath("//a[contains(@href,'/o_details.cfm?id=')]")).size();
	          for(int i=1;i<size*2;i++)
	          {
	         
	          if(driver.findElements(By.xpath("//*[@id='renderView']/table[2]/tbody/tr["+i+"]/td[1]/table/tbody/tr[2]/td/img[contains(@src,'buyitnow')]")).size()==1)
	          {
	           resultDetails.setFlag(true);
	           i++; //because, there is one more empry row in table after each and every lot row. So we are skipping that empty row
	          }
	        
	          else
	          {
	           System.out.println("Lot displayed without BIN");
	           resultDetails.setFlag(false);
	           break;
	          }
	          }
	       break;
	       
	       
	   
	      }
	   }
	   catch(Exception e)
	   {
	    System.out.println(e);
	    resultDetails.setFlag(false);
	   }
	   
	  
	  }
	 public void SEARCHLOTINEQWITHEQID(WebDriver driver,String pagename)
	   {
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   try{
	    
	   Thread.sleep(5000);
	    if(pagename.equalsIgnoreCase("LotDetailsPage"))
	     eqid_1=driver.findElement(By.xpath("//*[contains(text(),'Lot ID:')]/span")).getText();
	    else if(pagename.equalsIgnoreCase("SEARCHRESULTPAGE"))
	     eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
	    else if(pagename.equalsIgnoreCase("HOMEPAGE"))
	    {
	     eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
	     //moving to home page
	     driver.findElement(By.xpath("//a/img[@class='logo-img img-responsive']")).click();
	    }
	    else if(pagename.equalsIgnoreCase("MYONEPAGE"))
	    {
	     eqid_1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[4]")).getText();
	     //moving to home page
	     driver.findElement(By.xpath("(//a[contains(text(),'MyONE')])[2]")).click();
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
	    System.out.println("suman999999999999999999999999999999999999999999999999: "+size);
	    if(size==4 && actual_eqid.equalsIgnoreCase(eqid_1))
	     resultDetails.setFlag(true);
	       
	   }
	   catch(Exception e)
	   {
	   System.out.println(e);
	    resultDetails.setFlag(false);
	   }
	   
	   }
	 public void AssetNation ( WebDriver driver) {
		 try {
		 // Actions to be performed on failure
			 
			 if(driver.getPageSource().contains("500 Internal server error")){
				 driver.navigate().refresh();
			 }
			 int userid=driver.findElements(By.id("iduser")).size();
			 int logoutlink=driver.findElements(By.linkText("Logout")).size();
			 if(userid>0){
				 SIGNOUT(driver);
				 System.out.println("Clicked on Signout after Fail");
			 }
			 else if(logoutlink>0){
				 AMPLOGOUT(driver);
			 }
				 
			 
		 } catch (Exception e) {
			 System.out.println(e);
		 }
	 }
	
 }
 
