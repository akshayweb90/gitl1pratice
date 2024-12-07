package HRM.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		
		 WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement e =w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//				e.sendKeys("Admin");
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.quit();
		
		

	}

}
