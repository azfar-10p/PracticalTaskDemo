package objects;

import Utilities.connectionString;
import org.testng.annotations.Test;
import pages.homePage;

public class home extends connectionString {

    homePage hp;

    public home(){
        hp = new homePage(driver);
    }

    @Test
    public void whenUserClickOnChapterOneLink() {
        System.out.println("Clicking On Chapter One Link");
        hp.anc_Chapter1.click();
    }
}