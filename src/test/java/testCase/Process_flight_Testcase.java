package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.OneWay;
import pages.Proceed_for_booking;

public class Process_flight_Testcase extends Lunching_Url {

	@Test(priority = 0)
	public void flight_available() {

        OneWay one = PageFactory.initElements(driver, OneWay.class);
    	one.trip_from();
		one.trip_city_to_go();
		one.trip_rtn_box_click();
		one.trip_to();
		one.clnder_img_first();
		one.trip_start_date();
		one.trip_rtrn_img();
		one.trip_rtrn_date();
		one.signup_login();
		

		Proceed_for_booking process = PageFactory.initElements(driver, Proceed_for_booking.class);
		process.flight_Processing();

	}

}
