package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class chapterOnePage {
    public chapterOnePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "divontheleft")
    @CacheLookup
    public WebElement lab_text;

    @FindBy(how = How.CSS, using = "a[href*='/']")
    @CacheLookup
    public WebElement anc_BackHome;
}