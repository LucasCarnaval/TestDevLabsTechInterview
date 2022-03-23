package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/java/resources/features"},
        glue = {"stepDefinitions"},
        tags = "@signin",
        monochrome = false,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class Main_Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
