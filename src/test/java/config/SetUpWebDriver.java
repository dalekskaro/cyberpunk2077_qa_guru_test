package config;

import com.codeborne.selenide.Configuration;
import java.util.Map;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetUpWebDriver {
  private static final WebDriverConfig config = InitiateConfig.initiatedConfig.read();

  public static void setUpWebDriver() {
    Configuration.baseUrl = config.baseUrl();
    Configuration.browser = config.browser();
    Configuration.browserVersion = config.browserVersion();
    Configuration.browserSize = config.browserResolution();
    Configuration.pageLoadStrategy = config.pageLoadStrategy();

    if (config.isRemote()) {
      setUpRemote();
    }
  }

  private static void setUpRemote() {
    Configuration.remote = config.remoteUrl();
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
        "enableVNC", true,
        "enableVideo", true
    ));
    Configuration.browserCapabilities = capabilities;
  }
}
