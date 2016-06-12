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
public class CompanyOrdersPage
{
    private final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "cost")
    public WebElement orderReportsCostListContainer;

    @FindBy(how = How.CSS, using = "[ng-click=\'purchaseFlowStepCtrl.next()\']")
    public WebElement placeOrderControl;

    public CompanyOrdersPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public String IsCompanyRecordFree(String cost) {
        if(orderReportsCostListContainer.getText().contains(cost))
        {
            return orderReportsCostListContainer.getText();
        }
        return cost;
    }

    public void SelectPlaceOrder()
    {
        placeOrderControl.click();
    }
}
