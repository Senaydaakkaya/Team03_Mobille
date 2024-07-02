package Runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class OuterRunner {

    final String tags = "@US14-TC02";

    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/reports/" + tags + "-report.html",
                    "json:target/json-reports/"+ tags + "cucumber.json",
                    "junit:target/xml-report/" + tags + "cucumber.xml",
                    "rerun:target/failedRerun.txt"
            },
            features = "src/test/resources/features",
            glue = {"stepdefinitions", "hooks"},
            tags = tags,
            dryRun = false
    )

    public class Runner {}
}