import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByIndex(11);
		
		Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue("12");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1985");
		
						
		//driver.close();
	}

}
