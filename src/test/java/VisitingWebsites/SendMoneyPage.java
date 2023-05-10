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
        driver.get("https://tabcash/sendmoney.aspx");

        WebElement username = driver.findElement(By.id("username"));
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
        sendMoney.click();
        driver.get("https://tabcash/home.aspx");

//        WebElement Text = driver.findElement(By.id("ctl00_CPHContainer_lblOutput"));
//        String InvalidMsg =Text.getText();
//        org.junit.Assert.assertEquals(InvalidMsg,"You have not activate your account. Please first active your account from verification link. A verification link has been sent to your email,\n" +
//                "if you haven't got it yet then either check your spam or click here to resend it!!! ");

    }
}
