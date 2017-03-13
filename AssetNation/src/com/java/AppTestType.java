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
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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



 public class AppTestType{

	public enum AppKeyWords{
		LNK,BTN,XPH,EXACTOFFER,AMPTOOL,USR,COMPARE,SOURCESITE, LISTELEMENTS, NEWUSERREGISTRATION, CONTENTMNGR, TYPE,CSS, NAME, listing, ACCEPTDLG,
		ELISTINGS, APPROVEDLG,SEARCHFILTERS, FORGOTPASSWORD,SEARCHGLB, MAXINEVENTPAGE, DELCOOKIES, READCSV, RANDOMMOBILE, REDIRECT, AMPLOGIN, COMMERCIALLISTINGS, GETDATETIME, MAKEOFFERFROMWATCHLIST, BROWSEALLEVENTS, BROWSEALLLISTINGS,MAKE,FACETS, MODEL, COUNTRY, STATE, SER, AGRI, SEARCHRESULTS, TRANS, CONS, USERTAB, COMPARELISTINGS, GETLISTINGSCOUNT,
		MAXOFFERINDETAILSPAGE, EXACTOFFERINDETAILSPAGE, MAXOFFERINSEARCHRESULTSPAGE, EXACTOFFERINSEARCHRESULTSPAGE, ADDTOWATCHLIST, MAXOFFERFROMEVENTS, EXACTOFFERFROMEVENTS, BINOFFERFROMSEARCH, BINOFFERFROMLISTINGPAGE,VISITOR,MAKEOFFERBTN,CLOSINGTODAY,DSALE,NEWLISTINGS,EVENTS,ALERTINEMAILPREF,CONFIRMOFFER,LISTVIEWTITLE,
		OFFERS,CHANGEPASSWORD,FROMSEARCH,EA,NONZEROCOUNT,EQITQUESFWDTOSELLER,BUYINGSALESINMYONE,WATCHINGINMYONE,COMMERCIAL,BUYINGMYOFFER,BUYINGQA,MYSALES,LITEUSERREGISTRATION,SUBMITTEDASSET,PENDINGLISTING, DEFAULTOFFER,SELLERPAGE,FORWARDTOPM,DRAFTLISTING, FORWARDTOMM,FORWARDTOSELLER,FORWARDTOSTORAGE, MYBUYING,BUYINGINMYONE,PROFILE, FROMLISTING,
		BROWSEALL,GETUSERDETAILS, BROWSEE1, SEARCH, POSTALCODE, QA, SAVESEARCH, NAVIGATETOLISTINGDETAILSPAGE, USERAMP, PULLDOWNMENUS, SAVE, RECENT, WATCH, OFFERINEVENTSPAGE, OFFERFROMWATCHLIST, DEVLOGIN, LOGIN, WRNGEMAIL, WRNGPWD, WRGNEMAILPWD, MOUSEHOVER, USERPULLDOWN,LOTSTAB, VERIFYQAINAMP, REJECTQUES, LOADNEWUSERREG, AUTOSUGGEST, EMAILPREF, RBA, EO,
		Events, Closingtoday, DSale, NewListings, SELECTALL, UNCHECKONE, SEARCHPAGE, LISTINGPAGE, E1RBA, E1RBAINSEARCH, E1, E1INSEARCH, RBAINSEARCH, ALLEQUIPMENTLINK, CATEGORY, BUY, MYOFFERS, SELLERCHOICE, PAYMENTS, REMOVALS, HISTORY, SCHCE, MYEVENTS, EXACTINEVENTPAGE, MAXOFFER,AGREETERMS,
		MYOPERATION,SIGNIN,SIGNOUT,WAITFORTHIS,VERIFYTHIS,MAXBIDFROMEVENTPAGE,NAVIGATETO,EXACTBIDFROMEVENTPAGE,EXACTBIDFROMWATCHINGPAGE,MAXBIDFROMWATCHINGPAGE,
		BIDAMOUNTCALCULATION,E1LISTINGSELECTION,VISIBLE,NOTVISIBLE,CHECKED,UNCHECKED,VERIFYNOT,NEWLITEUSERLOGIN,APPROVEUSER,ADDINGTOWATCHLIST,SUBCATEGORYSELECTION,
		AMPLOGOUT,BIDONOWNLOT,ALLEQUIPMENTPAGE,SEARCHLOTINAMP,SEARCHLOTINEQWITHEQID, ENER,AssetNation,USERAGREEMENT, USERAGREEMENTPAGE, PRIVACYPOLICYPAGE, WEBSITERULESPAGE, ALERTHANDLING, FROMEVENTPAGE,SUMAN}
		
	
     final int MAX_STALE_ELEMENT_RETRIES = 5;
     int retries=0;
     int add = 100;
     public static String eqid_1="suman";
     
     
     
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String Time = cal.getTime().toString();
		String ParantWindow="";
		
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
	
	public AppTestType(TestType tt){
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
				
            case ALERTHANDLING:
                ALERTHANDLING(webdriver,fieldText,value);
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
                break;
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
                    	CHANGEPASSWORD(webdriver, fieldText, value);
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
                    	break;
                    case USERAGREEMENTPAGE:
                        USERAGREEMENTPAGE(webdriver);
                        break;
                       case PRIVACYPOLICYPAGE:
                        PRIVACYPOLICYPAGE(webdriver);
                        break; 
                       case WEBSITERULESPAGE:
                        WEBSITERULESPAGE(webdriver);
                        break;
                       case SUMAN:
                    	   SUMAN(webdriver,value);
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
				String ABGCount=driver.findElement(By.xpath("(//*[@class='abgCount'])[2]")).getText();
						

				String EOCount1 = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
				String RBACount1 = RBACount.substring(RBACount.indexOf("(")+1, RBACount.lastIndexOf(")"));
				String SSCount1 = SSCount.substring(SSCount.indexOf("(")+1, SSCount.lastIndexOf(")"));
				String ABGCount1 = ABGCount.substring(ABGCount.indexOf("(")+1, ABGCount.lastIndexOf(")"));
				
				System.out.println("EOCount1:"+EOCount1);
				System.out.println("RBACount1:"+RBACount1);
				System.out.println("SSCount1:"+SSCount1);
				System.out.println("ABGCount1:"+ABGCount1);
				
				Integer E1=Integer.parseInt(EOCount1);
				Integer RBA=Integer.parseInt(RBACount1);
				Integer SS=Integer.parseInt(SSCount1);
				Integer ABG=Integer.parseInt(ABGCount1);
				
				int count1=E1+RBA+SS+ABG;
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
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@id='site_id:ABG']/span[1]/input)[2]")).click();
				
				
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
			  if(msg.contains("Auctions By Gov"))
				  driver.findElement(By.xpath("(//*[@id='site_id:ABG']/span[1]/input)[2]")).click();
			  
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
	 
	 String question="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 try {
		 NAVIGATETOLISTINGDETAILSPAGE(driver);
		  
		/* getvalue = driver.findElement(By.xpath("//div[7]/span")).getText();
		 System.out.println(getvalue);	*/	
			 new Actions(driver).moveToElement((driver.findElement(By.xpath("//*[text()='Q & A for this Lot ']/../following-sibling::div/div/i")))).perform();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[text()='Q & A for this Lot ']/../following-sibling::div/div/i")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//*[text()='ASK IT NOW']")).click();
			 //Thread.sleep(5000);
			 question="where is the listing located"+Time;
			 driver.findElement(By.id("AskquesText")).sendKeys(question);
			// Thread.sleep(10000);
			 driver.findElement(By.xpath("//*[text()='SUBMIT QUESTION']")).click();
			 Boolean b6=driver.findElement(By.xpath("//*[text()='ASK IT NOW']")).isDisplayed();
				// Thread.sleep(10000);
			 Boolean b1=driver.findElement(By.xpath("//*[text()='We’ve got your question!']")).isDisplayed();
			 Boolean b2=driver.findElement(By.xpath("//*[text()='Your question will be forwarded to the seller. It may also be answered by our Customer Care team. Please note: we cannot determine when the seller will respond.']")).isDisplayed();
			 Boolean b3=driver.findElement(By.xpath("//*[text()=' Click here to receive a copy of your question by email']")).isDisplayed();
			 Boolean b4=driver.findElement(By.xpath("//input[@id='jsSendCopy' and @type='checkbox']")).isDisplayed();
			
			 if(b1 && b2 && b3 &&b4)
			 {
				 driver.findElement(By.xpath("//button[text()='OK']")).click();
				 System.out.println("clicked on ok button");
			 }
			 
			 
			 			 
			 Boolean b5=driver.findElement(By.xpath("//*[text()='ASK IT NOW']")).isDisplayed();
			 if(b5){	
				 System.out.println("Again 'ask it now displaying', it means question is asked successfully");
				 resultDetails.setFlag(true);
				 
			 }
			  
		 
	 } catch(Exception e) {
		 System.out.println(e);
		 e.printStackTrace();
		 resultDetails.setFlag(false);
		 }
	 return question;
		 
		 
	
	//return getvalue;
	
	 
 }
 
 public void VERIFYQAINAMP(WebDriver driver, String fieldText) throws FileNotFoundException {
	  
	 String field = fieldText;
	 	 
	 try {

		

		 
		 String question=QA(driver);
		 getvalue = driver.findElement(By.xpath("//*[@class='e2lot-result rgbold jsLotID']")).getText();
		 SIGNOUT(driver);

		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();
		 AMPLOGIN(driver, "http://amp.dev.assetnation.com/login");

		 /*driver.get(field);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

		 driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.id("userAgreementBtn")).click();
*/
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
	int k=0; 
try {		 
	
	 String question=QA(driver);
	 getvalue = driver.findElement(By.xpath("//*[@class='e2lot-result rgbold jsLotID']")).getText();
	 SIGNOUT(driver);
	 driver.manage().deleteAllCookies();
	 driver.navigate().refresh();
	 AMPLOGIN(driver, "http://amp.dev.assetnation.com/login");
	 Thread.sleep(2000);
	 System.out.println("Searching for lot id : "+getvalue);
	 String ParentHandle = driver.getWindowHandle();
	 driver.findElement(By.name("search_string")).clear();
	 driver.findElement(By.name("search_string")).sendKeys(getvalue);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
	 driver.findElement(By.xpath("//button")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.linkText("Lot Q/A")).click();	
	 WebDriverWait wait= new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Reject")));
 		 


	 driver.findElement(By.linkText("Reject")).click();
	 for(String winHandle : driver.getWindowHandles()) {

		 System.out.println("Entered For Loop");
		 driver.switchTo().window(winHandle);
	 }

	 driver.findElement(By.id("id_button_rejct")).click(); 

	 Thread.sleep(10000);
	 if(driver.findElements(By.xpath("//*[contains(text(),'Error')]")).size()>0)
		 {
		 k=1;
		 System.out.println("Error foundddddddddddddddddddddd");
		 }
	 driver.close();
	 //driver.switchTo().alert().accept();
	 //Thread.sleep(2000);
	 driver.switchTo().window(ParentHandle);
	 if(k==1)	 
		 resultDetails.setFlag(false);
	 else
		 resultDetails.setFlag(true);


}  

		  		/*catch(StaleElementReferenceException e) {
					 
					 if(retries < MAX_STALE_ELEMENT_RETRIES ){
						 
						 retries++;
						 	 }
					 
					 else {
						 
						 throw e;
					 }
				}*/
  catch(Exception e ) {
	  e.printStackTrace();
	 resultDetails.setFlag(false);

 } 
 }
 
 
 public void FORWARDTOMM (WebDriver driver, String fieldText) {
	 
	 try {

		 String question=QA(driver);
		 getvalue = driver.findElement(By.xpath("//*[@class='e2lot-result rgbold jsLotID']")).getText();
		 SIGNOUT(driver);
		 driver.manage().deleteAllCookies();
		 driver.navigate().refresh();
		 AMPLOGIN(driver, "http://amp.dev.assetnation.com/login");
		 Thread.sleep(2000);
		 System.out.println("Searching for lot id : "+getvalue);
		 String ParentHandle = driver.getWindowHandle();
		 driver.findElement(By.name("search_string")).clear();
		 driver.findElement(By.name("search_string")).sendKeys(getvalue);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); ;
		 driver.findElement(By.xpath("//button")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Lot Q/A")).click();
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forward")));

		 String ParentHandle1 = driver.getWindowHandle();
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
		 int k=0;
		if(driver.findElements(By.xpath("//*[contains(text(),'Error')]")).size()>0)
		 {
		 k=1;
		 System.out.println("Error foundddddddddddddddddddddd");
		 }
	 driver.close();
	 //driver.switchTo().alert().accept();
	 //Thread.sleep(2000);
	 driver.switchTo().window(ParentHandle1);
	 if(k==1)	 
		 resultDetails.setFlag(false);
	 else
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
		 else if(href.contains("http://e1.dev.assetnation.com/"))
			 href=href.replaceAll("http://e1.dev.assetnation.com/", "");


		 String min_offer=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMinOffer jsAmountText'])[1]")).getText();
		 System.out.println(min_offer);
		 String[] min_offer2=min_offer.split(".00");
		 String min_offer3=min_offer2[0].replace(",", "").replace("$", "");
		 /* String min_offer2=min_offer.substring(1, min_offer.length()-3);
		 String min_offer3=min_offer2.replace(",", "");*/

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
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='submit' and @value='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 for(int i=0;i<20;i++)
		 {
			 if(driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText().contains("$"))
				 break;
			 Thread.sleep(500);
		 }
		 String MyMaxBid=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText();
		 String[] MyMaxBid2=MyMaxBid.split(".00");   //$8,200.00
		 String MyMaxBid3=MyMaxBid2[0].replace("$", "").replace(",", "");


		 System.out.println("bidded value is: "+bidValue);
		 System.out.println("showing my bid value is: "+MyMaxBid3);
		 if(MyMaxBid3.equals(bidValue))
			 resultDetails.setFlag(true); 
		 else
			 System.out.println("bid value is mis-matched");


	 }

	 catch(Exception e) {

		 resultDetails.setErrorMessage(e.toString());
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
		 String[] min_offer2=min_offer.split(".00");
		 String min_offer3=min_offer2[0].replace(",", "").replace("$", "");
		 
		/* String min_offer2=min_offer.substring(1, min_offer.length()-3);
		 String min_offer3=min_offer2.replace(",", "");*/


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
		 driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@type='submit' and @value='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 for(int i=0;i<20;i++)
		 {
			 if(driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText().contains("$"))
				 break;
			 Thread.sleep(500);
		 }
		 String MyMaxBid=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText();
		 String[] MyMaxBid2=MyMaxBid.split(".00"); //$8,200.00
		 String MyMaxBid3=MyMaxBid2[0].replace("$", "").replace(",", "");


		 System.out.println("bidded value is: "+bidValue);
		 System.out.println("showing my bid value is: "+MyMaxBid3);
		 if(MyMaxBid3.equals(bidValue))
			 resultDetails.setFlag(true); 
		 else
			 System.out.println("bid value is mis-matched");


	 }

	 catch(Exception e) {

		 e.printStackTrace(); 
		 resultDetails.setErrorMessage(e.toString());
		 resultDetails.setFlag(false);
	 }

 }
 
      
   public void WATCHINGINMYONE(WebDriver driver, String fieldText) {
	   
	   try {
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ADDTOWATCHLIST(driver, fieldText);
	    System.out.println("Back to  WATCHINGINMYONE method");
	      
	    driver.findElement(By.xpath("(//a[contains(text(),'MyONE')])[2]")).click();
	    
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

		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   WebDriverWait wait = new WebDriverWait(driver, 25);
		   //navigation to next page
		   driver.findElement(By.linkText("2")).click();
		   //Thread.sleep(5000)
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")));
		   //clicking on first binocular icon which is not yet watching
		   ListingID = driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist']/../following::div[@class='rgbold jsLotID myone-black'])[2]")).getText(); 
		    System.out.println(ListingID);
		   driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
		   Thread.sleep(1000);
		   resultDetails.setFlag(true);
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
	    //ListingID = driver.findElement(By.xpath("//*[contains(text(),'Lot ID:')]/span")).getText(); 
	   ListingID = driver.findElement(By.xpath("//*[@class='e2lot-result rgbold jsLotID']")).getText(); 
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
	  
	   
	   }
	 
      catch(Exception e) {
    	  resultDetails.setFlag(false);
		  e.printStackTrace();
	      }
	 
	 break;
	 
	  
	  case FROMEVENTPAGE:
		  try{
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
				if(driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).isDisplayed())
				{
					 //clicking on first binocular icon which is not yet watching
					   ListingID = driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist']/../following::div[@class='rgbold jsLotID myone-black'])[2]")).getText(); 
					    System.out.println(ListingID);
					   driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
					   Thread.sleep(1000);
					   resultDetails.setFlag(true);
					break;	
				}
				//go back to event page
				else
					driver.navigate().back();
					
				

				}
		  }
		  catch (Exception e) {		    
			  resultDetails.setFlag(false);
			  e.printStackTrace();
			   }
		  break;
	  }

	   } catch (Exception e) {
		  e.printStackTrace();
	    System.out.println("listing is not added to watchlist2");
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
			 if(listingText.contains("MAX BID") || listingText.contains("SIGN IN TO PLACE A BID") || listingText.contains("PLACE A BID"))
			 {
				 System.out.println("clicking on listing: "+((i/2)+1));
				 listings.get(i).click();
				 break;
			 }
			 
			 
			i++;
			 
		 }
		
		 //waiting upto listing will be loaded
		 WebDriverWait wait = new WebDriverWait(driver, 40);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='More from This Seller']")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='RETURN TO RESULTS']")));*/
		 
		 //Thread.sleep(10000);
		 if(driver.findElement(By.xpath("(//div[contains(@class,'e1OfferConsole')])[1]")).isDisplayed())
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


