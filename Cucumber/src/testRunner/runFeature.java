package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//1. tags = {"@tag", "@tag1"} : means AND condition. –It says that scenarios matching both these tag needs to be executed.
//2. tags = {"@tag1, @tag2"} : means OR condition. — It says that scenarios matching any of this tag needs to be executed.

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features", glue="stepDefinition")
public class runFeature {

}
