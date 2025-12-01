package pages.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

public class CookieModalComponents {

  private final SelenideElement
      acceptOnlyNecessaryButton = $("#CybotCookiebotDialogBodyButtonDecline"),
      cookieModal = $("#CybotCookiebotDialog");

  public void closeWithOnlyNecessaryCookie() {
    acceptOnlyNecessaryButton.click();
  }

  public void checkCookieModalIsOn() {
    cookieModal.shouldHave(visible, Duration.ofSeconds(10));
  }
}


