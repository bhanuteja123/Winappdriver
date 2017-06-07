package methods;

import libaray.Common;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class Skype_method extends Common {
    public static void open() throws MalformedURLException, InterruptedException {
        before("skype");
    }

    public static void username(String user) {
        isdisplayed("AccessibilityId", "1001");
        clear("AccessibilityId", "1001");
        Send_text("AccessibilityId", "1001", user);
        Window_keys("AccessibilityId", "1001", "enter");

    }


    public static void user_verfiy() {

        get_text("name", "Enter password");
    }

    public static void password(String password) throws InterruptedException {
        isdisplayed("name", "Password");
        clear("name", "Password");
        Send_text("name", "Password", password);
        Window_keys("name", "Password", "enter");
    }

    public static void logout() throws InterruptedException {
        Thread.sleep(5000);
        click("name", "Skype");
        click("name", "Sign Out");
    }

}
