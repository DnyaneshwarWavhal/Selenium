import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("dnyaneshwarwavhal@yahoo.co.in");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		wait .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\'login-passwd']"))).sendKeys("dnyaneshwari11121985");
		driver.findElement(By.xpath("//button[@id=\'login-signin\']")).click();
				
		//driver.close();
	}

}
