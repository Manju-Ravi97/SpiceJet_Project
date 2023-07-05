package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_Url.Lunching_Url;
import pages.Login;

public class LoginTestCase extends Lunching_Url {
	
	@Test
	public void initial_login() {
		//2.Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.

		Login log = PageFactory.initElements(driver, Login.class);
		log.login_up();
		log.log_num("959 751 4715");
		log.log_Pass("manjuravi@1997");
		log.start_login();
	}

}
