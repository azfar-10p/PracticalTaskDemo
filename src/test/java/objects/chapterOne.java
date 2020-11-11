package objects;

import Utilities.connectionString;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.chapterOnePage;

public class chapterOne extends connectionString {

    chapterOnePage cp;
    private String labText;

    public chapterOne() {
        cp = new chapterOnePage(driver);
    }

    @Test(priority = 1)
    public void thenUserShouldVerifyTheTextOnChapterOnePage() {
        Assert.assertEquals(cp.getTextFromChapterOne(), "Assert that this text is on the page");
        System.out.println("Verified Text: " + cp.getTextFromChapterOne());
    }

    @Test(priority = 2)
    public void whenUserClickOnHomePageLink() {
        System.out.println("Clicking on Home Page link...");
        cp.clickingOnHomeLink();
    }
}