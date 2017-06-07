package methods;

import libaray.Common;

import java.net.MalformedURLException;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class Outlook_cucumber extends Common {
    protected static void open() throws MalformedURLException {
        before("outlook");
    }

    protected static void new_mail() throws InterruptedException {
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
    }

    public static void sent_mail() throws InterruptedException {
        Thread.sleep(3000);
        String main = windowhandels();
        switch_windows(main);
        click("name","Sent Items");
    }
    public  static  void close(){
        driver.close();
        driver.quit();
    }
}
