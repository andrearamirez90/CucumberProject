package testRunners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions (features= "src/test/resources/features/dataTable.feature"
		,glue = {""},

		//,snippets = SnippetType.CAMELCASE
		plugin = {"pretty", "html: test-ouput"},
		
		monochrome=true, 
		strict=true, 
		dryRun= false

		)
		
public class Runner {

	
}
