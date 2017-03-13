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
import java.util.Iterator;


import com.java.objects.ResultDetails;
import org.junit.Assert;

public class AppTestType{

	public enum AppKeyWords{

		//tweaked
		NEWUSERREGISTRATION, REDIRECT, AMPLOGIN, BROWSEALLLISTINGS,FACETS,SEARCHRESULTS, MAXOFFERINSEARCHRESULTSPAGE, 
		EXACTOFFERINSEARCHRESULTSPAGE, ADDTOWATCHLIST,WATCHINGINMYONE, CHANGEPASSWORD,NONZEROCOUNT, QA, NAVIGATETOLISTINGDETAILSPAGE, 
		VERIFYQAINAMP,  LOADNEWUSERREG,

		//new
		MYOPERATION,SIGNIN,SIGNOUT, WAITFORTHIS,VERIFYTHIS,MAXBIDFROMEVENTPAGE,NAVIGATETO,EXACTBIDFROMEVENTPAGE,EXACTBIDFROMWATCHINGPAGE, MAXBIDFROMWATCHINGPAGE,BIDDING_IN_LISTINGDETAILSPAGE,
		BIDAMOUNTCALCULATION,E1LISTINGSELECTION,VISIBLE,NOTVISIBLE,CHECKED,UNCHECKED,VERIFYNOT,NEWLITEUSERLOGIN,ADDINGTOWATCHLIST,SUBCATEGORYSELECTION,
		AMPLOGOUT,BIDONOWNLOT,ALLEQUIPMENTPAGE,SEARCHLOTINAMP,SEARCHLOTINEQWITHEQID, AssetNation,USERAGREEMENT, USERAGREEMENTPAGE,ALERTHANDLING, VERIFYANDCONTINUE, 
		DEFAULTBIDAMOUNT,BIDFROMLOTDETAILSPAGE,CLOSETAB,SWITCHWINDOWE1, BIDHISTORY, LEFTNAVLOTCOUNT, LOTPOSITION, ENDLOT,  LOTSINEVENT, LINKSINEVENT,
		EVENTID, EVENTNAME,ACTIONONFIRSTACTIVELOT, BIDAMOUNT,SETFORESEE,LITEUSERREGISTRATION,LOTCONVERSION,CHANGELOTSTATUSINAMP,APPROVELOT,ADDLOTTOANEVENT,ADDQUALIFIEDLOTTOANEVENT, BIDDINGONQUALIFIEDEVENT,
		QUALIFIEDLOTINEVENTPAGE, BIDONQUALIFIEDLOT, ADDINGQUALIFIEDUSER,PAGINATION,CLOSELOT,TRASHLOT,WAITFORELEMENTPRESENCE,DISAPPEARBIN,ERRORMSGSINEVENT,BIDDINGINEVENTDETAILSPAGE,VERIFYBIN, BINBIDAMOUNT, 
		ADDINGPRIVATESALEUSER,LOGINJOOMLA,UPLOADIMAGE,
		
		//keywords only(using in switch cases)
		FROMEVENTPAGE,CATEGORY,MYEVENTS, ENER,SOURCESITE, MAKE,MODEL,COUNTRY,STATE,POSTALCODE,BROWSEALL,BROWSEE1,AGRI,TRANS,CONS,SEARCH,FROMSEARCH,FROMLISTING, EA,AGREETERMS,COMMERCIAL,
		MAXBID,EXACTBID,MAXLOWERBID,EXACTLOWERBID,BIN,MAXQUALIFIEDERRORMSG,EXACTQUALIFIEDERRORMSG,EXACTBIDQUALIFIED,MAXBIDQUALIFIED,EVENTDETAILSPAGE,LOTDETAILS, EVENT, WATCHLISTSEARCH,BINLOTDETAILS, 
		BINEVENT, BINWATCHLISTSEARCH, EVENTPAGE, WATCHLISTPAGE, LISTINGPAGE, LOTDETAILSPAGE, LOTPAGE,


		//currently not using 
		READCSV}


	final int MAX_STALE_ELEMENT_RETRIES = 5;
	int retries=0;
	int add = 100;
	public static String eqid_1="suman";
	public static String lotattributeID;

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

			case REDIRECT:
				REDIRECT(webdriver, fieldText);
				break;
			case ERRORMSGSINEVENT:
			     ERRORMSGSINEVENT(webdriver,fieldText);
				 break;
		    case LOGINJOOMLA:
			     LOGINJOOMLA(webdriver);
				 break;
		    case UPLOADIMAGE:
			     UPLOADIMAGE(webdriver);
				 break;
				 
			case VERIFYBIN:
			     VERIFYBIN(webdriver,fieldText);
				 break;
				 
			case BINBIDAMOUNT:
			     BINBIDAMOUNT(webdriver,fieldText);
				 break;
				 
			case ADDINGPRIVATESALEUSER:
			     ADDINGPRIVATESALEUSER(webdriver,fieldText);
				 break;
				 
			case BIDDINGINEVENTDETAILSPAGE:
			     BIDDINGINEVENTDETAILSPAGE(webdriver,fieldText);
				 break;
				 
