package tests;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainCyberpunkPage;

@Tag("regress")
@Story("Компоненты на главной странице")
@Owner("Irina Attano")
public class MainPageComponentsTests extends BaseTest {

  MainCyberpunkPage mainCyberpunkPage = new MainCyberpunkPage();
  String
      textOnHeader = "Полное погружение в Cyberpunk 2077";

  @Tag("smoke") @Tag("homework-17")
  @Test
  @Severity(SeverityLevel.NORMAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("На шапке сайта есть текст: {textOnHeader}")
  void textOnHeaderTest() {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal()
        .checkTextOnHeader(textOnHeader);
  }

  @Severity(SeverityLevel.NORMAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @ValueSource(strings = {"КУПИТЬ", "ТРЕЙЛЕР"})
  @ParameterizedTest(name = "На шапке сайта есть кнопка: {0}")
  void buttonWithTextOnHeaderTest(String text) {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal()
        .checkButtonWithTextOnHeader(text);
  }

}
