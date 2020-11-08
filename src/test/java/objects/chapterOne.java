package objects;

import connection.connectionString;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.chapterOnePage;

public class chapterOne extends connectionString {
    chapterOnePage cp;

    @Test(priority = 1)
    public void thenUserShouldVerifyTheTextOnChapterOnePage(){
        cp = new chapterOnePage(driver);
        Assert.assertEquals(cp.getTextForVerification(), "Assert that this text is on the page");
        System.out.println("Verified Text: " + cp.getTextForVerification());
    }

    @Test(priority = 2)
    public void whenUserClickOnHomePageLink(){
        cp = new chapterOnePage(driver);
        System.out.println("Clicking on Home Page link...");
        cp.clickHomeLink();
    }
}