package PageObject.Runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/search/IntimateClaimManagerII.feature",
        glue = "StepDef"

)
public class IntimateClaimManagerIITest {
}
