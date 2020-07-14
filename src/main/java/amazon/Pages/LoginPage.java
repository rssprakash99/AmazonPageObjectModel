package amazon.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.Testbase.TestBase;

public  class LoginPage extends TestBase {
	
	@FindBy(xpath = "//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")
	WebElement mousehover1 ;
	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signInbtn;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailId;
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement loginContinue;
	@FindBy(xpath = "//input[@name='password']")
	WebElement PassWord;
	@FindBy(xpath = "//span[@class='a-button a-button-span12 a-button-primary']//input[@class='a-button-input']")
	WebElement accountLogin;
	@FindBy(xpath = "//span[contains(text(),'Hello, Prakash')]")
	WebElement getVisibleText;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public  void doLogin(String un, String pwd) {
		
		Actions action = new Actions(driver);
		action.moveToElement(mousehover1).build().perform();
		signInbtn.click();
		emailId.clear();
		emailId.sendKeys(un);
		loginContinue.click();
		PassWord.clear();
		PassWord.sendKeys(pwd); 
		accountLogin.click();
	}
	public String UsernameTest() {
		
		String text = getVisibleText.getText();
		return text;
		
	}

}
