package io.aktoluna.slnarch.core.element;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public interface ElementOperation<T extends Element> {

  Actions newAction();

  Select newSelect(WebElement element);

  T click(WebElement element);

  T click(List<WebElement> elements, int index);

  T click();

  T click(int index);

  T clear(WebElement element);

  T clear(List<WebElement> elements, int index);

  T clear();

  T clear(int index);

  T sendKeys(WebElement element, CharSequence... keys);

  T sendKeys(CharSequence... keys);

  T sendKeys(List<WebElement> element, int index, CharSequence... keys);

  T sendKeys(int index, CharSequence... keys);

  T sendKeysWithWait(WebElement element, long waitMillis, CharSequence... keys);

  T sendKeysWithWait(long waitMillis, CharSequence... keys);

  T sendKeysWithWait(List<WebElement> element, int index, long waitMillis, CharSequence... keys);

  T sendKeysWithWait(int index, long waitMillis, CharSequence... keys);

  T selectComboItem(WebElement element, String value);

  T selectComboItem(List<WebElement> elements, int index, String value);

  T selectComboItem(String value);

  T selectComboItem(String value, int index);

  T hover(WebElement element);

  T hover(List<WebElement> elements, int index);

  T hover();

  T hover(int index);

  T scrollTo(WebElement element);

  T scrollTo(List<WebElement> elements, int index);

  T scrollTo();

  T scrollTo(int index);
}
