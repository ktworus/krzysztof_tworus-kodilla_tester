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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role=\"alertdialog\"]")));
        WebElement buttonAccept = driver.findElement(By.xpath("//button[@data-role=\"accept-consent\"]"));
        buttonAccept.click();

        WebElement inputField = driver.findElement(By.xpath("//form[@action=\"/listing\"]/input[1]"));
       inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement buttonSearch = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        buttonSearch.click();

    }
}