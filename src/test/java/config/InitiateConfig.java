package config;

import org.aeonbits.owner.ConfigFactory;

public enum InitiateConfig {
  initiatedConfig;

  private static final WebDriverConfig webDriverConfig
      = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

  public WebDriverConfig read() {
    return webDriverConfig;
  }
}
