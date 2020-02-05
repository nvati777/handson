package stepGlue;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="demo28jan.feature",glue= {"stepglue"},tags= {"@datadriven,@smoke"},
plugin="json:target/cucmber_report.json")
public class TestFine {

}
