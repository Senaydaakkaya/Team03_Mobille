package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static hooks.Base.driver;
import static utilities.Driver.getAppiumDriver;

public class MobileHooks {
    @Before
    public void startUp() throws InterruptedException {
        Base.initialize();
        getAppiumDriver();
        Thread.sleep(4000);
    }
    @After
    public void shuttingDown(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
