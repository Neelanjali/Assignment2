package Assignment_2.onboardingAssignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how = How.XPATH, using ="//a[@id='tab-flight-tab']")
	 @CacheLookup
	static WebElement flight;
	
	 @FindBy(how = How.XPATH, using ="//label[@name='type-one-way']")
	 @CacheLookup
	static WebElement oneWay;
	 
	 final  WebDriver driver;

	 public HomePage(WebDriver driver)

		{

			this.driver = driver;

			}

}
