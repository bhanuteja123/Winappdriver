package methods;

import libaray.Common;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class Outlook_testng extends Common {
    @BeforeClass
    public void start() throws MalformedURLException {
        before("outlook");
    }

    @Test
    public void main() throws InterruptedException {
        WindowTitle();
        String main = windowhandels();
        click("name", "New Email");
        Thread.sleep(3000);
        String openwindow = windowhandels();
        switch_windows(openwindow);
        click("name","To");
        Send_text("name","To","sdsdsdsds@gmail.com");
        Send_text("AccessibilityId","4101","Testing");
        Send_text("classname","_WwG","testing 1");
        Window_keys("classname","_WwG","enter");
        Send_text("classname","_WwG","testing 2");
        click("name","Close");
        click("name","No");
        Thread.sleep(3000);
        WindowTitle();
        switch_windows(main);
        click("name","Sent Items");
    }

    @AfterClass
    public static void end(){
        driver.close();
        driver.quit();
    }
}
