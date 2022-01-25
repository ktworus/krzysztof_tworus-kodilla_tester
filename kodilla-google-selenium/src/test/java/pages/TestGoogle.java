package pages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;


public class TestGoogle {

    WebDriver driver;
    List <String> expectedUrls = Arrays.asList("https://pl-pl.facebook.com/kodillaCom/", "https://bedeprogramistka.pl/dlaczego-wybrala-bootcamp-kodilla/");


    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();

    }
   @Test
    public void selectRandomPage(){
       GoogleSearch googleSearch = new GoogleSearch(driver);
       googleSearch.searchResults();
       GoogleResults googleResults = new GoogleResults(driver);
       RandomPage result = googleResults.getRandom();
       System.out.println(result);
       System.out.println(result.getPageUrl(driver));

       Assert.assertTrue(expectedUrls.contains(result.getPageUrl(driver)));

    }
}