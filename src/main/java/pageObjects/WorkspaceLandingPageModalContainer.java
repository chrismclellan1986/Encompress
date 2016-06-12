package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by cmcle_000 on 09/06/2016.
 */


public class WorkspaceLandingPageModalContainer
{
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "new-workspace-form-matter")
    public WebElement matterReferenceTextBox;

    @FindBy(how = How.ID, using = "new-workspace-form-create-button")
    public WebElement createButton;


    public WorkspaceLandingPageModalContainer(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public WorkspaceLandingPageModalContainer enterMatterReference(String matterReference)
    {
        matterReferenceTextBox.sendKeys(matterReference);
        return new WorkspaceLandingPageModalContainer(driver);
    }

    public WorkspacePage selectCreateButton() {
        if (createButton.isDisplayed()) {
            createButton.click();
        }
        return new WorkspacePage(driver);
    }

}
