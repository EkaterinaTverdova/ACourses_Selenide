package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ConstructorPage {
    final SelenideElement createCourseAuthorBtn = $x("//*[text()='Авторский курс']" +
            "//ancestor::div[@class='createCourse_text_container__QVw1w']" +
            "//child::button[text()='Создать курс']");
    final SelenideElement pageTitle = $x("//*[text()='Рабочий стол автора']");
    final SelenideElement courseName = $("[id='courseName']");
    final SelenideElement courseDescription = $("[id='courseDescription']");
    final SelenideElement inputAvatar = $("[id='imageInput']");
    final SelenideElement inputTag = $x("//*[@for='Аналитика']");
    final SelenideElement btnSave = $x("//*[text()='Сохранить']");

    public ConstructorPage pageOpen() {
        pageTitle.should(exist).shouldBe(visible, Duration.ofSeconds(10));

        return this;
    }

    public ConstructorPage checkBtnColor() {
        createCourseAuthorBtn.shouldHave(cssValue("background-color", "rgba(75, 164, 208, 1)"));

        return this;
    }

    public ConstructorPage btnAuthorNewCourse() {
        createCourseAuthorBtn.click();

        return this;
    }

    public ConstructorPage setAuthorNameNewCourse() {
        courseName.setValue("Тест");

        return this;
    }

    public ConstructorPage setAuthorDescriptionNewCourse() {
        courseDescription.setValue("Описание теста");

        return this;
    }

    public ConstructorPage setAuthorAvatarNewCourse() {
        inputAvatar.uploadFromClasspath("cat.jpg");

        return this;
    }

    public ConstructorPage btnTag() {
        inputTag.click();

        return this;
    }

    public ConstructorPage checkBtnColorSave() {
        btnSave.shouldHave(Condition.cssValue("border-bottom-color", "rgba(75, 164, 208, 1)"));

        return this;
    }
}
