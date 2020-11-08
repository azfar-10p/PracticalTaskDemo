package objects;

import connection.connectionString;
import org.testng.annotations.Test;
import pages.homePage;

public class home extends connectionString {

    homePage hp;

    @Test
    public void whenUserClickOnChapterOneLink() {
        hp = new homePage(driver);
        System.out.println("Clicking On Chapter One Link");
        hp.clickOnChapter1Link();
    }
}