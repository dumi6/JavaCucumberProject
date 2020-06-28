package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\JavaProject\\eclipse-workspace\\SundayCucumberProject\\src\\main\\java\\Features\\hooks.feature", //path of features file
glue= {"stepDefinition"}, //path of step definition
format = {"pretty","html:test-outout", "junit: junit_xml/cucumberReports.xml"},
monochrome = true, //readable console format
strict= true, // checks is any step definition is not defined in step definition file
dryRun = false // to check the mapping btwn the feature file and the step def
//tags = {"@PhoenixTest"}
		) //Cucumber options

public class TestRunner {
	
//tags {"@Chronos"} run only Chronos env:  
//tags {"@Phoenix" , "@Chronos"} runs all Phoenix or Chronos env: 
}
