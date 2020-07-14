package amazon.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import amazon.Utils.CustomListener;

import amazon.Pages.AddressPage;
import amazon.Pages.LoginPage;
import amazon.Testbase.TestBase;
@Listeners(CustomListener.class)
public class AddressPageTest extends TestBase {

	public AddressPageTest() throws IOException {
		super();
	}
	LoginPage loginpage;
	AddressPage addresspage;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		loginpage = new LoginPage();
		loginpage.doLogin(prop.getProperty("userName"), prop.getProperty("password"));
		addresspage = new AddressPage();
		
	}
	@Test(priority =2)
	public void AddressCreationTest()  {
		addresspage.Addresscreation();
		
		String actAddName = addresspage.AddressTest();
		System.out.println("Actual addrss name is ==========>"  +  actAddName);
		
		String expAddName = "Kiran";
		System.out.println("expected addrss name is =========>" + expAddName);
		Assert.assertEquals(actAddName, expAddName);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
