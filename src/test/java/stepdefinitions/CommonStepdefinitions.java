package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class CommonStepdefinitions extends Base {
    @Given("User logs in {string}.")
    public void user_logs_in(String properties) throws InterruptedException {
        signIn(ConfigReader.getProperty(properties) , ConfigReader.getProperty("password"));
    }
    @Given("User clicks on profile button.")
    public void user_clicks_on_profile_button() {
        clickAndVerify(queryCardPage.profileButton);
    }
    @Given("User navigates to back for {int} time.")
    public void user_navigates_to_back_time(int count) {
        for (int i = 0; i < count; i++) {
            Driver.getAppiumDriver().navigate().back();
        }
    }
    @Given("User clicks on {int},{int}.")
    public void user_clicks_on(int x, int y){
        koordinatTiklamaMethodu(x,y);
    }
}
