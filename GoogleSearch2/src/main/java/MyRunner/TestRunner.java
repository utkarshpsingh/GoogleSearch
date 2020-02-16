package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ={"C:\\Users\\utkar\\eclipse-workspace\\GoogleSearch2\\src\\test\\java\\Features\\googleSearch.feature"
			},		 				
        glue = {"stepDefinitions"},
        tags = {"~@Ignore"},
        dryRun = false ,
        monochrome =true,
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json","rerun:target/cucumber-reports/rerun.txt"},
        
        plugin = {"json:target/cucumber-reports/CucumberTestReport.json","rerun:target/cucumber-reports/rerun.txt" } )



public class TestRunner {

}
