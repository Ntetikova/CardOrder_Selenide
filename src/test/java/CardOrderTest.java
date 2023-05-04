import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardOrderTest {
    @BeforeEach
    void setUpTests() {
        open("http://localhost:9999/");
    }
    @Test
    public void shouldSendForm() {

        $("[data-test-id=name] input").setValue("Супер Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleSurname() {

        $("[data-test-id=name] input").setValue("Супер-Пупер Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleName() {

        $("[data-test-id=name] input").setValue("Супер Олег-Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleSurnameName() {

        $("[data-test-id=name] input").setValue("Супер-Пупер Олег-Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleSurnameNameSpace() {

        $("[data-test-id=name] input").setValue("Супер-Пупер Олег Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleSurnameSpaceName() {

        $("[data-test-id=name] input").setValue("Супер Пупер Олег-Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    public void shouldSendFormDoubleSurnameSpaceNameSpace() {

        $("[data-test-id=name] input").setValue("Супер Пупер Олег Олег");
        $("[data-test-id=phone] input").setValue("+79638528520");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

}
