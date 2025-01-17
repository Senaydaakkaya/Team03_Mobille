package utilities;

import hooks.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Driver extends Base {
    private Driver() {
    }

    public static AppiumDriver getAppiumDriver() {


        /**  Gercek cihaz icin url "http:0.0.0.0:4723/wd/hub";
         Emilator cihaz icin url "http:127.0.0.1:4723/wd/hub";
         */


        /**
         * Driver null olduğunda telefonumuza ait özellikleri hazırlarız
         */
        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options.setPlatformName("Android").setAutomationName("UiAutomator2");
                    options.setApp("src/test/java/Apps/querycart1.0.apk");
                    options.setAppPackage("com.inilabs.shopking");
                    options.setAppActivity("com.inilabs.shopking.MainActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.setNewCommandTimeout(Duration.ofMinutes(20));
                    try {
                        driver = new AndroidDriver(
                                new URL("http://0.0.0.0:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case "IOS":

                    break;
                default:
                    throw new RuntimeException("Desteklenmeyen Platform");
            }
        }

        /**
         * Her test basinda uygulamanin sifirlanmasini ve en bastan olmasini saglar.
         * NoReset=true olursa uygulama kaldigi noktadan devam eder
         */

     /*   if (ConfigReader.getProperty("platformName").equals("Android")) {
            assert appiumServerUrl != null;
            try {
                driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else {
            throw new UnsupportedOperationException(" Invalid Platform Name ");
        }*/
        return driver;
    }
}
