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
import pages.components.MenuPage;

@Tag("regress")
@Story("Компоненты на главной странице")
@Owner("Irina Attano")
public class MenuComponentsTest extends BaseTest {

  MainCyberpunkPage mainCyberpunkPage = new MainCyberpunkPage();
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
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent("ИГРЫ", "CYBERPUNK 2077")
        .checkMenuItemContent("ИГРЫ", "ПРИЗРАЧНАЯ СВОБОДА");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела СЕРИАЛЫ в меню")
  void checkMenuShowsContent() {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent("СЕРИАЛЫ", "EDGERUNNERS")
        .checkMenuItemContent("СЕРИАЛЫ", "EDGERUNNERS");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела СООБЩЕСТВО в меню")
  void checkMenuCommunityContent() {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent("СООБЩЕСТВО", "ФОРУМ")
        .checkMenuItemContent("СООБЩЕСТВО", "DISCORD")
        .checkMenuItemContent("СООБЩЕСТВО", "TWITCH DROPS")
        .checkMenuItemContent("СООБЩЕСТВО", "ПОЛЕЗНЫЕ МАТЕРИАЛЫ")
        .checkMenuItemContent("СООБЩЕСТВО", "КАЛЬКУЛЯТОР СПОСОБНОСТЕЙ")
        .checkMenuItemContent("СООБЩЕСТВО", "ИГРОВОЙ БУКЛЕТ");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела ПРОЧЕЕ в меню")
  void checkMenuMoreContent() {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    ;
    menuPage.checkMenuItemContent("ПРОЧЕЕ", "ИГРАЙТЕ НА NINTENDO SWITCH™ 2")
        .checkMenuItemContent("ПРОЧЕЕ", "ПАТЧ 2.3")
        .checkMenuItemContent("ПРОЧЕЕ", "МОИ НАГРАДЫ")
        .checkMenuItemContent("ПРОЧЕЕ", "АТРИБУТИКА")
        .checkMenuItemContent("ПРОЧЕЕ", "ГАЛЕРЕЯ")
        .checkMenuItemContent("ПРОЧЕЕ", "ПОДДЕРЖКА")
        .checkMenuItemContent("ПРОЧЕЕ", "CD PROJEKT RED");
  }

  @Tag("smoke")
  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Link(value = "Testing url", url = "https://www.cyberpunk.net/ru/ru/")
  @DisplayName("Проверка наполнения раздела RU в меню")
  void checkMenuLanguageContent() {
    mainCyberpunkPage.openRuPage()
        .closeCookieModal();
    menuPage.checkMenuItemContent("RU", "ENGLISH")
        .checkMenuItemContent("RU", "РУССКИЙ")
        .checkMenuItemContent("RU", "DEUTSCH")
        .checkMenuItemContent("RU", "POLSKI")
        .checkMenuItemContent("RU", "PORTUGUÊS (BR)")
        .checkMenuItemContent("RU", "FRANÇAIS")
        .checkMenuItemContent("RU", "ESPAÑOL")
        .checkMenuItemContent("RU", "ITALIANO")
        .checkMenuItemContent("RU", "日本語")
        .checkMenuItemContent("RU", "한국어")
        .checkMenuItemContent("RU", "简体中文")
        .checkMenuItemContent("RU", "繁體中文");
  }

}
