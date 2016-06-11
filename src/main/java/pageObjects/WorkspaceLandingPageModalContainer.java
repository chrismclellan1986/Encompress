package pageObjects;

/**
 * Created by cmcle_000 on 09/06/2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkspaceLandingPageModalContainer {
    final WebDriver driver;


    public WorkspaceLandingPageModalContainer(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.CLASS_NAME, using = "enc-workspace-list")
    public WebElement openWorkspaceSection;

    @FindBy(how = How.TAG_NAME, using = "button")
    public WebElement openButton;


    public void SearchForOpenWorkspace(String workSpaceName){
        List<WebElement> baseTable = openWorkspaceSection.findElements(By.tagName("td"));

        for(WebElement e : baseTable){
            if(e.getText().equals(workSpaceName)){
                e.click();
                break;
            }
        }
    }
    
    public void SelectOpen() {
        if (openButton.isEnabled()) {

            openButton.click();
        }
        else {
            System.out.print("Open Button is not Enabled");
        }
    }




}
