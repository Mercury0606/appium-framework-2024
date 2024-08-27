package Merc.pratice;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver androidDriver ;
    public AppiumDriverLocalService service ;
    @BeforeClass
    public void configAppium() throws MalformedURLException {
        //Andriod driver, IOS driver
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("neg");
//        options.setApp("//Users/zhongchongyuan//IdeaProjects//appium-framework-2024//src//main//java//Resources//ApiDemos-debug.apk");
        options.setApp("//Users/zhongchongyuan//IdeaProjects//appium-framework-2024//src//main//java//Resources//General-Store.apk");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void longPressAction(WebElement pressedBtn){
        ((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture",
                ImmutableMap.of(
                        "elementId", ((RemoteWebElement) pressedBtn).getId(),
                        "duration", 2000
                ));

    }

    public void scrollToEndAction(){
        //        where to scroll is known prior
//        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));

//      No prior idea
        boolean canScrollMore;
        do{
            canScrollMore = (Boolean) ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 1.0
            ));
        }while (canScrollMore);
    }

    public void swipeAction(WebElement element,String direction){
        ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 200, "height", 200,
                "elementId",((RemoteWebElement)element).getId(),
                "direction", direction,
                "percent", 0.75
        ));
    }

    public void dragAction(WebElement element,int endX, int endY){
        // Java
        ((JavascriptExecutor) androidDriver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", endX,
                "endY", endY
        ));
    }

    public void stratActivity(String intent){
        ((JavascriptExecutor) androidDriver).executeScript("mobile: startActivity", ImmutableMap.of("intent",intent));
    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
        service.stop();
    }
}
