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
public class CompanyAppointmentPage
{
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "purchaseFlowStepCtrl.form_input_companyName_1")
    public WebElement companyNameTextBox;

    @FindBy(how = How.CLASS_NAME, using = "next")
    public WebElement searchButton;

    public CompanyAppointmentPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void EnterCompanyName(String companyName)
    {
        companyNameTextBox.sendKeys(companyName);
    }

    public void SelectSearchButton()
    {
        searchButton.click();
    }


}
