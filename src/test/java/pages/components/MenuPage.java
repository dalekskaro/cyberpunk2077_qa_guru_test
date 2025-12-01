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

  @Step("Проверяем наполнение раздела {item} в меню - в выпадающем списке есть выбор {content}")
  public MenuPage checkMenuItemContent(SoftAssertions softly, String item, String content) {
    menu.checkContentItemInMenu(softly, item, content);
    return this;
  }

}
