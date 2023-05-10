package OpeningBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserUsingDriver {
    public static void main(String[] args) {

        //FIRST WAY chrome browser
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        //SECOND WAY chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }
}
