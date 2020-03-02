package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testone() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.selenium.dev");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
