package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonFunction;
import base_Url.Lunching_Url;

public class OneWay extends Lunching_Url {

	//from 
	@FindBy(xpath = "//div[@data-testid='to-testID-origin']//input[@type='text']")
	WebElement from;


	@FindBy(xpath = "//div[contains(text(),'BLR')]")
	WebElement from_click;

    //To
	@FindBy(xpath = "//div[@data-testid='to-testID-destination']//input[@type='text']")
	WebElement rtn_click;

	@FindBy(xpath = "//div[contains(text(),'DEL')]")
	WebElement to;

   //Depature date
	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[13]")
	WebElement click_img_clder;

//	@FindBy(xpath = "(//div[@data-testid='undefined-calendar-day-20'])[1]")
	@FindBy(xpath = "(//div)[329]")
	WebElement start_date;
	
   //rturn date
	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[14]")
	WebElement click_img_return_clnder;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][normalize-space()='16'])[2]")
	WebElement rtrn_date;
	
	//Login
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement login;
	
	public void trip_from() {
		from.click();
	}

	public void trip_city_to_go() {
		from_click.click();
	}

	public void trip_rtn_box_click() {
		rtn_click.click();
	}
	
	public void trip_to() {
		to.click();
	}
	public void clnder_img_first() {
	CommonFunction.clickingOnWebElement(start_date, 15);
		click_img_clder.click();
	}

	
	public void trip_start_date() {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(start_date));

		start_date.click();
	}
	
	public void trip_rtrn_img() {
		click_img_return_clnder.click();
	}
	
	public void trip_rtrn_date() {
		CommonFunction.clickingOnWebElement(rtrn_date, 10);
		rtrn_date.click();
	}
	
	public void signup_login() {
		login.click();
	}
	
	
	
	
	
	
	
}
