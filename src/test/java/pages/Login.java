package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
//2.Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement login_number;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement login_Pass;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement click_login;

	
	
	public void login_up() {
		login.click();
	}

	public void log_num(String no) {
		login_number.sendKeys(no);
	}

	public void log_Pass(String pass) {
		login_Pass.sendKeys(pass);
	}

	public void start_login() {
		click_login.click();
	}

}
