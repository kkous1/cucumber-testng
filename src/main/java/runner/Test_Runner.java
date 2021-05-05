package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/main/resources/features",
		glue="step_definitions",
		tags="",
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		
		)

public class Test_Runner {
	

}
