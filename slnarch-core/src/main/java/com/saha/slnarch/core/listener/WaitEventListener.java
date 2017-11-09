package com.saha.slnarch.core.listener;

import com.saha.slnarch.core.element.JavaScriptAction;
import com.saha.slnarch.core.wait.WaitingAction;
import javax.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WaitEventListener extends BaseListener implements WebDriverEventListener {


  private WaitingAction waitingAction;

  private JavaScriptAction javaScriptAction;

  @Inject
  public WaitEventListener(WaitingAction waitingAction,
      JavaScriptAction javaScriptAction) {
    this.waitingAction = waitingAction;
    this.javaScriptAction = javaScriptAction;
  }


  @Override
  public void beforeAlertAccept(WebDriver webDriver) {

  }

  @Override
  public void afterAlertAccept(WebDriver webDriver) {

  }

  @Override
  public void afterAlertDismiss(WebDriver webDriver) {

  }

  @Override
  public void beforeAlertDismiss(WebDriver webDriver) {

  }

  @Override
  public void beforeNavigateTo(String s, WebDriver webDriver) {

  }

  @Override
  public void afterNavigateTo(String s, WebDriver webDriver) {

  }

  @Override
  public void beforeNavigateBack(WebDriver webDriver) {

  }

  @Override
  public void afterNavigateBack(WebDriver webDriver) {

  }

  @Override
  public void beforeNavigateForward(WebDriver webDriver) {

  }

  @Override
  public void afterNavigateForward(WebDriver webDriver) {

  }

  @Override
  public void beforeNavigateRefresh(WebDriver webDriver) {

  }

  @Override
  public void afterNavigateRefresh(WebDriver webDriver) {
    logger.info("Refresh Page Url={}", webDriver.getCurrentUrl());
    waitingAction.waitAll();
  }

  @Override
  public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
    logger.info("Wait All Request");
    waitingAction.waitAll();
  }

  @Override
  public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
    logger.info("Find Element {}", by.toString());
  }

  @Override
  public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
    javaScriptAction.scrollToJs(webElement);
    javaScriptAction.highlightElementWithJs(webElement);
  }

  @Override
  public void afterClickOn(WebElement webElement, WebDriver webDriver) {

  }

  @Override
  public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver,
      CharSequence[] charSequences) {
    logger.info("Set Value {}", charSequences);
  }

  @Override
  public void afterChangeValueOf(WebElement webElement, WebDriver webDriver,
      CharSequence[] charSequences) {

  }

  @Override
  public void beforeScript(String s, WebDriver webDriver) {

  }

  @Override
  public void afterScript(String s, WebDriver webDriver) {

  }

  @Override
  public void onException(Throwable throwable, WebDriver webDriver) {

  }
}
