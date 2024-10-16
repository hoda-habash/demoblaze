package signup;


import base.BaseTests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ValidSignup extends BaseTests {


    ReadDataFromJson readDataFromJson;

    @Test(priority = 1)
    public void testSuccessfulSignup() throws FileNotFoundException{
        readDataFromJson = new ReadDataFromJson();

        SignupPage signupPage = homePage.clickSignupButton();
        SignupPage.insertUsername(readDataFromJson.readJsonFile().Signup.ValidSignupData.Username);
        SignupPage.insertPassword(readDataFromJson.readJsonFile().Signup.ValidSignupData.Password);
        SignupPage.clickSignup();

        String actualResult = signupPage.ValidationMessage();
        String expectedResult = "This user already exist.";
        Assert.assertTrue(actualResult.contains(expectedResult), "Alert Message doesn't match Expected message");

        SignupPage.clickCancel();
    }

    @Test(priority = 2)
    public void testCloseSignup() throws FileNotFoundException{
        readDataFromJson = new ReadDataFromJson();

        //Insert new name and password  then click "Cancel" then Check if an Alert popped-up or not (No alert should pop-up)
        homePage.clickSignupButton();
        SignupPage.insertUsername(readDataFromJson.readJsonFile().Signup.ValidSignupData.Username);
        //WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
        SignupPage.insertPassword(readDataFromJson.readJsonFile().Signup.ValidSignupData.Password);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        SignupPage.clickCancel();

        try {
            // Switch to the alert
            Alert alert = driver.switchTo().alert();
            // Assert that alert is present
            Assert.assertTrue(false, "Alert is present");
        } catch (NoAlertPresentException e) {
            // Assert that alert is not present
            Assert.assertFalse(false,"No alert present");
        }

    }


}
