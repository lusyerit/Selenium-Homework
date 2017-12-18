package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    private WebDriver driver;
    private String baseUrl = "https://www.google.am/?gws_rd=cr&dcr=0&ei=yXI3WrStMI35kwXL0YLADg";
    private By searchFieldLocator = By.id("lst-ib");
    private By googleSearchLocator = By.name("btnK");

    private By resultLocator = By.cssSelector("a[href*='wikipedia']");

    public String getUrl() { return driver.getCurrentUrl();}

    public MainPage(WebDriver webDriver){
        this.driver = webDriver;
        driver.get(baseUrl);
    }

    public void searchWith(String request ) {
        driver.findElement(searchFieldLocator).sendKeys(request);
        driver.findElement(googleSearchLocator).click();
    }

    public boolean isWikiDisplayed()
    {
        return driver.findElement(resultLocator).isDisplayed();
    }

}
