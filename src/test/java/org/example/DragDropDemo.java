package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class DragDropDemo extends BaseTest{


    @Test
    public void DragDropTest() throws MalformedURLException, InterruptedException {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement source = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        dragAction(source,530,584);
        Thread.sleep(2000);
    }
}
