package question1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
	ChromeDriver chrome;
	@Test(priority = 1)
	  public void openBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		  chrome = new ChromeDriver();
		  chrome.get("https://accounts.google.com/signup/v2/webcreateaccount?service=g4np&continue=https%3A%2F%2Fwww.google.com%2Fnonprofits%2Faccount%2Fsignup%3Flocality%3Dus&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	 }
	

@Test(priority = 2)
public void loginTest() {
 chrome.findElement(By.name("firstName")).sendKeys("mangal");
	chrome.findElement(By.name("lastName")).sendKeys("khandalikar");
	chrome.findElement(By.name("Username")).sendKeys("khandalikarmangal");
	chrome.findElement(By.name("Passwd")).sendKeys("mangal123@");
	chrome.findElement(By.name("ConfirmPasswd")).sendKeys("mangal123@");
	chrome.findElementByXPath("//*[@id=\"accountDetailsNext\"]/span/span").click();
	chrome.findElement(By.id("phoneNumberId")).sendKeys("8208496722");

}
}
