

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99_Insurance_TestNG_TestClass extends Base_Class 
{
    int TestCaseID;
	 
	//InitializeBrowser();
	//public WebDriver driver;
	
	 Guru99_Insurance_Login Login;
	
     Guru99_Insurance_BrokerInsuranceWebPage Login1;
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		InitializeBrowser();
		
		//Create object of POM-1
	   Login=new Guru99_Insurance_Login(driver);
	   
	    //Create object of POM-2
	   Login1=new  Guru99_Insurance_BrokerInsuranceWebPage(driver);
	   
	}
	
	@BeforeMethod
	public void Login() throws IOException, InterruptedException
	{
		Login.enterEmail(UtilityClass.getDatafromPF("EM"));
		
		Thread.sleep(1000);
		
		Login.enterPassword(UtilityClass.getDatafromPF("PSW"));
		
		Thread.sleep(1000);
		
		Login.clickLoginBtn();
	}
	
	@Test(priority=1)
	public void verifyEmailAddressofGuru99() throws EncryptedDocumentException, IOException               //Test Class/Method
	{
		TestCaseID=100;
		
	  String ActualEmail=Login1.getEmail();                         //saradeg@gmail.com
	  
	  String ExpectedEmail=UtilityClass.getDatafromExcelsheet(0,0);         //saradeg@gmail.com
	  
	  Assert.assertEquals(ActualEmail,ExpectedEmail);   //Pass
	}
	
	@Test(priority=2)
	public void getTitle() throws EncryptedDocumentException, IOException
	{
		TestCaseID=101;
		
	 String	ActualTitle=driver.getTitle();                          //Insurance Broker Syastem
	 
	 String ExpectedTitle=UtilityClass.getDatafromExcelsheet(1,0);          //Insurance Broker Syastem1
	
	 Assert.assertEquals(ActualTitle,ExpectedTitle);   
	 
	}
	
	@Test()
	public void CalculatePremium() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TestCaseID=102;
		
		Login1.clickRequestQuotation();
		Thread.sleep(1000);
		
		Login1.selectBreakdowncover();
		Thread.sleep(1000);
		
		Login1.clickWindscreenrepair();
		Thread.sleep(1000);
		
	     String	A1=UtilityClass.getDatafromExcelsheet(2,0);
	     Login1.Enterincidents(A1);       //abc123
	     Thread.sleep(1000);
	     
	    String B1=UtilityClass.getDatafromExcelsheet(3,0);
	    Login1.EnterRegistration(B1);      //MH14 KV 2001
	    Thread.sleep(1000);
	    
	    String C1=UtilityClass.getDatafromExcelsheet(4,0);
	    Login1.EnterAnnualmileage(C1);       //25
	    Thread.sleep(1000);
	    
	    String D1=UtilityClass.getDatafromExcelsheet(5,0);
	    Login1.EnterEstimatedvalue(D1);       //50000
	    Thread.sleep(1000);
	    
	    Login1.SelectParkingLocation();
	    Thread.sleep(1000);
	    
	    Login1.SelectYear();
	    Thread.sleep(1000);
	    
	    Login1.SelectMonth();
	    Thread.sleep(1000);
	    
	    Login1.SelectDate();
	    Thread.sleep(1000);
	    
	    Login1.SelectDate();
	    Thread.sleep(1000);
	    
	    Login1.ClickCP();
	    Thread.sleep(1000);
	    
	    String ActualFinalPremium=Login1.getFinalPremium();     // No discount Premium: �1500
	    
	    String ExpectedFinalPremiumofcar=UtilityClass.getDatafromExcelsheet(6,0);    // No discount Premium: �1500  
	    
	    Assert.assertEquals(ActualFinalPremium,ExpectedFinalPremiumofcar);
	    
	}
	
    @AfterMethod                //Pass    //Fail
	public void Logout(ITestResult Result) throws IOException
	{
		
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureScreenshot(driver, TestCaseID);
		}
		
		Login1.clickLogoutBtn();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
}
