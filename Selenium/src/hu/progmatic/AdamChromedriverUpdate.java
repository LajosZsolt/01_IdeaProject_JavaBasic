package hu.progmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class AdamChromedriverUpdate {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

    //Creating an object of ChromeDriver
    RemoteWebDriver driver = new ChromeDriver();
    //Actual chrome version load and modify to have only the first 3 numbers
    Capabilities caps = driver.getCapabilities();
    String browserName = caps.getBrowserName();
    String browserVersion = caps.getBrowserVersion();
    System.out.println(browserVersion);
    String shortBrowserVersion = browserVersion.substring(0, 3);
    System.out.println(shortBrowserVersion);

    //change the window size to max
    driver.manage().window().maximize();
    //Deleting all the cookies
    driver.manage().deleteAllCookies();
    //loading the chromedriver page
    driver.get("https://chromedriver.chromium.org/downloads");
    String originalWindow = driver.getWindowHandle();
    //Find the right webdriver based on chrome version ( only the first 3 number is considered)
    WebElement releaseNumber = driver.findElement(By.partialLinkText(shortBrowserVersion));
    releaseNumber.click();
    //Switch the focus to the new tab.
    for (String windowHandle : driver.getWindowHandles()) {
        if (!originalWindow.contentEquals(windowHandle)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
    //Waiting to load everything on the new tab
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    //find the right OS
    WebElement downloadLink = driver.findElement(By.partialLinkText("chromedriver_win32.zip"));
    //dowload the webdriver
    downloadLink.click();

    // Driver quit is off to be able to download the file
    // driver.quit();

}
}
