/**
 * Created by cmcle_000 on 09/06/2016.
 */

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LoginPage;
import pageObjects.WorkspaceLandingPageModalContainer;


import java.util.concurrent.TimeUnit;

public class EncompassLoginTest {

    static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ukstaging.encompasshost.com/");
    }

    @Test
    public void validLoginTest() throws InterruptedException {
        // This is to Instantiate Login Page Class
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        // Once the class is instantiated, we use their objects to driver user actions

        loginPage.txtbx_Username.sendKeys("kylo.ren@ytrewq.moc");
        loginPage.txtbx_Password.sendKeys("encompass1");
        loginPage.btn_Login.click();

        WorkspaceLandingPageModalContainer workLandingPageModalContainer = PageFactory.initElements(driver, WorkspaceLandingPageModalContainer.class);






    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
