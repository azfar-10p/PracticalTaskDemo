package selenideTest;

import configurationFile.configReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class sampleTest {

    public configReader reader;

    public sampleTest() {
        reader = new configReader();
    }

    //This is a sample Selenide Test for POC, its run independently by clicking on Test
    @Test
    public void selenideSampleTest() {
        System.out.println("Opening Default Browser");
        open(reader.getApplicationURL());
        System.out.println("Clicking on Chapter One Link");
        WebElement chapterOne = $("a[href*='chapter1']");
        chapterOne.click();
        $("#divontheleft").shouldHave(text("Assert that this text is on the page"));
        System.out.println("Verified Text on Chapter One Page");
        System.out.println("Clicking on Home Page link");
        WebElement homePage = $("a[href*='/']");
        homePage.click();
    }
}