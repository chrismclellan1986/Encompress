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
public class DashboardPage
{
    final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "unselectable")
    public WebElement tableBody;

    @FindBy(how = How.CLASS_NAME, using = "enc-document-container")
    public WebElement documentContainer;


    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public String CheckForHarrodsIconOnChart(String type)
    {
        List<WebElement> tableData = tableBody.findElements(By.tagName("td"));

        for(WebElement td: tableData)
        {
            if(td.getText().contains(type))
            {
                return td.getText();

            }
            break;
        }
        return type;
    }


    public boolean CheckForDocumentdocumentIsLoaded(String document)
    {
        List<WebElement> docSection = documentContainer.findElements(By.tagName("section"));

        for(WebElement section: docSection)
            if (!section.getText().equals(document)) {
                return false;

            }
        return true;
    }
}
