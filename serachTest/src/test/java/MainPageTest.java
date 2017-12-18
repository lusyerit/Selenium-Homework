import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class MainPageTest {

    ChromeDriver driver;
    MainPage mainPage;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lusine.yeritsyan\\Desktop\\Selenium Classes\\chromedriver.exe");

        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void search() throws InterruptedException
    {
        mainPage.searchWith("Armenia");
        Assert.assertTrue (mainPage.isWikiDisplayed(),"Login was not succeed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
