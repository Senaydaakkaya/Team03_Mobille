package utilities;

import hooks.Base;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

public class ReusableMethods extends Base {
    public static void uploadApk(){
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigReader.getProperty("version"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,ConfigReader.getProperty("appPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,ConfigReader.getProperty("appActivity"));
    }

    public static void koordinatTiklama(WebElement slider) throws InterruptedException {
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));

        getAppiumDriver().perform(singletonList(sequence));
    }

    public static void koordinatTiklamaMethodu(int x,int y) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(x, y);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));
    }

    public static void scrollWithUiScrollableAndClick(String elementText) {
        AndroidDriver driver = (AndroidDriver)  Driver.getAppiumDriver();
    //  driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElement(By.xpath("//*[@text='" + elementText + "']")).click();
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  getAppiumDriver();
    //  driver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))"));

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAppiumDriver();

        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void ekranKaydirmaMethodu(int xPress,int yPress,int wait,int xMove,int yMove, int count){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        for (int i = 1; i <= count; i++) {
            var start = new Point(xPress, yPress);
            var end = new Point(xMove, yMove);
            var swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                    PointerInput.Origin.viewport(), start.getX(), start.getY()));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(wait),
                    PointerInput.Origin.viewport(), end.getX(), end.getY()));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Arrays.asList(swipe));
        }
    }

    public static void scrollDown(int ms, int count) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        for (int i = 1; i <= count; i++) {
            var start = new Point(480, 1561);
            var end = new Point(480, 70);
            var swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                    PointerInput.Origin.viewport(), start.getX(), start.getY()));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(ms),
                    PointerInput.Origin.viewport(), end.getX(), end.getY()));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Arrays.asList(swipe));
        }
    }

    public static void scrollUp(int ms, int count) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        for (int i = 1; i <= count; i++) {
            var start = new Point(540, 70);
            var end = new Point (540, 1561);
            var swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                    PointerInput.Origin.viewport(), start.getX(), start.getY()));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(ms),
                    PointerInput.Origin.viewport(), end.getX(), end.getY()));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Arrays.asList(swipe));
        }
    }
    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickAndVerify(WebElement element) {
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
    }

    public static void clickAndSendKeys(WebElement element, String context) {
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.click();
        element.clear();
        element.sendKeys(context);
    }

    public static void signIn(String email, String password) throws InterruptedException {
        koordinatTiklamaMethodu(970,1700);
        koordinatTiklamaMethodu(800,600);
        Thread.sleep(5000);
        koordinatTiklamaMethodu(896,547);
        koordinatTiklamaMethodu(500,630);
        queryCardPage.emailBox.sendKeys(email);
        koordinatTiklamaMethodu(500,870);
        queryCardPage.passwordBox.sendKeys(password);
        koordinatTiklamaMethodu(540,1024);
    }
}
