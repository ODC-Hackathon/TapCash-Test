package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendMoneyPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/user/sendmoney");

        WebElement username = driver.findElement(By.id("user_name"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("sarah123");

        WebElement amount = driver.findElement(By.id("amount"));
        amount.isDisplayed();
        amount.isEnabled();
        amount.sendKeys("10");

        WebElement sendMoney = driver.findElement(By.id("sendMoney"));
        sendMoney.isDisplayed();
        sendMoney.isEnabled();
        if(sendMoney.click())
            driver.get("https://tabcash/home.aspx");
    }
}
