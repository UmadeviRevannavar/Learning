package firsttestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	public String baseUrl="http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	public String DriverPath="C:\\Users\\pc world\\Desktop\\Danappa Sanni Docs\\Doc\\selenium\\ChromeDriver\\chromedriver.exe";
	
	@BeforeTest
	public void driverIntialisation()
	{System.setProperty("webdriver.chrome.driver", DriverPath);
		driver=new ChromeDriver();
	driver.get(baseUrl);
	}
  @Test
  public void verifyTitle() {
	  String Expected="Welcome: Mercury Tours";
			  String Actual=driver.getTitle();
			  Assert.assertEquals(Actual, Expected);
  }
  @AfterTest
  public void closing()
  {
	  driver.quit();
  }
}
