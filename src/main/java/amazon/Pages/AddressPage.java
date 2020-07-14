package amazon.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazon.Testbase.TestBase;
import amazon.Utils.TestUtils;

public class AddressPage extends TestBase {
	TestUtils testutils;
	
	@FindBy(xpath = "//h2[contains(text(),'Your Addresses')]")
	WebElement yourAddresses;
	@FindBy(xpath = "//div[@class='a-section a-spacing-none address-plus-icon aok-inline-block']")
	WebElement addAddrress;
	@FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressFullName']")
	WebElement fullName;
	@FindBy(xpath = "//input[@placeholder='10-digit mobile number without prefixes']")
	WebElement phoneNumber;
	@FindBy(xpath = "//input[@placeholder='6 digits [0-9] PIN code']")
	WebElement pinCode;
	@FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressLine1']")
	WebElement addressline1;
	@FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressLine2']")
	WebElement addressline2;
	@FindBy(xpath = "//input[@placeholder='E.g. Near AIIMS Flyover, Behind Regal Cinema, etc.']")
	WebElement landMark; // sendkeys
	@FindBy(xpath = "//input[@name='address-ui-widgets-enterAddressCity']")
	WebElement city;  // sendkeys
	@FindBy(xpath = "//span[contains(text(),'Hello, Prakash')]")
	WebElement mousehover2; // mouse hover action
	@FindBy(xpath = "//span[contains(text(),'Your Account')]")
	WebElement yourAccount; // click
	@FindBy(xpath = "//span[contains(text(),'Select state')]")
	WebElement selectStateDropDown1;
	@FindBy(xpath = "//a[contains(text(),'ANDHRA PRADESH')]")
	WebElement AndhraPradesh;
	@FindBy(xpath = "//span[@class='a-button a-button-dropdown address-ui-widgets-desktop-form-field-full-width']//span[@class='a-button-text a-declarative']")
	WebElement selectaddressTypeDropDown2;
	@FindBy(xpath = "//a[contains(text(),'9 pm delivery)')]")
	WebElement home;
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement addressclick;
	@FindBy(xpath = "//div[contains(@class,'a-section address-section-no-default')]//h5[contains(@class,'a-text-bold')][contains(text(),'Kiran')]")
	WebElement addressVisbileText;

	public AddressPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public  void Addresscreation() {
		
		Actions action = new Actions(driver);
		action.moveToElement(mousehover2).build().perform();
		
		yourAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yourAddresses.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addAddrress.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fullName.sendKeys(testutils.FULLNAME);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		phoneNumber.sendKeys(testutils.MOBILE);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pinCode.sendKeys(testutils.pinCODE);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addressline1.sendKeys(testutils.ADDRESS1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addressline2.sendKeys(testutils.ADDRESS2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		landMark.sendKeys(testutils.LANDMARK);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectaddressTypeDropDown2.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		home.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		addressclick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
       public String AddressTest() {
		
		String text1 = addressVisbileText.getText();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text1;
		
	} 
	
	
	
	

}
