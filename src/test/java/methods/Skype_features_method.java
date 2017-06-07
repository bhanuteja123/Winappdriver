package methods;

import libaray.Common;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;


/**
 * Created by bhanu_000 on 02-06-2017.
 */
public class Skype_features_method extends Common {
    public static void echo() throws InterruptedException {
        WindowTitle();
        Thread.sleep(5000);
        WindowTitle();
        Set<String> a = driver.getContextHandles();
        System.out.println(a);
        WebElement element = driver.findElementByTagName("list item");
        element.click();
    }
}
