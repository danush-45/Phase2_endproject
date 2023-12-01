package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91867\\eclipse-workspace\\TestNG\\Star\\src\\test\\java\\feature\\star.feature", glue = {
"steps" }, plugin = { "html:target/Cucumberreport1.html", "pretty",

"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"timeline:test-output-thread/" })

public class StarRunner {
}

