package hu.progmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPure {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();

        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        //launching the specified URL
        driver.get("https://progmatic.hu");


        WebElement acceptCookieButton = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button[2]"));
        // <button class="gdpr-agreement btn-accent btn-flat" type="button">I Agree</button>
        // /html/body/div[6]/div/div[2]/button[2]


        wait.until(ExpectedConditions.visibilityOf(acceptCookieButton));
        acceptCookieButton.click();

        //Locating the elements using name locator for the text box
        WebElement jelentkezemButtom = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[5]/div/div/div/div/div/div/div/span[1]/a"));
        // /html/body/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div[5]/div/div/div/div/div/div/div/span[1]/a

        jelentkezemButtom.click();

        //driver.quit();



    }
}
