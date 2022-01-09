package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        WebElement buttonAccept = driver.findElement(By.xpath("//body[1]/div[3]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
        buttonAccept.click();

       WebElement inputField = driver.findElement(By.xpath("//input[1]"));
       inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement buttonSearch = driver.findElement(By.xpath("//body[1]/div[3]/div[4]/header[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));
        buttonSearch.click();

    }
}