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
public class CompanySearchResultPage
{
    private final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "enc-search-results-table")
    private WebElement companyNameListTable;

    @FindBy(how = How.CLASS_NAME, using = "next")
    private WebElement nextButton;

    public CompanySearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void SelectCompanyFromTable(String company)
    {
        SearchCompanyList(company, companyNameListTable);
    }

    public void SelectNext()
    {
        nextButton.click();
    }


    private void SearchCompanyList(String type, WebElement element)
    {
        List<WebElement> links = element.findElements(By.tagName("td"));

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
