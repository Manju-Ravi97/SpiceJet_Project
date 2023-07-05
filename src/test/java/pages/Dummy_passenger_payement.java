package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.CommonFunction;
import base_Url.Lunching_Url;

public class Dummy_passenger_payement extends Lunching_Url {

	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[3]")
	WebElement title;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement first_name;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement last_name;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phone;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement email;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement city;
	@FindBy(xpath = "(//*[name()='rect'])[3]")
	WebElement check_box;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
	WebElement login_continue;
	// new pop open before add-ons

	// next process Add-ons -login button
	@FindBy(xpath = "(//div[contains(text(),'Continue')])[3]")
	WebElement again_continue;

	// new pop open before add-ons

	@FindBy(id = "skipfrompopup")
	WebElement skipForSkipComfort;

	// final payment-iframe
	@FindBy(xpath = "//input[@placeholder='Enter Card Number Here']")
	WebElement card_number;

	@FindBy(xpath = "//iframe[@class='card_number_iframe']")
	WebElement iframe;

	// card number enter using iframe
	@FindBy(xpath = "//input[@placeholder='Cardholder Name']")
	WebElement card_name;
	
	@FindBy(xpath = "//iframe[@class='name_on_card_iframe']")
	WebElement card_iframe;

	// entering month iframe
	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement month;

	@FindBy(xpath = "//iframe[@class='card_exp_month_iframe']")
	WebElement month_iframe;
	
	// enter year iframe
	@FindBy(xpath = "//input[@placeholder='YY']")
	WebElement year;
	@FindBy(xpath = "//iframe[@class='card_exp_year_iframe']")
	WebElement year_iframe;
	
	// enter cvv iframe
	@FindBy(xpath = "//input[@id='security_code']")
	WebElement cvv;
	@FindBy(xpath = "//iframe[@class='security_code_iframe']")
	WebElement cvv_iframe;

	//Final process to submit
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
	WebElement proceed_to_pay;

	public void click_title() {
		title.click();
	}

	public void click_tilte_of_passenger() {

		List<WebElement> list = driver.findElements(By.xpath(
				"//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Miss")) {
				list.get(i).click();
				break;
			}
		}

	}

	public void first_name_person(String nm) {
		first_name.sendKeys(nm);
	}

	public void last_name_person(String lm) {
		CommonFunction.clickingOnWebElement(last_name, 15);
		last_name.sendKeys(lm);
	}

	public void phnoe_number(String phn) {
		phone.sendKeys(phn);
	}

	public void email_Id(String em) {
		email.sendKeys(em);

	}

	public void city_person(String cty) {
		city.sendKeys(cty);
	}

	public void checck_box_primary() {
		check_box.click();
	}

	public void finish_continue() {
		login_continue.click();

	}

	public void addons_continue() throws Exception {
		CommonFunction.clickingOnWebElement(again_continue, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", again_continue);

	}

	public void pop_Skip() {
		Actions skip = new Actions(driver);
		CommonFunction.clickingOnWebElement(skipForSkipComfort, 20);

		skip.moveToElement(skipForSkipComfort).click().build().perform();

	}

	public void card_holder_number(String holdername) {
		driver.switchTo().frame(iframe);
		card_number.sendKeys(holdername);
		driver.switchTo().defaultContent();
	}

	public void card_holder_name(String holname) {

		driver.switchTo().frame(card_iframe);
		CommonFunction.clickingOnWebElement(card_name, 5);
		card_name.sendKeys(holname);
		driver.switchTo().defaultContent();
	}

	public void expire_month(String mname) {
		driver.switchTo().frame(month_iframe);
		month.sendKeys(mname);
		driver.switchTo().defaultContent();
	}

	public void expire_year(String yrs) {
		driver.switchTo().frame(year_iframe);

		year.sendKeys(yrs);
		driver.switchTo().defaultContent();
	}

	public void holder_cvv(String cv) {
		driver.switchTo().frame(cvv_iframe);

		cvv.sendKeys(cv);
		driver.switchTo().defaultContent();
	}

	public void payment() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", proceed_to_pay);

	}

}
