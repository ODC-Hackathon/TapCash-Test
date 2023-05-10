package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/Login");

        WebElement email = driver.findElement(By.id("user_name"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys("test@admin");

        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("TapCash@2023");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("/login"))
            driver.navigate().to("https://tabcash/home.com/");

        WebElement RegisterButton = driver.findElement(By.id("register"));
        RegisterButton.isDisplayed();
        RegisterButton.isEnabled();
        loginButton.click();
        if(currentUrl.contains("/register"))
            driver.navigate().to("https://register.com/");


//        WebElement Text = driver.findElement(By.id("ctl00_CPHContainer_lblOutput"));
//        String InvalidMsg =Text.getText();
//        org.junit.Assert.assertEquals(InvalidMsg,"You have not activate your account. Please first active your account from verification link. A verification link has been sent to your email,\n" +
//                "if you haven't got it yet then either check your spam or click here to resend it!!! ");

    }
}
