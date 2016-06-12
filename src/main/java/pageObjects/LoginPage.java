package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by cmcle_000 on 09/06/2016.
 */
public class LoginPage
{
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "username")
    public WebElement txtbx_Username;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtbx_Password;

    @FindBy(how = How.CLASS_NAME, using = "enc-login-submit-button")
    public WebElement btn_Login;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public LoginPage EnterLoginDetails(String username, String password)
    {
        txtbx_Username.sendKeys(username);
        txtbx_Password.sendKeys(password);
        btn_Login.click();

        return new LoginPage(driver);
    }

}
