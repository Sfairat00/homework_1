package homework_2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQa {

    @Test
    void RegistrationFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ctvty");
        $("#lastName").setValue("FFFF");
        $("#userEmail").setValue("sfai@qq.ru");
        $("#genterWrapper").$(byText("Male")).click();

    }

}
