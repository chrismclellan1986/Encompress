package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by cmcle_000 on 12/06/2016.
 */
public class WorkspacePage
{
    private final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "enc-open-startsearch")
    public WebElement searchButton;

    public WorkspacePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public StartMenuModalPage SelectSearch() throws InterruptedException {

        WebElement searchElement = searchButton;

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(searchElement));
        element.click();
        return new StartMenuModalPage(driver);
    }


}
