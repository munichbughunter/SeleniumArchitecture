package com.saha.slnarch.core.browser.local;

import com.saha.slnarch.core.browser.BaseBrowser;
import com.saha.slnarch.core.model.Configuration;
import java.net.MalformedURLException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariBrowser extends BaseBrowser<SafariDriver, SafariOptions, SafariBrowser> {

  public SafariBrowser(Configuration configuration) {
    super(configuration);
  }

  @Override
  protected SafariBrowser setDriverPath() {
    return this;
  }

  @Override
  protected SafariOptions getDefaultOptions(Proxy proxy) {
    return new SafariOptions();
  }

  @Override
  public SafariDriver buildWebDriver(SafariOptions options, Proxy proxy)
      throws MalformedURLException {
    return setDriverPath().setTimeOut(new SafariDriver(getOptions(options, proxy)));
  }
}
