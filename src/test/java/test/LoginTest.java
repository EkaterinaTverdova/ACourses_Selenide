package test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    String user = USER;
    String password = PASSWORD;

    @Test
    public void checkPageOpen() {
        loginPage.openPage();
        loginPage.login(user, password);
        catalogPage.pageOpen();
        catalogPage.checkTextColor();
    }
}
