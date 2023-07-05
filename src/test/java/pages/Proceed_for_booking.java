package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.CommonFunction;
import base_Url.Lunching_Url;

public class Proceed_for_booking extends Lunching_Url {
	
	//Write code to select a flight and proceed to the booking page.

	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	
    WebElement processing;
	
	
	
public void flight_Processing() {
	CommonFunction.clickingOnWebElement(processing, 15);
	processing.click();
}
}