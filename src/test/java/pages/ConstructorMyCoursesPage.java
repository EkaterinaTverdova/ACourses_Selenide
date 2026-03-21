package pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ConstructorMyCoursesPage {
    final SelenideElement createCourseAuthorBtn = $x("//*[text()='Авторский курс']" +
            "//ancestor::div[@class='createCourse_text_container__QVw1w']" +
            "//child::button[text()='Создать курс']");
    final SelenideElement pageTitle = $x("//*[text()='Рабочий стол автора']");
    final SelenideElement courseAuthor = $x("//*[@class='courseItem_item__container__p2o_q']");

    public ConstructorMyCoursesPage pageOpen() {
        pageTitle.should(exist).shouldBe(visible, Duration.ofSeconds(10));

        return this;
    }

    public ConstructorMyCoursesPage checkNewCourseAuthorBtnColor() {
        createCourseAuthorBtn.shouldHave(cssValue("background-color", "rgba(75, 164, 208, 1)"));

        return this;
    }

    public ConstructorMyCoursesPage clickBtnAuthorNewCourse() {
        createCourseAuthorBtn.click();

        return this;
    }
}