public void ALERTHANDLING(WebDriver driver,String fieldText,String value) {
	 //fieldText=Locator to click-Xpath or linktext
	 //value= LEAVE to Leave Page or STAY to stay on the page
	 try {
	   String f = fieldText;
	       String locatorType=f.substring(0,3);
	       String locatorValue=f.substring(3,f.length());
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //For link     
	 if(locatorType.equalsIgnoreCase("LNK")){
	  
	   if(value.equalsIgnoreCase("LEAVE")){

	    driver.findElement(By.linkText(locatorValue)).click();
	     driver.switchTo().alert().accept();
	      Thread.sleep(1000);
	     resultDetails.setFlag(true);
	         
	   } 
	   else if(value.equalsIgnoreCase("STAY")){

	     driver.findElement(By.linkText(locatorValue)).click();
	     
	     Alert alert = driver.switchTo().alert();
	     String alertText=alert.getText();
	     driver.switchTo().alert().dismiss();
	     Thread.sleep(1000);
	     if(alertText.contains("You have made changes on this page that you have not yet confirmed.")){
	       resultDetails.setFlag(true);
	       }
	   }
	 }
	 
	 ///For Xpath
	 else if(locatorType.equalsIgnoreCase("XPH")){
	  if(value.equalsIgnoreCase("LEAVE")){

	    driver.findElement(By.xpath(locatorValue)).click();
	     driver.switchTo().alert().accept();
	      Thread.sleep(2000);
	     resultDetails.setFlag(true);
	         
	   } 
	   else if(value.equalsIgnoreCase("STAY")){

	     driver.findElement(By.xpath(locatorValue)).click();
	     Alert alert = driver.switchTo().alert();
	     String alertText=alert.getText();
	     driver.switchTo().alert().dismiss();
	     Thread.sleep(1000);
	     if(alertText.contains("You have made changes on this page that you have not yet confirmed.")){
	       resultDetails.setFlag(true);
	       }
	   }
	  
	  }
	  
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
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	     Thread.sleep(10000);
	     
	     
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
	     WebDriverWait wait=new WebDriverWait(driver, 35);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-user famember-icon']"))); //verifying the "Activate your membership" icon 
	     System.out.println("Successfully Registered user with mail id: "+Email);
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
	       driver.get("http://e1.dev.assetnation.com");
	       SIGNIN(driver, EMAIL, user);
	       
	       /* driver.findElement(By.id("sign")).click();
	        driver.findElement(By.name("josso_username")).sendKeys(EMAIL);
	       driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	       driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();*/
	       
	       
	     //To verify exceptional casse where previously a signout is not happened corrctly and the cookie is remembered
	     
	    /* if(!driver.findElement(By.id("iduser")).getText().equalsIgnoreCase(user)){
	 
	      SIGNOUT(driver);
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.id("sign")).click();
	       driver.findElement(By.name("josso_username")).sendKeys(EMAIL);
	       driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	       driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
         }*/
	     if(driver.findElement(By.id("iduser")).getText().equalsIgnoreCase(user)){
	    	 resultDetails.setFlag(true);
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
	     // System.out.println("size is:"+driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).size());suman
	      if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).size()>0)
	        {
	          driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).click();
	              driver.findElement(By.xpath("//*[@class='btn btn-primary btn-group-justified' and @type='submit']")).click();
	              driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            
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
			Thread.sleep(3000);
			if(msg.contains("SalvageSale"))
				driver.findElement(By.xpath("(//*[@id='site_id:SS']/span[1]/input)[2]")).click();
			Thread.sleep(3000);
			if(msg.contains("Auctions By Gov"))
				driver.findElement(By.xpath("(//*[@id='site_id:ABG']/span[1]/input)[2]")).click();

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
	  // wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
	    
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	  ParantWindow=driver.getWindowHandle();
	 // driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.name("josso_username")).clear();
	  driver.findElement(By.name("josso_username")).sendKeys(fieldText);
	  driver.findElement(By.name("josso_password")).clear();
	  driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	  try{
	  driver.findElement(By.xpath("//*[@value='SIGN IN']")).click();}
	  catch(Exception elementnotfoundexException){
		  driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	  }
	  System.out.println("size is   :"+driver.findElements(By.id("iduser")).size());
	  if(driver.findElements(By.id("iduser")).size()>0){
	   System.out.println("1111111111");
	   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	   if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).size()>0)
	        {
	          driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).click();
	              driver.findElement(By.xpath("//*[@class='btn btn-primary btn-group-justified' and @type='submit']")).click();
	              driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	             // driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
	            //  wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
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
	    //agree terms-This piece of code is to verify agree terms checkbox after re logging(not logged in as the valid user)
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    if(driver.findElements(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).size()>0)
	         {
	           driver.findElement(By.xpath("//input[@id='useragreetoterms' and @type='checkbox']")).click();
	               driver.findElement(By.xpath("//*[@class='btn btn-primary btn-group-justified' and @type='submit']")).click();
	               driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	              // driver.findElement(By.xpath("//input[@value='Go to EquipmentOne']")).click();
	             //  wait.until(ExpectedConditions.titleIs("Used Equipment Sales | Buy & Sell Online | Ritchie Bros. EquipmentOne"));
	         }
	    
	   }
	   resultDetails.setFlag(true);
	  }
	  
	    
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
			//according to new to changes the following is not needed
			/*if(url2.contains("LISTINGID"))
			{
				driver.findElement(By.id("uname")).click();
				Thread.sleep(2000);
				
			}*/
			
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
	    	resultDetails.setErrorMessage(fieldText+"Locator Not Found");
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
		    	   System.out.println(driver.findElement(By.xpath(locatorValue)).getText());
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
		          e.printStackTrace();
		          resultDetails.setErrorMessage(fieldText+" Text is not matching with that of the locator (or) the locator not found");
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
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")));
		   //clicking on first binocular icon which is not yet watching
		   driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
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
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")));
		   //clicking on first binocular icon which is not yet watching
		   driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
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
			String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText' and contains(text(),'$')])")).getText();
			
			String[] offer11=offer_withdollar.split(".00");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
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
			String nextoffer=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText' and contains(text(),'$')])")).getText();
			String[] nextoffer1=nextoffer.split(".00");
			if(offer_withdollar.equalsIgnoreCase(nextoffer1[0]))   //if(offer_withdollar.equalsIgnoreCase(nextoffer) || k==1)
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
					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText' and contains(text(),'$')])")).getText();
					String[] offer11=offer_withdollar.split(".00");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
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

					String[] offer11=offer_withdollar.split(".00");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
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
			 //if there is any pop-up's the following code will close them
			/* System.out.println("ParantWindow is: "+ParantWindow);
			 System.out.println(driver.getWindowHandle());
			 if(!driver.getWindowHandle().equalsIgnoreCase(ParantWindow)){
				driver.close();
			 }*/
			 
			 /*for(String winHandle : driver.getWindowHandles()) 
			 {
				 if(!winHandle.equalsIgnoreCase(ParantWindow)){
					 driver.switchTo().window(winHandle);
					 driver.close();
				 }
			 }*/
			 
			 driver.switchTo().window(ParantWindow);
			 // Actions to be performed on failure
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 if(driver.getPageSource().contains("server error")||driver.getPageSource().contains("amp.dev.assetnation.com")||driver.getCurrentUrl().contains("amp.dev.assetnation.com")){
				 driver.navigate().to("http://amp.dev.assetnation.com");
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				 int logoutlink=driver.findElements(By.linkText("Logout")).size();
				 if(logoutlink>0){
					 AMPLOGOUT(driver);
					 System.out.println("Clicked on Logout after Fail");
				 }
			 }
			 else{

				 int userid=driver.findElements(By.id("iduser")).size();
				 if(userid>0){
					 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					 SIGNOUT(driver);
					 System.out.println("Clicked on Signout after Fail");
				 }
			 }


		 } catch (Exception e) {
			 System.out.println(e);
		 }
	 }	
	 public void VERIFYTHIS_2(WebDriver driver,String fieldText, String value) throws Exception{
         //Used to verify the text in any specific Loctor or Message
		  //<XPH or LNK or IDI or TXT><Locator> or MSG in fieldText 
		  //Text or Message to be verified in Value
		  int i=0;
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		   String f = fieldText;
		   String val=value;
		     String locatorType=f.substring(0,3);
		     String locatorValue=f.substring(3,f.length());
		       if(locatorType.equalsIgnoreCase("XPH")){
		    	   //System.out.println(driver.findElement(By.xpath(locatorValue)).getText());  
		         if(driver.findElement(By.xpath(locatorValue)).getText().equalsIgnoreCase(val))
		         i=1;
		       }
		       else if(locatorType.equalsIgnoreCase("LNK")){
		      
		        if(driver.findElement(By.linkText(locatorValue)).getText().equalsIgnoreCase(val))
		        i=1;
		         
		         }
		       if(i==0){
		    	   //resultDetails.setErrorMessage(fieldText+" Text is not matching with that of the locator (or) the locator not found");
		    	   resultDetails.setErrorMessage(driver.findElement(By.xpath(locatorValue)).getText()+locatorValue);
		           throw new Exception();
		       }
		  
		
		 
		 }
	 public void WAITFORTHIS_2(WebDriver driver,String fieldText, String value) throws Exception{
         
		  int i=0;
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		   String f = fieldText;
		   String val=value;
		     String locatorType=f.substring(0,3);
		     String locatorValue=f.substring(3,f.length());
		     if(locatorType.equalsIgnoreCase("XPH")){
			        
			        if(driver.findElements(By.xpath(locatorValue)).size()>0)
			        	i=1;
			       }
			       else if(locatorType.equalsIgnoreCase("LNK")){
			      
			        if(driver.findElements(By.linkText(locatorValue)).size()>0)
			        	i=1;
			       }
		       if(i==0){
		    	   resultDetails.setErrorMessage(fieldText+"Locator Not Found");
		          throw new Exception();
		       }
		  
		
		 
		 }
	 
	 public void USERAGREEMENTPAGE( WebDriver driver){
		 try{
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WAITFORTHIS_2(driver, "XPH//*[@id='rules_terms']/h3[starts-with(text(),'Effective Date:')]", "20000");
			 WAITFORTHIS_2(driver, "XPH(//a[@class='helplink terms-and-conditions active'])[2]", "1000");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages useragreement']/descendant::h2", "User Agreement");
			 WAITFORTHIS_2(driver, "LNKPRINT", "1000");
			 VERIFYTHIS_2(driver, "XPH//*[@class='termsData']/descendant::p[@class='rgbold paragraph']", "The EquipmentOne website (\"this Website\") is operated by AssetNation, Inc. (the \"Company\" or \"we\"), a member of the Ritchie Bros. group of companies.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='termsData']/descendant::p[3]", "If you have multiple user accounts, your acceptance of this Agreement on one user account will constitute acceptance of the Agreement on all user accounts then in existence and on all user accounts subsequently created by you. This Website has Website Rules (accessible from the footer of this Website) that apply to your use of this Website, and are incorporated herein by reference. By agreeing to this Agreement, and then subsequently using this Website, you are agreeing to comply with the Website Rules.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='termsData']/descendant::p[4]", "We may amend this Agreement at any time by posting the amended Agreement on this Website. An amended Agreement shall automatically be effective immediately after it is posted on this Website. Your continued use of this Website after our posting of any changes will constitute your acceptance of such changes. This Agreement may not be otherwise amended except in a writing hand signed by you and the Company. Notwithstanding any other provision of this Agreement, for purposes of this provision, a \"writing\" does not include an e-mail message and a signature does not include an electronic signature.");
			 VERIFYTHIS_2(driver, "XPH//div[@class='termsData']/descendant::h4[1]", "Each Assetnation website is only a venue or marketplace");
			 VERIFYTHIS_2(driver, "XPH//*[@class='termsData']/descendant::p[5]", "This Website is only a venue or marketplace for our users to bid, sell and buy many different items. Our role is only to provide a venue for lots, bids and acceptances, and facilitate the exchange of information between buyers and sellers. We are not involved in forming the actual transaction between buyers and sellers, we are not an agent of buyer or seller, and we do not take title to the items at any point in the sales process. Any agreement reached between a buyer and seller with respect to the terms of sale for an item is solely between such buyer and seller. As a result, we have no control over and do not guarantee the quality, safety, or legality of items listed for sale, the truth or accuracy of seller's lot information, the ability of sellers to sell items, the ability of buyers to pay for items, or that a buyer or seller will actually complete a transaction");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='2']/h4", "Disputes between users; release of the company");
			 VERIFYTHIS_2(driver, "XPH//li[@value='2']/../../p", "You agree not to hold the Company responsible for any user's actions or inactions relating to the purchase and sale of items listed on this Website. If you have a dispute with one or more users, you release the Company, its subsidiaries and affiliates, and their respective officers, directors, agents, employees and third party suppliers, from claims, demands and damages (actual and consequential) of every kind and nature, known and unknown, suspected and unsuspected, disclosed and undisclosed, including without limitation those claims, demands and damages based in whole or in part upon the Company's negligence, gross negligence, statutory liability or strict liability, arising out of or in any way connected with such dispute. If you are a California resident, you waive California Civil Code 1542, which says: \"A general release does not extend to claims which the creditor does not know or suspect to exist in his favor at the time of executing the release, which if known by him must have materially affected his settlement with the debtor.\"");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']/h4", "Limitation of liability between buyer and seller");
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']/../../p", "FOR ANY TRANSACTION BETWEEN BUYER AND SELLER, BUYER AND SELLER AGREE AS FOLLOWS:");
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']/../../*[@type='a']/li[1]", "ALL ITEMS LISTED ON THIS WEBSITE ARE SOLD \"AS IS, WHERE IS\" WITH NO WARRANTIES OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE, UNLESS OTHERWISE EXPRESSLY SET FORTH IN THE TERMS OF SALE FOR SUCH ITEM AND LABELED AS A \"WARRANTY.\"");
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']/../../*[@type='a']/li[2]", "IN NO EVENT SHALL BUYER OR SELLER BE LIABLE TO EACH OTHER FOR SPECIAL, INCIDENTAL, INDIRECT, CONSEQUENTIAL OR PUNITIVE DAMAGES OF ANY KIND, OR ANY LOST REVENUE OR ANTICIPATED PROFITS, ARISING OUT OF OR IN CONNECTION WITH SUCH TRANSACTION.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']/../../*[@type='a']/li[3]", "IN NO EVENT SHALL THE LIABILITY OF SELLER TO BUYER, OR BUYER TO SELLER, FOR ANY SUCH TRANSACTION EXCEED THE PURCHASE PRICE OF THE PURCHASED ITEMS AND, IF THE PURCHASED ITEMS HAVE ALREADY BEEN RELEASED TO BUYER, THE REASONABLE LOGISTICS COSTS INCURRED BY BUYER FOR THE TRANSPORTATION AND STORAGE OF THE PURCHASED ITEMS. A PARTY TO A TRANSACTION ON THIS WEBSITE MAY ENFORCE THIS SECTION 3 AGAINST THE OTHER PARTY AS IF IT HAD BEEN AGREED DIRECTLY BETWEEN THE PARTIES THEMSELVES.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']/h4", "Escrow agent");
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']/../../p[1]", "After selection of the winning bid, the winning buyer is required to pay the agreed purchase price and other fees to the Company. In this case, the Company will act as Escrow Agent to hold such funds in escrow (the \"Escrow Funds\") in a separate and segregated bank account used for the Escrow Funds.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']/../../p[2]","With respect to the Escrow Funds and the Company's duties as Escrow Agent to buyer and seller, you agree as follows:");
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']/../../*[@type='a']/li[1]", "The Company is not a principal of or participant in the underlying transaction between buyer and seller. The Company may rely on any written instrument or e-mail reasonably believed by it to be genuine and to have been signed or sent by the proper party or parties, their officers, representatives or agents.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']/../../*[@type='a']/li[2]", "Should any dispute arise between buyer and seller with respect to the Escrow Funds, the Company shall have the right to (i) refrain from taking any action other than to retain custody of the Escrow Funds until it shall have received joint written instructions signed by each of buyer and seller, or a final order, judgment or decree from a court of competent jurisdiction, or (ii) institute a bill of interpleader in any court of competent jurisdiction to determine the rights of the parties. If buyer and seller agree to resolve their dispute over the Escrow Funds through binding arbitration, the Company shall have the additional right to act on the instructions of the appointed arbitrator(s). Should such actions be necessary, or should the Company become involved in litigation or other proceedings of any nature on account of the Escrow Funds solely because it holds the Escrow Funds as Escrow Agent, you agree to pay the Company, in addition to any commissions hereunder, the reasonable attorney's fees incurred by the Company and any other costs and expenses resulting from such actions, all of which may be deducted from the Escrow Funds prior to their disbursement by the Company.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/h4", "lot requirements; license; exclusivity");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../p[1]","When you list items for sale on this Website, you represent and warrant that you have the authority to sell such items, free and clear of any liens, claims or other encumbrances. You further agree to use commercially reasonable efforts to supply accurate information for each lot, and will be solely responsible for the lot information you provide. When you give us content for a lot of items, you grant us a non-exclusive, worldwide, perpetual, irrevocable, royalty-free, sublicensable (through multiple tiers) right to exercise any and all copyright, trademark, publicity, moral, and database rights (but no other rights) you have in the content, in any media known now or in the future.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../p[2]","When you list an item for sale on this Website, you agree that during the period in which the item is posted (the \"Exclusivity Period\"), the Company shall have the exclusive right to sell such item. You further agree that during the Exclusivity Period you will solicit and accept bids on the item only through this Website. If you solicit or accept, through any means other than this Website, any bid on any such item during the Exclusivity Period you agree to pay the Company the Seller Commission Fee and the Seller Default Penalty Fee set forth in the Website Rules, as if such item had been sold through a completed online sale on this Website.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']/h4", "Eligibility and registration");
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']/../../p", "This Website is available only to individuals and entities that can form legally binding contracts under applicable law, and is not available to minors. You represent and warrant that (i) all user information provided during registration is accurate and complete, and (ii) you will update such user information from time to time so that it is kept current, accurate and complete at all times. If you are registering with the Company as a business entity, you represent that you have the authority to legally bind that entity. You are solely responsible for all conduct and transmissions that take place under your user name and password. The Company may ask for additional information at any time to verify your registration information. The Company may, in its sole and absolute discretion, refuse to accept a party's registration.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='7']/h4", "User responsibilities");
			 VERIFYTHIS_2(driver, "XPH//li[@value='7']/../../p[1]", "When using this Website, you agree that you will not do any of the following:");
			 VERIFYTHIS_2(driver, "XPH//li[@value='7']/../../p[2]", "Without limiting other remedies, we may limit, suspend or terminate a user's registration and access to this Website at any time if we believe, in our sole discretion, that you have breached this User Agreement or the applicable Website Rules or Privacy Policy, or otherwise have engaged in any inappropriate behavior on this Website.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='8']/h4", "Disclaimers");
			 VERIFYTHIS_2(driver, "XPH//li[@value='8']/../../p[1]","THIS WEBSITE IS PROVIDED BY THE COMPANY ON AN \"AS IS\", \"AS AVAILABLE\" BASIS.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='8']/../../p[2]","TO THE FULLEST EXTENT PERMITTED BY APPLICABLE LAW, THE COMPANY DISCLAIMS ALL REPRESENTATIONS AND WARRANTIES OF ANY KIND, EXPRESS OR IMPLIED, AS TO THE OPERATION, ACCESSIBILITY OR SECURITY OF THIS WEBSITE, AND THE ACCURACY, COMPLETENESS, CURRENCY OR RELIABILITY OF ANY OF THE CONTENT OR DATA FOUND ON THIS WEBSITE INCLUDING, BUT NOT LIMITED TO, IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NON-INFRINGEMENT.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='8']/../../p[3]","THE COMPANY DOES NOT WARRANT THAT THIS WEBSITE OR THE FUNCTIONS, FEATURES OR CONTENT ON THIS WEBSITE WILL ALWAYS BE AVAILABLE, ACCESSIBLE, UNINTERRUPTED, AND SECURE OR OPERATE WITHOUT ERROR.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='8']/../../p[4]","THE COMPANY EXPRESSLY DISCLAIMS, AND USER RELEASES THE COMPANY FROM, ANY RESPONSIBILITY FOR ANY MISREPRESENTATIONS OR BREACHES COMMITTED BY ANY BUYER OR SELLER.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='9']/h4", "Limitation of liability of company");
			 VERIFYTHIS_2(driver, "XPH//li[@value='9']/../../p[1]","IN NO EVENT SHALL THE COMPANY BE LIABLE FOR ANY LOSS, CLAIM, DAMAGE OR EXPENSE, OR ANY SPECIAL, INCIDENTAL, INDIRECT, CONSEQUENTIAL OR PUNITIVE DAMAGES OF ANY KIND, INCLUDING LOST REVENUES OR PROFITS, DIRECTLY OR INDIRECTLY ARISING OUT OF YOUR USE OF OR INABILITY TO USE THIS WEBSITE.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='9']/../../p[2]","IF, NOTWITHSTANDING THE FOREGOING, THE COMPANY SHOULD BE FOUND LIABLE FOR ANY LOSS OR DAMAGE (WHETHER IN CONTRACT OR TORT) THAT ARISES OUT OF OR IS IN ANY WAY CONNECTED WITH THIS AGREEMENT OR THE USE OF THIS WEBSITE, THE LIABILITY OF THE COMPANY TO YOU OR ANY THIRD PARTY SHALL IN NO EVENT EXCEED, IN THE AGGREGATE, THE GREATER OF (A) THE FEES PAID TO THE COMPANY WITH RESPECT TO THE PARTICULAR TRANSACTION GIVING RISE TO SUCH LIABILITY, OR (B) US$1,000.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='10']/h4", "Indemnification");
			 VERIFYTHIS_2(driver, "XPH//li[@value='10']/../../p", "You agree to indemnify, defend and hold harmless the Company, its subsidiaries, parent companies and affiliates, and their respective officers, directors, employees, agents and third party suppliers (collectively, the \"Company Group\"), from and against any and all claims, losses, damages, liabilities, judgments and fees and expenses related thereto (including, without limitation, reasonable attorneys' fees), brought by or on behalf of any third party against any of the Company Group that arises out of or in connection with:");
			 VERIFYTHIS_2(driver, "XPH//li[@value='10']/../../*[@type='i']/li[1]", "Any breach or violation by you of this Agreement, including, without limitation, any breach of your representations, warranties or covenants contained herein,");
			 VERIFYTHIS_2(driver, "XPH//li[@value='10']/../../*[@type='i']/li[2]", "Any dispute with another user relating to your purchase or sale of items on this Website, or");
			 VERIFYTHIS_2(driver, "XPH//li[@value='10']/../../*[@type='i']/li[3]", "Any personal injury, death or property damage caused by or arising out of the subsequent use of the items sold or purchased by you on this Website.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='11']/h4", "Termination of usage");
			 VERIFYTHIS_2(driver, "XPH//li[@value='11']/../../p","This Agreement is in force until terminated by either you or the Company. If you disagree with this Agreement, your sole remedy is to terminate your use of this Website. Upon any termination of this Agreement, all obligations of either party set forth herein which relate to transactions by such party prior to such termination shall survive such termination and continue in effect, including, without limitation, the provisions of Sections 2, 3, 4, 8, 9 and 10.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='12']/h4", "Privacy policy");
			 VERIFYTHIS_2(driver, "XPH//li[@value='12']/../../p[1]","We do not sell or rent your personal information to third parties for their marketing purposes without your explicit consent. We use your information only as described in our Privacy Policy, which is incorporated herein by reference and made a part of this Agreement. We view protection of users' privacy as a very important community principle. You can access and modify the information you provide us and choose not to receive certain communications by signing in to your account.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='12']/../../p[2]","Your account password is the key that unlocks your account. You should at all times treat it as highly confidential. Your failure to maintain the confidentiality of your password may compromise the privacy of your personal information. It may also subject you to legal and financial liability for actions taken by means of your account. If you believe at any time that your password has been compromised you should immediately change your password and contact customer care.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='13']/h4", "Applicable law and venue; waiver of jury trial");
			 VERIFYTHIS_2(driver, "XPH//li[@value='13']/../../p[1]", "This Site is controlled by the Company from its offices within the State of Texas, United States of America. The laws applicable to the interpretation of this Agreement shall be the laws of the State of Texas, without regard to any conflict of law provisions.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='13']/../../p[2]", "You agree that any action at law or in equity arising out of or relating to this Agreement shall be filed only in the state or federal courts of Harris County, Texas, U.S.A., and that you hereby consent and submit to the exclusive jurisdiction and venue of such courts. No action arising under or relating to this Agreement may be brought by either party more than two years after the cause of action has accrued.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='13']/../../p[3]", "YOU KNOWINGLY, VOLUNTARILY AND INTENTIONALLY WAIVE THE RIGHT TO A TRIAL BY JURY IN ANY LITIGATION ARISING OUT OF, UNDER, OR IN CONNECTION WITH THIS AGREEMENT, YOUR USE OF ANY ASSETNATION WEBSITE OR ANY COURSE OF CONDUCT, COURSE OF DEALING, STATEMENTS (WHETHER VERBAL OR WRITTEN) OR ACTIONS OF ANY PERSON. THIS PARAGRAPH IS A MATERIAL INDUCEMENT FOR YOU AND THE COMPANY TO ENTER INTO THIS AGREEMENT.The scope of this waiver is intended to be all-encompassing of any and all disputes that may be filed in any court and that relate to the subject matter of this Agreement, including without limitation, contract claims, tort claims (including fraud in the inducement), breach of duty claims and all other common law and statutory claims. THIS WAIVER OF JURY TRIAL IS IRREVOCABLE, MEANING THAT IT MAY NOT BE MODIFIED EITHER ORALLY OR IN WRITING, AND THIS WAIVER SHALL APPLY TO ANY SUBSEQUENT AMENDMENTS, RENEWALS, SUPPLEMENTS OR MODIFICATIONS OF THIS AGREEMENT. In the event of litigation, this provision may be filed as a written consent to a trial by the court.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='14']/h4", "Company copyright and trademarks");
			 VERIFYTHIS_2(driver, "XPH//li[@value='14']/../../p[1]", "The trademarks, trade names and all other material contained on this Website, including all portions of this Website, site design, text, graphics, and all intellectual property rights thereto are the sole and exclusive property of the Company or its licensors. Except as expressly permitted hereby, the use of any such intellectual property for any other purpose, or the modification, distribution or republication of such material without the prior written permission from the Company, is strictly prohibited.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='14']/../../p[2]", "Copyright 2000-2013, AssetNation, Inc. Any rights not expressly granted herein are reserved.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='15']/h4", "Electronic communications and agreements");
			 VERIFYTHIS_2(driver, "XPH//li[@value='15']/../../p", "You consent to receive communications from us electronically. We will communicate with you by e-mail or by posting notices on this Website. You also consent to the electronic formation of contracts and agreements between you and us and between you and any other user. You agree that all contracts, agreements, notices, disclosures and other communications that we or any other user provides to or forms with you electronically satisfy any legal requirement that such contracts, agreements, notices, disclosures, and communications be in writing, or that any signature to any contract or agreement be in writing. IF AT ANY TIME YOU NOTIFY US THAT YOU REVOKE THE CONSENTS CONTAINED IN THIS PARAGRAPH, YOUR REGISTRATION ON AND ACCESS TO THIS WEBSITE WILL BE IMMEDIATELY TERMINATED.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='16']/h4", "Notices");
			 VERIFYTHIS_2(driver, "XPH//li[@value='16']/../../p[1]", "Notices shall be given to the Company by e-mail to customercare@equipmentone.com? and by certified mail, return receipt requested, to AssetNation, Inc., Attention: President, 1001 McKinney, Suite 1700, Houston, Texas 77002, or to such other address as may be designated from time to time. Notices to the Company shall be deemed to have been given five days after the date of mailing by certified mail, return receipt requested.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='16']/../../p[2]", "Notices to you will be sent by e-mail to the e-mail address given to the Company when you registered with the Company, or such other e-mail address as you may provide by e-mail to the Company from time to time. Notices to you shall be deemed to have been received 24 hours after the e-mail is sent.");
			 WAITFORTHIS_2(driver, "LNKcustomercare@equipmentone.com", "1000");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/h4", "Miscellaneous");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[1]","Entire Agreement. This Agreement (including the Website Rules and Privacy Policy) constitutes the entire agreement and understanding of the parties in respect of its subject matter and supersedes all prior understandings, agreements, or representations by or among the parties, written or oral, to the extent they relate in any way to the subject matter hereof or the transactions contemplated hereby; provided, however, that if a user has a pre-existing written contract with the Company that may not be amended without the written consent of both parties, then such pre-existing contract shall remain in effect and, to the extent of any conflict with this Agreement, the terms of the pre-existing contract shall control.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[2]","No Agency or Other Relationship. This Agreement does not create, and shall not be construed by the parties or any third person as creating, any agency, partnership, joint venture, or employment relationship between you and the Company. Instead, the relationship of the parties under this Agreement shall be solely that of independent contractors.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[3]","Force Majeure. Neither party hereto shall be liable to the other for any delay in or failure to perform any of its obligations hereunder to the extent performance is prevented or delayed due to causes beyond its control, including, but not limited to, failures of electronic or mechanical equipment or of the Internet or other telecommunications, computer viruses, unauthorized access, acts of God, war, terrorism, fire, severe weather or other natural disasters, or interference or hindrance by any governmental authority.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[4]","Waiver. Our failure to exercise or enforce any right or provision of this Agreement, or any delay on our part in doing so, will not constitute our waiver of such right or provision.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[5]","Assignment. This Agreement may not be assigned by you without the prior written consent of the Company.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[6]","Successors. All of the terms, agreements, covenants, representations, warranties, and conditions of this Agreement are binding upon, and inure to the benefit of and are enforceable by, the parties and their respective successors and permitted assigns.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[7]","Severability. If any provision of this Agreement is held to be invalid or unenforceable, such provision shall be struck and the remaining provisions shall be fully enforceable.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[8]","Headings. Headings are for reference purposes only and shall not affect the meaning or interpretation of this Agreement.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[9]","Third Party Beneficiaries. You agree that every other user with whom you interact on this Website is an intended third party beneficiary of this Agreement.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='17']/../../*[@type='a']/li[10]","Attorney's Fees. In the event that the Company has to file suit against you or otherwise participate in any judicial or other legal proceeding to enforce its rights and your obligations under this Agreement, the Company shall be entitled to recover, and you shall be obligated to pay, in addition to all damages and other forms of relief or recovery awarded to the Company, the Company's reasonable attorney's fee, expenses (including without limitation the expense associated with retaining and employing expert witnesses) and all costs of court.");

			 resultDetails.setFlag(true);
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 resultDetails.setFlag(false);
		 }
		 
	 }
	 public void PRIVACYPOLICYPAGE( WebDriver driver){
		 try{
			
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WAITFORTHIS_2(driver, "XPH//*[@id='rules_terms']/h3[starts-with(text(),'Effective Date:')]", "20000");
			 WAITFORTHIS_2(driver, "XPH(//a[@class='helplink privacy-policy active'])[2]", "1000");
			 WAITFORTHIS_2(driver, "LNKPRINT", "1000");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages policy-para']/descendant::h2", "Privacy Statement");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages policy-para']/descendant::p[1]", "This Privacy Statement describes the privacy practices of AssetNation, Inc., a member of the Ritchie Bros. group of companies (the \"Company\" or \"we\") with respect to the collection, use, and disclosure of personal information, including in respect of the Company's website located at www.equipmentone.com (\"EquipmentOne website\"). This Privacy Statement may be supplemented or modified by agreements entered into between the Company and an individual from time to time.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages policy-para']/descendant::p[2]", "Where we have provided a translation of the English language version of this Privacy Statement, such translation is provided for your convenience only. To the extent there is any inconsistency between the English language version of this Privacy Statement and any such translation, the English language version shall govern.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages policy-para']/descendant::p[3]", "In this Privacy Statement, \"personal information\" means any information about an identifiable individual, excluding any information that has been made anonymous or that is excluded from the definition of \"personal information\" under applicable laws.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages policy-para']/descendant::p[4]", "This statement will notify you of:");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[1]", "What personal information or third party personal information is collected through our website");
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[2]", "How the information is used");
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[3]", "With whom the information may be shared");
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[4]", "What choices are available to you regarding collection, use and distribution of personal information");
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[5]", "The kind of security procedures that are in place to protect the loss, misuse or alteration of personal information under our control");
			 VERIFYTHIS_2(driver, "XPH//*[@class='terms-user']/li[6]", "How you can correct any inaccuracies in your personal information");
			 
			 VERIFYTHIS_2(driver, "XPH//h4[@class='privacypolicyh4']", "Table of Contents");
			 WAITFORTHIS_2(driver, "LNKInformation Collection", "1000");
			 WAITFORTHIS_2(driver, "LNKInformation Use", "1000");
			 WAITFORTHIS_2(driver, "LNKInformation Disclosure", "1000");
			 WAITFORTHIS_2(driver, "LNKSharing", "1000");
			 WAITFORTHIS_2(driver, "LNKUser Registration", "1000");
			 WAITFORTHIS_2(driver, "LNKSpecial Offers, and Site and Service Updates", "1000");
			 WAITFORTHIS_2(driver, "LNKUsage Data", "1000");
			 WAITFORTHIS_2(driver, "LNKCookies", "1000");
			 WAITFORTHIS_2(driver, "LNKWeb Server Traffic Log Files", "1000");
			 WAITFORTHIS_2(driver, "LNKChildren", "1000");
			 WAITFORTHIS_2(driver, "LNKLinks", "1000");
			 WAITFORTHIS_2(driver, "LNKSurveys", "1000");
			 WAITFORTHIS_2(driver, "LNKSecurity", "1000");
			 WAITFORTHIS_2(driver, "LNKChoice / Opt-Out", "1000");
			 WAITFORTHIS_2(driver, "LNKNotification of Changes & Acceptance of Privacy Statement", "1000");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoCollect']", "Information Collection");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoCollect']/../p[1]", "Except where otherwise required or permitted by law, we will inform individuals of the purposes for the collection, use, or disclosure of the individual's personal information prior to collecting, using or disclosing the personal information.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoCollect']/../p[2]","We collect personal information from individuals through various means, including through our websites and through user registration.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoCollect']/../p[3]", "Requirements for consent to collection, use, or disclosure of personal information vary depending on circumstances and on the type of personal information that is intended to be collected, used, or disclosed. In determining whether consent is required and, if so, which form of consent is appropriate, we will take into account both the sensitivity of the personal information at issue and the purposes for which we will use the information. Consent may be express, implied (including through use of \"opt-out\" consent where appropriate), or deemed. For example, if an individual provides his/her mailing address and requests information regarding a particular product, consent to use the address to mail product information to the individual is implied.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoCollect']/../p[4]", "On giving reasonable written notice to the Company, an individual may withdraw consent to the collection, use, or disclosure of his or her personal information. Upon receipt of this withdrawal, we will notify the individual of the likely consequences of withdrawing his or her consent. Except where otherwise required or permitted by law, we will then stop collecting, using or disclosing the individual's personal information.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoUse']", "Information Use");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoUse']/../p[1]", "We use information collected from individuals to provide products or services (including disclosure of personal information to third parties as required to provide those products or services, and as described herein), to respond to requests for information regarding the Company's products and services, and for additional purposes that may be identified at or before the time that the information is collected. The information gathered will be used for general corporate marketing purposes, thereby enabling us to refine and improve our service and better meet our customers' needs.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoUse']/../p[2]", "The information gathered may also be used by the Company to resolve disputes, collect fees, troubleshoot problems, enforce our User Agreement and related policies, and prevent potentially prohibited or illegal activities.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoUse']/../p[3]", "We will not use or disclose personal information for purposes other than those for which it was collected, except with the consent of the individual or as required or permitted by law. Once the information is no longer required to fulfill its intended purposes, and is no longer required or permitted to be retained for legal or business purposes, it will be destroyed, erased, or made anonymous.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']", "Information Disclosure");	
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']/../p[1]", "We are the sole owner of the information collected on this site and will not share or rent this information to others in any way other than as disclosed in this Privacy Statement.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']/../p[2]", "By using this website to buy or sell, you consent to our disclosing relevant contact information of the seller and buyer to each other, or in the event of a dispute between the parties.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']/../p[3]", "We may disclose certain personal information to third parties and to affiliated entities in order to carry out work on behalf of the Company or in connection with the operation of affiliated or hosted marketplace venues. We will take appropriate steps to ensure that such recipients safeguard the personal information and use the information only for authorized purposes. If we partner with another party to provide specific services, and a user registers for these services, we will share the contact information or other information necessary for the third party to provide the requested services.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']/../p[4]", "We may also disclose personal information to legal, financial, and other professional advisors and to our lenders or insurers in connection with the operation of our business, or in connection with the sale or reorganization of all or part of our business or operations. In respect of our fraud detection and prevention efforts or the investigation of unlawful activities, we may collect and disclose personal information in cooperation with law enforcement authorities. We may also collect and provide personal information to other third parties in response to a subpoena, court order or substantially similar legal procedure, or when we in good faith believe disclosure is required by any applicable law, regulation or legal process.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='InfoDisclosure']/../p[5]", "By using the EquipmentOne website, you agree to allow us to use your remarks, suggestions, writings or comments as we so determine without your further consent and without compensation or any other interests or rights. However, we will not identify the specific source of the comments by name or email address without your permission. You also agree that we will not be liable for use or acquisition of your information by any third party without our knowledge or consent.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Sharing']", "Sharing");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Sharing']/..", "Sharing"+"\n"+"We may share aggregated demographic information with our partners and affiliates. This is not linked to any personal information that can identify any individual person.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Registration']", "User Registration");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Registration']/../p[1]", "To use certain areas of this website, a user must first register and accept the User Agreement. By accepting the User Agreement, you expressly consent to our collection, storage, use and disclosure of your personal information as described in this Privacy Statement, and in particular, after you accept the User Agreement, you expressly consent to our collecting and storing the following personal information:");
			 VERIFYTHIS_2(driver, "XPH//*[@class='policy-user-reg']/li[1]", "e-mail address, physical contact information, and (depending on the service used) sometimes financial information, such as credit card or bank account numbers;");
			 VERIFYTHIS_2(driver, "XPH//*[@class='policy-user-reg']/li[2]", "transactional information based on your activities on our websites (such as buying and selling), and correspondence sent to us in connection with these activities;");
			 VERIFYTHIS_2(driver, "XPH//*[@class='policy-user-reg']/li[3]", "if you are a seller, we collect information relating to the item you desire to post for sale and related identifying information; and");
			 VERIFYTHIS_2(driver, "XPH//*[@class='policy-user-reg']/li[4]", "other information from your interaction with this website, or our services, content and advertising, including computer and connection information, statistics on page views, traffic to and from this website, IP address and standard web log information");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Registration']/../p[2]", "Registration and the provision of this information are required to access some areas of the website. Visitors who do not input the required information will not have access to these areas.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Special']", "Special Offers, and Site and Service Updates");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Special']/../p[1]", "We may send registrants site and service announcement updates, and information regarding new or improved services and upcoming events that we think may be of interest to them. We may communicate with a user to provide requested services or with respect to their account via email or phone.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Usage']", "Usage Data");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Usage']/../p[1]", "The website also collects other information through some of the features available on the site. Information including unique ID, access time, search parameters and visitor feedback is collected.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']", "Cookies");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']/../p[1]","A cookie is a piece of data containing information about a user and is stored on the user's hard drive. Use of a cookie is in some ways linked to personal information while on our site - see details above. The cookies have long term expirations to provide convenience to users so that a user has to log in a password only once while on our site. If a user rejects the cookie, they will be able to use our site, but will be unable to access some areas. Cookies also enable us to track the interests of our users, allowing us to personalize and enhance their experience on our website. We offer certain features that are available only through the use of cookies, and use cookies to help identify you and maintain your signed-in status. Most cookies are \"session cookies,\" meaning that they are automatically deleted from your hard drive at the end of a session. You are always free to decline our cookies if your browser permits, although doing so may interfere with your use of some of our websites or services.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']/../p[2]","If permitted by your computer and browser settings, we will place cookies on your computer as you browse the EquipmentOne.com to gather non-personally identifiable information, which may include your computer’s IP address, browser type, the webpage you were visiting prior to accessing the EquipmentOne.com, and other statistics. We use information collected from cookies so that we can understand what sort of information you are interested in, which enables us to display advertising on your computer based on these interests.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']/../p[3]","We use trusted third-party advertising companies, including without limitation Google Analytics, to serve ads when you visit our website. These companies may use anonymized information collected through the use of cookies (not including your name, address, email address, telephone number, or any other personally identifiable information) about your visits to this and other websites in order to provide advertisements about goods and services of interest to you. This means that when you are on websites other than the EquipmentOne.com, you may be shown advertising based on your activity on the EquipmentOne.com. We do not share any information with third parties that directly identifies you.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']/../p[4]","You can opt out of Google Analytics for Display Advertising by visiting https://www.google.com/settings/ads.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Cookies']/../p[5]","You can learn more about behavioral advertising and opt out of third-party behavioral advertising by visiting www.youradchoices.com.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='TLF']", "Web Server Traffic Log Files");
			 VERIFYTHIS_2(driver, "XPH//*[@id='TLF']/../p[1]","Web server logs collect visitor information including IP address, browser type and version, referring URLs, referring search engines and specified search strings. This information helps us design improvements to the services and navigational structure of our website.");
			 
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Children']","Children");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Children']/../p[1]","We do not attempt to collect personal information from children.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Children']/../p[2]","Note that we cannot always determine if a user of our website is a child.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Links']","Links");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Links']/../p[1]","This website contains links to other sites, including sites maintained by our corporate partners for the provision of online payment services and online shipping quotes. Please be aware that we are not responsible for the privacy practices of such other sites. We encourage our users to read the privacy statements of all websites that collect personal information.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Surveys']","Surveys");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Surveys']/../p[1]","Occasional surveys may be conducted on the EquipmentOne website. Survey information will be used to help us monitor and improve the use of this site and our services.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='Security']/../h3","Management of Personal Information:");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Security']","Security");
			 VERIFYTHIS_2(driver, "XPH//*[@id='Security']/../p[1]","Your information is stored on our servers located in the United States. We use a number of tools (passwords, physical security, etc.) to protect your personal information against unauthorized access and disclosure. As you may be aware, however, third parties may unlawfully intercept or access transmissions or private communications, and other users may abuse or misuse your personal information that they collect from our websites. Therefore, although we work very hard to protect your privacy, we cannot ensure or warrant that your personal information or private communications will always remain private.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='OptOut']","Choice / Opt-Out");
			 VERIFYTHIS_2(driver, "XPH//*[@id='OptOut']/../p[1]","Our users are given the opportunity to \"opt-out\" of having their information used for purposes not directly related to the purchase of services or products using our websites. Our online registration process has an opt-out provision, which allows the user to select that the information not be provided to any companies other than the Company. Registered users who no longer wish to receive promotional or other informational material from us may also opt-out of receiving these communications by replying to unsubscribe in the subject line in the e-mail or e-mail us at customercare@equipmentone.com.");
			 WAITFORTHIS_2(driver, "LNKcustomercare@equipmentone.com", "1000");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@id='ChangePrivStmt']","Notification of Changes & Acceptance of Privacy Statement");
			 VERIFYTHIS_2(driver, "XPH//*[@id='ChangePrivStmt']/../p[1]","By using the EquipmentOne website and services, you signify your acceptance of this Privacy Statement.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='ChangePrivStmt']/../p[2]","We reserve the right to modify this Privacy Statement at any time. Your continued use of any portion of the EquipmentOne website following notification or posting of such changes will constitute your acceptance of those changes.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='ChangePrivStmt']/../p[3]","If we change our privacy practices, we will post those changes to our Privacy Statement web page and update the date listed on the links to it, as well as on the statement itself. We will post those changes so users are always aware of what personal information we collect, how we use it, and under what circumstances, if any, we disclose it. We may from time to time provide notice of changes to this Privacy Statement by email or mail, or to other contact information provided by you.");
			 VERIFYTHIS_2(driver, "XPH//*[@id='ChangePrivStmt']/../p[4]","We use personal information in accordance with the Privacy Statement under which the personal information was collected. If at any point we decide to use personal information in a manner different from that currently stated, we will notify users. Users will have a choice as to whether or not we use their personal information in this different manner.");
			 resultDetails.setFlag(true);
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 resultDetails.setFlag(false); 
	       }
	
      }
	 public void WEBSITERULESPAGE( WebDriver driver){
		 try{
			//VERIFYTHIS_2(driver, "", "");
			 //WAITFORTHIS_2(driver, "", "");
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WAITFORTHIS_2(driver, "XPH//*[@id='rules_terms']/h3[starts-with(text(),'Effective Date:')]", "20000");
			 WAITFORTHIS_2(driver, "XPH(//a[@class='helplink website-rules active'])[2]", "1000");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages websiterules-para']/descendant::h2", "Website Rules");
			 WAITFORTHIS_2(driver, "LNKPRINT", "1000");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages websiterules-para']/descendant::p[1]","Welcome to EquipmentOne. This website is operated by AssetNation, Inc., a Ritchie Bros. company (the \"Company\").");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages websiterules-para']/descendant::h3","Application of these rules");
			 VERIFYTHIS_2(driver, "XPH//*[@class='row terms-pages websiterules-para']/descendant::p[2]","Your use of this website is subject in all respects to the User Agreement (the \"User Agreement\") which must be accepted by you to be a registered user of this website. By agreeing to the User Agreement, and then subsequently using this website, you are agreeing to comply with these Website Rules. We may amend these Website Rules at any time by posting the amended Website Rules on this website. Your continued use of this website after our posting of any changes will constitute your acceptance of such changes. These Website Rules govern the use of this website by all users. However, some provisions of these Website Rules apply specifically to Buyers, and some provisions apply specifically to Sellers. You are a \"Seller\" if you are offering, or intend to offer, Items for sale through a Lot on this Website. You are a \"Buyer\" if you are submitting Bids on an Item in a Lot. In addition, you are subject to the Lot Terms for any specific Items on this website for which you submit Bids. In case of any conflict between the Lot Terms of any specific Items or Lots and these Website Rules, the specific Lot Terms shall govern. These Website Rules and any Lot Terms are intended to be for the benefit of the Company, Buyers, and Sellers.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']", "Lot requirements");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[1]","When a Seller lists goods, equipment or assets (\"Items\") for sale on this website, the Seller represents and warrants that the Seller has the authority to sell such Items, free and clear of any liens, claims or other encumbrances. Any Item that is approved and published on the website is referred to as a \"Lot.\"");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[2]","Buyers and Sellers are responsible for compliance with all applicable statutes, laws, rules, regulations and ordinances, including without limitation, those pertaining to licensing, title transfer, emission standards, registration, and import/export.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[3]","The Company reserves the right to conduct searches or use other means available, as deemed necessary by the Company, for the disclosure of liens and encumbrances, and to contact creditors to determine amounts of any liens and encumbrances claimed against the Items. However, in no case shall the Company have a duty to conduct such searches, nor shall the Company be responsible for the result of any such searches. The Company will not accept an Encumbered Item to be published on the website as a Lot, unless the Seller first provides to the Company (i) a payoff letter from the lienholder authorizing the sale and acceptance of responsibility to release the lien after the sale, (ii) a Seller Document Administration Fee, as described below, and (iii) a Reserve amount that is sufficient to cover the payoff amount and any additional fees or commissions owed to the Company. Notwithstanding any other provision of these Website Rules to the contrary, no Seller may agree to sell an Encumbered Item below an amount sufficient to cover the amount of all outstanding liens and the Seller Document Administration Fee and any additional fees or commissions, unless the Seller has deposited with the Company such additional amounts as may be required to satisfy all outstanding liens and the Seller Document Administration Fee and any additional fees or commissions.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[4]","Items, the ownership of which is evidenced by a title, certificate of title or similar document (which will be collectively referred to as \"Title Document\"), whether or not mandated by any applicable law, will be referred to as \"Titled Assets.\" For Titled Assets, the Seller must provide to the Company a legible copy of the Title Documents, satisfactory to the Company in its sole discretion, prior to the Company’s acceptance of the Item to be published on the website as a Lot. The Company may require documentation to establish proper ownership prior to taking lots live on the marketplace.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[5]","Sellers are not permitted to advertise Items in a Lot that are not offered for sale in that Lot or in another Lot posted contemporaneously on the website. Prohibited activities include, but are not limited to, offering additional quantities of an Item or additional Items to a successful Buyer to be purchased outside of the website. The Company reserves the right to remove from the Lot information any advertising or solicitation for any Items that are not included for sale in the Lot or in another Lot posted contemporaneously on the website.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[6]","A Seller further agrees to use commercially reasonable efforts to supply accurate information for each Lot, and will be solely responsible for the Lot information that a Seller provides. From the information a Seller provides regarding a Seller’s Items, the Company will prepare and send the Seller the Lot for the Seller’s review prior to posting on this website, and if no response is received from the Seller within twenty-four (24) hours after being sent, the Lot will be deemed to be approved by the Seller, and the Company may publish the Lot to the website for the purpose of soliciting Bids. A Seller agrees that they will not operate or modify the Item, or permit anyone to operate or modify the Item, in any manner, after the Lot is published to the Website that could make inaccurate the information that the Seller provided for each Lot.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[7]","\"Listing Period\" means that period of time during which a Lot has been published to the website and is available for Buyers to submit Bids. A Seller agrees that during the Listing Period the Seller will not remove the Items from the Lot. If, for any reason, a Seller refuses to complete the sale of a listed Item, they will be subjected to the Seller Default Penalty Fee described below.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[8]","During the Listing Period, the Seller may not change the Lot description without the Company’s approval. In very limited circumstances, the Company may permit Sellers to extend the Listing Period, or to add additional non-material descriptive information, such as pictures or text, or correct inaccuracies, which do not materially change the original Lot description. If material changes are needed to correct inaccuracies in a Lot description, however, the Lot will be terminated and may be subsequently re-listed as appropriate, at the discretion of the Company.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='1']/../../p[9]","Notwithstanding the foregoing, the Company reserves the right to permanently withdraw any Lot from the website at any time for any reason at its sole discretion.");
		
			 VERIFYTHIS_2(driver, "XPH//li[@value='2']", "Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='termsltsemi-bold'])[1]","2.1. Sellers");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[1]/h4)[1]","2.1.1. Seller Commission Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[1]/p)[1]","For Items sold by a Seller on the website, the Seller will pay the Company a commission (deducted from the escrowed Purchase Price) as agreed to by the Seller. \"Purchase Price\" means the accepted Bid for an Item.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[2]/h4)[1]","2.1.2. Seller Listing Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[2]/p)[1]","For any Lot submitted by a Seller, the Company may charge the Seller a non-refundable Listing Fee, which must be paid by the Seller prior to submission of the Lot to the Company.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[3]/h4)[1]","2.1.3. Seller Document Administration Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[3]/p)[1]","The Company may charge the Seller a fee, per Lot, to assist in the payoff of any outstanding liens or encumbrances against an Item. This fee must be paid by the Seller prior to the approval and publishing of the Lot to the website. The fee is applicable to each Lot, each Item with a lien or encumbrance is subject to the fee.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[4]/h4)[1]","2.1.4. Seller Default Penalty");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[4]/p)[1]","A Seller will be placed in Default for failing to comply with the Lot Terms, the User Agreement or these Website Rules, and must pay the Company a Seller Default Penalty. Specifically, but without limitation, a Seller will be placed in Default for (i) removing the Item from the Lot during the Listing period, (ii) failing to deliver the Item to the winning Buyer by the Removal Deadline stated in the Lot Terms, (iii) making any misrepresentation or taking or failing to take any action that results in compensation being due to the Buyer. If a Seller defaults during the Listing Period, the Seller will pay the Company a Default Penalty Fee of 25% of the highest Bid, with a minimum of $100, per defaulted lot. If a Seller defaults after the Bid has been accepted, then the Seller will pay the Company a Default Penalty Fee of 25% of the Purchase Price, with a minimum of $100, per defaulted lot. If the Seller defaults by making a misrepresentation or taking or failing to take action that results in compensation being due to the Buyer, in addition to the Default Penalty Fee defined by this section, the Seller will owe the Company a Seller’s Commission calculated on original Purchase Price, without reduction for the amount of compensation paid to the Buyer. The Company shall have the right to withhold the amount of the Default Penalty Fee and any refunds from the Escrow Funds of the sale. The Company reserves the right to terminate any other Lots at the Company’s discretion.");
		 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='termsltsemi-bold'])[2]","2.2. Buyers");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[1]/h4)[2]","2.2.1. Buyer’s Premium Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[1]/p)[2]","For any Lot for which the Buyer’s Bid is accepted, the Buyer agrees to pay the Company a Buyer’s premium that is either (1) a percentage of the Purchase Price for such Items or (2) a flat amount. The Buyer’s Premium Fee for each Lot is disclosed either in the Lot Terms for the Lot or in the Buyer’s Bid confirmation box when the Buyer enters a Bid for the Item.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[2]/h4)[2]","2.2.2. Buyer Late Fee");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[2]/p)[2]","If the successful Buyer does not pay the Purchase Price, Buyer’s Premium Fee, and other fees and amounts (including taxes, if any) to the Company by the specified deadline, then, in addition to any other remedies available to the Company or to the Seller, the Buyer must pay to the Company a late fee that will be shown on the invoice.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[3]/h4)[2]","2.2.3. Buyer Default Penalty");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist website-subul-list']/li[3]/p)[2]","A Buyer will be placed in Default for failing to comply with the Lot Terms, the User Agreement or these Website Rules, and must pay the Company a Buyer Default Penalty. Specifically, but without limitation, a Buyer will be placed in Default for (i) failure to make full payment of the Purchase Price, the Buyer’s Premium Fee, and the Buyer Late Fee if applicable, and any other related fees and taxes, if applicable, within five (5) business days after acceptance of the successful Bid, or (ii) failure to either remove the Items or assume control of the Items by the Removal Deadline stated in the Lot Terms. Pending payment of the Buyer Default Penalty, the defaulting Buyer will be barred from placing a Bid on any other Lots on this and any other affiliated website operated by the Company. The defaulting Buyer may be subject to other claims, damages and liabilities to the Seller and to the Company, including, but not limited to, any accrued storage fees, and payment of the difference in sale price in the event the Company must re-list the Item and the resale results in a lower winning Bid amount for the Seller. The Buyer authorizes the Company to withhold any default penalties and other applicable charges from monies previously paid by the Buyer, on the Buyer’s behalf or subsequent to the Buyer being placed in Default, at the Company’s sole discretion. Buyers that are placed in Default on three (3) separate occasions in a twelve (12) month period may be subject to a one (1) year ban from placing a Bid on any Lot on this and any other affiliated website operated by the Company. Should a Buyer be banned from the marketplace, all outstanding penalties and fees must be paid in full prior to reinstatement. Notwithstanding the foregoing, the Company, at its sole discretion, may permanently ban or deactivate any Buyer for any reason.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ollist website-subul-list']/li[3]/p[2]","The Buyer Default Penalty will be 10% of the accepted high Bid of the Lot, with a minimum of $100 per defaulted Lot and a maximum of $2,000 per defaulted Lot.");
 
			 VERIFYTHIS_2(driver, "XPH//li[@value='3']", "Procedures for submitting a bid on a lot");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[1]","3.1. Online Negotiation Engine Formats");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::p[1]","During the Listing Period, Buyers are invited to submit Bids for listed Items. Buyers can only submit Bids higher than Bids already made. Buyers may not submit Bids that include changes to the Lot Terms or other terms of sale. The leading Bid amount, next minimum Bid required and a detailed Bid history for the Lot is displayed to the public. For any completed Lot, the successful Bid is displayed, but the successful Buyer's identity is not publicly disclosed on our website.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[2]","3.2. Types of Bid Submissions");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='websiterules-h4']/p","On each Lot, the Buyer will choose how to submit their Bid, either as a \"Max Bid\", an \"Exact Bid\", or, if available, a Buy It Now Bid.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='websiterules-h4']/ul/descendant::p[1]","3.2.1. Max Bid: When a Buyer submits a Max Bid, the system will automatically submit Bids on behalf of the Buyer until either the Buyer’s Bid is the highest Bid, in accordance with the required published increments, or the Buyer’s Max Bid has been reached, whichever comes first. The Company reserves the right to stop the Max Bid from incrementing, at the last entered Bid, if the Buyer is placed in default, deactivated or otherwise violated the User Agreement, these Website Rules, or any Lot Terms.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='websiterules-h4']/ul/descendant::p[2]","3.2.2 Exact Bid: When a Buyer submits an Exact Bid, the system will place that Bid at the exact price submitted by the Buyer. The Exact Bid must be at least the minimum required Bid increment and higher than the leading high Bid.");
			 VERIFYTHIS_2(driver, "XPH//*[@class='websiterules-h4']/ul/descendant::p[3]","3.2.3 Buy It Now Bid: For each Lot, the Seller may publish a \"Buy It Now Price.\" If a Buyer submits a \"Buy It Now Bid\" equal to the Buy It Now Price, the Seller is obligated to accept the Buy It Now Bid and complete the sale. A Buyer that submits a Buy It Now Bid will immediately end the Listing Period. For any Lot, the Buy It Now Price may be withdrawn at any time during the Listing Period so long as no Buyer has submitted a Buy It Now Bid equal to the Buy It Now Price. After the Buy It Now Price has been withdrawn, Buyers will not be permitted to submit a Buy It Now Bid.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[3]","3.3. Dynamic Closing Interval");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[3]/../p","Every Lot will have a Dynamic Closing interval. This interval will vary from Lot to Lot and will be published in the Bid console. Any market leading Bid, or Bid that matches the market leading Bid, by a Buyer within the Dynamic Closing interval will cause the Lot Period to be extended. The new closing time will be established by adding the Dynamic Closing interval to the time of the market leading Bid submission. There is no limit to the number of times a Lot may be extended in this situation.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[4]","3.4. Bid Acceptance Period");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[4]/../p[1]","The \"Bid Acceptance Period\" is defined as the period from the end of the Listing Period to the acceptance of the Bid.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[4]/../p[2]","If the Seller has committed to sell the Item, as evidenced by the wording \"Reserve Met\" on the Lot, at the end of the Listing Period the highest Bid will automatically be accepted, the Buyer that submitted the highest Bid will be the successful Buyer, and the Bid Acceptance Period will end immediately. Likewise, if the Buy It Now Price has been met with a Buy It Now Bid, the Listing Period will end, the Buy It Now Bid will automatically be accepted, the Buyer that submitted the Buy It Now Bid will be the successful Buyer, and the Bid Acceptance Period will end immediately. Once a Bid has been accepted, both the successful Buyer and the Seller are obligated to complete the sale.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[4]/../p[3]","At the close of the Listing Period, if the Item does not say \"Reserve Met\", then the Seller is not obligated to accept any Bids received on the Lot. In this case, the Seller does have the right to accept the highest Bid which was submitted on the Lot, or the Seller may reject all Bids. The amount of time during the Bid Acceptance Period allotted to the Seller to review and either accept or reject Bids is usually two (2) business days, and will usually be included in the Lot Terms. If the Seller rejects the Bids, the Seller may not re-list the Item on the Website for a period of fourteen (14) days after the end of the Bid Acceptance Period of the Lot. Once the Bid Acceptance Period has expired, the Buyer is no longer obligated to purchase the Item. However, if the Bid Acceptance Period expires, and the Buyer subsequently agrees to purchase the Item at their high Bid, then the Buyer is obligated to fund and complete the transaction.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[5]","3.5. Binding Bids");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[5]/../p","All Bids submitted by Buyers on listed Items are legally valid and binding. Bids are binding from the time of submission through the end of the Bid Acceptance Period. If a Buyer's Bid is accepted, the Buyer is obligated to complete the transaction. Buyers agree that submitting a Bid for Items listed for sale on this website is the legal equivalent of a firm purchase order.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[6]","3.6. Non-Retractable Bids");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[6]/../p","A Buyer may not retract a Bid once it is submitted. Buyers should carefully review their Bids prior to submitting them. If a clear typographical error is made, the Buyer must immediately notify the Company by telephone. Notifications must be received no later than one hour after the erroneous Bid is placed. The Company reserves the right to approve or deny any Bid retraction requests, and a retraction may result in default proceedings against the Buyer.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[7]","3.7. Seller Sales Agreement and Electronic Signature");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[7]/../p","When a Buyer places a Bid on a Lot, the Buyer is accepting and agreeing to the Lot Terms. In addition to the Lot Terms, certain Sellers may require a Buyer to accept and agree to a Seller Sales Agreement or Bill of Sale (collectively, \"Seller Sales Agreement\") that is a contract between the Buyer and the Seller. In the case of a Lot that requires agreement to a Seller Sales Agreement, the Buyer will be presented the Seller Sales Agreement at the time of Bid submission. It is solely the Buyer’s responsibility to read and understand the terms of the Seller Sales Agreement. When a Buyer confirms a Bid and accepts the terms of any required Seller Sales Agreement, this action constitutes an electronic signature, which is fully binding and is as enforceable as original signatures written on actual paper.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[8]","3.8. Void Bids");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[8]/../p","The Company reserves the right to reject or void any Bids which the Company believes have not been made in good faith, are intended to manipulate the Bidding process, or are prohibited either by applicable law or the Lot Terms for such Lot. A Bid that is voided may result in default proceedings against the Buyer.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[9]","3.9. Use of the Question and Answer Board");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[9]/../p","The Question and Answer board is provided as a means to allow Buyers and Sellers to clarify Lot information or to gain additional information about the Lot. The Company retains the right to moderate any Question and Answer, and refuse to post the message to the website. The Company may provide an Answer if the Question is already available in the Seller provided information. The Company will request an Answer from the Seller, if appropriate; however the Seller is responsible for deciding whether to provide an Answer and is solely responsible for the information provided in the answer. The Company makes no representations or warranties that questions submitted to the Question and Answer board will be answered. Any Question that is answered, and approved to be posted by the Company, will be publicly displayed for all users. Buyers and Sellers will not use the Question and Answer board to negotiate additional terms or to attempt to transact outside the website. Buyers are cautioned not to include any personal information when submitting questions. The Company reserves the right to modify questions prior to publishing questions and any answers on the website.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[10]","3.10. Technology Malfunction");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[10]/../p","If a technology malfunction materially affects the outcome of a Lot, the Company reserves the right to void the Lot. Should a technology malfunction result in Buyers being unable to access the site for purposes of reviewing Lots or placing Bids on Lots, the Company, in the Company’s sole discretion, reserves the right to extend the Listing Period, re-open closed Lots, or otherwise modify Lots on the site so as to ensure a fair and transparent marketplace for all participants.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[11]","3.11. Fair Bid and Listing Practices");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[11]/../p","Sale price manipulation of any kind by users is strictly prohibited, including, without limitation, placing a Bid through a secondary account or other party, by communicating with other Buyers, or by placing a shill Bid. Buyers or Sellers who do not act in good faith or otherwise subvert the integrity of the Company’s marketplace on this website are subject to Default Penalties, suspension, and termination of use. Sellers may not place Bids, directly or indirectly, on their own Lots. The Company reserves all of its rights, including without limitation contractual, legal, equitable and statutory rights, against any users that violate this section. The Company will pursue all remedies, including without limitation damages, injunctive relief, and attorney fees and costs, against any user that violates this section.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[12]","3.12. Pre-Qualified Buyer Lots");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist terms-e1lists'])[3]/descendant::h4[12]/../p","The Company may choose to limit a designated Lot to pre-qualified Buyers who may be required to place a specified amount on deposit with the Company, or otherwise meet certain business requirements identified by the Seller, prior to being authorized to submit Bids on the Lot. Prior to being invited to place a Bid on such Items, Buyers may be required to pay the deposit amount to the Company by wire transfer. The Company, in certain circumstances, and in the Company’s sole discretion, may charge the Buyer’s credit card as a means of entering the deposit, provided, however, that the Buyer provide written authorization to do so. Additional qualifications will be described in the Lot Terms. Only pre-qualified Buyers will be allowed to place Bids during the Listing Period. At the end of the Listing Period, the Company will promptly return the deposit, if any, to all unsuccessful Buyers, less any amounts that may be owed to the Company. If the successful Buyer for a Lot defaults by failing to pay the Purchase Price, Buyer’s Premium Fee, and all other fees, taxes and assessments, if any, the deposit amount of such Buyer will be forfeited and the Seller may exercise such other rights and remedies as are available under applicable law. In the event of such default, Buyer will remain liable to the Company to the extent that the Default Penalty described above exceeds the deposit amount.");
		 
			 VERIFYTHIS_2(driver, "XPH//li[@value='4']", "Settlement - payment and escrow process; removal process");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[1]/h4)[1]", "4.1. Invoice and Payment");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[1]/p)[1]", "At the conclusion of the Listing Period and upon the acceptance of the successful Bid by the Seller, the Company will promptly e-mail the successful Buyer an Invoice to the Buyer's registered e-mail address. The successful Buyer may also view the Invoice in their MyOne account. The successful Buyer is required to pay the Purchase Price, Buyer’s Premium Fee, and other fees and taxes, if any, to the Company prior to the deadline specified in the Invoice (generally within three (3) business days of the Bid acceptance). The Company will act as Escrow Agent to hold such funds in escrow (the \"Escrow Funds\") in a separate and segregated bank account used for the Escrow Funds. The Company shall be entitled to hold the Escrow Funds in an interest-bearing bank account and shall be entitled to the interest accruing thereon, without any duty to account for the interest to Buyers or Sellers.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[2]/h4)[1]", "4.2. Removal");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[2]/p)[1]","Each Lot will have a scheduled removal deadline set forth in the Lot Terms (the “Removal Deadline.”) The winning Buyer is required to remove the Items from the location identified on the Release Document on or before the Removal Deadline. The Buyer is deemed to assume control of any and all Items which are not removed from the location by the Removal Deadline, and is responsible for coordinating any storage or extended removal logistics directly with the location. Buyer and Seller agree to work collaboratively to facilitate a timely and professional removal process. Buyer agrees that the Removal Deadline is a material term of their agreement concerning the use of the website and any Lot in which Buyer submits a Bid. Buyer further agrees that their failure to either remove the Items or assume control of the Items by the Removal Deadline will be a material breach of Buyer’s agreement with both the Company and Seller, and will subject Buyer to the Buyer Default Penalty, as well as possible storage fees and administrative fees, as appropriate.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[2]/p)[2]","For each Lot, upon the Buyer’s payment of the Purchase Price, Buyer’s Premium Fee, and other fees and taxes, if any, due the Company, the Company will e-mail the successful Buyer, Seller, and, if necessary, the storage location a release document (\"Release Document\"). This document must be signed and returned to the Company by both Buyer and Seller indicating successful removal of the Items. Failure to return a signed Release Document may result in the Company not releasing Buyer documents, such as a Title Document, or proceeds from the sale to the Seller.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ullist']/li[2]/p)[3]","If the Seller, storage location, or other party notifies the Company that the Buyer has failed to remove the Items or assume control over the Items by the Removal Deadline, the Buyer will be placed in Default, and will be subject to the Buyer Default Penalty and applicable Buyer Default rules. In addition to the Buyer Default Penalty, the defaulting Buyer will forfeit all rights to the Items (which may be resold to a third party by the Seller) and may be subject to other claims, damages and liabilities to the Seller and to the Company, such as storage fees, administrative fees, the amount of any reduction in sales price upon resale of the Items by the Seller, and any applicable fines. Pending payment of the Buyer Default Penalty and any other assessed claims, damages, liabilities, and fees, the defaulting Buyer will be barred from submitting a Bid on any other Lots on this and any other affiliated website operated by the Company.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[3]/h4", "4.3. Escrow Process");
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[3]/p", "The Buyer authorizes the Company to distribute to Seller, or Seller's designee, the Escrow Funds (less our agreed commission, any agreed fees for other services, if applicable, the amount required to discharge and satisfy all charges, liens, claims and encumbrances against the Items, any Default Penalty Fees, any Buyer refunds, and any applicable taxes payable on our services) after the Dispute Initiation Period (defined in section 4.6.2 below) has passed. Any deviation from the foregoing requires prior written approval from the Buyer, Seller and Company. Once the Company disburses the Escrow Funds in conformity with the requirements of these rules, the Company shall be relieved of all further liability with respect to the Escrow Funds, and the Buyer and Seller must deal directly with each other concerning the Escrow Funds. The Company will not release any Escrow Funds while there is a valid, pending and unresolved Dispute related to the Lot. The Company will not consider any Dispute valid if the Buyer has not complied with the rules regarding Disputes set out in section 4.6 below.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[4]/h4", "4.4. Seller Making Items Available");
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[4]/p", "If the Buyer notifies the Company that the Seller did not make the Items available by the scheduled Removal Deadline, the Company will notify both parties and refund the Escrow Funds to Buyer within ten (10) days after we send the notice, if the parties cannot agree to a removal schedule. In the event that the Company refunds the Buyer in accordance with this section, the Seller will pay the Seller Default Penalty Fee, in addition to any other fees the Company would have earned had the transaction completed.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[5]/h4", "4.5. Title Transfer Process");
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[5]/p", "Not all Items are Titled Assets and not all transactions will result in the transfer of a Title Document. Buyers must review the Lot Terms to determine whether the transfer of a Title Document is applicable. For Titled Assets the transfer of the Title Document may occur as follows:");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[1]/p", "4.5.1. Unless otherwise noted in the Lot Terms, the Seller will convey the Title Document to the Buyer at the time of removal of the Item. If the Buyer chooses to have a removal or transport agent remove the Item or their behalf, the location may provide the Title Document to Buyer’s agent at the time of removal. If the Buyer or Buyer’s agent misplaces or loses the Title Document, the Seller and the Company are not responsible for replacing the Title Document. In some instances, the Seller may be willing to request a duplicate, but it is not guaranteed, and any costs for duplicate will be responsibility of the Buyer. No compensation for delays will be provided.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[2]/p[1]", "4.5.2. In certain circumstances, and as disclosed in the Lot Terms, the Company will hold the Title Document until the Buyer completes all the requirements of the Lot Terms and these Website Rules. Titles sent to Buyers by the Company will be placed, by default, into the registered company name of the Buyer as shown exactly on their registered user account record. Buyers are solely responsible for ensuring that their registered user account information is accurate. If a Buyer’s registered account does not have a company name, then the title will be placed into the Buyer’s personal name, as it is noted in their registered user account. Buyers who register with a company name but desire to take title in their personal name must notify the Company in writing by sending their request to titles@ritchiebros.com within 5 days of being invoiced. The email must reference the Lot number and provide specific instructions on how you desire title to the unit to be taken. Title Documents will not be sent to the Buyer unless and until the Company has received a Release Document, executed by the Buyer and the Seller, which serves as evidence that removal of the Titled Asset has occurred. The Buyer must also provide any other documentation required in the Lot Terms, including but not limited to a fully executed Equipment Sales Agreement, export documentation, etc. Title Documents will not be conveyed to the Buyer until all required documentation is received from the Buyer. Buyers are required to send all necessary documentation to Company to the attention of the Title Clerk in a timely manner to receive the Title Document. If the Buyer fails to return all completed documentation within 30 days of the Removal Deadline, Company may dispose of the Title Documents, after which time the Title Document will no longer be available to the Buyer.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[2]/p[2]", "In lieu of Title Documents, certain transactions may result in the Seller providing a Bill of Sale to the Buyer. The Buyer is responsible for providing an executed Release Document, along with any other additional documentation which might be required, including, but not limited to, a fully executed Equipment Sales Agreement and export documentation in order to obtain the Bill of Sale. Buyers should review the Lot Terms to understand the necessary requirements which must be met before a Bill of Sale can be provided.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[2]/p[3]", "When an Item that would normally be sold with a Title Document is sold with a Bill of Sale only, the Lot Terms will state: “No title is available. The item(s) will be sold with a Bill of Sale only.”");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[2]/p[4]", "Any improvements or repairs made to the Item by the Buyer prior to receiving the Title Document or Bill of Sale are made at the Buyer’s own risk. The Company will not be held accountable for any costs incurred by the Buyer if they fail to return all completed documentation within 30 days of the removal deadline or if the Seller or mailing service mishandles the Title Document or Bill of Sale Transfer Process.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[2]/li[2]/p[5]", "If for any reason a title is unable to be provided to the Buyer in accordance with the applicable Lot Terms or these Website Rules, the Buyer and Seller may agree to a partial refund and the Buyer may keep the Item, or the Buyer and Seller may agree to a full refund of the Purchase Price including Buyer’s Premium Fee and the Buyer must return the Item to the Seller. The Buyer will not be compensated for any expenses, costs, repairs, or improvements made to the Item after the time of purchase. The Company will not be liable to a Buyer in any manner whatsoever where a Seller fails to deliver to the Buyer or the Company any Title Document in accordance with the applicable Lot Terms or these Website Rules.");
			 
			 VERIFYTHIS_2(driver, "XPH//*[@class='e1-ullist']/li[6]/h4", "4.6. Total Buyer Protection – Dispute Resolution Process");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[1]/p", "4.6.1. Triggering the Dispute Resolution Process. Prior to expiry of the Dispute Initiation Period and subject to the terms and conditions contained in this section 4.6, a Buyer may notify us that an Item purchased was materially misrepresented by the Seller if the Item received by the Buyer does not materially correspond to the description provided in the Item’s online listing page at the time the listing expired (a “Dispute”). If a Dispute is initiated by a Buyer in accordance with this section 4.6 and accepted by the Company, the Company will investigate the matter and help facilitate a resolution with the Seller through our dispute resolution process. Acceptance of a Dispute as properly initiated and the review and adjudication of a Dispute pursuant to our Dispute resolution process will at all times be at our sole discretion. If, in our opinion, a Buyer is abusing the Dispute resolution process, we reserve the right to suspend (indefinitely or otherwise) the Buyer’s ability to engage such process.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[2]/p", "4.6.2. Reporting a Dispute. The Buyer must initiate the Dispute by either contacting the Company’s customer service department by phone, or by completing and submitting the online Dispute form in the Buyer’s MyONE account page. In each case, the Dispute must be initiated prior to 5:00 PM (Eastern Time) on the second calendar day after the earlier of: (i) removal of the Item, or (ii) expiry of the scheduled Removal Deadline regardless of whether the Item has been picked up by such date (the “Dispute Initiation Period”). Buyer’s using a removal or transport agent will not be granted a time extension for initiating a Dispute. Any Dispute initiated after expiry of the foregoing time period will not be accepted by the Company.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[3]/p", "4.6.3. Conditions to Determination of a Dispute. Without limiting any of the other terms and conditions contained in this section 4.6, the Company’s determination of a Dispute is conditional upon: (i) the Buyer completing the transaction by paying their invoice in full and obtaining a valid Release Document; (ii) the Item being available for inspection at our request; (iii) no other resolution method having been triggered by the Buyer (such as litigation or requesting a chargeback from their payment provider); (iv) the Buyer providing to the Company tangible evidence satisfactory to the Company at its discretion documenting the misrepresentation being complained of; and (v) the Buyer providing any additional documentation requested by the Company within three business days of a request being made, such as photos, quotations or invoices for monies spent.");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[4]/p", "4.6.4. Restrictions on Use of Item. During the period that a Dispute is being adjudicated by the Company, the Item in question may not be sold, exported, rented, leased, repaired, enhanced or dismantled in any manner whatsoever, and may only be used by the Buyer or its designee to the limited extent necessary to load/unload the Item and to verify whether it corresponds with its online listing description available at the time the listing expired.");
			 
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/p", "4.6.5. Exclusions to Dispute Resolution Process. A Dispute will be ineligible for adjudication by the Company if:");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[1]", "i. we consider it a case of buyer’s remorse;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[2]", "ii. the Item has been resold or otherwise transferred to another party other than the Buyer;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[3]", "iii. the Item is being exported and has left the port of export;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[4]", "iv. the Item has been dismantled or modified in any manner whatsoever;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[5]", "v. it arises from asked but unanswered questions posted or displayed in an Item’s online listing description;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[6]", "vi. it arises from damage to an Item which does not materially impact the standard operation of the Item or substantially alter its value, such as normal wear and tear or cosmetic damage;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[7]", "vii. it arises from damage caused while an Item is being loaded, unloaded or in transit;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[8]", "viii. it arises from a condition that can only be identified through the operation of the Item on a job site or under load capacity;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[9]", "ix. it relates to latent or hidden defects;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[10]", "x. it arises from a condition that can only be identified through dismantling or performing diagnostic tests;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[11]", "xi. it relates to electronic control modules for systems or components, or the electronic display;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[12]", "xii. it arises from changes to an Item’s condition as a result of exposure to the elements;");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[13]", "xiii. it is for the cost of repairs or improvements made to an Item or other make-ready expenses, transportation costs, inspection fees or custom charges; or");
			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[5]/ul/li[14]", "xiv. it relates to consumables, such as batteries or fluids.");

			 VERIFYTHIS_2(driver, "XPH(//*[@class='e1-ollist terms-e1ollist'])[3]/li[6]/p", "4.6.6. Adjudication. Upon determination that an Item has been materially misrepresented, we may collapse the transaction and ask the Buyer to return the Item to the Seller. Where an Item is returned to the Seller, it must be in the same condition in which it was received by the Buyer and returned at the same location specified in the listing unless we otherwise notify the Buyer. If the Item is a Titled Asset, then the accompanying Title Document must be returned to us or the Seller in the condition in which it was received. After confirming that the Item has been returned to the Seller and, where applicable, we or the Seller are in receipt of the Title Document, the Buyer will be entitled to a refund of the full purchase price of the Item. In no event will the Buyer be entitled to a refund of the transportation or logistic costs associated with removing or returning the Item. In some instances, the transaction may not be collapsed and the Item not returned to the Seller. In these circumstances, with the parties’ consent, a Buyer may receive a partial refund, future credit, a replacement part or some other agreed upon form of compensation. Notwithstanding the foregoing, the initiation of a Dispute or acceptance by us as properly initiated Dispute does not guarantee the Buyer will receive any form of compensation whatsoever. All determinations regarding a Dispute will be at our discretion and be final in nature. We reserve the right to waive or extend any Dispute requirements or time periods in our sole discretion, which waiver or extension will only be valid if given in writing. No such waiver or extension will be deemed or construed to apply to any future Dispute or waive a Buyer’s strict compliance with any other terms and conditions contained in these Website Rules.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']", "Taxes");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../p","In any sale on this website, the Buyer and Seller are responsible for determining whether sales, use, VAT, GST, IVA, transfer, ad valorem or other similar taxes of any taxing authority apply to the transaction and to collect, report and remit the correct tax to the appropriate tax authority. Unless otherwise agreed with the Seller, the Company is not obligated to determine whether any such taxes apply and is not responsible for collecting, remitting or reporting any such taxes arising from any transaction. Invoices to Buyers may contain tax. When tax is due, Buyer is required to remit the stated tax. Failure to pay tax may result in Buyer being placed in default, and if applicable, deactivated.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../ul/li[1]/h4","5.1. Buyer Tax Exemption");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../ul/li[1]/p","The Buyer is solely responsible for making sure a legible copy of any applicable exemption certificate is submitted to the Company, and that the exemption certificate on file with the Company is current and applies to the Item the Buyer is purchasing from the Seller. Failure to supply the Company a current exemption certificate will result in the Buyer being charged applicable tax on the Invoice. At the time of Bid Acceptance, if the Buyer does not have a valid and current exemption certificate on file with the Company, the Buyer must pay the tax on the Invoice and is solely responsible for seeking reimbursement of the tax from the taxing authority.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../ul/li[2]/h4","5.2. Export Documentation");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../ul/li[2]/p[1]","Sales, Use, VAT, GST, IVA, transfer, ad valorem or other similar taxes of any taxing authority may be applicable to all sales unless the Buyer can provide their resale certificate at the time of purchase. If Buyer is exporting the item(s), export documentation must be submitted within 10 days after the Removal Deadline to have the applicable tax refunded. If the documentation is submitted after the requested deadline, the Company may require, at the sole responsibility of the Buyer, the Buyer to recover the tax directly from the appropriate taxing agency.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='5']/../../ul/li[2]/p[2]","By submitting to the Company any tax exemption certificate, export documentation or other documents for the purpose of avoiding the assessment or payment of any tax, duty, assessment, or fee, the Buyer represents and warrants to the Company that (1) such documents are accurate, complete and applicable to the purchase for which they are submitted; (2) the Buyer is entitled to the tax or other exemption being claimed, and (3) the Buyer is not submitting the documents for any illegal or unlawful purpose. The Buyer agrees to indemnify the Company for any breach of any representation or warranty contained in this section, which indemnity obligation shall include without limitation all damages, fines, penalties, interest, attorney’s fees and costs suffered or incurred by the Company.");
			 
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']", "Orange book pricing guidance tool");
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']/../../p[1]","The Company makes available to users of the Website an Orange Book Pricing Guidance Tool (the \"Orange Book\").");
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']/../../p[2]","THE ORANGE BOOK IS PROVIDED AS AN INFORMATIONAL RESOURCE FOR USERS AND IS PROVIDED \"AS IS\" AND \"AS AVAILABLE\" FOR YOUR USE. THE ORANGE BOOK IS DESIGNED TO PROVIDE PRICING INFORMATION, BUT THE ACCURACY OF THE INFORMATION CANNOT BE GUARANTEED. ALTHOUGH EFFORTS HAVE BEEN MADE TO ASSURE THAT THE INFORMATION IS ACCURATE, DUE TO THE NUMBER OF SOURCES FROM WHICH CONTENT FOR THE ORANGEBOOK IS OBTAINED, AND THE INHERENT HAZARDS OF ELECTRONIC DISTRIBUTION, THERE MAY BE DELAYS, OMISSIONS, AND INACCURACIES IN SUCH CONTENT. ALL MATERIALS, INFORMATION, SOFTWARE, SERVICES, AND PRODUCTS INCLUDED IN OR AVAILABLE THROUGH THE ORANGE BOOK ARE PROVIDED WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NONINFRINGEMENT. FURTHER, WITHOUT IN ANY WAY LIMITING THE FOREGOING DISCLAIMERS, THE COMPANY AND ITS AFFILIATES, AGENTS, AND LICENSORS CANNOT AND DO NOT WARRANT THAT THE INFORMATION CONTAINED IN THE ORANGE BOOK IS ACCURATE, COMPLETE, CURRENT, OR RELIABLE , THAT THE FUNCTIONS AND OPERATION OF THE ORANGE BOOK WILL BE UNINTERRUPTED, FREE OF ERROR, OR AVAILABLE AT ANY PARTICULAR TIME OR LOCATION, THAT DEFECTS WILL BE CORRECTED, OR THAT THE ORANGE BOOK OR THE SERVER THAT MAKES IT AVAILABLE ARE FREE OF VIRUSES OR OTHER HARMFUL COMPONENTS. YOUR USE OF THE ORANGE BOOK IS SOLELY AT YOUR RISK.");
			 VERIFYTHIS_2(driver, "XPH//li[@value='6']/../../p[3]","Limitation of Liability. WITH RESPECT TO YOUR USE OF THE ORANGE BOOK AND THE DATA PROVIDED BY THE ORANGE BOOK, NO PARTY (INCLUDING THE COMPANY AND THE OWNERS AND LICENSORS OF THE DATA) SHALL BE LIABLE FOR ANY CLAIM IN CONNECTION WITH THE ORANGE BOOK, THE DATA OR THEIR USE BY YOU (WHETHER UNDER ANY STATUTE OR IN CONTRACT, TORT, STRICT LIABILITY OR OTHERWISE) FOR MORE THAN $100. IN NO EVENT SHALL ANY SUCH PARTY BE LIABLE FOR LOST REVENUES, LOST PROFITS, LOSS OF BUSINESS, OR ANY CONSEQUENTIAL, INCIDENTAL, INDIRECT, EXEMPLARY, SPECIAL, OR PUNITIVE DAMAGES, LOSS OR EXPENSES OF ANY KIND, WHETHER SUCH LIABILITY IS ASSERTED ON THE BASIS OF STATUTE, CONTRACT, TORT (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE AND WHETHER OR NOT FORESEEABLE, EVEN IF IT HAS BEEN ADVISED OR WAS AWARE OF THE POSSIBILITY OF SUCH LOSS OR DAMAGES.");
			 resultDetails.setFlag(true);
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 resultDetails.setFlag(false); 
	       }
	 
	 }
	 public void SUMAN(WebDriver driver,String fieldText) throws Exception{
         
		  System.out.println(driver.findElement(By.xpath(fieldText)).getText());
		  resultDetails.setFlag(true); 
		
		 
		 }
	 
 }
 
