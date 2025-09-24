package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;
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
    softly.assertThat(menuSubList.findBy(Condition.text(content)).text())
        .as("Раздел {item} содержит раздел {content}")
        .isEqualTo(content);
  }

}
