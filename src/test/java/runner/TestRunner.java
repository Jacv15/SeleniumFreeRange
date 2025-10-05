package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectDirectories("src/test/resources")
@ConfigurationParameter(key = "cucumber.glue", value = "steps")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@IncludeTags({"test1"})


public class TestRunner {

}