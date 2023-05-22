package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/ahadali/eclipse-pbl/IRCTC/src/main/java/Feature"
		,glue= {"Binding"}
		
		
		)

public class Runner {

}
