package Merc.pratice;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class MisceallanousAppiumActions extends BaseTest {
    @Test
    public void Misceallous() throws MalformedURLException, InterruptedException {

///Users/zhongchongyuan/Library/Android/sdk/platform-tools/adb shell dumpsys window | grep -E 'mCurrentFocus'
//      App package & App activity
        stratActivity("io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies");

//
        androidDriver.findElement(By.id("android:id/checkbox")).click();
        DeviceRotation landscape = new DeviceRotation(50,0,90);
        androidDriver.rotate(landscape);
        androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = androidDriver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");

        //coy paste
        //copy to clipboard - paste it clipboard
        androidDriver.setClipboardText("Mercury Wifi");
        androidDriver.findElement(By.id("android:id/edit")).sendKeys(androidDriver.getClipboardText());
        androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        androidDriver.findElements(By.className("android.widget.Button")).get(1).click();
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
        androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));

    }
}
