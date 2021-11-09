import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sales {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sandy.bisht@gmail.com");	
		driver.findElement(By.id("password")).sendKeys("qwerty12345");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
