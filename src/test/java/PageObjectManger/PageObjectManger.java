package PageObjectManger;

import org.openqa.selenium.WebDriver;

import HRM.Pages.HomePage;
import HRM.Pages.LoginPage;

public  class PageObjectManger {
	private LoginPage loginPage;
	private HomePage homePage;
	WebDriver driver=null;
	public PageObjectManger(WebDriver d){
		driver=d;
	}

	public LoginPage getLoginPage() {
		return (loginPage==null)? new LoginPage(driver):loginPage;

	}
	public HomePage getHomePage() {
		return (homePage==null)? new HomePage(driver):homePage;
	}

	

}
