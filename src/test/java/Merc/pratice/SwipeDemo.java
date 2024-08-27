package Merc.pratice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SwipeDemo extends BaseTest{


    @Test
    public void SwipeTest() throws MalformedURLException, InterruptedException {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstImage = androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        Assert.assertEquals(firstImage.getAttribute("focusable"),"true");
        //Swipe
        swipeAction(firstImage,"left");

        Thread.sleep(2000);





    }
}
