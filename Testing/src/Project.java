


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.homecentre.in/");
		
		driver.findElement(By.id("js-site-search-input")).sendKeys("tea cups");
		
		Thread.sleep(2000L);
		
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/div/span[3]/span[1]/div/ul[2]/li[1]/a")).click();
		WebElement Nverify= driver.findElement(By.xpath("//h1[@id='product-details-name']"));
		
		String product= Nverify.getText();
		if(product.equalsIgnoreCase("Raisa-Retro Printed Tea Mug")) {
			System.out.println("CUP NAME MATCHED");
		}
		else {
			System.out.println("CUP NAME not MATCHED");
		}
		
		WebElement addtobasket= driver.findElement(By.xpath("//fieldset[@class='show old-button-set'] //button[@id=\"product-actions-btn-add\"]"));
		addtobasket.click();
		
		Thread.sleep(2000L);
		WebElement checkout= driver.findElement(By.xpath("//div[@class='miniCart_row miniCart_row--center'] //button[@id='btn-checkout']"));
		
		checkout.click();
		driver.close();
	

	}
	}