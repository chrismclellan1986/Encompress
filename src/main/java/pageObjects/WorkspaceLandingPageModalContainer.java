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

    @FindBy(how = How.CSS, using = "img.title")
    public WebElement span_LoginName;
}
