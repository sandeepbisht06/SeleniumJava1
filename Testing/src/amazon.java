import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"))).build().perform();
		

	}

}
