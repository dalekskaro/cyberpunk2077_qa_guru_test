package pages.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class CookieModalComponents {

  private final SelenideElement
      acceptOnlyNecessaryButton = $("#CybotCookiebotDialogBodyButtonDecline"),
      acceptOpinionButton = $("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection"),
      acceptAllButton = $("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"),
      cookieModal = $("#CybotCookiebotDialog"),
      agreementNavTab = $("#CybotCookiebotDialogNavDeclaration"),
      detailsNavTab = $("#CybotCookiebotDialogNavDetails"),
      aboutNavTab = $("#CybotCookiebotDialogNavAbout"),
      dialogBodyContent = $("#CybotCookiebotDialogBodyContent");

  public void closeWithOnlyNecessaryCookie() {
    acceptOnlyNecessaryButton.click();
  }

  public void checkCookieModalIsOn() {
    cookieModal.shouldHave(visible);
  }
}


