package firsttestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNgFile {
	public String baseUrl="http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	public String DriverPath="C:\\Users\\pc world\\Desktop\\Danappa Sanni Docs\\Doc\\selenium\\ChromeDriver\\chromedriver.exe";
	
  @Test
  public void VerifyHomePageTitle() {
	  System.setProperty("webdriver.chrome.driver", DriverPath);
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  driver.close();
	
  }
}
