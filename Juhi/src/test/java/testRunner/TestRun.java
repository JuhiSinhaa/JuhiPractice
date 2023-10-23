package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\juhi.sinha\\eclipse-workspace\\Juhi\\src\\test\\java\\features",
		glue={"stepDefinition"},
//		tags = "@DemoWebShop",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		)
public class TestRun {
}
