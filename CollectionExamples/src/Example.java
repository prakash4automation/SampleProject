import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example 
{
	
	@Test
	public void launchBrowser()
	{
		// TODO Auto-generated method stub E:\chromedriver_win32
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		java.util.List<WebElement> MyLinks=driver.findElements(By.tagName("a"));

		System.out.println("MyLink size-->"+MyLinks.size());

		//Loop1
		for(WebElement el:MyLinks)
		{
			System.out.println("Another way--MyLink size-->"+el.getText());
		}
		
		//loop2
		for(int i=0;i<MyLinks.size();i++)
		{

		WebElement ele= MyLinks.get(i);

		String url=ele.getAttribute("href");
		System.out.println("MyLink size-->"+MyLinks.get(i).getText());
		
		

		}
		
	}

}
