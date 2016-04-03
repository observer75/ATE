package DemoTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.*;

public class GmailTest {
//  private WebDriver driver;
//  private String baseUrl;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Work\\Projects\\Jars\\chromedriver.exe");
	
  }
  
  @Test(enabled = false)
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
  
  @Test 
  public void FirefoxLogin()
  {
	  WebDriver driverFirefox = new FirefoxDriver();
	  String baseUrlF = "https://mail.google.com";
	  driverFirefox.get(baseUrlF);
	  WebElement login = driverFirefox.findElement(By.id("Email"));
	  login.sendKeys("iocmarus@gmail.com");
	  
	  WebElement next = driverFirefox.findElement(By.id("next"));
	  next.click();

	  WebElement passwd = driverFirefox.findElement(By.id("Passwd"));
	  
//	  Actions passwdClick =new Actions(driverFirefox);
//	  passwdClick.click()
	  
	  WebElement signIn = driverFirefox.findElement(By.id("signIn"));
	  signIn.click();
	  
	  WebDriverWait wait = new WebDriverWait(driverFirefox, 20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
	  
	  WebElement search = driverFirefox.findElement(By.id("gbqfq"));
	  search.sendKeys("Колектив");
	  
	  WebElement searchButton = driverFirefox.findElement(By.id("gbqfb"));
	  searchButton.click();
	  
	  WebElement message = driverFirefox.findElement(By.id(":bg"));
	  message.click();
  }
}
