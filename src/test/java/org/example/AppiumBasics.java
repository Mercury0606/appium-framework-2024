package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class AppiumBasics extends BaseTest{


    @Test
    public void WifiSettingName() throws MalformedURLException {
        //Actual automation
        //Xpath,id,accessibilityId,className,androidUIAutomator
        androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
        //tagName[@attribute='value'] -> //tagName
        androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        androidDriver.findElement(By.id("android:id/checkbox")).click();
        androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = androidDriver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");
        androidDriver.findElement(By.id("android:id/edit")).sendKeys("Mercury Wifi");
        androidDriver.findElements(By.className("android.widget.Button")).get(1).click();



    }
}
