package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomPage extends AbstractPage{

    public RandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeRandomResults() {
        System.out.println("Random result");
        System.out.println(driver.getCurrentUrl());

    }
    public String getPageUrl(WebDriver driver)
    {
        return  driver.getCurrentUrl();
    }
}

