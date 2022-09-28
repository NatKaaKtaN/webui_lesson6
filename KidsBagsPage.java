package ru.gb.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsBagsPage extends BaseView{

    public KidsBagsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[. =\"Школьные рюкзаки для девочек\"]")
    private WebElement girlBags;

    public void searchGirlBags () {
        actions.moveToElement(girlBags)
                .click()
                .perform();
    }
}
