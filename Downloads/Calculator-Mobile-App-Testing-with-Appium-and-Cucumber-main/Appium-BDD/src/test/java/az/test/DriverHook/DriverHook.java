package az.test.DriverHook;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class DriverHook {
    public static AndroidDriver andoridDriver;
    public DesiredCapabilities desiredCapabilities(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appium:platformVersion","9");
        desiredCapabilities.setCapability("appium:deviceName","emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appium:automationName","UiAutomator2");
        desiredCapabilities.setCapability("appium:appActivity","com.android.calculator2.Calculator");
        return desiredCapabilities;
    };


    @Before
    public void beforeScenario() throws MalformedURLException {
         URL appiumServerUrl=new URL("http://127.0.0.1:4723/");
        andoridDriver=new AndroidDriver(appiumServerUrl,desiredCapabilities());
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if(andoridDriver!=null){
            if(scenario.isFailed()){
                takeDriverScreenshot(scenario);
            }
            andoridDriver.quit();
        }

    }

    private void takeDriverScreenshot(Scenario scenario) throws IOException {
        if(andoridDriver!=null){
            File screenshot=((TakesScreenshot) andoridDriver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent= FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent,"image/png", UUID.randomUUID().toString());

        }

    }
}
