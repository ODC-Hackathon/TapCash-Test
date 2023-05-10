package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/Register.aspx");

        WebElement name = driver.findElement(By.id("name"));
        name.isDisplayed();
        name.isEnabled();
        name.sendKeys("sarah yossri");

        WebElement username = driver.findElement(By.id("username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("sarah123");

        WebElement phone = driver.findElement(By.id("phone"));
        phone.isDisplayed();
        phone.isEnabled();
        phone.sendKeys("01123456789");

        WebElement email = driver.findElement(By.id("email"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys("sarah.yossri@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("123456");

        WebElement nationalID = driver.findElement(By.id("nationalID"));
        nationalID.isDisplayed();
        nationalID.isEnabled();
        nationalID.sendKeys("12345678912345");

        WebElement registerButton = driver.findElement(By.id("registerButton"));
        registerButton.isDisplayed();
        registerButton.isEnabled();
        registerButton.click();
        driver.navigate().to("https://tabcash.com/");

//        WebElement Text = driver.findElement(By.id("ctl00_CPHContainer_lblOutput"));
//        String InvalidMsg =Text.getText();
//        org.junit.Assert.assertEquals(InvalidMsg,"You have not activate your account. Please first active your account from verification link. A verification link has been sent to your email,\n" +
//                "if you haven't got it yet then either check your spam or click here to resend it!!! ");

    }
}
