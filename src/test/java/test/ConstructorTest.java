package test;

import org.testng.annotations.Test;

public class ConstructorTest extends BaseTest {
    @Test
    public void checkPageOpen() {
        constructorPage.pageOpen();
    }

    @Test
    public void addNewCourse() {
        constructorPage
                .btnAuthorNewCourse()
                .setAuthorNameNewCourse()
                .setAuthorDescriptionNewCourse()
                .setAuthorAvatarNewCourse()
                .btnTag()
                .checkBtnColorSave();
    }
}
