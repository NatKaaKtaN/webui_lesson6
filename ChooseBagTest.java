package ru.gb.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChooseBagTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new EdgeDriver();
    }

    @Test
    void chooseBagTest() {
        driver.get("https://www.21vek.by");
        new MainPage(driver).inputSearch();
        new MainPage(driver).searchList();
        new KidsBagsPage(driver).searchGirlBags();
        new SuccessBlock(driver).verificationSuccessSelection();
    }


    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
