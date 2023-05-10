package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CreateFamilyMember {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/user/create-member");

        WebElement name = driver.findElement(By.id("name"));
        name.isDisplayed();
        name.isEnabled();
        name.sendKeys("test-family");


        WebElement user_name = driver.findElement(By.id("user_name"));
        user_name.isDisplayed();
        user_name.isEnabled();
        user_name.sendKeys("test@family");


        WebElement phonenumber = driver.findElement(By.id("phonenumber"));
        phonenumber.isDisplayed();
        phonenumber.isEnabled();
        phonenumber.sendKeys("0152154854");



        WebElement percentage = driver.findElement(By.id("percentage"));
        percentage.isDisplayed();
        percentage.isEnabled();
        percentage.sendKeys("10");




        WebElement pincode = driver.findElement(By.id("pincode"));
        pincode.isDisplayed();
        pincode.isEnabled();
        pincode.sendKeys("4888");




        WebElement create_member = driver.findElement(By.id("create"));
        create_member.isDisplayed();
        create_member.isEnabled();
        create_member.click();

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("/register"))
            driver.navigate().to("https://tapcash/user/create-member");


    }
}
