package libaray;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class Common {

    protected static WindowsDriver driver;

    protected static void before(String app) throws MalformedURLException {
        if (app.equalsIgnoreCase("outlook")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Program Files (x86)\\Microsoft Office\\Office16\\OUTLOOK.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } else if (app.equalsIgnoreCase("skype")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName","WIndows");
            cap.setCapability("app", "C:\\Program Files (x86)\\Skype\\Phone\\skype.exe");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
            //driver = new WindowsDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
    }


    protected static String windowhandels() {
        Set<String> b = driver.getWindowHandles();
        System.out.println(b);
        return b.iterator().next();
    }

    protected static void WindowTitle() {
        System.out.println(driver.getTitle());

    }

    protected static void click(String locator_type, String locator) {

        findelement(locator_type, locator).click();
    }

    public static void isdisplayed(String locator_type, String locator) {
        System.out.println(findelement(locator_type, locator).isDisplayed());
    }

    public static void Isselected(String locator_type, String locator) {
        System.out.println(findelement(locator_type, locator).isSelected());
    }

    public static void isenable(String locator_type, String locator) {

        System.out.println(findelement(locator_type, locator).isEnabled());
    }

    public static WebElement findelement(String locator_type, String locator) {
        WebElement element = null;
        if (locator_type.equalsIgnoreCase("name")) {
            element = driver.findElementByName(locator);
        }
        if (locator_type.equalsIgnoreCase("AccessibilityId")) {
            element = driver.findElementByAccessibilityId(locator);
        }
        if (locator_type.equalsIgnoreCase("classname")) {
            element = driver.findElementByClassName(locator);
        }
        return element;

    }

    public static void get_text(String locator_type, String locator) {
        String text = findelement(locator_type, locator).getText();
        System.out.println(text);
    }

    public static void clear(String locator_type, String locator) {
        findelement(locator_type, locator).clear();
    }

    public static void Window_keys(String locator_type, String locator, String Operation) {

        switch (Operation) {
            case "enter":
                findelement(locator_type, locator).sendKeys(Keys.RETURN);
        }

    }

    protected static void Send_text(String locator_type, String locator, String Send_text) {
        findelement(locator_type, locator).sendKeys(Send_text);
    }

    protected static void switch_windows(String Window_Handel) {
        driver.switchTo().window(Window_Handel);
    }
}
