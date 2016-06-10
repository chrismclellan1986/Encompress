package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cmcle_000 on 09/06/2016.
 */
public class LoginPage {
    final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //@FindsBy(how = How.ID, using = "username")
    @FindBy(how = How.ID, using = "username")
    public WebElement txtbx_Username;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtbx_Password;

    @FindBy(how = How.CLASS_NAME, using = "enc-login-submit-button")
    public WebElement btn_Login;

}
