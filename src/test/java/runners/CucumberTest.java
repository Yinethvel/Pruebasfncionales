package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"classpath:features"}
		,glue="definitions",
		tags = {"@AutomatizacionOpenSourcecms"
		}
		)
public class CucumberTest {

}
																																																																																																																																																																																																																																																									