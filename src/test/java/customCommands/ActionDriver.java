package customCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Assessment.StartBrowser;

public class ActionDriver {

	WebDriver driver;
	
	public ActionDriver() {
		driver =StartBrowser.driver;
	}
	
	//used to launch the Application
	//url is for the ilab website
	public void launchApp(String url) {
		driver.get(url);
	}
	//whenever using click command need to pass a locator
	//performs click operations on links, buttons,drop box etc
	//@param locator --get it from objRep eg ---homePage.lnkCareers 
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	//set test in text box area
	//parameter locator gets it from objRep
	//parameter testData from external source
	public void input(By locator, String testData) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(testData);
	}
	//perform mouse hover on given element
	//parameter locator get it from objRep
	public void mouseHover(By locator) {
		Actions a=new Actions(driver);
		WebElement mo= driver.findElement(locator);
		a.moveToElement(mo).build().perform();
	}
}
