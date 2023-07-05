package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.SignUp;

public class SignUpTestCase extends Lunching_Url {
	
	@Test
	
	public void initial_step() throws Exception {
		//1.Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.

		SignUp sup = PageFactory.initElements(driver, SignUp.class);
		
		sup.clicking_sign();
	    sup.select_title();
		sup.firstName("Dinesh");
		sup.lastName("ravi");
		sup.selecting_Country();
		sup.click_calender();
		sup.Calender_date();
		sup.enter_no("9994447890");
		sup.emailId("dinesshRaja@YOP.com");
		sup.password("dineshravi@1997");
		sup.re_password("dineshravi@1997");
		sup.check();
		sup.submit();
	}

}




















