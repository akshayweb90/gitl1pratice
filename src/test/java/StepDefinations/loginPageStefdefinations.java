package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPageStefdefinations {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.openai.com/");
		WebElement e =driver.findElement(By.xpath("//button[@data-testid='login-button']"));
		System.out.println(e.getCssValue("background-color")+System.getProperty("usr.dir")+File.separator+"ts.png");
	    File f=e.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File(System.getProperty("user.dir")+File.separator+"ts.png"));
	    driver.close();
	}
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	    
	}
	@Then("user should able to login")
	public void user_should_able_to_login() {
	    
	}

}
