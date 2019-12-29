package question1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	
	ChromeDriver chrome;
	@Test(priority = 1)
	  public void openBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		  chrome = new ChromeDriver();
		  chrome.get("https://www.verizonwireless.com/");
	 }
	@Test(priority = 2)
	  public void signIn()
	  {
	  WebElement signIn = chrome.findElementById("gnavAccountMenu");
		
		
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(signIn).build().perform();

}
}
