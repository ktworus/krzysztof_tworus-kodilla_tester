package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "h3[class=\"LC20lb MBeuO DKV0Md\"]")
    private List<WebElement> results;
    private static RandomPage randomPage;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
    public RandomPage loadRandomPage (WebDriver driver, int randomNumber) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(results.get(randomNumber))).click();
        RandomPage randomPage = new RandomPage(driver);
        return randomPage;
    }
    public RandomPage getRandom(){
        Random random = new Random();
        int randomNumber = random.nextInt(results.size());
        randomPage=loadRandomPage(driver,randomNumber);
        return randomPage;

    }

}
