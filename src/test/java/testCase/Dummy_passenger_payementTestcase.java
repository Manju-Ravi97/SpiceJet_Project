package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.Dummy_passenger_payement;
import pages.OneWay;
import pages.Proceed_for_booking;

public class Dummy_passenger_payementTestcase extends Lunching_Url{
	
	
	@Test
	public void payement() throws Exception {
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
	
	//next step for flight process

		Proceed_for_booking process = PageFactory.initElements(driver, Proceed_for_booking.class);
		process.flight_Processing();
// passenger details
		Dummy_passenger_payement pymt = PageFactory.initElements(driver, Dummy_passenger_payement.class);
		pymt.click_title();
		pymt.click_tilte_of_passenger();
		pymt.first_name_person("Dinesh");
		pymt.last_name_person("ravi");
		pymt.phnoe_number("9994447890");
		pymt.email_Id("dineshravi@YOPmail.com");
		pymt.city_person("chennai");
		pymt.checck_box_primary();
		pymt.finish_continue();
		
		
		
		
		//add-ons
		pymt.addons_continue();
		
		//Pop Skip
		
	pymt.pop_Skip();
		
		//final payment
		pymt.card_holder_number("4444 4444 0000 2222");
		pymt.card_holder_name("Dinesh Ravi");
		pymt.expire_month("04");
		pymt.expire_year("2025");
		pymt.holder_cvv("567");
		pymt.payment();
		
		
		
		
		
		
		
		
		
		
	}
	

}
