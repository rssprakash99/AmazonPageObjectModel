package amazon.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import amazon.Testbase.TestBase;

public class TestUtils extends TestBase{
	public static long IMPLICITWAITTIMEOUT = 30;
	public static long PAGELOADTIMEOUT = 30;
	
	public static final String FULLNAME= "Kiran";
	public static final String  MOBILE = "9618071477";
	public static final String pinCODE = "533001";
	public static final String ADDRESS1 = "TilakStreet";
	public static final String ADDRESS2 = "Rangainaidustreet";
	public static final String LANDMARK = "Satyagowritheatre";
	public static final String CITY = "Kakinada";
	public TestUtils() throws IOException {
		super();
	}
	public static void highLightElement(WebDriver driver, WebElement element){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', ' border: 0.5px solid red');", element);
		
		 }
	public static void highLight(WebDriver driver, WebElement element){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', ' border: 0.5px solid white');", element);
		
		 }
	public static void takeScreenShotsAtEndoftest(String path) throws Exception 
     {
		//  File class use for storing any file location
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File(path));
     }
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
		}
}
