import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"},
        stepNotifications = true,
        tags = "@Scenario1",
        features = "src/test/resources/",
        glue = {"com.itstep.lesson.steps.version1",
                "com.itstep.lesson.hooks"
        }
)
public class RunCucumberTest {

}
