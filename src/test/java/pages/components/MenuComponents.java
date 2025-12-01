package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.SoftAssertions;

public class MenuComponents {

  private final ElementsCollection
      menuItem = $$(".menu"),
      menuSub = $$(".menu .menu-sub"),
      menuSubList = $$(".menu .menu-sub-list a");

  public void checkItemInMenu(String text) {
    menuItem.findBy(Condition.text(text)).shouldHave(Condition.visible);
  }

  public void checkContentItemInMenu(SoftAssertions softly, String item, String content) {
    menuSub.findBy(Condition.exactText(item)).click();

    SelenideElement contentItem = menuSubList.find(Condition.text(content));

    softly.assertThat(contentItem.exists())
        .as("Элемент '%s' существует в разделе '%s'", content, item)
        .isTrue();

    if (contentItem.exists()) {
      softly.assertThat(contentItem.text())
          .as("Текст элемента '%s' в разделе '%s'", content, item)
          .isEqualTo(content);
    }
  }
}
