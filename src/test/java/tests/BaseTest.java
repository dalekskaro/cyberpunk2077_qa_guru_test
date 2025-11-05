package tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.SetUpWebDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

  @BeforeAll
  static void setWebDriver() {
    SetUpWebDriver.setUpWebDriver();
  }

  @BeforeEach
  void addListenerAllure() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
  }

  @AfterEach
  void closeBrowserDriver() {
    closeWebDriver();
  }

  @AfterEach
  void addAttachments() {
    Attach.screenshotAs("Скрин страницы");
    Attach.addVideo("Видео всего теста");
    Attach.pageSnapshot("Снапшот страницы");
    Attach.pageSource("Source страницы");
    Attach.browserConsoleLogs("Логи браузера");
  }

}
