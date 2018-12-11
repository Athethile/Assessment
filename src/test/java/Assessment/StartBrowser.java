package Assessment;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {
	public static WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ilabadmin\\Downloads\\geckodriver-v0.23.0-win32\\geckodriver.exe");	
	  	driver=new FirefoxDriver();//declaration
		driver.manage().window().maximize();//maximise window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
