package PageActions;

import java.time.Duration;
import java.util.List;

import org.apache.hc.client5.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectManger.PageObjectManger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageAction {
	//public WebDriver =new Ste
	static WebDriver   driver;
	PageObjectManger pageObjectManger;
	static WebDriverWait wait;
	public PageAction(){
		
	}
	public  void startDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		///Cookie c=(Cookie) new org.openqa.selenium.Cookie("VISITOR_PRIVACY_METADATA","CgJJThIEGgAgEQ%3D%3D");
		//driver.manage().addCookie((org.openqa.selenium.Cookie) c);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait =new WebDriverWait(driver, Duration.ofSeconds(1));
		pageObjectManger=new PageObjectManger(driver);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getElement(By by) {
		WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return w;
	}
	public WebElement getElement(String xpath) {
		By by= By.xpath(xpath);
		WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return w;
	}
	public List<WebElement> getElements(String xpath) {
		By by= By.xpath(xpath);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		List<WebElement> w=driver.findElements(By.xpath(xpath));
		return w;
	}
	public void clickElement(String xpath) {
		By by= By.xpath(xpath);
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();;
	}
	public void setInput(String xpath, String IPvalue) {
		By by= By.xpath(xpath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(IPvalue);
	}
	
}