			case DISAPPEARBIN:
			     DISAPPEARBIN(webdriver, fieldText);
				 break;
			case ALERTHANDLING:
				ALERTHANDLING(webdriver,fieldText,value);
				break;
			case PAGINATION:
			     PAGINATION(webdriver);
				 break;
			case NONZEROCOUNT:
				NONZEROCOUNT(webdriver);
				break;
			case LOTCONVERSION:
			    LOTCONVERSION(webdriver);
				break;
			case CHANGELOTSTATUSINAMP:
				CHANGELOTSTATUSINAMP(webdriver);
				break;
			case WATCHINGINMYONE:
				WATCHINGINMYONE(webdriver, fieldText);
				break;
			case NEWLITEUSERLOGIN:
				NEWLITEUSERLOGIN(webdriver,fieldText,value);
				break;
			case NEWUSERREGISTRATION:
				NEWUSERREGISTRATION(webdriver, fieldText, value);
				break;
			case LITEUSERREGISTRATION:
			     LITEUSERREGISTRATION(webdriver, fieldText, value);
				break;
			case READCSV:
				READCSV(webdriver);
				break;
			case AMPLOGIN:
				AMPLOGIN(webdriver, fieldText);
				break;
			case AMPLOGOUT:
				AMPLOGOUT(webdriver);
				break;
			case BROWSEALLLISTINGS:
				BROWSEALLLISTINGS(webdriver, fieldText);
				break;
			case FACETS:
				FACETS(webdriver,fieldText,value);				
			case SEARCHRESULTS:
				SEARCHRESULTS(webdriver, fieldText, value);                         	
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
			case CHANGEPASSWORD:
				CHANGEPASSWORD(webdriver, fieldText, value);
				break;
			case QA:
				QA(webdriver);
				break;
			case NAVIGATETOLISTINGDETAILSPAGE:
				NAVIGATETOLISTINGDETAILSPAGE(webdriver);
				break;
			case VERIFYQAINAMP:
				VERIFYQAINAMP(webdriver, fieldText);
				break;
			case LOADNEWUSERREG:
				LOADNEWUSERREG(webdriver, fieldText, value);
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
			case VERIFYANDCONTINUE:
				VERIFYANDCONTINUE(webdriver, fieldText, value);
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
			case AGREETERMS:
				AGREETERMS(webdriver,fieldText, value);
				break;
			case DEFAULTBIDAMOUNT:
				DEFAULTBIDAMOUNT(webdriver, fieldText, value);
				break;
			case BIDFROMLOTDETAILSPAGE:
				BIDFROMLOTDETAILSPAGE(webdriver,value);
				break;
			case CLOSETAB:
				CLOSETAB(webdriver, fieldText);
				break;
			case SWITCHWINDOWE1:
				SWITCHWINDOWE1(webdriver, fieldText);
				break;
			case BIDAMOUNT:
				BIDAMOUNT(webdriver, fieldText);
				break;	
			case BIDHISTORY:
				BIDHISTORY(webdriver, fieldText);
				break;
			case LEFTNAVLOTCOUNT:
				LEFTNAVLOTCOUNT(webdriver);
				break;
			case LOTPOSITION:
				LOTPOSITION(webdriver);
				break;
			case ENDLOT:
				ENDLOT(webdriver);
				break;
			case EVENTID:
				EVENTID(webdriver);
				break;
			case EVENTNAME:
				EVENTNAME(webdriver);
				break;	
			case LOTSINEVENT:
				LOTSINEVENT(webdriver);
				break;
			case LINKSINEVENT:
				LINKSINEVENT(webdriver);
				break;					
			case BIDDING_IN_LISTINGDETAILSPAGE:
				BIDDING_IN_LISTINGDETAILSPAGE(webdriver, fieldText, value);
				break;					
			case ACTIONONFIRSTACTIVELOT:
				ACTIONONFIRSTACTIVELOT(webdriver, fieldText, value);
				break;					
            case SETFORESEE:
				SETFORESEE(webdriver);
				break;
			case APPROVELOT:
				APPROVELOT(webdriver);
				break;
			case CLOSELOT:
				CLOSELOT(webdriver);
				break;
			case TRASHLOT:
			    TRASHLOT(webdriver);
				break;
			case ADDLOTTOANEVENT:
				ADDLOTTOANEVENT(webdriver, fieldText, value);
				break;
			case ADDQUALIFIEDLOTTOANEVENT:
				ADDQUALIFIEDLOTTOANEVENT(webdriver);
				break;
			case BIDDINGONQUALIFIEDEVENT:
				BIDDINGONQUALIFIEDEVENT(webdriver, fieldText);
				break;
			case QUALIFIEDLOTINEVENTPAGE:
				QUALIFIEDLOTINEVENTPAGE(webdriver);
				break;
			case BIDONQUALIFIEDLOT:
				BIDONQUALIFIEDLOT(webdriver, fieldText);
				break;
			case ADDINGQUALIFIEDUSER:
				ADDINGQUALIFIEDUSER(webdriver, fieldText);
				break;
			case WAITFORELEMENTPRESENCE:
				 WAITFORELEMENTPRESENCE(webdriver, fieldText);
				break;
			}			
		}catch(Exception e){
			resultDetails.setErrorMessage(e.getMessage());
		}
		return resultDetails;
	}
	

		public void NONZEROCOUNT(WebDriver driver) {
			try {
			   WebElement lots = driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]"));
			   WebElement auctions = driver.findElement(By.id("e1AuctionsFound"));
			   WebElement events = driver.findElement(By.id("e1ResultsFound"));
			   String count="";
			   //to get text of lots or auctions or events count 
			   if(lots.isDisplayed())
			   {
				count=driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();
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


	public void AMPLOGIN(WebDriver driver, String fieldText) {

		String field = fieldText;  
		System.out.println("In AMPLOGIN method");
		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			driver.navigate().refresh();

			//driver.manage().deleteAllCookies();
			driver.navigate().refresh();
			System.out.println("redirecting to AMP url");
			driver.get(field); // Change again back to staging AMP Site.
			//driver.manage().deleteAllCookies();
			ParantWindow=driver.getWindowHandle();
			driver.findElement(By.id("aurid")).sendKeys("mglaz@assetnation.com");

			driver.findElement(By.id("apwd")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[@value='Login']")).click();
            Thread.sleep(5000);
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
				driver.findElement(By.id("agreetoterms")).click();				
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

	public void READCSV(WebDriver driver) {


		driver.get("http://mmtool.staging.assetnation.com"); // Change again back to staging AMP Site.
		//driver.manage().deleteAllCookies();
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
					String E1Count = driver.findElement(By.xpath("(//span[@class='EquipmentOneCount'])[2]")).getText();
					String RBACount = driver.findElement(By.xpath("(//*[@class='RBACount'])[2]")).getText();
					String SSCount = driver.findElement(By.xpath("(//*[@class='SalvageSaleCount'])[2]")).getText();
					//String ABGCount=driver.findElement(By.xpath("(//*[@class='ABGCount'])[2]")).getText();


					String EOCount1 = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
					String RBACount1 = RBACount.substring(RBACount.indexOf("(")+1, RBACount.lastIndexOf(")"));
					String SSCount1 = SSCount.substring(SSCount.indexOf("(")+1, SSCount.lastIndexOf(")"));
					//String ABGCount1 = ABGCount.substring(ABGCount.indexOf("(")+1, ABGCount.lastIndexOf(")"));

					System.out.println("EOCount1:"+EOCount1);
					System.out.println("RBACount1:"+RBACount1);
					System.out.println("SSCount1:"+SSCount1);
					//System.out.println("ABGCount1:"+ABGCount1);

					Integer E1=Integer.parseInt(EOCount1);
					Integer RBA=Integer.parseInt(RBACount1);
					Integer SS=Integer.parseInt(SSCount1);
					//Integer ABG=Integer.parseInt(ABGCount1);

					int count1=E1+RBA+SS;
					String SearchFinalCount=String.valueOf(count1);

					String LotCount = driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();
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
					StackTraceElement[] elements = e.getStackTrace();  
					System.out.println("Error at line number: "+elements[elements.length-1].getLineNumber());
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);

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
					driver.findElement(By.xpath("(//*[@id='site_id:SalvageSale']/span[1]/input)[2]")).click();
					Thread.sleep(2000);
					//driver.findElement(By.xpath("(//*[@id='site_id:ABG']/span[1]/input)[2]")).click();


					//suman

					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String E1Count = driver.findElement(By.xpath("(//span[@class='EquipmentOneCount'])[2]")).getText();
					System.out.println(E1Count);
					String EOCount = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
					Integer count1=Integer.parseInt(EOCount);
					System.out.println("count1 is: "+count1);

					Thread.sleep(5000);
					System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.xpath("(//span[@class='e1NumFound'])[2]")).size());
					System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
					String listingcount = driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();
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
					StackTraceElement[] elements = e.getStackTrace();  
					System.out.println("Error at line number: "+elements[elements.length-1].getLineNumber());
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);

				}

				break;


			case MYEVENTS:
				try{

					SUBCATEGORYSELECTION(driver,"XPH//*[@class='dropdown mega navBarText navBarBrowse']/a[starts-with(text(),'Browse')]","XPH//*[@class='mega-nav level1']/li/a[starts-with(text(),'Events')]");
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[contains(@class,'source-site')]/a)[2]")).click();
					Thread.sleep(1000);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String E1Count = driver.findElement(By.xpath("(//span[@class='EquipmentOneCount'])[2]")).getText();

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
					StackTraceElement[] elements = e.getStackTrace();  
					System.out.println("Error at line number: "+elements[elements.length-1].getLineNumber());
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
					//e.printStackTrace();
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
			//ALLEQUIPMENTPAGE(driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (FCT) {

			case MAKE:

				try {

					// suman
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);
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
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);
                     driver.findElement(By.xpath("(//a[text()='Category'])[2]")).click();
					 Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[@id='Category']/ul/li[1]/span/input)[2]")).click();

					String Categorycount = driver.findElement(By.xpath("(//*[@id='Category']/ul/li[1])[2]")).getText();
					String FirstCategorycount = Categorycount.substring(Categorycount.indexOf("(")+1, Categorycount.lastIndexOf(")"));
					System.out.println(FirstCategorycount);

					String categoryfinal = driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();			 				 
					if(FirstCategorycount.equalsIgnoreCase(categoryfinal)) {

						resultDetails.setFlag(true);
						System.out.println("Counts matched!!!");
					}


				} catch (Exception e ) {
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}

				break;

			case MODEL:

				try {
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);

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
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);
                     driver.findElement(By.xpath("(//a[text()='Model'])[2]")).click();
					Thread.sleep(4000);
				
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
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);
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

			case SOURCESITE:
				try {
					driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
					Thread.sleep(2000);
                    // driver.findElement(By.xpath("(//a[text()='Model'])[2]")).click();
					//Thread.sleep(2000);
					driver.findElement(By.xpath("(//span[text()='Source Site'])[2]")).click();
					Thread.sleep(2000);
					//driver.findElement(By.xpath("(//*[@id='State/Province']/ul/li[1]/span/input)[2]")).click();

					//Thread.sleep(1000);

					String MakecountE1 = driver.findElement(By.xpath("(//*[@id='site_id:EquipmentOne']/span[3])[2]")).getText();

					System.out.println(MakecountE1);
					
					String Makecount1 = MakecountE1.substring(MakecountE1.indexOf("(")+1, MakecountE1.lastIndexOf(")"));
					Integer totalCountE1=Integer.parseInt(Makecount1);
					System.out.println("Expected count: "+totalCountE1);
					
					String MakecountRBA = driver.findElement(By.xpath("(//*[@id='site_id:RBA']/span[3])[2]")).getText();

					System.out.println(MakecountRBA);
					
					String Makecount2 = MakecountRBA.substring(MakecountRBA.indexOf("(")+1, MakecountRBA.lastIndexOf(")"));
					Integer totalCountRBA=Integer.parseInt(Makecount2);
					System.out.println("Expected count: "+totalCountRBA);
					
					
				    String MakecountSS = driver.findElement(By.xpath("(//*[@id='site_id:SalvageSale']/span[3])[2]")).getText();

					System.out.println(MakecountSS);
					
					String Makecount3 = MakecountSS.substring(MakecountSS.indexOf("(")+1, MakecountSS.lastIndexOf(")"));
					Integer totalCountSS=Integer.parseInt(Makecount3);
					System.out.println("Expected count: "+totalCountSS);
					
					Integer totalCount=totalCountE1+totalCountRBA+totalCountSS;

					//String RBMakecount = Makecount.substring(Makecount.indexOf("(")+1, Makecount.lastIndexOf(")"));
					//Integer totalCount=Integer.parseInt(RBMakecount);
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
					driver.findElement(By.xpath("https://qa.equipmentone.com/energy-equipment")).click();
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
			new Actions(driver).moveToElement((driver.findElement(By.xpath("//h3[contains(text(),'Q & A for this Lot')]")))).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h3[contains(text(),'Q & A for this Lot')]")).click();
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
			System.out.println(b1);
			Boolean b2=driver.findElement(By.xpath("//*[text()='Your question will be forwarded to the seller. It may also be answered by our Customer Care team. Please note: we cannot determine when the seller will respond.']")).isDisplayed();
			System.out.println(b2);
			Boolean b3=driver.findElement(By.xpath("//*[text()=' Click here to receive a copy of your question by email']")).isDisplayed();
			System.out.println(b3);
			Boolean b4=driver.findElement(By.xpath("//input[@id='jsSendCopy' and @type='checkbox']")).isDisplayed();
			System.out.println(b4);
			if(b1 && b2 && b3 && b4)
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
/*
			//driver.manage().deleteAllCookies();
			driver.navigate().refresh();*/
			System.out.println("before AMP login");
			AMPLOGIN(driver, "http://amp-qa.equipmentone.com/login");

			/*driver.get(field);
		 //driver.manage().deleteAllCookies();
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
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false);

			//		 FileOutputStream fos = new FileOutputStream("C:/TestProject - DEV/Log File/logfile.txt");
			//		  PrintStream ps = new PrintStream(fos);
			//		  e.printStackTrace(ps);
		}
	}

	public void MAXOFFERINSEARCHRESULTSPAGE(WebDriver driver){

		try {
			// suman 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.navigate().to("https://qa.equipmentone.com/all-equipment/equipmentone-listings");

			Thread.sleep(1000);
			//driver.findElement(By.linkText("2")).click();//To go to 2nd page of the search results
			Thread.sleep(10000);

			//in search result there may be events, so finding first listing(excluding events) to offer exact bid

			List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
			int j=-1;
			String ID = "";
			String s1="";
			for(int i=1;i<listings.size();i++)
			{
				j++;
				s1=listings.get(i).getAttribute("href");
				String s2[]=s1.split("/listing?");
				String s3[]=s2[1].split("&");
				String s4[]=s3[0].split("=");
				String id=s4[1];
				ID=id;
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
		   /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[1]")).getText();
			String[] offer11=offer_withdollar.split(".00 ");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
			Integer a=Integer.parseInt(offer);
			System.out.println("you need to enter: "+offer);

			driver.findElement(By.xpath("(//a[@href='/listing?listingid="+ID+"']/following::*[@type='button' and @value='PLACE A BID'])[1]")).click();
            driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
			Thread.sleep(2000);*/
			driver.findElement(By.xpath("(//a[@href='/listing?listingid="+ID+"']/following::*[@type='button' and @value='PLACE A BID'])[1]")).click();
			BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"MAX");   
			resultDetails.setFlag(true);



		}

		catch(Exception e) {

			e.printStackTrace(); 
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false);
		}


	}

	public void EXACTOFFERINSEARCHRESULTSPAGE(WebDriver driver){

		try {
			// suman 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.navigate().to("https://qa.equipmentone.com/all-equipment/equipmentone-listings");

			/*Thread.sleep(1000);
			driver.findElement(By.linkText("2")).click();//To go to 2nd page of the search results
			Thread.sleep(10000);*/

			//in search result there may be events, so finding first listing(excluding events) to offer exact bid

			List <WebElement> listings = driver.findElements(By.cssSelector("a[href*='/listing?listingid']"));
			int j=-1;
			String ID = "";
			String s1="";
			for(int i=1;i<listings.size();i++)
			{
				j++;
				s1=listings.get(i).getAttribute("href");
				String s2[]=s1.split("/listing?");
				String s3[]=s2[1].split("&");
				String s4[]=s3[0].split("=");
				String id=s4[1];
				ID=id;
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


			/* System.out.println("number of listings in page: "+listings.size());

		 //taking first listing (not concidering events)
		 WebElement we=listings.get(j);
		 String href=we.getAttribute("href");
		 System.out.println("href of first listing is: "+href);
		 // (//a[@href='https://qa.equipmentone.com/listing?listingid=316696&backToSearchButton=1']/following::*[@class='jsMinOfferjsAmountText'])[1]

		 if(href.contains("https://qa.equipmentone.com"))
			 href=href.replaceAll("https://qa.equipmentone.com", "");
		 else if(href.contains("https://qa.equipmentone.com/"))
			 href=href.replaceAll("https://qa.equipmentone.com/", "");


		 String min_offer=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMinOffer jsAmountText'])[1]")).getText();
		 String[] min_offer2=min_offer.split(".00 ");
		 String min_offer3=min_offer2[0].replace(",", "").replace("$", "");

		 String min_offer2=min_offer.substring(1, min_offer.length()-3);
		 String min_offer3=min_offer2.replace(",", "");


		 Integer minOffer=Integer.parseInt(min_offer3);
		 System.out.println("minimum offer is: "+minOffer);
		 Integer bidAmount=add+minOffer;
		 String bidValue=String.valueOf(bidAmount);

		 Integer a1=bidAmount;

		 //to overcome 'You cannot place a bid lower than or the same amount as your previous bid' 
		 Integer a2=0;
		 String MyMaxbid=driver.findElement(By.xpath("//*[@id='listing-"+ID+"']")).getText();
		 if(MyMaxbid.contains("MY MAX BID"))
		 {
			 String MM[]=MyMaxbid.split("MY MAX BID");
			 String amt[]=MM[1].split(".00 ");
			 String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
			 a2=Integer.parseInt(MyMaxAmount)+100; 
			 if(a2>a1)
		 		bidValue=a2.toString();
		 }

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
		 for(int i=0;i<20;i++)suman
		 {
			 if(driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText().contains("$"))
				 break;
			 Thread.sleep(500);
		 }
		 String MyMaxBid=driver.findElement(By.xpath("(//a[@href='"+href+"']/following::*[@class='jsMyMaxBidValue'])[1]")).getText();
		 String[] MyMaxBid2=MyMaxBid.split(".00 "); //$8,200.00
		 String MyMaxBid3=MyMaxBid2[0].replace("$", "").replace(",", "");


		 System.out.println("bidded value is: "+bidValue);
		 System.out.println("showing my bid value is: "+MyMaxBid3);
		 if(MyMaxBid3.equals(bidValue))
			 resultDetails.setFlag(true); 
		 else
			 System.out.println("bid value is mis-matched");
			 */
			driver.findElement(By.xpath("(//a[@href='/listing?listingid="+ID+"']/following::*[@class='check-box' and @value='Exact Bid'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@href='/listing?listingid="+ID+"']/following::*[@type='button' and @value='PLACE A BID'])[1]")).click();

			BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"EXACT");   
			resultDetails.setFlag(true);



		}

		catch(Exception e) {

			StackTraceElement[] elements = e.getStackTrace();  
			System.out.println(elements[elements.length-1].getLineNumber());
			System.out.println(e.toString());
			resultDetails.setFlag(false);
		}

	}

	public void WATCHINGINMYONE(WebDriver driver, String fieldText) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			ADDTOWATCHLIST(driver, fieldText);
			System.out.println("Back to  WATCHINGINMYONE method");

			driver.findElement(By.xpath("(//a[contains(text(),'MyONE')])[2]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[contains(text(),'Watching')])[2]")).click();
			Thread.sleep(10000);

			if(driver.getPageSource().contains(ListingID)) {
				System.out.println("listing is found in myone pagesource");
				resultDetails.setFlag(true);
			}
		} catch (Exception e) {
			System.out.println("Listing added is not displayed in MYOne Watchlist");
			resultDetails.setFlag(false);

		}

	}

	public void VERIFYANDCONTINUE(WebDriver driver,String precondition, String postcondition ){
		try{
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		if(driver.findElements(By.xpath(precondition)).size()>0){
			System.out.println("pre condition executed successfully");
			
			if(driver.findElements(By.xpath(postcondition)).size()>0){
				System.out.println("post condition executed successfully");
				resultDetails.setFlag(true);}}
			else
			{
				System.out.println("pre condition failed");
				//hence we are not verifying the post condition
				resultDetails.setFlag(true);
			}
		
		}
		catch(Exception e){
			resultDetails.setErrorMessage(e.toString());
			e.printStackTrace();
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

					//driver.findElement(By.linkText("Watch This")).click();
					  driver.findElement(By.xpath("//*[contains(@class,'jswatchtitle')]")).click();
					System.out.println("clicked on watch this");

					//System.out.println(driver.findElement(By.xpath("//*[@class='e1WatchingThisText']")).getText());
					//if(driver.findElement(By.xpath("//*[@class='e1WatchingThisText']")).getText().equalsIgnoreCase("Watching")){
						//System.out.println("Added to watchlist"); 
						//resultDetails.setFlag(true);
					//}
						
						resultDetails.setFlag(true);
					//else {
						resultDetails.setFlag(false);
						System.out.println("listing is not added to watchlist1");  
					//}
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
			driver.navigate().to("https://qa.equipmentone.com/all-equipment/equipmentone-listings");

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
			//if(driver.findElement(By.xpath("(//div[contains(@class,'e1OfferConsole')])[1]")).isDisplayed())
				resultDetails.setFlag(true);
		} catch(Exception e){
			e.printStackTrace();
			resultDetails.setFlag(false);


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
				//driver.manage().deleteAllCookies();
				driver.navigate().refresh();
				driver.get(fieldText);
				//driver.manage().deleteAllCookies();
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
				//driver.manage().deleteAllCookies();
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
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					String alertText=alert.getText();
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					resultDetails.setFlag(true);

				} 
				else if(value.equalsIgnoreCase("Stay")){

					driver.findElement(By.linkText(locatorValue)).click();
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					String alertText=alert.getText();
					driver.switchTo().alert().dismiss();
					Thread.sleep(2000);
					
						resultDetails.setFlag(true);
					
				}
			}

			///For Xpath
			else if(locatorType.equalsIgnoreCase("XPH")){
				if(value.equalsIgnoreCase("Leave")){

					driver.findElement(By.xpath(locatorValue)).click();
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					String alertText=alert.getText();
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					resultDetails.setFlag(true);

				} 
				else if(value.equalsIgnoreCase("Stay")){

					driver.findElement(By.xpath(locatorValue)).click();
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					String alertText=alert.getText();
					driver.switchTo().alert().dismiss();
					Thread.sleep(2000);
					
						resultDetails.setFlag(true);
					
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
			//driver.manage().deleteAllCookies();
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
			driver.findElement(By.id("agreetoterms")).click();
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
			driver.get("https://qa.equipmentone.com");
			SIGNIN(driver, EMAIL, user);

			/* driver.findElement(By.id("sign")).click();
	        driver.findElement(By.name("josso_username")).sendKeys(EMAIL);
	       driver.findElement(By.name("josso_password")).sendKeys("Equipment1$");
	       driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();*/


			//To verify exceptional casse where previously a signout is not happened corrctly and the cookie is remembered

			/* if(!driver.findElement(By.id("iduser")).getText().equalsIgnoreCase(user)){

	      SIGNOUT(driver);
	      //driver.manage().deleteAllCookies();
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

			//driver.manage().deleteAllCookies();    
			driver.navigate().refresh();	

			driver.get(value); 
			AMPLOGIN(driver, value);  
			driver.findElement(By.linkText("Users")).click(); 
			driver.findElement(By.name("email")).sendKeys(EMAIL);
			driver.findElement(By.xpath("//input[@value='Search']")).click(); 
			Thread.sleep(3000);
			String VerifyUser = driver.findElement(By.xpath("//input[@value='Search']/following::tr[3]/td[2]")).getText();

			if(VerifyUser.equalsIgnoreCase(EMAIL)); {

				System.out.println("User Verified");

			}
			resultDetails.setFlag(true); 
		}

		catch (Exception e )
		{
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false);

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
				driver.findElement(By.xpath("(//*[@id='site_id:SalvageSale']/span[1]/input)[2]")).click();
			Thread.sleep(3000);
			if(msg.contains("Auctions By Gov"))
				driver.findElement(By.xpath("(//*[@id='site_id:ABG']/span[1]/input)[2]")).click();

			Thread.sleep(5000);

			//String E1Count = driver.findElement(By.cssSelector("span.e1Count")).getText();//
			System.out.println("size1 issssssssssssssssssss: "+driver.findElements(By.xpath("(//*[@id='site_id:EquipmentOne']/span[3])[2]")).size());
			String E1Count = driver.findElement(By.xpath("(//*[@id='site_id:EquipmentOne']/span[3])[2]")).getText();
			System.out.println(E1Count);
			String EOCountt = E1Count.substring(E1Count.indexOf("(")+1, E1Count.lastIndexOf(")"));
			Integer count1=Integer.parseInt(EOCountt);
			System.out.println("count1 is: "+count1);

			Thread.sleep(5000);
			System.out.println("size2 isssssssssssssssssssssss"+driver.findElements(By.xpath("(//*[@class='e1NumFound'])[2]")).size());
			System.out.println("size3 isssssssssssssssssssssss"+driver.findElements(By.id("e1ResultsFound")).size());
			String listingcount = driver.findElement(By.xpath("(//*[@class='e1NumFound'])[2]")).getText();
			String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();

			System.out.println(listingcount);
			System.out.println(nextlistingcount);
			//suman
			boolean lotDisplay=driver.findElement(By.xpath("(//*[@class='e1NumFound'])[2]")).isDisplayed();
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
				case "IDI":
					new Select(driver.findElement(By.id(locator))).selectByVisibleText(val);
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

	public void SIGNIN(WebDriver driver, String fieldText, String value)
	{

		try{

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
					driver.navigate().to("https://qa.equipmentone.com");
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
			//String url2=url.toUpperCase();
			//LOT CREATION PAGE IS DIFFER FROM OTHER PAGES
			if(url.contains("createlisting"))
			{
				driver.findElement(By.id("iduser")).click();
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
	public void LOTCONVERSION(WebDriver driver){ // Converting lot from Self Service and Approve the lot
	  try 
	  {		  
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		System.out.println("execution lot conversion");
		Thread.sleep(10000);	 
		driver.findElement(By.xpath("//span[contains(text(),'Convert')]")).click();  
		Thread.sleep(10000);
		driver.findElement(By.id("id_button_createlot")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);			  				  
	    String lotdetail=driver.findElement(By.xpath("//td[text()='Lot Detail']")).getText();
        if(lotdetail.equalsIgnoreCase("Lot Detail"))
		{
		System.out.println("lot created successfully");
		}
		String lotStatus=driver.findElement(By.xpath("//li[contains(text(),'(PI)')]")).getText();
		if(lotStatus.equalsIgnoreCase("(PI)"))
		{
		System.out.println("lot is in PI status");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]")).click();
		driver.findElement(By.xpath("(//input[@name='offerPreview'])[2]")).click();
		driver.findElement(By.name("savebutton")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
		String lotId=driver.findElement(By.xpath("(//td[@class='listdata'])[1]")).getText();
			//driver.findElement(By.xpath("//a[contains(text(),'Approve')]")).click();
		Thread.sleep(2000);
			
			/*String ParentHandle = driver.getWindowHandle();
				driver.findElement(By.xpath("//a[contains(text(),'Approve')]")).click();	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);		
                driver.findElement(By.xpath("//*[@name='reason']")).sendKeys("test");
				driver.findElement(By.name("verify")).click();
				driver.findElement(By.xpath("//input[@value='Approve']")).click();
				Thread.sleep(1000);	
                  // Closing the Child Window.
                      //  driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);*/			
				  
	    resultDetails.setFlag(true);
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}		
	public void CHANGELOTSTATUSINAMP(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		  driver.findElement(By.linkText("Create Release of Funds")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  String MainWindow=driver.getWindowHandle();					
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    driver.switchTo().window(ChildWindow);		
					new Select(driver.findElement(By.xpath("//select[@name='urgency']"))).selectByVisibleText("Must Go Today");
					new Select(driver.findElement(By.xpath("//select[@name='formOfPayment']"))).selectByVisibleText("Company Check");
					new Select(driver.findElement(By.xpath("//select[@name='deliveryMethod']"))).selectByVisibleText("Hand Deliver");
                    driver.findElement(By.xpath("//input[@value='Submit']")).click();
					Thread.sleep(1000);		
            }		
        }		
        
            driver.switchTo().window(MainWindow);	
			
			driver.findElement(By.xpath("(//a[contains(@alt,'General Information')])")).click();
			driver.findElement(By.linkText("View Buyer Details")).click();
			
			String MainWindow1=driver.getWindowHandle();					
            Set<String> s2=driver.getWindowHandles();		
        Iterator<String> i2=s2.iterator();		
        		
        while(i2.hasNext())			
        {		
            String ChildWindow=i2.next();		
            		
            if(!MainWindow1.equalsIgnoreCase(ChildWindow))			
            {    		
                    driver.switchTo().window(ChildWindow);	
						Thread.sleep(1000);
					new Select(driver.findElement(By.xpath("//select[@name='lotStatus']"))).selectByVisibleText("Sale Complete");
					
                    driver.findElement(By.xpath("(//input[@name='buyerIDs'])[1]")).click();
					driver.findElement(By.xpath("//input[@value='Save Changes']")).click();
					Thread.sleep(1000);	
						driver.close();
            }		
        }		
        
            driver.switchTo().window(MainWindow1);	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(@href,'listings')]")).click();
			Thread.sleep(1000);
			String lotstatus=driver.findElement(By.xpath("(//*[text()='Sale Complete'])[1]")).getText();
			if(lotstatus.equalsIgnoreCase("Sale Complete"))
			{
			System.out.println("lot is in Sale Complete status");
			}
			driver.findElement(By.xpath("(//a[contains(@alt,'General Information')])")).click();
			
			driver.findElement(By.linkText("View Buyer Details")).click();
			
			String MainWindow2=driver.getWindowHandle();					
            Set<String> s3=driver.getWindowHandles();		
        Iterator<String> i3=s3.iterator();		
        		
        while(i3.hasNext())			
        {		
            String ChildWindow=i3.next();		
            		
            if(!MainWindow2.equalsIgnoreCase(ChildWindow))			
            {    		
                    driver.switchTo().window(ChildWindow);		
					Thread.sleep(1000);
					new Select(driver.findElement(By.xpath("//select[@name='lotStatus']"))).selectByVisibleText("Commission Swept");
					
                    driver.findElement(By.xpath("(//input[@name='buyerIDs'])[1]")).click();
					driver.findElement(By.xpath("//input[@value='Save Changes']")).click();
					Thread.sleep(1000);	
					driver.close();					
            }		
        }		
        
            driver.switchTo().window(MainWindow2);	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(@href,'listings')]")).click();
			Thread.sleep(1000);
			String lotstatus1=driver.findElement(By.xpath("(//*[text()='Sweep and Hold'])[1]")).getText();
			if(lotstatus1.equalsIgnoreCase("Sweep and Hold"))
			{
			System.out.println("lot is in Sweep and Hold status");
			}
			Thread.sleep(1000);
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

	public void MAXBIDFROMEVENTPAGE(WebDriver driver) {

		try {
			String ID="";
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
				 //events.get(2).click();
				 Thread.sleep(8000);
				 if(driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).isDisplayed())
				 {
					 driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
					 //we can't say every first lot in event is having place a bid button or even it may not a e1 lot also
					 for(int k=1;k<11;k++)
					 {
						 String reenterMsg="";
						 if((reenterMsg=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getText()).contains("Re-enter"))
						 {
							 //listing-343249
							 String id=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getAttribute("id");
							 String href2[]=id.split("listing-");
							 ID=href2[1];
							 System.out.println("Lot ID id: "+ID);
							 break;
						 }

					 }



					 BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"MAX");
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
			String ID="";
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

				 if(driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).isDisplayed())
				 {
					 driver.findElement(By.xpath("(//*[@type='radio' and @value='Exact Bid'])[2]")).click();
					 Thread.sleep(4000);
					 driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();
					 //we can't say every first lot in event is having place a bid button or even it may not a e1 lot also
					 for(int k=1;k<11;k++)
					 {
						 String reenterMsg="";
						 if((reenterMsg=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getText()).contains("Re-enter"))
						 {
							 //listing-343249
							 String id=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getAttribute("id");
							 String href2[]=id.split("listing-");
							 ID=href2[1];
							 System.out.println("Lot ID id: "+ID);
							 break;
						 }

					 }



					 BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"EXACT");
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
			String ID="";
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://qa.equipmentone.com/all-equipment/equipmentone-listings");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			Thread.sleep(1000);
			//navigation to next page
			//   driver.findElement(By.linkText("2")).click();
			//Thread.sleep(5000)
			if(driver.findElements(By.xpath("(//*[@class='e1tooltip icon-custom-watching'])")).size()==0)
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")));
				//clicking on first binocular icon which is not yet watching
				driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
			}
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

				//we can't say every first lot in event is having place a bid button or even it may not a e1 lot also
				for(int k=1;k<6;k++)
				{
					String reenterMsg="";
					if((reenterMsg=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getText()).contains("Re-enter"))
					{
						//listing-343249
						String id=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getAttribute("id");
						String href2[]=id.split("listing-");
						ID=href2[1];
						System.out.println("Lot ID id: "+ID);
						break;
					}

				}


				BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"EXACT");   
				resultDetails.setFlag(true);
			}
			else
			{
				System.out.println("there is no place a bid button in watchlist section");
				resultDetails.setFlag(false);
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
			String ID="";
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://qa.equipmentone.com/all-equipment/equipmentone-listings");
			WebDriverWait wait = new WebDriverWait(driver, 25);
			Thread.sleep(1000);
			//navigation to next page
			// driver.findElement(By.linkText("2")).click();
			//Thread.sleep(5000)
			if(driver.findElements(By.xpath("(//*[@class='e1tooltip icon-custom-watching'])")).size()==0){
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")));
				//clicking on first binocular icon which is not yet watching
				driver.findElement(By.xpath("(//*[@class='e1tooltip icon_watchlist'])[1]")).click();
			}
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='MyONE '])[2]")));
			driver.findElement(By.xpath("(//a[text()='MyONE '])[2]")).click();
			//Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Watching")));

			driver.findElement(By.partialLinkText("Watching")).click();
			if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))).isDisplayed())
			{
				driver.findElement(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]")).click();

				//we can't say every first lot in event is having place a bid button or even it may not a e1 lot also
				for(int k=1;k<6;k++)
				{
					String reenterMsg="";
					if((reenterMsg=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getText()).contains("Re-enter"))
					{
						//listing-343249
						String id=driver.findElement(By.xpath("(//*[contains(@id,'listing-')])["+k+"]")).getAttribute("id");
						String href2[]=id.split("listing-");
						ID=href2[1];
						System.out.println("Lot ID id: "+ID);
						break;
					}

				}


				BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,"MAX");   
				resultDetails.setFlag(true);
			}
			else
			{
				System.out.println("there is no place a bid button in watchlist section");
				resultDetails.setFlag(false);
			}
		} 
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);

		}


	}

	public void BIDDING_IN_LISTINGDETAILSPAGE(WebDriver driver,String ID,String BidType) throws Exception {

		try {
			int index=2;
			int k=0;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[1]")).getText();
			String[] offer11=offer_withdollar.split(".00 ");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
			Integer a=Integer.parseInt(offer);
			System.out.println("you need to enter: "+offer);
			//SUMAN
			Integer a1=a;
			//to overcome 'You cannot place a bid lower than or the same amount as your previous bid' 
			Integer a2=0;  
			String MyMaxbid=driver.findElement(By.xpath("//*[contains(@id,'listing-"+ID+"')]")).getText();
			if(MyMaxbid.contains("MY MAX BID"))
			{
				String MM[]=MyMaxbid.split("MY MAX BID");
				String amt[]=MM[1].split(".00 ");
				String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
				a2=Integer.parseInt(MyMaxAmount)+100; 
				if(a2>a1){
					offer=a2.toString();
					driver.findElement(By.xpath("//*[@type='button' and @value='UNDO']")).click();
					Thread.sleep(4000);
					// try is for non lot details page, and catch is for lot details page
					try{
						if(BidType.equalsIgnoreCase("EXACT")){
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							driver.findElement(By.xpath("(//*[@type='radio' and @value='Exact Bid'])[2]")).click();
						index=2;}
						Thread.sleep(4000);
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.findElement(By.xpath("(//span[@class='placeholderContainer'])[2]/span")).click();
						driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput'])[2]")).sendKeys(offer);
						driver.findElement(By.xpath("(//*[@value='PLACE A BID'])[2]")).click();
					}
					catch(Exception e)
					{
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						//System.out.println("9999999999999999999999999999999999999999999"+e);
						if(BidType.equalsIgnoreCase("EXACT"))
							driver.findElement(By.xpath("(//*[@type='radio' and @value='Exact Bid'])[1]")).click();
						Thread.sleep(4000);						
						driver.findElement(By.xpath("(//span[@class='placeholderContainer'])[1]/span")).click();
						driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput'])[1]")).sendKeys(offer);
						driver.findElement(By.xpath("(//*[@value='PLACE A BID'])[1]")).click();
					}
				}
			}

			//SUMAN
			//	try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])["+index+"]")).sendKeys(offer);
			}
			catch(Exception e)
			{
				index=1;
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])["+index+"]")).sendKeys(offer);
			}
			driver.findElement(By.xpath("(//input[@class='btn btn-primary jsConfirmOffer'])["+index+"]")).click();
			//	}
			/*catch(Exception e)
			{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
				driver.findElement(By.xpath("(//input[@class='btn btn-primary jsConfirmOffer'])[1]")).click();

			}*/
			//CHECKING CALCULATION PART
			/*Thread.sleep(4000);
			String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 text-right myone-green jsBidTotal'])[2]")).getText();
			Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));*/
			/*int act_amount=(int) total_amount2;
			int exp_amount=(int) (a*1.1);

			if(act_amount!=exp_amount)
				k=1;*/

			//some times we have confirmation check-box and some times we dont have
			try{
				//driver.findElement(By.xpath("(//input[@class='jsTermsAgree'])[1]")).click();
				 WebElement element=driver.findElement(By.xpath("(//input[@class='jsTermsAgree'])[1]"));
			     JavascriptExecutor js = (JavascriptExecutor)driver;
			     js.executeScript("arguments[0].click();", element);
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}

			Thread.sleep(5000);
			//driver.findElement(By.xpath("(//input[@class='btn btn-primary jsSubmitOffer'])["+index+"]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try{driver.findElement(By.xpath("(//input[@class='btn btn-primary btn-block jsSubmitOffer'])[1]")).click();}
			catch(Exception e){driver.findElement(By.xpath("(//input[@class='btn btn-primary btn-block jsSubmitOffer'])[2]")).click();}
			Thread.sleep(15000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//verifying my max amount to confirm whether bid was done successfully or not
			Integer a3=0;
			String MyMaxbid2=driver.findElement(By.xpath("//*[@id='listing-"+ID+"']")).getText();
			if(MyMaxbid.contains("MY MAX BID"))
			{
				String MM[]=MyMaxbid2.split("MY MAX BID");
				String amt[]=MM[1].split(".00 ");
				String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
				a3=Integer.parseInt(MyMaxAmount);
				if(a3.equals(a2)){
					resultDetails.setFlag(true); 
					System.out.println("newly entered bidded amount is: "+a3);
				}
			}
			else
				resultDetails.setFlag(false);


		} catch (Exception e ) {
			e.printStackTrace();
			resultDetails.setFlag(false);
			throw(e);  
		}


	}

	public void BIDAMOUNTCALCULATION(WebDriver driver,String fieldText)
	{

		try {

			//suman
			String offer="";
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 25);
			String page=fieldText;
			switch (page) {

			case "LOTPAGE":

				if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@value,'PLACE A BID')])[2]"))).isDisplayed())
				{
					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')])")).getText();

					String[] offer11=offer_withdollar.split(".00 ");
					String offer1=offer11[0].replace("$", "");
					offer=offer1.replace(",", "");
					Integer a1=Integer.parseInt(offer);
					Integer a2=0;
					String MyMaxbid=driver.findElement(By.xpath("//*[contains(@id,'listing-') and contains(@class,'row listing-item e1ListingItem jsListingRendered')]")).getText();
					if(MyMaxbid.contains("MY MAX BID"))
					{
						String MM[]=MyMaxbid.split("MY MAX BID");
						String amt[]=MM[1].split(".00 ");
						String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
						a2=Integer.parseInt(MyMaxAmount)+100; 
					}
					if(a2>a1)
						offer=a2.toString();
					else
						offer=a1.toString();
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput'])[2]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@value='PLACE A BID'])[2]")).click();
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@class='btn btn-primary jsConfirmOffer'])[2]")).click();
					Integer a=Integer.parseInt(offer);
					//CHECKING CALCULATION PART
					Thread.sleep(4000);
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[1]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
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


				if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@value='PLACE A BID'])[1]"))).isDisplayed())
				{
					//	driver.findElement(By.xpath("(//*[@value='PLACE A BID'])")).click();

					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText bidamt'])")).getText();

					String[] offer11=offer_withdollar.split(".00 ");
					String offer1=offer11[0].replace("$", "");
					offer=offer1.replace(",", "");
					Integer a1=Integer.parseInt(offer);


					Integer a2=0;
					String MyMaxbid=driver.findElement(By.xpath("//*[contains(@class,'jsMyMaxBidText')]")).getText();
					if(MyMaxbid.contains("MY MAX BID"))
					{
						String MM[]=MyMaxbid.split("MY MAX BID");
						String amt[]=MM[1].split(".00 ");
						String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
						a2=Integer.parseInt(MyMaxAmount)+100; 
					}
					if(a2>a1)
						offer=a2.toString();
					else
						offer=a1.toString();
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput'])[1]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@value='PLACE A BID'])[1]")).click();
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@class='btn btn-primary jsConfirmOffer'])[1]")).click();
					Integer a=Integer.parseInt(offer);
					//CHECKING CALCULATION PART
					Thread.sleep(4000);
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[1]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
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
					resultDetails.setFlag(false);
				}
				break;


		case "EVENTDETAILSPAGE":	


				if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@value='PLACE A BID'])[last()]"))).isDisplayed())
				{
					//	driver.findElement(By.xpath("(//*[@value='PLACE A BID'])")).click();

					String offer_withdollar=driver.findElement(By.xpath("(//span[@class='jsMinOffer jsAmountText bidamt'])[last()]")).getText();

					String[] offer11=offer_withdollar.split("\\.");
					String offer1=offer11[0].replace("$", "");
					offer=offer1.replace(",", "");
					Integer a1=Integer.parseInt(offer);


					Integer a2=0;
					String MyMaxbid=driver.findElement(By.xpath("//*[contains(@class,'jsMyMaxBidText')]")).getText();
					if(MyMaxbid.contains("MY MAX BID"))
					{
						String MM[]=MyMaxbid.split("MY MAX BID");
						String amt[]=MM[1].split(".00 ");
						String MyMaxAmount=amt[0].replace(",", "").replace("$", "").replace(" ", "");
						a2=Integer.parseInt(MyMaxAmount)+100; 
					}
					if(a2>a1)
						offer=a2.toString();
					else
						offer=a1.toString();
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput'])[last()]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@value='PLACE A BID'])[last()]")).click();
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
					Thread.sleep(2500);
					driver.findElement(By.xpath("(//*[@class='btn btn-primary jsConfirmOffer'])[last()]")).click();
					Thread.sleep(2500);
					Integer a=Integer.parseInt(offer);
					//CHECKING CALCULATION PART
					Thread.sleep(4000);
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[last()]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
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
					resultDetails.setFlag(false);
				}
				break;


			
		} 
		}
		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage(e.toString());
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try{	
			if(fieldText.equalsIgnoreCase("back"))
				driver.navigate().back();
			else if(fieldText.equalsIgnoreCase("forward"))
				driver.navigate().forward();
			else		
				driver.navigate().to(fieldText);
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false);
		}


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

	public void ADDINGTOWATCHLIST(WebDriver driver){

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try{
			if(driver.findElements(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to remove from')])[1]")).size()>0)
				System.out.println("already there are some lots in watchlist section");
			else
				driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle' and contains(@data-original-title,'Click to')])[1]")).click();
			resultDetails.setFlag(true); 
		}

		catch (Exception e ) {

			e.printStackTrace();
			resultDetails.setErrorMessage("Error encountered while trying to add a lot to watchlist");  
			resultDetails.setFlag(false);
		}
	}

	public void SUBCATEGORYSELECTION(WebDriver driver,String fieldText,String value){
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String category= fieldText.substring(3, fieldText.length());
			String subcat=value.substring(3, value.length());
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(category))); 
			new Actions(driver).moveToElement(driver.findElement(By.xpath(category))).perform();
			Thread.sleep(5000);
			
			try{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(subcat))); 
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
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[contains(@class,'dropdown mega navBarText')]/a[starts-with(text(),'Browse ')]")).click();
				System.out.println("clicked on All Equipment Link");
				resultDetails.setFlag(true);
			}
			catch(Exception e)
			{
				driver.navigate().to("https://qa.equipmentone.com/all-equipment");
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
				eqid_1=driver.findElement(By.xpath("//*[text()='Lot Number']/following-sibling::div[contains(@class,'jsLotID')]")).getText();
			else if(pagename.equalsIgnoreCase("SEARCHRESULTPAGE"))
				eqid_1=driver.findElement(By.xpath("(//a[contains(@href,'/listing?listingid=')]/following::div[@class='rgbold jsLotID myone-black'])[4]")).getText();
			else if(pagename.equalsIgnoreCase("HOMEPAGE"))
			{
				eqid_1=driver.findElement(By.xpath("(//a[contains(@href,'/listing?listingid=')]/following::div[@class='rgbold jsLotID myone-black'])[4]")).getText();
				//moving to home page
				driver.findElement(By.xpath("//a/img[@class='logo-img img-responsive']")).click();
			}
			else if(pagename.equalsIgnoreCase("MYONEPAGE"))
			{
				eqid_1=driver.findElement(By.xpath("(//a[contains(@href,'/listing?listingid=')]/following::div[@class='rgbold jsLotID myone-black'])[4]")).getText();
				//moving to MyOne page
				driver.findElement(By.xpath("(//a[contains(text(),'MyONE')])[2]")).click();
			}
			Thread.sleep(5000);
			//searching with above lot id
			driver.findElement(By.id("search")).sendKeys(eqid_1);
			driver.findElement(By.xpath("//*[@id='main_search']/button")).click();
			//WebDriverWait wait=new WebDriverWait(driver, 50);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='search-tags']/ul/li[text()='"+eqid_1+"'])[2]")));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
			
			/*List<String> winHandle=  (List<String>) driver.getWindowHandles();
			int wi=winHandle.size();
			for(int i=1;i<wi;i++)
			{				 
				driver.switchTo().window(winHandle.get(i));
				driver.close();				
			}
				*/		
			System.out.println("ParantWindow(2) is: "+ParantWindow);
			if(!ParantWindow.isEmpty())
				driver.switchTo().window(ParantWindow);
			// Actions to be performed on failure
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			if(driver.getPageSource().contains("server error")||driver.getPageSource().contains("amp-staging.assetnation.com")||driver.getCurrentUrl().contains("http://amp.dev.assetnation.com") ||driver.getPageSource().contains("amp.dev.assetnation.com")){
		//	if(driver.getCurrentUrl().contains("amp-staging.assetnation.com")){
				System.out.println("A");
				driver.navigate().to("http://amp-qa.equipmentone.com");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				int logoutlink=driver.findElements(By.linkText("Logout")).size();
				if(logoutlink>0){
					AMPLOGOUT(driver);
					System.out.println("Clicked on Logout after Fail");
				}
			}
			else{
				System.out.println("B");
				int userid=driver.findElements(By.id("iduser")).size();
				if(userid>0){
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					SIGNOUT(driver);
					System.out.println("Clicked on Signout after Fail");
				}
			}


		} catch (Exception e9) {
			System.out.println("xyxyxy: "+e9);
		}
	}	
	public void AGREETERMS( WebDriver driver,String ActualFileName, String ExpectedFileName){
		try{
			String div1=driver.findElement(By.id("t3-content")).getText();
			WRITETOFILE(div1,ActualFileName);			//
			File actual = new File(ActualFileName);
			File expected = new File(ExpectedFileName);

			boolean compare1and2 = FileUtils.contentEquals(actual, expected);
			if(compare1and2)
				System.out.println("agree terms are matched");
			else
				System.out.println("agree terms are not matched");
			resultDetails.setFlag(true);





		}
		catch(Exception e){
			e.printStackTrace();
			resultDetails.setFlag(false);
		}

	}
	
	public int AMOUNTFORMAT(WebDriver driver,String fieldText){

		try{
			int a1=0;
			if(driver.findElements(By.xpath(fieldText)).size()>0)
			{
			String offer_withdollar=driver.findElement(By.xpath(fieldText)).getText();
			String[] offer11=offer_withdollar.split(".00 ");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
			a1=Integer.parseInt(offer);
			}
			return a1;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void DEFAULTBIDAMOUNT(WebDriver driver,String HighBidLocator,String EnterAmountLocator) throws Exception{
		try{
			int a1=0;
			int a2=0;
			////*[@class='jsHighBid']
			if(driver.findElements(By.xpath(HighBidLocator)).size()>0)
			{
				a1=AMOUNTFORMAT(driver,HighBidLocator);
			}
			////*[@class='jsMinOffer jsAmountText']
			a2=AMOUNTFORMAT(driver,EnterAmountLocator);

			if(a2>a1){
				System.out.println("EnterAmount: "+a2+" is greater than the HighBid amount: "+a1);
				resultDetails.setFlag(true);
			}
			else
				resultDetails.setFlag(false);

		}

		catch(Exception e)
		{
			resultDetails.setErrorMessage(e.toString());
			resultDetails.setFlag(false); 
		}

	}

	public void BIDFROMLOTDETAILSPAGE(WebDriver driver,String BIDTYPE) {

		try {
			String ID="";
			String listingId[]=driver.findElement(By.xpath("//*[contains(@id,'listing-')]")).getAttribute("id").split("listing-");
			ID=listingId[1];
			BIDDING_IN_LISTINGDETAILSPAGE(driver,ID,BIDTYPE);   
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false); 
		}
	}

	public void CLOSETAB(WebDriver driver,String tabNumber) {

		try {
			driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+tabNumber);
			Thread.sleep(2000);
			driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"w");
			Thread.sleep(2000);
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}
	


	public void SWITCHWINDOWE1(WebDriver driver,String WindowNumber) {

		try {
			Integer i=1;
			for(String winHandle : driver.getWindowHandles()) {

				driver.switchTo().window(winHandle);
				if(i.equals(WindowNumber.toString()))
					break;
				i=i+1;
			}
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}

	public void LEFTNAVLOTCOUNT(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String listingcount = driver.findElement(By.id("e1NumFound")).getText();
			String nextlistingcount = driver.findElement(By.id("e1ResultsFound")).getText();
			Integer convlistingcount = Integer.parseInt(listingcount);
			Integer convnextlistingcount = Integer.parseInt(nextlistingcount);
			System.out.println("lot count is: "+convlistingcount);
			System.out.println("event count is: "+convnextlistingcount);	
			Integer myfinalcount = convlistingcount + convnextlistingcount;
			String finalcount = String.valueOf(myfinalcount);
			System.out.println(myfinalcount);			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/listing?listingid')])[2]")).click();						
			String rescount = driver.findElement(By.xpath("(//p[contains(text(),'of') and @class='lotTitle'])[2]")).getText();
			System.out.println("Result is: "+rescount);
			if(rescount.contains(" ")){
				String[] rescount1=rescount.split(" ");
				String rescount2=rescount1[0];
				System.out.println(rescount2);
				String rescount3=rescount1[1];
				System.out.println(rescount3);
				String rescount4=rescount1[2];
				System.out.println(rescount4);
				Integer a=Integer.parseInt(rescount4);
				System.out.println("Total lot count is: "+rescount4);
				if(rescount4.equals(myfinalcount) && rescount2.equalsIgnoreCase("1")){
					resultDetails.setFlag(true); 
				}
				else{
					resultDetails.setFlag(false); 
				}
			}

		}	
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}
	public void LOTPOSITION(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/listing?listingid')])[7]")).click();						
			String rescount = driver.findElement(By.xpath("(//p[contains(text(),'7 of') and @class='lotTitle'])[2]")).getText();
			System.out.println("Result is: "+rescount);
			resultDetails.setFlag(true); 
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}
	public void ENDLOT(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> str=driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/listing?listingid')]"));
			System.out.println(str.size());
			if(str.size()>0)
			{
				str.get(str.size()-1).click();
				resultDetails.setFlag(true);
			}
			else
				resultDetails.setFlag(false); 

		}	
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}
	/*public void WATCHLIST(WebDriver driver)
		{
			try {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle'])[2]")).click();

		  if(driver.findElement(By.xpath("(//div[text()='You are no longer watching this item. Click the Watch This button again to keep.'])[2]")).isDisplayed())
		  {
		   driver.findElement(By.xpath("(//i[@class='fa fa-binoculars fa-watchstack jswatchtitle'])[2]")).click();
		   }
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("(//a[@href='/myone' and text()='MyONE '])[2]")).click();
		   driver.findElement(By.xpath("(//a[@href='myone?view=watchlist'])[2]")).click();
		   driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/listing?listingid')])[1]")).click();
		     resultDetails.setFlag(true);
		     }
		    catch(Exception e) {
		     resultDetails.setFlag(false);
		    }
		 }*/

	public void BIDAMOUNT(WebDriver driver,String fieldText) {

		try {
			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String offer_withdollar=driver.findElement(By.xpath(locatorValue)).getText();
			String[] offer11=offer_withdollar.split(".00 ");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
			Integer a=Integer.parseInt(offer);
			System.out.println("you need to enter: "+offer);
			try{
			driver.findElement(By.xpath("//input[@value='PLACE A BID']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
			Thread.sleep(3000);
			}
			catch (Exception elementnotfoundexException)
			{
				driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[2]")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
				Thread.sleep(3000);
			}
			resultDetails.setFlag(true);
		}
		catch (Exception e ) {
			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);
		}
	}
	public void BIDHISTORY(WebDriver driver,String fieldText) {

		try {
			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String offer_withdollar=driver.findElement(By.xpath(locatorValue)).getText();
			String[] offer11=offer_withdollar.split(".00 ");
			String offer1=offer11[0].replace("$", "");
			String offer=offer1.replace(",", "");
			Integer a=Integer.parseInt(offer);
			System.out.println("you need to enter: "+offer);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String bidamount=driver.findElement(By.xpath("(//tr[1]/td[3]/div)[2]")).getText();
			//$550 USD
			String[] history11;
			System.out.println(bidamount);
			if(bidamount.contains("USD"))
				history11=bidamount.split(" USD");
			else
				history11=bidamount.split(" CAD");
			System.out.println(history11[0]);
			String history1=history11[0].replace("$", "");
			String history=history1.replace(",", "");
			Integer i=Integer.parseInt(history);
			System.out.println("you need to enter: "+history);
			if(offer.equals(history)){

				resultDetails.setFlag(true);
			}
			else
			{
				System.out.println("NO Bid History");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			resultDetails.setErrorMessage("Listing is not available or Closed");  
			resultDetails.setFlag(false);
		}
	}

	public void EVENTID(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);						
			String eventid = driver.findElement(By.xpath("(//div[@class='rgbold jsEventID myone-black'])[2]")).getText();
			System.out.println(eventid);
			driver.findElement(By.xpath("//img[@alt='EquipmentOne']")).click();
			driver.findElement(By.id("search")).sendKeys(eventid);
			driver.findElement(By.xpath("//button[@class='fa fa-search fa-2x']")).click();
			String reseventid=driver.findElement(By.xpath("(//div[@class='rgbold jsEventID myone-black'])[2]")).getText();
			if(eventid.equals(reseventid))
			{
				System.out.println("Event exists");
				resultDetails.setFlag(true);
			}	
			else
				resultDetails.setFlag(false);

		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}

	public void EVENTNAME(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);						
			String eventname = driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[1]")).getText();
			System.out.println(eventname);
			driver.findElement(By.xpath("//img[@alt='EquipmentONE']")).click();
			driver.findElement(By.id("search")).sendKeys(eventname);
			driver.findElement(By.xpath("//button[@class='fa fa-search fa-2x']")).click();
			String reseventname=driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[1]")).getText();
			if(eventname.equals(reseventname))
			{
				System.out.println("Event exists");
				resultDetails.setFlag(true);
			}	
			resultDetails.setFlag(false); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}

	public void LOTSINEVENT(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String event=driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[1]")).getText();
			System.out.println(event);
			String lotcount = driver.findElement(By.xpath("(//div[@class='rgbold jsLotCount myone-black'])[2]")).getText();
			System.out.println(lotcount);
			driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[1]")).click();
			String eventName=driver.findElement(By.id("e1SearchPageTitle")).getText();
			String lots=driver.findElement(By.id("e1NumFound")).getText();
			if(lotcount.equals(lots) && event.equals(eventName))
				resultDetails.setFlag(true); 
			else
				resultDetails.setFlag(false); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false); 
		}
	}

	public void LINKSINEVENT(WebDriver driver)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String lotsavailable=driver.findElement(By.xpath("(//div[@class='rgbold jsLotCount myone-black'])[2]")).getText();
			System.out.println(lotsavailable); 
			Integer a=Integer.parseInt(lotsavailable);
			if(a>1)
			{
				driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[1]")).click();
				List<WebElement> str=driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/listing?listingid')]"));
				System.out.println(str.size());
				for(int i=0; i<str.size(); i++)
				{
					System.out.println(str.get(i).getText()); //str[i]
				}
				if(str.size()>1)
				{
					str.get(str.size()-1).click();
				}
			}

			String lotsavailable1=driver.findElement(By.xpath("(//div[@class='rgbold jsLotCount myone-black'])[3]")).getText();
			System.out.println(lotsavailable1); 
			Integer b=Integer.parseInt(lotsavailable1);
			if(b>1)
			{
				driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[2]")).click();
				List<WebElement> str1=driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/listing?listingid')]"));
				System.out.println(str1.size());
				for(int j=0; j<str1.size(); j++)
				{
					System.out.println(str1.get(j).getText()); //str[i]
				}
				if(str1.size()>1)
				{
					str1.get(str1.size()-1).click();
				}
			}

			String lotsavailable2=driver.findElement(By.xpath("(//div[@class='rgbold jsLotCount myone-black'])[4]")).getText();
			System.out.println(lotsavailable2); 
			Integer c=Integer.parseInt(lotsavailable2);
			if(c>1)
			{
				driver.findElement(By.xpath("(//a[@class='jsTitle' and contains(@href,'/event?eventid')])[3]")).click();
				List<WebElement> str2=driver.findElements(By.xpath("//a[@class='jsTitle' and contains(@href,'/listing?listingid')]"));
				System.out.println(str2.size());
				for(int h=0; h<str2.size(); h++)
				{
					System.out.println(str2.get(h).getText()); //str[i]
				}
				if(str2.size()>1)
				{
					str2.get(str2.size()-1).click();
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

	public void ACTIONONFIRSTACTIVELOT(WebDriver driver,String xpath2,String Operation1){
		// xpath1 is xpath of whole container of lot
		// operationXpath is xpath of the element on which we should do action after finding the active element/lot index
		String LotType=xpath2.substring(0,5);
		String xpath1=xpath2.substring(5,xpath2.length());
		String Operation=Operation1.substring(0,3);
		String OperationValue=Operation1.substring(3,Operation1.length());
		try{

			int i=1;
			List<WebElement> li=driver.findElements(By.xpath("//div[contains(@id,'listing-')]"));
			for (WebElement webElement : li) {
				if(webElement.getText().contains("MAX BID") && webElement.getText().contains(LotType)){
					System.out.println("++++++++++++++++++++++++++++++++++++active lot position is: "+i);
					new Actions(driver).moveToElement(webElement).perform();
					Thread.sleep(1000);
					break;
				}
				i++;
			}
			if(!xpath1.equalsIgnoreCase("//a[@class='jsTitle' and contains(@href,'/listing?listingid=')]")){
			// one extra element(invisible element) is there in search page hence adding the 1 to over come that
			i=i+1;}
			//giving the index of the active element to click on only first active element(it may be place a bid, watch list icon or whatever it may be)
			String ReqXpath="("+xpath1+")["+i+"]";
			System.out.println(ReqXpath);
			
			//new Actions(driver).moveToElement(driver.findElement(By.xpath(ReqXpath))).perform();
			Thread.sleep(1000);
			switch (Operation) {
			case "CLK":
				//if any lot is already in watching list and there are no more lots available to add into watchlist then we are skipping this
				if(!(ReqXpath.contains("e1tooltip icon_watchlist") && driver.findElements(By.xpath(ReqXpath)).size()==0))
					driver.findElement(By.xpath(ReqXpath)).click();
				break;

			case "SND":
				driver.findElement(By.xpath(ReqXpath)).sendKeys(OperationValue);
				break;
			}
			
			
			resultDetails.setFlag(true);
		}
		catch(Exception e){
			
			resultDetails.setErrorMessage(e.toString());
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	
	public void WRITETOFILE(String text,String filename) throws IOException
	{
	BufferedWriter output = null;
    try {
        File file = new File(filename);
        output = new BufferedWriter(new FileWriter(file));
        output.write(text);
    } 
	catch ( IOException e ) 
	{
        e.printStackTrace();
    } finally {
        if ( output != null ) 
        	output.close();
    }
}
		
	/*StackTraceElement[] elements = e.getStackTrace();  
		   System.out.println(elements[elements.length-1].getLineNumber());
		   System.out.println(e.toString());	 */
	
	
	
	
		public void SETFORESEE(WebDriver driver) 
		{  

		try {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://qa.equipmentone.com/#acscommand=fstest");
		driver.navigate().refresh();
		//Thread.sleep(1000);
	             driver.findElement(By.xpath("//input[@value='Clear']")).click();
		driver.findElement(By.xpath("//input[@name='tablet_web']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='mobile_web']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='browse']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@value='Set']")).click();
		//Thread.sleep(1000);

		driver.get("https://qa.equipmentone.com");
	
		resultDetails.setFlag(true);
		}

		catch (Exception e ){
			System.out.println("values are not set");
			resultDetails.setFlag(false);

		}

	}
	public void APPROVELOT(WebDriver driver)
	{
		try{
			Thread.sleep(2000);
			
			//	String ParentHandle = driver.getWindowHandle();
				driver.findElement(By.xpath("//a[contains(text(),'Approve')]")).click();	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);		
                driver.findElement(By.xpath("//*[@name='reason']")).sendKeys("test");
				driver.findElement(By.name("verify")).click();
				driver.findElement(By.xpath("//input[@value='Approve']")).click();
				Thread.sleep(1000);	
                  // Closing the Child Window.
                      //  driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);
				Thread.sleep(1000);	
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false);
		}
	}
	public void ADDLOTTOANEVENT(WebDriver driver, String fieldText,String value)
	{
		//String fieldType = fieldText;
		//String field = fieldText;
		
		try{
			    //AppKeyWords BIDTYPE = AppKeyWords.valueOf(fieldType.toUpperCase());			
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
				String e1lotId=driver.findElement(By.xpath("(//td[@class='listdata'])[1]")).getText();
				System.out.println(e1lotId);
				Thread.sleep(1000);	
				//clicking on Auctions link
				driver.findElement(By.xpath("//a[text()='Auctions']")).click();  
				Thread.sleep(1000);	
				//selecting venue
				Select selectvenue=new Select(driver.findElement(By.xpath("//select[@name='venueID']")));
				selectvenue.selectByVisibleText("EquipmentOne");
				//selecting status 
				Select lotstatus=new Select(driver.findElement(By.name("salestatus")));
				lotstatus.selectByVisibleText("Approved");
				//click on find button
				driver.findElement(By.xpath("(//input[@class='submitbutton'])[1]")).click();
				//storing the event id 
				String eventid=driver.findElement(By.xpath("(//td[@class='listdata']/b)[1]")).getText();
				System.out.println(eventid);
				//adding lot to the event
				driver.findElement(By.xpath("(//a[text()='Add / Remove Lots'])[1]")).click(); 
				String ParentWindow = driver.getWindowHandle();
				String Childwindow = ParentWindow;
				for (String Handle : driver.getWindowHandles())
				{
					if (!Childwindow.equals(Handle))
					{
						Childwindow = Handle;
						driver.switchTo().window(Childwindow);
						Thread.sleep(1500);
						driver.findElement(By.name("search_string")).sendKeys(e1lotId);
						Thread.sleep(1500);
						driver.findElement(By.name("searchListings")).click(); 
						Thread.sleep(1500);
						driver.findElement(By.name("listingIDs")).click();
						Thread.sleep(1500);
						driver.findElement(By.name("saveListings")).click();
						Thread.sleep(1500);
					}
				}
				driver.switchTo().window(ParentWindow);
				driver.navigate().refresh();
				/*if(driver.findElement(By.xpath("(//li[contains(text(),'Open Auction')])[1]")).isDisplayed())
				{
					
				}*/
				driver.findElement(By.xpath("//a[@href='/security/logout']")).click();
				Thread.sleep(5000);	 		
				SETFORESEE(driver);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    SIGNIN(driver, fieldText, value);
				Thread.sleep(1500);
				driver.findElement(By.id("search")).sendKeys(eventid);
				Thread.sleep(1500);
				driver.findElement(By.xpath("//button[@class='fa fa-search fa-2x']")).click();
				Thread.sleep(1500);
				if(driver.findElement(By.xpath("//span[@class='e1EventsText']")).isDisplayed())
				{
				driver.findElement(By.xpath("(//a[contains(@href,'/event?eventid')])[1]")).click();
				Thread.sleep(1500);	
				}
				else
				{
					System.out.println("event is not displayed");
				}
		    
		resultDetails.setFlag(true);
	    }
	    catch (Exception e ) 
		{
            e.printStackTrace();
		    resultDetails.setFlag(false);		
      
	    }	
	}
     public void ADDQUALIFIEDLOTTOANEVENT(WebDriver driver)
	{
		try
		{
			//LOTCONVERSION(driver);
			driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]")).click();
			driver.findElement(By.xpath("(//input[@name='offerPreview'])[2]")).click();
			driver.findElement(By.name("savebutton")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
			String lotId=driver.findElement(By.xpath("(//td[@class='listdata'])[1]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'Private Sale')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='DEPOSIT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("depositAmount")).sendKeys("0");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Save Changes']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
			Thread.sleep(2000);
			APPROVELOT(driver);
			driver.findElement(By.xpath("//a[text()='Auctions']")).click();  
			//selecting venue
			Thread.sleep(2000);
			Select selectvenue=new Select(driver.findElement(By.xpath("//select[@name='venueID']")));
			selectvenue.selectByVisibleText("EquipmentOne");
			//selecting status 
			Select lotstatus=new Select(driver.findElement(By.name("salestatus")));
			lotstatus.selectByVisibleText("Approved");
			//click on find button
			driver.findElement(By.xpath("(//input[@class='submitbutton'])[1]")).click();
			//storing the event id 
			String eventid=driver.findElement(By.xpath("(//td[@class='listdata']/b)[1]")).getText();
			System.out.println(eventid);
			//adding lot to the event
			driver.findElement(By.xpath("//a[text()='Add / Remove Lots']")).click(); 
			String MainWindow = driver.getWindowHandle();
			String Childwindow1 = MainWindow;
			for (String Handle : driver.getWindowHandles())
				{
					if (!Childwindow1.equals(Handle))
					{
						Childwindow1 = Handle;
						driver.switchTo().window(Childwindow1);
						Thread.sleep(1500);
						driver.findElement(By.name("search_string")).sendKeys(lotId);
						Thread.sleep(1500);
						driver.findElement(By.name("searchListings")).click(); 
						Thread.sleep(1500);
						driver.findElement(By.name("listingIDs")).click();
						Thread.sleep(1500);
						driver.findElement(By.name("saveListings")).click();
						Thread.sleep(1500);
					}
				}
			driver.switchTo().window(MainWindow);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/security/logout']")).click();
			Thread.sleep(5000);	
			SETFORESEE(driver);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("cain_123@yahoo.com");
			driver.findElement(By.xpath("//input[@id='josso_password']")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("search")).sendKeys(eventid);
			Thread.sleep(1500);
			driver.findElement(By.xpath("//button[@class='fa fa-search fa-2x']")).click();
			Thread.sleep(1500);
			if(driver.findElement(By.xpath("//span[@class='e1EventsText']")).isDisplayed())
			{
				driver.findElement(By.xpath("(//a[contains(@href,'/event?eventid')])[1]")).click();
				Thread.sleep(1500);
				PAGINATION(driver);
			resultDetails.setFlag(true);
			}		
		}	
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);		
		}
	}
	public void BIDDINGONQUALIFIEDEVENT(WebDriver driver, String fieldText)
	{
		String fieldType = fieldText;
		String field = fieldText;
		try{
			AppKeyWords EVENTBID = AppKeyWords.valueOf(fieldType.toUpperCase());			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (EVENTBID) 
			{
			case MAXQUALIFIEDERRORMSG:
				try{
					ADDQUALIFIEDLOTTOANEVENT(driver);
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys("1");
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
					String errormsg="The listing you are attempting to make an offer on is for Qualified Buyers only. Please contact Customer Care at 855-723-7781.";
					if(driver.findElement(By.xpath("//span[contains(text(),'The listing you are attempting to make an offer on is for Qualified Buyers only. Please contact Customer Care at 855-723-7781.')]")).getText().contains(errormsg))
					{
						System.out.println("Error message displayed");
						resultDetails.setFlag(true);
					}
					}
					catch (Exception e )
					{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
					}
					break;
			case EXACTQUALIFIEDERRORMSG:
				try{
					ADDQUALIFIEDLOTTOANEVENT(driver);
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys("1");
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
					String errormsg="The listing you are attempting to make an offer on is for Qualified Buyers only. Please contact Customer Care at 855-723-7781.";
					if(driver.findElement(By.xpath("//span[contains(text(),'The listing you are attempting to make an offer on is for Qualified Buyers only. Please contact Customer Care at 855-723-7781.')]")).getText().contains(errormsg))
					{
						System.out.println("Error message displayed");
						resultDetails.setFlag(true);
					}
					}
					catch (Exception e )
					{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
					}
					break;			
			}
			resultDetails.setFlag(true);
		}
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);		
		}
	}
	public void QUALIFIEDLOTINEVENTPAGE(WebDriver driver)
	{				
				try{
					//LOTCONVERSION
					//ADDINGQUALIFIEDUSER(driver);
					//APPROVELOT(driver);
					String lotId=driver.findElement(By.xpath("(//td[@class='listdata'])[1]")).getText();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//a[text()='Auctions']")).click();  
					//selecting venue
					Thread.sleep(2000);
					Select selectvenue=new Select(driver.findElement(By.xpath("//select[@name='venueID']")));
					selectvenue.selectByVisibleText("EquipmentOne");
					//selecting status 
					Select lotstatus=new Select(driver.findElement(By.name("salestatus")));
					lotstatus.selectByVisibleText("Approved");
					//click on find button
					driver.findElement(By.xpath("(//input[@class='submitbutton'])[1]")).click();
					//storing the event id 
					String eventid=driver.findElement(By.xpath("(//td[@class='listdata']/b)[1]")).getText();
					System.out.println(eventid);
					//adding lot to the event
					driver.findElement(By.xpath("//a[text()='Add / Remove Lots']")).click(); 
					String MainWindow3 = driver.getWindowHandle();
					String Childwindow3 = MainWindow3;
					for (String Handle : driver.getWindowHandles())
					{
					if (!Childwindow3.equals(Handle))
					{
						Childwindow3 = Handle;
						driver.switchTo().window(Childwindow3);
						Thread.sleep(1500);
						driver.findElement(By.name("search_string")).sendKeys(lotId);
						Thread.sleep(1500);
						driver.findElement(By.name("searchListings")).click(); 
						Thread.sleep(1500);
						driver.findElement(By.name("listingIDs")).click();
						Thread.sleep(1500);
						driver.findElement(By.name("saveListings")).click();
						Thread.sleep(1500);
					}
					}
					driver.switchTo().window(MainWindow3);
					driver.findElement(By.xpath("//a[@href='/security/logout']")).click();
					Thread.sleep(5000);	
					SETFORESEE(driver);
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("qualifieduser@automation.com");
					driver.findElement(By.xpath("//input[@id='josso_password']")).sendKeys("Equipment1$");
					driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
					Thread.sleep(1500);
					driver.findElement(By.id("search")).sendKeys(eventid);
					Thread.sleep(1500);
					driver.findElement(By.xpath("//button[@class='fa fa-search fa-2x']")).click();
					Thread.sleep(1500);
					if(driver.findElement(By.xpath("//span[@class='e1EventsText']")).isDisplayed())
					{
					driver.findElement(By.xpath("(//a[contains(@href,'/event?eventid')])[1]")).click();
					Thread.sleep(1500);
					PAGINATION(driver);
					String e1lotid=driver.findElement(By.xpath("(//div[@class='rgbold jsLotID myone-black'])[last()]")).getText();
					if(lotId.equalsIgnoreCase(e1lotid))
					{
						System.out.println("lot is displayed in event details page");
						resultDetails.setFlag(true);
					}
				}
			}
			
			
			catch(Exception e )
			{
				e.printStackTrace();
				resultDetails.setErrorMessage(e.toString());
				resultDetails.setFlag(false);
			}
	}				
	public void BIDONQUALIFIEDLOT(WebDriver driver, String fieldText)
	{
		String fieldType = fieldText;
		String field = fieldText;
		try{
			AppKeyWords QUALIFIEDBID = AppKeyWords.valueOf(fieldType.toUpperCase());			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (QUALIFIEDBID) 
			{
			case MAXBIDQUALIFIED:
				try{
					QUALIFIEDLOTINEVENTPAGE(driver);
					Thread.sleep(1500);
					String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[last()]")).getText();
					String[] offer11=offer_withdollar.split(".00 ");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
					Integer a=Integer.parseInt(offer);
					System.out.println("you need to enter: "+offer);
					driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(offer);
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
					Thread.sleep(1500);
					if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).isDisplayed())
					{
						driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
					}
			        else
			            System.out.println("there is no confirm check box");
						driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
						Thread.sleep(1500);
						resultDetails.setFlag(true);
					}
					catch(Exception e)
					{   
					    String msg="Your Results List";
						if(msg.equalsIgnoreCase("Your Results List"))
						{
							String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))")).getText();
					        String[] offer11=offer_withdollar.split(".00 ");
					        String offer1=offer11[0].replace("$", "");
							String offer=offer1.replace(",", "");
							Integer a=Integer.parseInt(offer);
							System.out.println("you need to enter: "+offer);
							driver.findElement(By.xpath("(//input[@name='makeoffer'])")).sendKeys(offer);
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@value='PLACE A BID'])")).click();
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])")).sendKeys(offer);
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
							Thread.sleep(1500);
							if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])")).isDisplayed())
							{
							driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])")).click();
							}
							else
							System.out.println("there is no confirm check box");
							driver.findElement(By.xpath("(//input[@value='Submit'])")).click();
							Thread.sleep(1500);
							resultDetails.setFlag(true);
						}
						else
						{
							resultDetails.setFlag(false);
						}
					}
					break;
			
				
				case EXACTBIDQUALIFIED:
					try{
						QUALIFIEDLOTINEVENTPAGE(driver);
						Thread.sleep(1500);
						String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[last()]")).getText();
						String[] offer11=offer_withdollar.split(".00 ");
						String offer1=offer11[0].replace("$", "");
						String offer=offer1.replace(",", "");
						Integer a=Integer.parseInt(offer);
						System.out.println("you need to enter: "+offer);
						driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
					    Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(offer);
					    Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
						Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
						Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
						Thread.sleep(1500);
						if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).isDisplayed())
						{
							driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
						}
			            else
			                System.out.println("there is no confirm check box");
							driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
							Thread.sleep(1500);
							resultDetails.setFlag(true);
						}
					catch(Exception e)
					{
						e.printStackTrace();
						resultDetails.setErrorMessage(e.toString());
						resultDetails.setFlag(false);
					}
					break;
				}					
				resultDetails.setFlag(true);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				resultDetails.setFlag(false);		
			}
	}
	public void ADDINGQUALIFIEDUSER(WebDriver driver, String fieldText)
	{
		try{
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("(//a[contains(text(),'Private Sale')])[1]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("//input[@name='restriction' and @value='DEPOSIT']")).click();
					Thread.sleep(2000);
					driver.findElement(By.name("depositAmount")).sendKeys("0");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@value='Save Changes']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Choose User']")).click();
					String MainWindow1=driver.getWindowHandle();
					String ChildWindow1=MainWindow1;
					for(String handles:driver.getWindowHandles())
					{
						if(!(ChildWindow1.equals(handles)))
						{
							ChildWindow1 = handles;
							driver.switchTo().window(ChildWindow1);
							driver.findElement(By.name("email")).sendKeys(fieldText);
						    Thread.sleep(8000);
							driver.findElement(By.xpath("//input[@value='Search']")).click();
							Thread.sleep(5000); 	
							driver.findElement(By.xpath("//a[contains(@href,'javascript:')]")).click();
							Thread.sleep(2000);
						}
					}
					driver.switchTo().window(MainWindow1);
					Select selectdropdown=new Select(driver.findElement(By.name("depositType")));
					selectdropdown.selectByVisibleText("Other");
					Thread.sleep(2000);
					driver.findElement(By.name("savebutton")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
					Thread.sleep(2000);
					resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
				resultDetails.setFlag(false);	
		}
	}
	
	public void CLOSELOT(WebDriver driver) // Close the Lot from AMP.
	{
		try{
			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
				driver.findElement(By.xpath("//a[contains(text(),'Close Now')]")).click();	
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String MainWindow=driver.getWindowHandle();		
        		
        
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 driver.switchTo().window(ChildWindow);		
             
				driver.findElement(By.xpath("//input[@value='Close Now']")).click();
				Thread.sleep(1000);	
           	
            }		
        }		
        
            driver.switchTo().window(MainWindow);
				Thread.sleep(1000);	
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false);
		}
	}
	
	
	public void TRASHLOT(WebDriver driver) // Close the Lot from AMP.
	{
		try{
			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
				driver.findElement(By.xpath("//a[contains(text(),'Trash')]")).click();	
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				String MainWindow=driver.getWindowHandle();		
        		
        
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 driver.switchTo().window(ChildWindow);		
             
				driver.findElement(By.xpath("//input[@value='Trash']")).click();
				Thread.sleep(1000);	
           	
            }		
        }		
        
            driver.switchTo().window(MainWindow);
				Thread.sleep(1000);	
			resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			resultDetails.setFlag(false);
		}
	}
	
	public void PAGINATION(WebDriver driver)
	{
		try{
			    String lotcount=driver.findElement(By.xpath("(//span[@class='e1NumFound'])[2]")).getText();
		        int count=Integer.parseInt(lotcount);
		        if(count>20)
				{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    List<WebElement> options = driver.findElements(By.xpath("//select[@name='dropdownPages']/option"));
		        System.out.println(options.size());
		        int paginationSize=(options.size())/2;
		        System.out.println(paginationSize);
		        int i =paginationSize ;
		        for(i = 0; i <= paginationSize; i++)
		        { 
                System.out.println("checking the condition");
				if(i==paginationSize)
				{
			    Select paginationdropdown=new Select(driver.findElement(By.xpath("(//select[@name='dropdownPages'])[1]")));
			    Thread.sleep(1000);
			    paginationdropdown.selectByIndex(i-1);
			    Thread.sleep(2000);
			    }
				}
				}
				else
				{
				System.out.println("no pagination is displayed");					
				}
				resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			 e.printStackTrace();
			 resultDetails.setFlag(false);
	    }
	}
	public void WAITFORELEMENTPRESENCE(WebDriver driver,String fieldText)
	{
		//Used to verify the text in any specific Loctor or Message
		//<XPH or LNK or IDI or TXT or MSG><Locator> in fieldText 
		//Time in milliseconds in Value
		try{ 

			String f = fieldText;
			String locatorType=f.substring(0,3);
			String locatorValue=f.substring(3,f.length());
			WebDriverWait wait = new WebDriverWait(driver, 2000);
	        if(locatorType.equalsIgnoreCase("XPH")){
                
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorValue))); 
				if(driver.findElements(By.xpath(locatorValue)).size()>0)
					resultDetails.setFlag(true);
			}
			else if(locatorType.equalsIgnoreCase("LNK")){
                
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(locatorValue))); 
				if(driver.findElements(By.linkText(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("IDI") || locatorType.equalsIgnoreCase("TXT")){
                
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locatorValue))); 
				if(driver.findElements(By.id(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			}
			else if(locatorType.equalsIgnoreCase("PLK")){
                
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locatorValue))); 
				if(driver.findElements(By.partialLinkText(locatorValue)).size()>0)
					resultDetails.setFlag(true);


			} 
			else
			{
				Thread.sleep(2000);
				resultDetails.setFlag(true);
			}

		}

		catch(Exception e){
			resultDetails.setErrorMessage(fieldText+"Locator Not Found");
			resultDetails.setFlag(false);

		}
	}
	public void DISAPPEARBIN(WebDriver driver, String fieldText)
	{
			try
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String binValue0=driver.findElement(By.xpath("(//div[@class='e1BuyItNowPrice row buyit-price text-right'])[last()]")).getText();
			//int binValue1=Integer.parseInt(binValue);
			System.out.println(binValue0);
		    String binValue1[]=binValue0.split("\\.");
		    System.out.println(binValue1[0]);
		    String binValue2=binValue1[0].replace("$", "");
		    System.out.println(binValue2);
		    String binValue3=binValue2.replace(",", "");
		    System.out.println(binValue3);
		    int binValue=Integer.parseInt(binValue3);
		    System.out.println(binValue);
		    int value=binValue*(81);
		    System.out.println(value);
		    int Value2 =value/100;
		    System.out.println(Value2);
		    String enterBin=Integer.toString(Value2);
		    System.out.println(enterBin);
			String fieldType = fieldText;
			String field = fieldText;
			try{
			AppKeyWords BINDISAPPEAR = AppKeyWords.valueOf(fieldType.toUpperCase());			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (BINDISAPPEAR) 
			{
			case BINEVENT:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			 resultDetails.setFlag(true);
			}
			catch(Exception e){
				e.printStackTrace();
				resultDetails.setFlag(false);
			}
			break;
			case BINLOTDETAILS:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("//input[@value='Exact Bid']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='makeoffer']")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@value='PLACE A BID']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[1]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			resultDetails.setFlag(true);	
		}
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		break;
		case BINWATCHLISTSEARCH:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("(//input[@value='Exact Bid'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@name='makeoffer'])[2]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			resultDetails.setFlag(true);	
		}
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		break;
		}
		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void ERRORMSGSINEVENT(WebDriver driver, String fieldText)
	{
		String fieldType = fieldText;
		String field = fieldText;
		try{
		    AppKeyWords BIDTYPE = AppKeyWords.valueOf(fieldType.toUpperCase());	
		  
		    switch(BIDTYPE) 
		    {
			case MAXBID:
				try
				{
				PAGINATION(driver);
				driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
				Thread.sleep(1500);
			    driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
				String errormsg="Amounts do not match!";
				if(driver.findElement(By.xpath("//span[contains(text(),'Amounts do not match!')]")).getText().contains(errormsg))
				{
					System.out.println("Amounts do not match error message displayed");
				}
				else
				{
					System.out.println("Amounts do not match error message is not displayed");
				}
				resultDetails.setFlag(true);
				}				
				catch (Exception e )
				{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}
				break;				
			case BIN:	
			    try
				{
				PAGINATION(driver);
			    driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).click();
				Thread.sleep(1500);
				if(driver.findElement(By.xpath("(//input[@value='UNDO'])[last()]")).isEnabled())
				{
					System.out.println("undo button is enabled");
				}
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
				Thread.sleep(1500);
			    driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
				String errormsg="Amounts do not match!";
				if(driver.findElement(By.xpath("//span[contains(text(),'Amounts do not match!')]")).getText().contains(errormsg))
				{
					System.out.println("Amounts do not match error message displayed");
				}
				resultDetails.setFlag(true);
				}
				//SIGNOUT(driver);
			    //resultDetails.setFlag(true);
				catch (Exception e ) 
				{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}
				break;					
		    case EXACTBID:
				try
				{
				PAGINATION(driver);	
				driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
				Thread.sleep(1500);
			    driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
				Thread.sleep(1500);
			    driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
				String errormsg="Amounts do not match!";
				if(driver.findElement(By.xpath("//span[contains(text(),'Amounts do not match!')]")).getText().contains(errormsg))
				{
					System.out.println("Amounts do not match error message displayed");
				}
				resultDetails.setFlag(true);
				}
				//SIGNOUT(driver);
			    catch (Exception e ) 
				{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}
				break;				
		    case MAXLOWERBID:
				try
				{
				PAGINATION(driver);
				driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys("1");
				Thread.sleep(2000);
			    driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
				Thread.sleep(1500);
			    driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
				String errormsg="Your bid is lower than the next bid required.";
				if(driver.findElement(By.xpath("//span[contains(text(),'Your bid is lower than the next bid required.')]")).getText().contains(errormsg))
				{
					System.out.println("Your bid is lower than the next bid required.error message displayed");
				}
				resultDetails.setFlag(true);
				}
				//SIGNOUT(driver);
				catch (Exception e )
				{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
				}
				break;
			case EXACTLOWERBID:
				try
				{
				PAGINATION(driver);
                driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys("1");
				driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
				driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys("1");
				driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
				String errormsg="Your bid is lower than the next bid required.";
				Thread.sleep(1500);				
				if(driver.findElement(By.xpath("//span[contains(text(),'Your bid is lower than the next bid required.')]")).getText().contains(errormsg))
				{
					System.out.println("Your bid is lower than the next bid required.error message displayed");
				}
				resultDetails.setFlag(true);
				}
			    //SIGNOUT(driver);
				catch (Exception e ) 
				{
					e.printStackTrace();
					resultDetails.setFlag(false);
				}
				break;				
		}
		resultDetails.setFlag(true);
	    }
	    catch (Exception e ) 
		{
            e.printStackTrace();
		    resultDetails.setFlag(false);		
      
	    }	
	}
	public void BIDDINGINEVENTDETAILSPAGE(WebDriver driver, String fieldText)
	{
		String fieldType = fieldText;
		String field = fieldText;
		try{
			AppKeyWords BID = AppKeyWords.valueOf(fieldType.toUpperCase());			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (BID) 
			{
			case MAXBID:
				try{
					Thread.sleep(1500);
					String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[last()]")).getText();
					String[] offer11=offer_withdollar.split(".00 ");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
					Integer a=Integer.parseInt(offer);
					System.out.println("you need to enter: "+offer);
					driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(offer);
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
					Thread.sleep(1500);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
					Thread.sleep(1500);
					if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).isDisplayed())
					{
						driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
					}
			        else
			            System.out.println("there is no confirm check box");
						driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
						Thread.sleep(1500);
						resultDetails.setFlag(true);
					}
					catch(Exception e)
					{   
					    String msg="Your Results List";
						if(msg.equalsIgnoreCase("Your Results List"))
						{
							String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))")).getText();
					        String[] offer11=offer_withdollar.split(".00 ");
					        String offer1=offer11[0].replace("$", "");
							String offer=offer1.replace(",", "");
							Integer a=Integer.parseInt(offer);
							System.out.println("you need to enter: "+offer);
							driver.findElement(By.xpath("(//input[@name='makeoffer'])")).sendKeys(offer);
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@value='PLACE A BID'])")).click();
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])")).sendKeys(offer);
							Thread.sleep(1500);
							driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
							Thread.sleep(1500);
							if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])")).isDisplayed())
							{
							driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])")).click();
							}
							else
							System.out.println("there is no confirm check box");
							driver.findElement(By.xpath("(//input[@value='Submit'])")).click();
							Thread.sleep(1500);
							resultDetails.setFlag(true);
						}
						else
						{
							resultDetails.setFlag(false);
						}
					}
					break;
			
				
				case EXACTBID:
					try{
						Thread.sleep(1500);
						String offer_withdollar=driver.findElement(By.xpath("((//span[@class='jsMinOffer jsAmountText bidamt' and contains(text(),'$')]))[last()]")).getText();
						String[] offer11=offer_withdollar.split(".00 ");
						String offer1=offer11[0].replace("$", "");
						String offer=offer1.replace(",", "");
						Integer a=Integer.parseInt(offer);
						System.out.println("you need to enter: "+offer);
						driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
					    Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(offer);
					    Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
						Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
						Thread.sleep(1500);
						driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
						Thread.sleep(1500);
						if(driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).isDisplayed())
						{
							driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
						}
			            else
			                System.out.println("there is no confirm check box");
							driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
							Thread.sleep(1500);
							resultDetails.setFlag(true);
						}
					catch(Exception e)
					{
						e.printStackTrace();
						resultDetails.setErrorMessage(e.toString());
						resultDetails.setFlag(false);
					}
					break;
				}					
				resultDetails.setFlag(true);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				resultDetails.setFlag(false);		
			}
	}
	public void VERIFYBIN(WebDriver driver, String fieldText)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String binValue0=driver.findElement(By.xpath("(//div[@class='e1BuyItNowPrice row buyit-price text-right'])[last()]")).getText();
			//int binValue1=Integer.parseInt(binValue);
			System.out.println(binValue0);
		    String binValue1[]=binValue0.split("\\.");
		    System.out.println(binValue1[0]);
		    String binValue2=binValue1[0].replace("$", "");
		    System.out.println(binValue2);
		    String binValue3=binValue2.replace(",", "");
		    System.out.println(binValue3);
		    int binValue=Integer.parseInt(binValue3);
		    System.out.println(binValue);
		    int value=binValue*(80);
		    System.out.println(value);
		    int Value2 =value/100;
		    System.out.println(Value2);
		    String enterBin=Integer.toString(Value2);
		    System.out.println(enterBin);
			String fieldType = fieldText;
			String field = fieldText;
			try{
			AppKeyWords BINBUTTON = AppKeyWords.valueOf(fieldType.toUpperCase());			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			switch (BINBUTTON) 
			{
			case EVENT:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("(//input[@value='Exact Bid'])[last()]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@name='makeoffer'])[last()]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[last()]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@value='Submit'])[last()]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			 resultDetails.setFlag(true);
			}
			catch(Exception e){
				e.printStackTrace();
				resultDetails.setFlag(false);
			}
			break;
			case LOTDETAILS:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("//input[@value='Exact Bid']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='makeoffer']")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@value='PLACE A BID']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[1]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			resultDetails.setFlag(true);	
		}
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		break;
		case WATCHLISTSEARCH:
			try{
			Thread.sleep(1500);	
			driver.findElement(By.xpath("(//input[@value='Exact Bid'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@name='makeoffer'])[2]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='PLACE A BID'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(enterBin);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='CONTINUE'])[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try{
				driver.findElement(By.xpath("(//input[@class='jsSiteTermsAgree' and @type='checkbox'])[last()]")).click();
			}
			catch(Exception e2){
				System.out.println("there is no confirm check box");
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).isDisplayed())
			{
				resultDetails.setFlag(false);
			}
			resultDetails.setFlag(true);	
		}
	    catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		break;
		}
		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
		resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);
		}
	}
	public void BINBIDAMOUNT(WebDriver driver,String fieldText) {
		try {	
			String fieldType = fieldText;
			String field = fieldText;
			    AppKeyWords BINONPAGE = AppKeyWords.valueOf(fieldType.toUpperCase());			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				switch (BINONPAGE) 
			{
			case EVENTPAGE:
			//if(page.equalsIgnoreCase("EVENTPAGE"))
				try{
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String offer_withdollar=driver.findElement(By.xpath("(//div[@class='e1BuyItNowPrice row buyit-price text-right' and contains(text(),'$')])[last()]")).getText();
					String[] offer11=offer_withdollar.split("\\.");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
					Integer a=Integer.parseInt(offer);
					//long a = Long.parseLong(offer);
					System.out.println("you need to enter: "+offer);
					driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[last()]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[last()]")).sendKeys(offer);
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[last()]")).click();
					Thread.sleep(4000);
					//checking the calculation part
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[last()]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
					int t1=(int) (a+a*0.1);
					int t2=  (int) total_amount2;

					System.out.println("Expected total amount including buyer premium is: "+t1);
					System.out.println("Actual amount is: "+t2);
					if(t1==t2){
						resultDetails.setFlag(true);}
				   }
					catch (Exception e )
					{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
					}
					break;		
		    case LISTINGPAGE:
			//else if(page.equalsIgnoreCase("LISTINGPAGE"))
				try{
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String offer_withdollar=driver.findElement(By.xpath("//div[@class='e1BuyItNowPrice row buyit-price text-right' and contains(text(),'$')]")).getText();
					String[] offer11=offer_withdollar.split("\\.");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
					Integer a=Integer.parseInt(offer);
					//long a = Long.parseLong(offer);
					System.out.println("you need to enter: "+offer);
					driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[1]")).click();
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[1]")).sendKeys(offer);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[1]")).click();
					Thread.sleep(4000);
					//checking the calculation part
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[1]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
					int t1=(int) (a+a*0.1);
					int t2=  (int) total_amount2;

					System.out.println("Expected total amount including buyer premium is: "+t1);
					System.out.println("Actual amount is: "+t2);
					if(t1==t2){
						resultDetails.setFlag(true);}
				   }
					catch (Exception e )
					{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
					}
					break;
			case WATCHLISTPAGE:
			//else if(page.equalsIgnoreCase("WATCHLISTPAGE"))
				try{
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					String offer_withdollar=driver.findElement(By.xpath("//div[@class='e1BuyItNowPrice row buyit-price text-right' and contains(text(),'$')]")).getText();
					String[] offer11=offer_withdollar.split("\\.");
					String offer1=offer11[0].replace("$", "");
					String offer=offer1.replace(",", "");
					Integer a=Integer.parseInt(offer);
					//long a = Long.parseLong(offer);
					System.out.println("you need to enter: "+offer);
					driver.findElement(By.xpath("(//input[@value='BUY IT NOW'])[2]")).click();
					driver.findElement(By.xpath("(//input[@class='form-control jsOfferInput e1ConfirmInput'])[2]")).sendKeys(offer);
					driver.findElement(By.xpath("(//input[@value='CONTINUE'])[2]")).click();
					Thread.sleep(4000);
					//checking the calculation part
					String total_amount=driver.findElement(By.xpath("(//*[@class='col-sm-12 col-xs-12 myone-green jsBidTotal bidamt'])[1]")).getText();
					//Integer total_amount2=Integer.parseInt(total_amount.substring(1, total_amount.length()-3).replace(",", ""));
					String w[]=total_amount.replace("$", "").replace(",","").split(".00 ");
					Integer total_amount2=Integer.parseInt(w[0]);
					int t1=(int) (a+a*0.1);
					int t2=  (int) total_amount2;

					System.out.println("Expected total amount including buyer premium is: "+t1);
					System.out.println("Actual amount is: "+t2);
					if(t1==t2){
						resultDetails.setFlag(true);}
				   }
					catch (Exception e )
					{
					e.printStackTrace();
					resultDetails.setErrorMessage(e.toString());
					resultDetails.setFlag(false);
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
	public void ADDINGPRIVATESALEUSER(WebDriver driver, String fieldText)
	{
		try{
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("(//a[contains(text(),'Private Sale')])[1]")).click();
					Thread.sleep(15000);
					driver.findElement(By.xpath("//input[@name='restriction' and @value='PRIVATE']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@value='Save Changes']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Choose User']")).click();
					String MainWindow1=driver.getWindowHandle();
					String ChildWindow1=MainWindow1;
					for(String handles:driver.getWindowHandles())
					{
						if(!(ChildWindow1.equals(handles)))
						{
							ChildWindow1 = handles;
							driver.switchTo().window(ChildWindow1);
							driver.findElement(By.name("email")).sendKeys(fieldText);
						    Thread.sleep(8000);
							driver.findElement(By.xpath("//input[@value='Search']")).click();
							Thread.sleep(5000); 	
							driver.findElement(By.xpath("//a[contains(@href,'chooseUser')]")).click();
							Thread.sleep(2000);
						}
					}
					driver.switchTo().window(MainWindow1);
					Select selectdropdown=new Select(driver.findElement(By.name("companyID")));
					selectdropdown.selectByVisibleText("Accenture");
					Thread.sleep(2000);
					driver.findElement(By.name("savebutton")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
					Thread.sleep(2000);
					resultDetails.setFlag(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
				resultDetails.setFlag(false);	
		}
	}
	public void LOGINJOOMLA(WebDriver driver)
	{   
	    try  
		{
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    String url="https://qa.equipmentone.com/administrator/";
			driver.get(url);
			driver.findElement(By.id("mod-login-username")).sendKeys("bhaskar.sikatapu@valuelabs.com");
			driver.findElement(By.id("mod-login-password")).sendKeys("Equipment1$");
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-large']")).click();
			Thread.sleep(1500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resultDetails.setFlag(false);	
		}
		   
	}
	public void VERIFYFEATUREDLOT(WebDriver driver)
	{  
	
	try{ 
        driver.findElement(By.xpath("//*[@id='menu']/li[5]/a")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//a[contains(text(),'E1FeaturedQ')]")).click();
        List <WebElement>list= driver.findElements(By.xpath("(//ul[@class='handles list ui-sortable'])[1]/li"));
        for(WebElement element:list)
        {
	    String name= element.getText();
        int lotCount=Integer.parseInt(name);
	    System.out.println(lotCount);
	    if(lotCount>13)
	    {
		 driver.findElement(By.xpath("(//div[@class='icon-trash'])[1]")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	    }
        }
	    driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
	    Select dropdown=new Select(driver.findElement(By.id("f_pageType")));
	    dropdown.selectByVisibleText("Listing");
	    driver.findElement(By.id("f_query")).sendKeys("EQ84619-0007");
	    driver.findElement(By.xpath("//*[@id='datapImage']/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@class='btn btn-small'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@class='btn btn-small'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@class='btn btn-small'])[2]")).click();
	    Thread.sleep(2000);
	    System.out.println("navigate to e1");
	    Thread.sleep(1000);
	    SETFORESEE(driver);
	    driver.get("https://qa.equipmentone.com/index.php?fwcache=1");
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    List <WebElement>featuredlots= driver.findElements(By.xpath("//div[@class='e1-itemhead']"));
	    Thread.sleep(2000);
	    for(WebElement element1:featuredlots)
	    {
	    	String lotname= element1.getText();
	        System.out.println(lotname);
		    if(lotname.equalsIgnoreCase("test lot"))
		    {
		    	System.out.println("lot is displayed in featured section");
		    	Thread.sleep(1000);
		    	break;
		    }
		}
	    
	    }
	
	catch(Exception e)
		{
			e.printStackTrace();
		    resultDetails.setFlag(false);	
		}
	}
        
		
	public void UPLOADIMAGE(WebDriver driver)
	{
		try{
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block jsPhotoUpload']")).click();
	        Thread.sleep(1500);
	        int size = driver.findElements(By.tagName("iframe")).size();
	        System.out.println(size);
	        driver.switchTo().frame(1);
	        Thread.sleep(5000);
		    WebElement element= driver.findElement(By.name("file"));
		    element.sendKeys("D:\\Image\\prasuna.jpg");
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			resultDetails.setFlag(true);
		   }
		catch(Exception e)
		{
			e.printStackTrace();
		    resultDetails.setFlag(false);	
		}
	}

}