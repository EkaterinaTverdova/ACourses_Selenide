package test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CatalogPage;
import pages.ConstructorPage;
import pages.LoginPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    public static final String BASE_URL = PropertyReader.getProperty("course.url");
    public static final String USER = PropertyReader.getProperty("course.user");
    public static final String PASSWORD = PropertyReader.getProperty("course.password");

    LoginPage loginPage;
    CatalogPage catalogPage;
    ConstructorPage constructorPage;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1000";
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        Configuration.browserCapabilities = options;
//        getWebDriver().manage().window().maximize();
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.baseUrl = BASE_URL;
//        Configuration.holdBrowserOpen = true;

        loginPage = new LoginPage();
        catalogPage = new CatalogPage();
        constructorPage = new ConstructorPage();
    }

    @AfterMethod
    public void close() {
        clearBrowserCookies();
        closeWebDriver();
    }
}
