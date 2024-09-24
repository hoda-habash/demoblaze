package signup;

import base.BaseTests;
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

    @Test
    public void testSuccessfulSignup() throws FileNotFoundException{
        readDataFromJson = new ReadDataFromJson();

        SignupPage signupPage = homePage.clickSignupButton();
        SignupPage.insertUsername(readDataFromJson.readJsonFile().Signup.ValidSignupData.Username);
        SignupPage.insertPassword(readDataFromJson.readJsonFile().Signup.ValidSignupData.Password);
        SignupPage.clickSignup();


        String actualResult = signupPage.ValidationMessage();
        String expectedResult = "This user already exist.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
