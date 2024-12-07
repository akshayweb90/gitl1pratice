package StepDefinations;




//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import HRM.Pages.LoginPage;
import PageActions.PageAction;
import PageObjectManger.PageObjectManger;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class LoginPageStepDefination extends PageAction {
	public static WebDriver driver=null;
	PageObjectManger pageObjectManger;
	public LoginPageStepDefination(){
		
		pageObjectManger=new PageObjectManger(driver);
	}
	@Given("user is on login Page")
	public void user_is_on_login_page()   {
		startDriver();
		pageObjectManger.getLoginPage().hitUrl();
}
	@When("User gives the credential")
	public void user_gives_the_credential()  {
		pageObjectManger.getLoginPage().loginHRM();
	}
	@Then("user is on dashboard")
	public void user_is_on_dashboard() {
		
	}
	@When("User click om logout button")
	public void user_click_om_logout_button() {
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
}

	@Then("user is logged out")
	public void user_is_logged_out() {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Boolean LoginPageIcon=driver.findElement(By.xpath("//h5")).isDisplayed();
		assertTrue(LoginPageIcon);
	}
	@Then("^user enters(.*)and(.*)$")
	public void user_enters_akshay_and_gadhave(String username,String passward) {
		WebElement username1=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username1.sendKeys(username);
		WebElement Passward1=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Passward1.sendKeys(passward);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

	@Then("invalid credential sms should displayed")
	public void invalid_credential_sms_should_displayed() {

	}

//	@After
//	public void teardown() {
//		driver.close();
//		System.out.print("closed");
//	}





}
