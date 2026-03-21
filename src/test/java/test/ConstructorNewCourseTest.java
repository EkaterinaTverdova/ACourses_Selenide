package test;

import org.testng.annotations.Test;

public class ConstructorNewCourseTest extends BaseTest {
    @Test
    public void checkPageOpen() {
        constructorMyCoursesPage.pageOpen();
    }

    @Test
    public void addNewCourse() {
        constructorMyCoursesPage
                .checkNewCourseAuthorBtnColor()
                .clickBtnAuthorNewCourse();
        constructorNewCoursePage
                .setAuthorNameNewCourse()
                .setAuthorDescriptionNewCourse()
                .setAuthorAvatarNewCourse()
                .btnTag()
                .checkBtnColorSave()
                .clickSave()
                .checkBtnColorNext()
                .clickNext();
    }
}
