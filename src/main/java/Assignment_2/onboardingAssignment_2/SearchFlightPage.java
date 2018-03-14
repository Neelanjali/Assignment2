package Assignment_2.onboardingAssignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchFlightPage {

	
	final  WebDriver driver;
	
	@FindBy(how = How.XPATH, using ="//input[@id='flight-origin']")
	 @CacheLookup
	static WebElement source;

	 
	 @FindBy(how = How.XPATH, using ="//input[@id='flight-destination']")
	 @CacheLookup
	static WebElement destination;

	 	 
	 @FindBy(how = How.XPATH, using ="//span[@class='icon icon-calendar']")
	 @CacheLookup
	static WebElement calender;
	 
	 @FindBy(how = How.XPATH, using ="//button[@class='datepicker-cal-date' and @data-year='2018' and @data-month='2' and @data-day='13']")
	 @CacheLookup
	static WebElement date;
	 
	 @FindBy(how = How.XPATH, using ="//button[@id='search-button']")
	 @CacheLookup
	static WebElement submit;
	 
	 public SearchFlightPage(WebDriver driver)

		{

			this.driver = driver;

			}
	 
	 

}
