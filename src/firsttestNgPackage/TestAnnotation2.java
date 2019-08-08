package firsttestNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation2 {
	WebDriver driver;
	String baseUrl="http://demo.guru99.com/test/newtours/";
	String driverPath="C:\\Users\\pc world\\Desktop\\Danappa Sanni Docs\\Doc\\selenium\\ChromeDriver\\chromedriver.exe";
	@BeforeTest
	public void Initialisation()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get(baseUrl);
	}
	@BeforeMethod
	public void CheckingHomePage()
	{
		String ExpectedTitle="Welcome: Mercury Tours";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
  @Test (priority=0)
  public void CheckingRegisterPage ()
  {
	  String ExpectedTitle="Register: Mercury Tours";
		
	  driver.findElement(By.linkText("REGISTER")).click();
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test(priority=1)
  public void CheckingSupportPage()
  {
	  String ExpectedTitle="Under Construction: Mercury Tours";
		
	  driver.findElement(By.linkText("SUPPORT")).click();
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @AfterMethod
  public void GotoHome()
  {
	  driver.navigate().back();
  }
  @AfterTest
  public void CloseDriver()
  {
	  driver.close();
  }
}
