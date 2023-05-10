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
        driver.get("https://tabcash/user/addmoney");

        WebElement amount = driver.findElement(By.id("amount"));
        amount.isDisplayed();
        amount.isEnabled();
        amount.sendKeys("10");

        // DropDown
        WebElement dropDown = driver.findElement(By.id("methodTypes"));
        Select typesDropDown = new Select(dropDown);
        int length = typesDropDown.getOptions().size();

        for(int i =0; i<length ; i++)
        {
            typesDropDown.selectByIndex(i);

            if(i == 0)
            {
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
            }else if(i ==1)
            {

                WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
                phoneNumber.isDisplayed();
                phoneNumber.isEnabled();
                phoneNumber.sendKeys("01123456789");
            }else if(i ==2)
            {

                WebElement userName = driver.findElement(By.id("userName"));
                userName.isDisplayed();
                userName.isEnabled();
                userName.sendKeys("sarah123")
            }
        }


        WebElement addMoney = driver.findElement(By.id("addMoney"));
        addMoney.isDisplayed();
        addMoney.isEnabled();
        addMoney.click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("/user/addMoney"))
            driver.get("https://tabcash/user/home");

    }
}
