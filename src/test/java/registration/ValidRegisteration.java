package registration;

import base.BaseTests;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.io.FileNotFoundException;

public class ValidRegisteration extends BaseTests {

    ReadDataFromJson readDataFromJson;


    public void testSuccessfulRegister() throws FileNotFoundException{
        readDataFromJson = new ReadDataFromJson();

        //RegisterationPage registerationPage = new RegisterationPage();
        //registerationPage.insertFirstname(readDataFromJson.readJsonFile().Registeration.ValidCredentials.Firstname);
        //registerationPage.insertLastname(readDataFromJson.readJsonFile().Registeration.ValidCredentials.Lastname);
        //registerationPage.insertEmail(readDataFromJson.readJsonFile().Registeration.ValidCredentials.Email);
        //registerationPage.insertPassword(readDataFromJson.readJsonFile().Registeration.ValidCredentials.Password);
        //registerationPage.insertConfirmPassword(readDataFromJson.readJsonFile().Registeration.ValidCredentials.ConfirmPassword);
        //registerationPage.clickRegister();

        //String actualResult = registerationPage.ValidationMessage();
        //String expectedResult = "Your registration completed";
        //assertTrue(actualResult.contains(expectedResult));
    }

}
