package objects;

import Utilities.connectionString;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.chapterOnePage;

public class chapterOne extends connectionString {

    chapterOnePage cp;
    private String labText;

    public chapterOne(){
        cp = new chapterOnePage(driver);
    }

    @Test(priority = 1)
    public void thenUserShouldVerifyTheTextOnChapterOnePage(){
        labText = cp.lab_text.getText();
        Assert.assertEquals(labText, "Assert that this text is on the page");
        System.out.println("Verified Text: " + labText);
    }

    @Test(priority = 2)
    public void whenUserClickOnHomePageLink(){
        System.out.println("Clicking on Home Page link...");
        cp.anc_BackHome.click();
    }
}