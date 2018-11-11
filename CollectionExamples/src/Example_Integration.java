import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Integration 
{
	Properties pro=new Properties();
	File src;

	@BeforeTest
	public void pretest() throws IOException
	{
		src=new File("./Data.properties");
		 
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		 
		// Create Properties class object to read properties file
		
		 
		// Load file so we can use into our script
		pro.load(fis);
	}
	
	@Test
	public void LaunchBrowser() throws IOException
	{
		//Properties prop ;
		//final String filepath = "./Data.txt";
		
		File src=new File("./Data.properties");
		 
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		 
		// Create Properties class object to read properties file
		Properties pro=new Properties();
		 
		// Load file so we can use into our script
		pro.load(fis);
		
		System.out.println("**url**"+pro.getProperty("url"));
		System.out.println("**Username**"+pro.getProperty("Username"));
		System.out.println("**Password**"+pro.getProperty("Password"));
	}
}
