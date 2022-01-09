package com.kodilla.selenium.facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]")));
        WebElement buttonAccept = driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]"));
        buttonAccept.click();
        WebElement newRegistration = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]"));
        newRegistration.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]")));

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span[1]/span[1]/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);


    }
}
