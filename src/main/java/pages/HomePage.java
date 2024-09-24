package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By RegisterationButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private By SignupButton = By.xpath("//*[@id=\"signin2\"]");

    public RegisterationPage clickRegisterationButton(){
        driver.findElement(RegisterationButton).click();
        return new RegisterationPage(driver);
    }
    public SignupPage clickSignupButton(){
        driver.findElement(SignupButton).click();
        return new SignupPage(driver);
    }
}
