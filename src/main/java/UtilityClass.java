

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{

	
	//Automation TE:Jayant
	//Date:15/01/2023
	//Day:Sat
	//Fetch Data from Property File
	
	public static String getDatafromPF(String key) throws IOException
	{
		//To reach upto property file
	  FileInputStream file=new FileInputStream("C:\\Users\\janga\\eclipse-workspace\\6 Aug A Morning selenium\\propertyFile.properties");	
		
	  //Create object of properties class
	  Properties prop=new Properties();
	  
	  //To open property file
	   prop.load(file);
	   
	  //To fetch data from PF
	  String value1=prop.getProperty(key);
	  
	  return value1;
	}
	
	@Test
	public static String getDatafromExcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException
	{
		
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("C:\\Users\\janga\\eclipse-workspace\\MyMavenProject\\TestData\\6_Aug_morning.xlsx");
	 
	   Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet13");
	   
	   String value2=Sh.getRow(Row).getCell(Cell).getStringCellValue();
	  
	   return value2;
	
	  
   }
	  @Test
	  public static void CaptureScreenshot(WebDriver driver,int TestCaseID) throws IOException
	  {
		  
		  //Typecast/Downcasting/Convert
		  
		 File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 System.out.println(Source);
		 
		 File Destination=new File("D:\\Screenshot\\."+TestCaseID+".jpg");
		 
		 FileHandler.copy(Source,Destination);
		 
	  }
	  
	
	
	
	
	
	
	
	
	
}
