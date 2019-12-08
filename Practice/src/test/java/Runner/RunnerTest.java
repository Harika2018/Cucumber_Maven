package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\harik\\eclipse-workspace\\practice\\Practice\\src\\test\\java\\Features\\sampleFeatures.feature"
		,glue={"StepDefs"} 
		//,plugin = {"pretty","json:json_output/cucumber.json"}
		,plugin = {"pretty"}
		,dryRun = false
		//,format={"pretty","html:test-output"}
		)
public class RunnerTest {

}

 
/*
 * @CucumberOptions(plugin = "json:target/cucumber-report-composite.json")
 * public class RunnerTest {
 * 
 * @Test(groups = "examples", description =
 * "Example of using TestNGCucumberRunner to invoke Cucumber") public void
 * runCukes() { new TestRunner(getClass()).runCukes(); } }
 */