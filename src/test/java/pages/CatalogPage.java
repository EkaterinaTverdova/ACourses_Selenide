package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    final SelenideElement pageTitle = $("[class='header_link_content__NQJ4c header_active__3yS_O']");
    final SelenideElement findPlace = $("[placeholder='Введите название курса, минимум 3 символа']");

    public void pageOpen() {
        findPlace.should(exist).shouldBe(visible, Duration.ofSeconds(10));
        pageTitle.shouldHave(text("Каталог"));
    }

    public void checkTextColor() {
        pageTitle.shouldHave(Condition.cssValue("text-decoration-color", "rgb(75, 164, 208)"));
    }
}
