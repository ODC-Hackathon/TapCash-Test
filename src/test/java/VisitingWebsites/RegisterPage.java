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

        WebElement username = driver.findElement(By.id("user_name"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("sarah123");

        WebElement phone = driver.findElement(By.id("phone_number"));
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

        WebElement password = driver.findElement(By.id("password_confirmation"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("123456");


        WebElement nationalID = driver.findElement(By.id("nationalID"));
        nationalID.isDisplayed();
        nationalID.isEnabled();
        nationalID.sendKeys("12345678912345");

        WebElement pincode = driver.findElement(By.id("pincode"));
        pincode.isDisplayed();
        pincode.isEnabled();
        pincode.sendKeys("4888");

        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.isDisplayed();
        registerButton.isEnabled();

        if( registerButton.click())
            driver.navigate().to("https://tabcash.com/");

    }
}
