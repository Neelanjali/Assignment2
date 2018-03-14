package Assignment_2.onboardingAssignment_2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreeshotPage {
	
	static WebDriver driver;

	public static void takeSnapShot(WebDriver driver) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\neelanjali.jain\\Desktop\\screenshot.jpeg");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

}
}
