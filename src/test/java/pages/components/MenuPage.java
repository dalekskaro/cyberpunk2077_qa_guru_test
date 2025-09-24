package pages.components;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;

public class MenuPage {

  MenuComponents menu = new MenuComponents();

  @Step("Проверяем, что в меню есть раздел {text}")
  public MenuPage checkMenuItem(String text) {
    menu.checkItemInMenu(text);
    return this;
  }

  @Step("Проверяем наполнение раздела {item} в меню")
  public MenuPage checkMenuItemContent(String item, String content) {
    SoftAssertions softly = new SoftAssertions();
    menu.checkContentItemInMenu(softly, item, content);
    softly.assertAll();
    return this;
  }

}
