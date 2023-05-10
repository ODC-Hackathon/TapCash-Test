package VisitingWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddMoneyPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // to maximize browser's window
        driver.manage().window().maximize();

        // we use get method to open any web page
        driver.get("https://tabcash/addmoney.aspx");

        WebElement amount = driver.findElement(By.id("amount"));
        amount.isDisplayed();
        amount.isEnabled();
        amount.sendKeys("10");

        // DropDown
        WebElement dropDown = driver.findElement(By.id("methodTypes"));
        Select typesDropDown = new Select(dropDown);

        //selectByValue("")

        typesDropDown.selectByIndex(1);

                WebElement cardNumber = driver.findElement(By.id("cardNumber"));
                cardNumber.isDisplayed();
                cardNumber.isEnabled();
                cardNumber.sendKeys("1234567891234567");

                WebElement cvv = driver.findElement(By.id("cvv"));
                cvv.isDisplayed();
                cvv.isEnabled();
                cvv.sendKeys("123");

                WebElement expire = driver.findElement(By.id("expire"));
                expire.isDisplayed();
                expire.isEnabled();
                expire.sendKeys("01-01-2020");

        typesDropDown.selectByIndex(2);

                WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
                phoneNumber.isDisplayed();
                phoneNumber.isEnabled();
                phoneNumber.sendKeys("01123456789");

        typesDropDown.selectByIndex(3);

                WebElement userName = driver.findElement(By.id("userName"));
                userName.isDisplayed();
                userName.isEnabled();
                userName.sendKeys("sarah123");


        WebElement addMoney = driver.findElement(By.id("addMoney"));
        addMoney.isDisplayed();
        addMoney.isEnabled();
        addMoney.click();
        driver.get("https://tabcash/home.aspx");

//        WebElement Text = driver.findElement(By.id("ctl00_CPHContainer_lblOutput"));
//        String InvalidMsg =Text.getText();
//        org.junit.Assert.assertEquals(InvalidMsg,"You have not activate your account. Please first active your account from verification link. A verification link has been sent to your email,\n" +
//                "if you haven't got it yet then either check your spam or click here to resend it!!! ");

    }
}
