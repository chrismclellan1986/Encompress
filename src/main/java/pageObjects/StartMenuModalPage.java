package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by cmcle_000 on 12/06/2016.
 */
public class StartMenuModalPage
{
    private final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "enc-search-type")
    public WebElement selectTypeColumn;

    @FindBy(how = How.CLASS_NAME, using = "enc-search-source")
    public WebElement selectSourceColumn;

    @FindBy(how = How.CLASS_NAME, using = "enc-search-report")
    public WebElement selectSearchToStartColumn;

    public StartMenuModalPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void SearchAndClickType(String type)
    {
        Search(type, selectTypeColumn);
    }

    public void SearchAndClickSource(String source)
    {
        Search(source, selectSourceColumn);
    }

    public void SearchAndClickReport(String report)
    {
        Search(report, selectSearchToStartColumn);
    }

    private void Search(String type, WebElement element)
    {
        List<WebElement> links = element.findElements(By.tagName("a"));

        for(WebElement linkRows: links)
        {
            if(linkRows.getText().equals(type))
            {
                linkRows.click();
                break;
            }
        }
    }
}
