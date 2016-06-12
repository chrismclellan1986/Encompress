/**
 * Created by cmcle_000 on 09/06/2016.
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

public class EncompassLoginTest {

    static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://ukstaging.encompasshost.com/");
    }

    @Test
    public void validLoginTest() throws InterruptedException {
        // This is to Instantiate Login Page Class
        LoginPage loginPage = new LoginPage(driver);

        // Once the class is instantiated, we use their objects to driver user actions
        loginPage.EnterLoginDetails("kylo.ren@ytrewq.moc", "encompass1");

        WorkspaceLandingPageModalContainer workSpaceContainer = new WorkspaceLandingPageModalContainer(driver);

        workSpaceContainer.enterMatterReference("Chris McLellan" + Math.random());
        workSpaceContainer.selectCreateButton();

        WorkspacePage workSpacePage = new WorkspacePage(driver);

        workSpacePage.SelectSearch();

        StartMenuModalPage startMenuModalPage = new StartMenuModalPage(driver);

        startMenuModalPage.SearchAndClickType("Organisation");
        startMenuModalPage.SearchAndClickSource("Companies House");
        startMenuModalPage.SearchAndClickReport("Company Record");

        CompanyAppointmentPage companyAppointmentPage = new CompanyAppointmentPage(driver);
        companyAppointmentPage.EnterCompanyName("Harrods Limited");
        companyAppointmentPage.SelectSearchButton();





    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
