package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.components.MenuPage;

@Story("Проверка компонентов")
@Feature("Меню")
@Owner("Irina Attano")
public class MenuComponentsTest extends BaseTest {

  MenuPage menuPage = new MenuPage();

  @Severity(SeverityLevel.NORMAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @ValueSource(strings = {"ИГРЫ", "СЕРИАЛЫ", "СООБЩЕСТВО", "ПРОЧЕЕ", "RU", "КУПИТЬ"})
  @ParameterizedTest(name = "В меню есть раздел: {0}")
  void menuItemTest(String text) {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItem(text);
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела ИГРЫ в меню")
  void checkMenuGamesContent() {
    SoftAssertions softly = new SoftAssertions();

    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent(softly, "ИГРЫ", "CYBERPUNK 2077")
        .checkMenuItemContent(softly, "ИГРЫ", "ПРИЗРАЧНАЯ СВОБОДА");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела СЕРИАЛЫ в меню")
  void checkMenuShowsContent() {
    SoftAssertions softly = new SoftAssertions();

    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent(softly, "СЕРИАЛЫ", "EDGERUNNERS")
        .checkMenuItemContent(softly, "СЕРИАЛЫ", "EDGERUNNERS");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела СООБЩЕСТВО в меню")
  void checkMenuCommunityContent() {
    SoftAssertions softly = new SoftAssertions();

    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent(softly, "СООБЩЕСТВО", "ФОРУМ")
        .checkMenuItemContent(softly, "СООБЩЕСТВО", "DISCORD")
        .checkMenuItemContent(softly, "СООБЩЕСТВО", "ПОЛЕЗНЫЕ МАТЕРИАЛЫ")
        .checkMenuItemContent(softly, "СООБЩЕСТВО", "КАЛЬКУЛЯТОР СПОСОБНОСТЕЙ")
        .checkMenuItemContent(softly, "СООБЩЕСТВО", "ИГРОВОЙ БУКЛЕТ");

    softly.assertAll();
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела ПРОЧЕЕ в меню")
  void checkMenuMoreContent() {
    SoftAssertions softly = new SoftAssertions();

    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    ;
    menuPage.checkMenuItemContent(softly, "ПРОЧЕЕ", "ИГРАЙТЕ НА NINTENDO SWITCH™ 2")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "ПАТЧ 2.3")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "МОИ НАГРАДЫ")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "АТРИБУТИКА")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "ГАЛЕРЕЯ")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "ПОДДЕРЖКА")
        .checkMenuItemContent(softly, "ПРОЧЕЕ", "CD PROJEKT RED");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела RU в меню")
  void checkMenuLanguageContent() {
    SoftAssertions softly = new SoftAssertions();

    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent(softly, "RU", "ENGLISH")
        .checkMenuItemContent(softly, "RU", "РУССКИЙ")
        .checkMenuItemContent(softly, "RU", "DEUTSCH")
        .checkMenuItemContent(softly, "RU", "POLSKI")
        .checkMenuItemContent(softly, "RU", "PORTUGUÊS (BR)")
        .checkMenuItemContent(softly, "RU", "FRANÇAIS")
        .checkMenuItemContent(softly, "RU", "ESPAÑOL")
        .checkMenuItemContent(softly, "RU", "ITALIANO")
        .checkMenuItemContent(softly, "RU", "日本語")
        .checkMenuItemContent(softly, "RU", "한국어")
        .checkMenuItemContent(softly, "RU", "简体中文")
        .checkMenuItemContent(softly, "RU", "繁體中文");
  }

}
