package Merc.pratice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

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
