package signup;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;
import reader.ReadDataFromJson;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import static org.testng.AssertJUnit.assertTrue;

public class InvalidSignup extends BaseTests {
    ReadDataFromJson readDataFromJson;

    @Test
    public void testEmptySignupAttempt() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();

        SignupPage signupPage = homePage.clickSignupButton();
        SignupPage.insertUsername(readDataFromJson.readJsonFile().Signup.InvalidSignupData.EmptySignup.Username);
        SignupPage.clickSignup();

        //String actualResult = signupPage.errorMessage1();
        //String expectedResult = "Please fill out Username and Password.";
        //Assert.assertTrue(actualResult.contains(expectedResult));

        //SignupPage.clickCancel();
    }
}
