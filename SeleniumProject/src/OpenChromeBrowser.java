import org.openqa.selenium.WebDriver;
public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		Webdriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
