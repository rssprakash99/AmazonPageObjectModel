package amazon.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.Pages.LoginPage;
import amazon.Testbase.TestBase;
import amazon.Utils.CustomListener;
@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {
	public LoginPageTest() throws IOException {
		super();
	}
	LoginPage loginpage;


	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginpage = new LoginPage();
	
	}
	
	@Test(priority = 1)
	public void doLoginTest() throws InterruptedException {
		loginpage.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(7000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is =========>"+ currentUrl);
		Thread.sleep(7000);
		String currentId = driver.getWindowHandle();
		System.out.println("Current window ID is ========>"+ currentId);
		Thread.sleep(7000);
		
		String actualUserNameText = loginpage.UsernameTest();
		Thread.sleep(2000);
		System.out.println("Actual Username of application is =========>"+ actualUserNameText);
		String expectedUserNameText = "Hello, Prakash" ;
		
		Assert.assertEquals(actualUserNameText, expectedUserNameText);
	}
    
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(7000);
		driver.quit();
	}
}
