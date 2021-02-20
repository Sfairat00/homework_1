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
        $("#userNumber").setValue("9161764617");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1986");
        $(".react-datepicker__day.react-datepicker__day--019").click();
        $("#subjectsInput").setValue("BYXAT").pressEnter();

        sleep(4000);

    }

}
