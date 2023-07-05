package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.Validate_booking_page;

public class Validate_bookingPage_Testcase extends Lunching_Url{
	
	@Test
	
	public void  all_Menu_validation() {
	
	Validate_booking_page obj = PageFactory.initElements(driver, Validate_booking_page.class)	;
	
	obj.check_in();
	obj.checking_flight();
	obj.manage_flight();
	
	
	
	
}
}