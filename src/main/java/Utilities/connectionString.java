package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class connectionString {

    public static WebDriver driver;
    public configReader reader;

    public connectionString() {

        reader = new configReader();
        Initializer();
    }

    //region This method is use to Initialize a Web Driver like Chrome Driver and Navigate to The Automated Tester
    // WebDriverManager, can automatically download the driver’s binary files
    // for all the browsers (Chrome, Firefox, Opera, IE and Microsoft Edge etc.)
    public void Initializer() {
        if (driver == null) {
            try {
                System.out.println("Setup Chrome Driver");
                WebDriverManager.chromedriver().setup();
                System.out.println("Setup Chrome Options");
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("--headless");
                options.addArguments("--incognito");
                System.out.println("Initialize Chrome Driver with Incognito Property");
                driver = new ChromeDriver(options);
                System.out.println("Opening The Automated Tester on Chrome Browser");
                driver.get(reader.getApplicationURL());
                driver.manage().window().maximize();
            } catch (Exception ex) {
                System.out.println("Cause is : " + ex.getCause());
                System.out.println("Message is : " + ex.getMessage());
            }
        }
    }

    //region This method is used to Close and Quit the Web Driver
    @AfterSuite
    public void TearDown() {
        try {
            System.out.println("Closing the Browser");
            driver.close();
            driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //endregion
}