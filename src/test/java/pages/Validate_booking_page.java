package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.CommonFunction;
import base_Url.Lunching_Url;

public class Validate_booking_page extends Lunching_Url {

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][normalize-space()='check-in'])[1]")
	WebElement check;

	@FindBy(xpath = "//div[contains(text(),'flight status')]")
	WebElement flight;

	@FindBy(xpath = "//div[contains(text(),'manage booking')]")
	WebElement manage_book;

	public void check_in() {
		CommonFunction.clickingOnWebElement(check, 20);
		check.click();
		

	}

	public void checking_flight() {
		CommonFunction.clickingOnWebElement(flight, 15);
		flight.click();
		

	}

	public void manage_flight() {
		manage_book.click();
		
	}
}