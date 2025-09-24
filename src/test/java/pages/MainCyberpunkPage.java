package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CookieModalComponents;

public class MainCyberpunkPage {

  CookieModalComponents cookieModal = new CookieModalComponents();


  private final SelenideElement
      header = $(".header__inner"),
      headerButtons = $(".header__buttons");

  @Step("Открываем главную страницу. Вариант ru")
  public MainCyberpunkPage openRuPage() {
    open("/ru/ru/");
    return this;
  }

  @Step("Закрываем окно с cookie")
  public MainCyberpunkPage closeCookieModal() {
    cookieModal.checkCookieModalIsOn();
    cookieModal.closeWithOnlyNecessaryCookie();
    return this;
  }

  @Step("Проверяем, что в хэдере есть текст {text}")
  public MainCyberpunkPage checkTextOnHeader(String text) {
    header.shouldHave(text(text));
    return this;
  }

  @Step("Проверяем, что в хэдере есть кнопка с текстом {text}")
  public MainCyberpunkPage checkButtonWithTextOnHeader(String text) {
    headerButtons.shouldHave(text(text));
    return this;
  }
}
