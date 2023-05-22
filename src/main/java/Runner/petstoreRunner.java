package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/ahadali/eclipse-pbl/IRCTC/src/main/java/Feature/petstore.feature"
		,glue = {"Binding"}
		,tags = "@Petstore"
		,plugin = {"pretty","html:petstoreTarget/HtmlReports/petstoreReport.html",
						"pretty","junit:petstoreTarget/JunitReports/petstoreReport.xml",
						"pretty","json:petstoreTarget/JsonReports/petstoreReport.xml"}
		)

public class petstoreRunner {

}
