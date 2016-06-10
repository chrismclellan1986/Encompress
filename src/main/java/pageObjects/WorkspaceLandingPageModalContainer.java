package pageObjects;

/**
 * Created by cmcle_000 on 09/06/2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class WorkspaceLandingPageModalContainer {
    final WebDriver driver;


    public WorkspaceLandingPageModalContainer(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/enc-loading-indicator/section/ui-view/enc-workspace/div[3]/section/enc-landing-page-header/header/span/span")
    public WebElement span_LoginName;
}
