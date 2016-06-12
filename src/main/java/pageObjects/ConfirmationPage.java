package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by cmcle_000 on 12/06/2016.
 */
public class ConfirmationPage
{
    final WebDriver driver;

    @FindBy(how = How.CSS, using = "[ng-click=\'purchaseFlowStepCtrl.next()\']")
    public WebElement closeButton;

    public ConfirmationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void SelectCloseButton()
    {
        closeButton.click();
    }


}
