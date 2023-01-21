

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Guru99_Insurance_BrokerInsuranceWebPage 
{

	
	  //POM-2
	
	//1.Data members/Global variables should be declared globally with access level private by using @findby Annotation
	
	 @FindBy(xpath="//h4[text()='saradeg41@gmail.com']")  private WebElement SignedInAs;
	 
	 @FindBy(xpath="//input[@class='btn btn-danger']") private   WebElement  LogOutBtn;
     @FindBy(xpath="//a[text()='Request Quotation']") private WebElement RequestQuotation;
     @FindBy(xpath="//select[@id='quotation_breakdowncover']") private WebElement Breakdowncover;
     @FindBy(xpath="(//input[@name='windscreenrepair'])[2]") private WebElement Windscreenrepair;
	 @FindBy(xpath="//input[@name='incidents']") private WebElement incidents;
	 @FindBy(xpath="//input[@name='registration']") private WebElement Registration;
	 @FindBy(xpath="//input[@name='mileage']") private WebElement Annualmileage;
	 @FindBy(xpath="//input[@name='value']") private WebElement  Estimatedvalue;
	 @FindBy(xpath="//select[@name='parkinglocation']") private WebElement ParkingLocation;
	 @FindBy(xpath="//select[@name='year']") private WebElement    Year;
	 @FindBy(xpath="//select[@name='month']") private  WebElement      Month;
	 @FindBy(xpath="//select[@name='date']") private   WebElement    Date;
	 @FindBy(xpath="//input[@class='btn btn-default']") private WebElement CP;
	 @FindBy(xpath="//p[@id='calculatedpremium']")  private WebElement Premium;
	 
	 
	 //2.Initialize within a costructor with access level public using pagefactory
	 
	    public Guru99_Insurance_BrokerInsuranceWebPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	
	 //3.Utilize within a method with access level public
	    
	    public String getEmail()
	    {
	      String Actual=SignedInAs.getText();        //saradeg41@gmail.com
	      
	      return Actual;               //saradeg41@gmail.com
	    } 
	   
	    public void clickLogoutBtn()
	    {
	    	LogOutBtn.click();
	    }
	
	    public void clickRequestQuotation()
	    {
	    	RequestQuotation.click();
	    }
	    
	    public void selectBreakdowncover()
	    {
	    	Select S1=new Select(Breakdowncover);
	    	S1.selectByIndex(2);
	    }
	    
	    public void clickWindscreenrepair()
	    {
	    	 Windscreenrepair.click();
	    }
	    
	    public void Enterincidents(String X)            //abc123
	    {
	    	incidents.sendKeys(X);
	    }
	    
	    public void EnterRegistration(String Y)         //MH14 KV2001
	    {
	    	Registration.sendKeys(Y);
	    }
	    
	    public void EnterAnnualmileage(String Z)         //25
	    {
	    	 Annualmileage.sendKeys(Z);
	    }
	    
	     public void EnterEstimatedvalue(String U)       //50000
	    {
	    	Estimatedvalue.sendKeys(U);
	    }
	
	    public void SelectParkingLocation()
	    {
	    	Select S2=new Select(ParkingLocation);
	    	S2.selectByIndex(5);
	    }
	     
	    public void SelectYear()
	    {
	    	Select S3=new Select(Year);
	    	S3.selectByIndex(6);
	    }
	    
	    public void SelectMonth()
	    {
	    	Select S4=new Select(Month);
	    	S4.selectByIndex(6);
	    }
	    
	    public void SelectDate()
	    {
	    	Select S5=new Select(Date);
	    	S5.selectByIndex(4);
	    }
	    
	    public void ClickCP()
	    {
	    	CP.click();
	    }
	    
	    public String getFinalPremium()
	    {
	      String FP=Premium.getText();
	      
	      return FP;           //No discount Premium:
	    }
	    
	    
	    
}
