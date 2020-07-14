package amazon.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import amazon.Utils.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public TestBase() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\amazon\\Properties\\amazon.properties");
		prop.load(fis);
	}
	
	public static void initialization() {
		
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else
		{
			System.out.println("Selected browser is not there in the list========>"+ BrowserName);
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITWAITTIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGELOADTIMEOUT, TimeUnit.SECONDS);
	}
	

}
