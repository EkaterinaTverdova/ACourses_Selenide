package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ConstructorNewCoursePage {
    final SelenideElement createCourseAuthorBtn = $x("//*[text()='Авторский курс']" +
            "//ancestor::div[@class='createCourse_text_container__QVw1w']" +
            "//child::button[text()='Создать курс']");
    final SelenideElement pageTitle = $x("//*[text()='Рабочий стол автора']");
    final SelenideElement courseName = $("[id='courseName']");
    final SelenideElement courseDescription = $("[id='courseDescription']");
    final SelenideElement inputAvatar = $("[id='imageInput']");
    final SelenideElement inputTag = $x("//*[@for='Аналитика']");
    final SelenideElement btnSave = $x("//*[text()='Сохранить']");
    final SelenideElement btnNext = $x("//*[text()='Далее']");

//    public ConstructorNewCoursePage pageOpen() {
//        pageTitle.should(exist).shouldBe(visible, Duration.ofSeconds(10));
//
//        return this;
//    }

//    public ConstructorNewCoursePage checkNewCourseAuthorBtnColor() {
//        createCourseAuthorBtn.shouldHave(cssValue("background-color", "rgba(75, 164, 208, 1)"));
//
//        return this;
//    }
//
//    public ConstructorNewCoursePage btnAuthorNewCourse() {
//        createCourseAuthorBtn.click();
//
//        return this;
//    }

    public ConstructorNewCoursePage setAuthorNameNewCourse() {
        courseName.setValue("Тест");

        return this;
    }

    public ConstructorNewCoursePage setAuthorDescriptionNewCourse() {
        courseDescription.setValue("Описание теста");

        return this;
    }

    public ConstructorNewCoursePage setAuthorAvatarNewCourse() {
        inputAvatar.uploadFromClasspath("cat.jpg");

        return this;
    }

    public ConstructorNewCoursePage btnTag() {
        inputTag.click();

        return this;
    }

    public ConstructorNewCoursePage checkBtnColorSave() {
        btnSave.shouldHave(Condition.cssValue("border-bottom-color", "rgba(75, 164, 208, 1)"));

        return this;
    }

    public ConstructorNewCoursePage clickSave() {
        btnSave.click();

        return this;
    }

    public ConstructorNewCoursePage checkBtnColorNext() {
        btnNext.shouldHave(Condition.cssValue("background-color", "rgba(75, 164, 208, 1)"));

        return this;
    }

    public ConstructorNewCoursePage clickNext() {
        btnNext.click();

        return this;
    }
}
