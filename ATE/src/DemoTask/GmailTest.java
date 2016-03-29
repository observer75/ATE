package DemoTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest {
  private WebDriver driver;
  private String baseUrl;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:/Work/Projects/Jars");
	  WebDriver driver = new ChromeDriver();
	  baseUrl = "https://mail.google.com";
	  driver.get(baseUrl);
  }
  
  @Test
  public void chromeLogin()
  {
	  driver.get(baseUrl);
  }

}
