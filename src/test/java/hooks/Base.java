package hooks;

import Page.QueryCardPage;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.*;
import java.util.Random;

public abstract class Base {
    public static String email, password, name, phoneNumber,country,state,city,zipCode,streetAddress;
    public static int id;
    public static double sub_total;
    public static Date date;
    public static Random random;
    public static Faker faker;
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static DesiredCapabilities desiredCapabilities;
    public static QueryCardPage queryCardPage;

    public static void initialize(){
        faker = new Faker();
        random = new Random();
        options = new UiAutomator2Options();
        queryCardPage = new QueryCardPage();
        desiredCapabilities = new DesiredCapabilities();
    }
}
