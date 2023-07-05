package Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_Url.Lunching_Url;

public class CommonFunction extends Lunching_Url {
	
	
	   public static void clickingOnWebElement(WebElement element,long waitTimeinSeconds) {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(waitTimeinSeconds));
		 wait1.until(ExpectedConditions.elementToBeClickable(element));
	 	
		wait1.until(ExpectedConditions.visibilityOf(element));

	   
	   }

}
