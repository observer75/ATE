package DemoTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest {
//  private WebDriver driver;
//  private String baseUrl;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Work\\Projects\\Jars\\chromedriver.exe");
	
  }
  
  @Test
  public void chromeLogin()
  {
	  WebDriver driver = new ChromeDriver();
	  String baseUrl = "https://mail.google.com";
	  driver.get(baseUrl);
	  WebElement login = driver.findElement(By.id("Email"));
	  login.sendKeys("ivandodokas@gmail.com");
	  
	  WebElement next = driver.findElement(By.id("next"));
	  next.click();
	  
	 
	  
	  WebElement passwd = driver.findElement(By.id("Passwd"));
	  passwd.sendKeys("US!pf.avg");
	  
	  WebElement signIn = driver.findElement(By.id("signIn"));
	  signIn.click();
  }

}
