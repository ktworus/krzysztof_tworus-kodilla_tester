package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingAppCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        WebElement buttonAccept = driver.findElement(By.xpath("//body[1]/div[3]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
        buttonAccept.click();

       WebElement inputField = driver.findElement(By.cssSelector(".allegro.metrumHeader>form>.mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _535b5_3gmLS mp7g_oh"));
       inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement buttonSearch = driver.findElement(By.xpath("//body[1]/div[3]/div[4]/header[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));
        buttonSearch.click();

    }
}