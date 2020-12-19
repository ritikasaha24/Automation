package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Tells about the test runner class to start executing our tests
@RunWith(Cucumber.class)
//To set some properties for our cucumber test
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"StepDef"},strict = true,monochrome=true,

plugin= {"json","json:target/JSONReports/report.json",
		"html:target\\HtmlReports",
		"junit:target/XMLReports/report.xml"}
)
public class TestRunner {

}
