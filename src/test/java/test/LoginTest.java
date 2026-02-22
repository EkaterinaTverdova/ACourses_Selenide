package test;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginTest extends BaseTest {
    String authorPage = BASE_URL + "constructor/courses/current/my_courses";
    String studentPage = BASE_URL + "catalog";

    @Test
    public void checkPageOpen() {
        $x("//*[@class='header_role_button__cGAtT']").shouldBe(visible, Duration.ofSeconds(10));

        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        System.out.println("currentUrl " + currentUrl);
        if (currentUrl.equals(studentPage)) {
            catalogPage
                    .pageOpen()
                    .checkTextColor();
        } else if (currentUrl.equals(authorPage)) {
            constructorPage
                    .pageOpen()
                    .checkBtnColor();
        }
    }
}
