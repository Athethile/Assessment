package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Assessment.StartBrowser;
import customCommands.ActionDriver;
/*import objRep.careerspage;
import objRep.homePage;
import objRep.jobPage;
import objRep.southAfricaPage;*/

public class TestCase1 extends StartBrowser {
	
	// generates 10 digit phone number that starts with 0
		public static String generateMyNumber()
		{
		int aNumber = 0; 
		aNumber = (int)((Math.random() * 900000000)+100000000); 
		String a=String.valueOf(aNumber);
		return "0"+a;
		}
 
	@Test
	public static void testSiteOpen() {
		ActionDriver aDriver= new ActionDriver();
		aDriver.launchApp("https://www.ilabquality.com");
		/*aDriver.click(homePage.lnkCareers);
		aDriver.click(careerspage.lnkSouthAfrica);
		aDriver.click(southAfricaPage.lnkJob);
		aDriver.click(jobPage.ddApplyOnline);*/
		driver.findElement(By.linkText("CAREERS")).click();//clicks the hyperlink for Careers
		driver.findElement(By.linkText("South Africa")).click();//clicks the hyperlink for South Africa
		driver.findElement(By.className("wpjb-line-major")).click();//clicks on the first available job hyperlink using its class name
		driver.findElement(By.xpath("//*[@id='wpjb-scroll']/div[1]/a")).click();//clicks on drop-down button and opens it
		
		//population of the form
		driver.findElement(By.id("applicant_name")).sendKeys("Athi");
		driver.findElement(By.id("email")).sendKeys("automationAssessment@iLABQuality.com");
		driver.findElement(By.id("phone")).sendKeys(generateMyNumber());
		
		//clicking submit button
		driver.findElement(By.id("wpjb_submit")).click();
  }
}
