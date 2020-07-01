import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@SuiteDisplayName("Run all my test")
@RunWith(JUnitPlatform.class)
@SelectPackages(value = "tests")
@IncludeTags(value = "Parametrized & !ignore")
public class RunAllMyTests {

}
