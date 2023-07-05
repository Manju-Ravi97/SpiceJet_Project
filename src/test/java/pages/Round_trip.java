package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.CommonFunction;

public class Round_trip {
	// clicking round trip
	@FindBy(xpath = "//div[contains(text(),'round trip')]")
	WebElement click_round_checkbox;

	// clicking from-city
	@FindBy(xpath = "//div[@data-testid='to-testID-origin']//input[@type='text']")
	WebElement from_box;
	@FindBy(xpath = "//div[contains(text(),'CJB')]")
	WebElement city_to_start;

	// destination-city
	@FindBy(xpath = "//div[@data-testid='to-testID-destination']//input[@type='text']")
	WebElement destination_click;
	@FindBy(xpath = "//div[contains(text(),'GOX')]")
	WebElement destination_place;

	// date of start
	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[13]")
	WebElement cln_img;
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][normalize-space()='15'])[2]")
	WebElement from_date;

	// date of end trip
	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[14]")
	WebElement rtn_img_click;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[85]")
	WebElement rtn_date;

	// check box of catogories
	@FindBy(xpath = "//div[contains(text(),'Students')]")
	WebElement check_box_student;

	// login
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement login;

	// next page student discound booking
	@FindBy(xpath = "(//*[name()='rect'])[2]")
	WebElement checkbox_discount;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement finish;

	public void round_checkbox() {
		click_round_checkbox.click();
	}

	public void from_city() {
		from_box.click();
	}

	public void start_city() {
		city_to_start.click();
	}

	public void destination_box() {
		destination_click.click();
	}

	public void destination_end() {
		destination_place.click();
	}

	public void clnder_img_from() {
		CommonFunction.clickingOnWebElement(cln_img, 10);
		cln_img.click();
	}

	public void start_date() {
		// CommonFunction.clickingOnWebElement(from_date, 20);
		from_date.click();
	}

	public void rtning_date() {
		CommonFunction.clickingOnWebElement(rtn_img_click, 15);
		rtn_img_click.click();
	}

	public void date_of_rtn() {
		// CommonFunction.clickingOnWebElement(rtn_date, 15);
		rtn_date.click();
	}

	public void student_checkbox() {
		check_box_student.click();
	}

	public void click_login() {
		login.click();
	}

	public void discount_boxfor_studend() {
		checkbox_discount.click();
	}

	public void finish_round_trip() {
		finish.click();
	}
}
