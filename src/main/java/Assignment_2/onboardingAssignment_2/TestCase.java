package Assignment_2.onboardingAssignment_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestCase {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\neelanjali.jain\\Desktop\\SeleniumFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.orbitz.com/");
		
		HomePage Home_PG  = PageFactory.initElements(driver, HomePage.class);

		SearchFlightPage Search_PG = PageFactory.initElements(driver, SearchFlightPage.class);
		
		HomePage.flight.click();
		HomePage.oneWay.click();
		
		Search_PG.source.sendKeys("Pune, India (PNQ-Lohegaon");
		Search_PG.destination.sendKeys("Mumbai, India (BOM-Chhatrapati Shivaji Intl.)");
		
		Search_PG.calender.click();
		Search_PG.date.click();
		
		Select select=new Select(driver.findElement(By.id("flight-adults")));
		select.selectByValue("2");
		
		Search_PG.submit.click();
		ScreeshotPage.takeSnapShot(driver);
		driver.quit();
		
		
	}

}
