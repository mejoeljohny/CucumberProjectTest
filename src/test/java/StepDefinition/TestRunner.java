package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		 tags= {"@Sanity"},
		 		// to run only Sanity

		// tags= {"@Sanity, @Regression"}, to run both Sanity and Regression

		//tags = { "@Regression", "@Rapid" }, // to run both Sanity and Regression
		glue = { "StepDefinition" }

)
public class TestRunner {

}
