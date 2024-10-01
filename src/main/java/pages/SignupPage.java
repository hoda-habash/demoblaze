package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {
    static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    private static By UsernameField = By.xpath("//*[@id=\"sign-username\"]");
    private static By PasswordField = By.xpath("//*[@id=\"sign-password\"]");
    private static By SignupButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    private static By CancelSignupButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");


    public String ValidationMessage(){
        //Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(40));
        waiting.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        //get text
        String annotation = driver.switchTo().alert().getText();
        System.out.println(annotation);
        driver.switchTo().alert().accept();
        return annotation;

    }

    public static void clickSignup(){

        driver.findElement(SignupButton).click();
    }
    public static void insertUsername(String Username){
        driver.findElement(UsernameField).sendKeys(Username);
        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public static void insertPassword(String Password){

        driver.findElement(PasswordField).sendKeys(Password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public static void clickCancel(){

        driver.findElement(CancelSignupButton).click();

    }
}
