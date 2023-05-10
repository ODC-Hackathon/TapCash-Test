package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class card_generate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/user/card");

        WebElement type = driver.findElement(By.id("name"));
        type.isDisplayed();
        type.isEnabled();
        type.sendKeys("Visa");



        WebElement generate = driver.findElement(By.id("generate"));
        generate.isDisplayed();
        generate.isEnabled();
        generate.click();

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("/user/card"))
            driver.navigate().to("https://tapcash/user/card");


    }



}
