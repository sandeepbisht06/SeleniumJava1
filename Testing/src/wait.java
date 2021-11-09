import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait 
	{
		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	
				}
	}
