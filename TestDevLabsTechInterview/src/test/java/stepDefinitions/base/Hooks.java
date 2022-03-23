package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.Driver_Factory.cleanupDriver;
import static driver.Driver_Factory.getDriver;

public class Hooks {

    @Before
    public void setup(){
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario){
        if(scenario.isFailed()){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliSecounds = Long.toString(timestamp.getTime());

            byte[] screenshoot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshoot, "image/png", timeMilliSecounds);
        }
    }

    @After
    public void tearDown(){
        cleanupDriver();
    }

}
