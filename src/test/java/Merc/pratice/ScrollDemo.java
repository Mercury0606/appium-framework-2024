package Merc.pratice;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest{


    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();

        scrollToEndAction();



        Thread.sleep(2000);



    }
}
