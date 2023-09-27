package MavenTestWithJenkins.MavenTestWithJenkinsAndGit;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class testNg {
  WebDriver driver;
	@Test
  public void CheckIfGooglePageIsOpen() {
  WebElement searchTextBox = driver.findElement(By.name("q"));
  assertNull(searchTextBox);
  searchTextBox.sendKeys("This is test");
  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().fullscreen();
  }

  @AfterTest
  public void afterTest() {
  driver.quit();
  }

}
