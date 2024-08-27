package Merc.pratice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPress extends BaseTest{


    @Test
    public void LongPressGesture() throws MalformedURLException, InterruptedException {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        WebElement pplNameBtn = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));

        longPressAction(pplNameBtn);

        String menuText = androidDriver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(menuText,"Sample menu");
        Assert.assertTrue(androidDriver.findElement(By.id("android:id/title")).isDisplayed());




    }
}
