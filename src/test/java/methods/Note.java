package methods;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by bhanu_000 on 31-05-2017.
 */
public class Note {
    private static WindowsDriver Notepad;

    @Before
    public void steup() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
            Notepad = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), cap);
            Notepad.manage().window().maximize();
            Notepad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void main1() {
        Notepad.findElementByName("File").click();
        Notepad.findElementByName("Open...").click();
        //Notepad.findElementByAccessibilityId("1148").click();
        Notepad.findElementByClassName("Edit").clear();
        Notepad.findElementByClassName("Edit").sendKeys("C:\\Users\\bhanu_000\\Desktop\\Selenium\\test.txt");
        System.out.println("bhanuteja");
        List<WebElement> a = Notepad.findElementsByName("Open");
        System.out.println(a.size());
        WebElement s;
        for (int i = 0; i < a.size(); i++) {
            s = a.get(4);
            s.click();
        }
        Notepad.quit();

    }
}
