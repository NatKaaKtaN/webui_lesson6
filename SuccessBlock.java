package ru.gb.lesson6;


import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SuccessBlock extends BaseView {

    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(), 'Школьные рюкзаки для девочек')] ")
    private WebElement rightSelection;


    public void verificationSuccessSelection() {
        Assertions.assertNotEmpty(rightSelection.getText(), "Школьные рюкзаки для девочек");
    }
}
