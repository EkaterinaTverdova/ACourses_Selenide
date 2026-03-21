package test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CatalogPage;
import pages.ConstructorMyCoursesPage;
import pages.ConstructorNewCoursePage;
import pages.LoginPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    public static final String BASE_URL = PropertyReader.getProperty("course.url");
    public static final String USER = PropertyReader.getProperty("course.user");
    public static final String PASSWORD = PropertyReader.getProperty("course.password");

    String user = USER;
    String password = PASSWORD;

    LoginPage loginPage;
    CatalogPage catalogPage;
    ConstructorNewCoursePage constructorNewCoursePage;
    ConstructorMyCoursesPage constructorMyCoursesPage;

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
        constructorNewCoursePage = new ConstructorNewCoursePage();
        constructorMyCoursesPage = new ConstructorMyCoursesPage();

        loginPage
                .openPage()
                .login(user, password);
    }

    @AfterMethod
    public void close() {
        clearBrowserCookies();
        closeWebDriver();
    }
}
