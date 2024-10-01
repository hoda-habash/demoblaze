package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By SignupButton = By.xpath("//*[@id=\"signin2\"]");


    public SignupPage clickSignupButton(){
        driver.findElement(SignupButton).click();
        return new SignupPage(driver);
    }
}
