package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features={"C:\\Users\\Akshay Gadhave\\eclipse-workspace\\HRM_ORG\\src\\test\\java\\Resources\\HRM_loginPage.feature"},
		 glue = "StepDefinations"

		 ,tags="@HRM"

		 )
public class Runner extends AbstractTestNGCucumberTests{

}
