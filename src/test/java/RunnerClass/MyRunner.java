package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\AKGADHAV\\eclipse-workspace\\Cio.HRM\\src\\test\\java\\feature"},
		glue = "StepDefinations"

		,tags="@HRM"

		)
public class MyRunner extends  AbstractTestNGCucumberTests  {


}
