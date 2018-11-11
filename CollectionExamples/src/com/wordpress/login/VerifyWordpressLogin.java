/**
* 
*/
package com.wordpress.login;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 

 
/**
* 
*
*/
public class VerifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin()
{
 
	WebDriver driver ;

	
	System.out.println("**Remender**"+6%4);
	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");

	//Creating chrome driver object
	driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
 
LoginPage login=new LoginPage(driver);
 login.typeUserName("admin");
 login.typePassword("demo123");
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}