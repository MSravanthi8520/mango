package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:features/AddNationality.feature"}
,glue= {"NationalityTest"},
plugin = {"pretty", "html:target/cucumber-html-report"},
tags = {}
)

public class testrunner {

}