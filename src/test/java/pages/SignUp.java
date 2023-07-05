package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonFunction;
import base_Url.Lunching_Url;

public class SignUp extends Lunching_Url {
//1.Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.

	@FindBy(xpath = "//div[contains(text(),'Signup')]")
	WebElement signup;

	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement title;

	@FindBy(id = "first_name")
	WebElement firstname;

	@FindBy(id = "last_name")
	WebElement lastname;

	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement country;

	@FindBy(xpath = "//img[@class='d-inline-block datepicker']")
	WebElement calender;
//date of birth
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, April 29th, 1997']")
	WebElement birth_date;
	
	
	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement phone;

	@FindBy(id="email_id")
	WebElement signIn_email;

	@FindBy(id = "new-password")
	WebElement pass;

	@FindBy(id = "c-password")
	WebElement re_pass;

	@FindBy(xpath = "(//input[@id='defaultCheck1'])[1]")
	WebElement checkbox;

	@FindBy(xpath = "//button[@class='btn btn-red']")
	WebElement login;

	public void clicking_sign() {
		String oldWindow = driver.getWindowHandle();

		signup.click();
		Set<String> handles = driver.getWindowHandles();

		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
		}

	}

	public void select_title() throws Exception {
		Thread.sleep(1000);
		Select drop = new Select(title);
		drop.selectByVisibleText("Mr");

	}

	public void firstName(String fname) {
		firstname.sendKeys(fname);
	}

	public void lastName(String lname) {
		lastname.sendKeys(lname);
	}

	public void selecting_Country() {
		Select co = new Select(country);
		co.selectByVisibleText("India");
	}

	public void click_calender() {
		calender.click();
	}
	public void Calender_date() {
		Select obj =  new Select(year);
		obj.selectByVisibleText("1997");
		
		Select obj1 = new Select(month);
		obj1.selectByVisibleText("April");
		
		birth_date.click();
	}

	public void enter_no(String phn) {
		phone.sendKeys(phn);
	}

	public void emailId(String em) {
		signIn_email.sendKeys(em);

	}

	public void password(String finalpass) {
		pass.sendKeys(finalpass);
	}

	public void re_password(String verifypass) {
		re_pass.sendKeys(verifypass);
	}

	public void check() {
		//CommonFunction.clickingOnWebElement(checkbox, 15);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",checkbox );
		
	}

	public void submit() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login );
		
	}
}
