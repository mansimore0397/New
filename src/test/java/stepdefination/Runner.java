package stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		monochrome = true,
		features = {"src/test/java/features"},  //feature package location 
		glue= {"stepdefination"}, //package name
		tags = "@F2 and @smoke or @sanity" ,//or is for one herirachy //and is for child 
		plugin = {"html:target/cucumber.html" ,"json:target/cucumber.json"}
		
		
		)

public class Runner extends AbstractTestNGCucumberTests {
	

}
