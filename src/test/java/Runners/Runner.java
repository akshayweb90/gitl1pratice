package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features={"src\\test\\java"},
		 glue = "StepDefinations"

		 ,tags="@HRM"

		 )
public class Runner extends AbstractTestNGCucumberTests{

}
