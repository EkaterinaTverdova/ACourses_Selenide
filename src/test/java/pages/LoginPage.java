package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    final SelenideElement userImput = $("[id='loginEmailInput']");
    final SelenideElement passwordImput = $("[id='loginPasswordInput']");
    final SelenideElement loginBtn = $x("//*[text()='Войти']");

    public void openPage() {
        open("login");
    }

    public void login(String user, String password) {
        userImput.setValue(user);
        passwordImput.setValue(password);
        loginBtn.submit();
    }
}
