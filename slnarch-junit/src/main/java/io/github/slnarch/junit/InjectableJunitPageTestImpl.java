package io.github.slnarch.junit;

import io.aktoluna.slnarch.core.di.page.InjectablePageTestImpl;
import io.github.slnarch.junit.rule.SlnTestWatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

public abstract class InjectableJunitPageTestImpl extends InjectablePageTestImpl {

  @Rule
  public SlnTestWatcher slnTestWatcher = new SlnTestWatcher();

  @Before
  public void beforeTest() {
    getDriver().get(getConfiguration().getBaseUrl());
  }

  @After
  public void afterTest() {
    getDriver().quit();
  }
}
