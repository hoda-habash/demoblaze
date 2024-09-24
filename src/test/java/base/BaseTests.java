package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeMethod
    public void setup(){
        ChromeDriverService service = new ChromeDriverService.Builder().withLogOutput(System.out).build();

        System.setProperty("webdriver.chrome.driver", "D:\\Sources\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        // Set implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
        //driver.findElement(By.xpath("//*[@id=\"usYii7\"]/div/label/input")).click();

    }

   //@AfterMethod
   //public void TearDown(){ driver.quit(); }

}
