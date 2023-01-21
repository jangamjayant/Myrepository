

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{

     public	WebDriver driver;
	
	public void InitializeBrowser()
	{
		//Parameter-1:Name of the browser
		//Parameter-2:Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janga\\eclipse-workspace\\MyMavenProject\\Browsers\\chromedriver_win32 (2))");
		
		//Create object of chromedriver class
		driver=new ChromeDriver();
		
		//To open an application/To enter an URL
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
}
