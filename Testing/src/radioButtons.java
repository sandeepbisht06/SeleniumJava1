import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		//driver.findElement(By.xpath("//input[@value='Male']")).click();
		//System.out.println(driver.findElements(By.xpath("//input[@name='ageGroup']")).size());
		int count=driver.findElements(By.xpath("//input[@name='ageGroup']")).size();
		for(int i=0;i<count;i++)
		{
		//driver.findElements(By.xpath("//input[@name='ageGroup']")).get(i).click();
	String text=driver.findElements(By.xpath("//input[@name='ageGroup']")).get(i).getAttribute("value");
		System.out.println(text);
         if(text.equals(5 - 15)) 
         {
        	 driver.findElements(By.xpath("//input[@name='ageGroup']")).get(i).click();
        	 
		};
	}
	


}

}