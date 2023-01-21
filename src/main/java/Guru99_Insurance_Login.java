

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_Login 
{

	
	  //POM-1
	
	//1.Data members/Global variables should be declared globally with access level private by using @findby Annotation
	
	       @FindBy(xpath="//input[@name='email']") private WebElement Email;
	       @FindBy(xpath="//input[@name='password']")private WebElement  Password;
	       @FindBy(xpath="//input[@name='submit']") private    WebElement Loginbtn;
	       
     //2.Initialize within a constructor with access level public using Pagefactory
	    public Guru99_Insurance_Login(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	
	 //3.Utilize within a method with access level public
	     
	    public void enterEmail(String EmailAdd)
	    {
	    	Email.sendKeys(EmailAdd);
	    }
	    
	    public void enterPassword(String Pass)
	    {
	    	Password.sendKeys(Pass);
	    }
	    
	    public void clickLoginBtn()
	    {
	    	Loginbtn.click();
	    }
	    
	
	
	
	
}
