package HRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
LoginPage(WebDriver driver){
	this.driver=driver;
}
By UserName=By.xpath("//input[@name=\\\"username\\\"]");

}
