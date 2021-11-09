
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sandy.bisht@gmail.com");	
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("qwerty1235");
		driver.findElement(By.xpath("//*[@id=\"u_0_d_Sq\"]")).click();
	    

	}

}
