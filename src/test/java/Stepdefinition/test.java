package Stepdefinition;

import libaray.Common;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class test extends Common {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        before("skype");
//        WindowTitle();
//        isdisplayed("AccessibilityId", "1001");
//        clear("AccessibilityId", "1001");
//        Send_text("AccessibilityId", "1001", "surampudit@gmail.com");
//        Window_keys("AccessibilityId", "1001", "enter");
//        get_text("name", "Enter password");
//        isdisplayed("name", "Password");
//        clear("name", "Password");
//        Send_text("name", "Password", "Teja#1993");
//        Window_keys("name", "Password", "enter");
        WindowTitle();
        System.out.println("sss");
        switch_windows(windowhandels());
        WindowTitle();
        Thread.sleep(5000);
    }

}
