package hu.progmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabsTest_Method {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //Creating an object of ChromeDriver
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();



        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        loignTest();

        // Test Case 1 End
        // Clean up
        driver.quit();
        driver.close();
    }

    public static void loignTest() throws InterruptedException  {
        //launching the specified URL
        driver.get("https://www.saucedemo.com/");

        // Test Case 1 Start
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        WebElement userPassword = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        System.out.println("user-name, password and login-button founded!");

        //Thread.sleep(2000); //2 mp.-ig várakozik
        userNameInputField.sendKeys("standard_user");
        //Thread.sleep(2000); //2 mp.-ig várakozik
        userPassword.sendKeys("secret_sauce");
        //Thread.sleep(2000); //2 mp.-ig várakozik
        loginButton.click();

        Thread.sleep(5000); //5 mp.-ig várakozik
    }
}
