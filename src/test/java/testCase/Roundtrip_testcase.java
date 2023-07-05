package testCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.Round_trip;

public class Roundtrip_testcase  extends Lunching_Url{
	@Test
	public void roundtrip() {
		
		Round_trip round = PageFactory.initElements(driver, Round_trip.class);
		round.round_checkbox();
		round.from_city();
		round.start_city();
		round.destination_box();
		round.destination_end();
		round.clnder_img_from();
		round.start_date();
		round.rtning_date();
		round.date_of_rtn();
		round.student_checkbox();
		round.click_login();
		round.discount_boxfor_studend();
		round.finish_round_trip();
	}
	
	
	
	
}

