package az.test.StepDefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static az.test.DriverHook.DriverHook.andoridDriver;

public class CalculatorSteps{

    @Given("I am in HomePage")
    public void iAmInHomePage() {
        Assert.assertEquals(".Calculator",andoridDriver.currentActivity());
    }

    @When("Click calculator number {int}")
    public void clickCalculatorNumber(int arg0) {
        andoridDriver.findElement(By.id("com.android.calculator2:id/digit_"+arg0)).click();
    }

    @And("Click calculator operation {string}")
    public void clickCalculatorOperation(String arg0) {
        andoridDriver.findElement(new AppiumBy.ByAccessibilityId(arg0)).click();
    }

    @Then("Check result is {int}")
    public void checkResultIs(int arg0) {
        String result=andoridDriver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(arg0,Integer.parseInt(result));
    }
}
