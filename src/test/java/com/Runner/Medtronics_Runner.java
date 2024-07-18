package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base.BaseClass_Medtronics;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Siva\\eclipse-workspace\\Medtronics\\src\\test\\java\\featureFile.feature",
		glue = "com.StepDefinitions",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true,
		monochrome = true,
		plugin = {
				"html:HtmlReport/Medtronics",
				"pretty",
				"json:JsonReport/Medtronics Login.json",
				"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/"+"Medtronics.html"}
		)


public class Medtronics_Runner extends BaseClass_Medtronics{

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver =browserLaunch("chrome");
	}

	@AfterClass
	public static void close() {

//		driver.quit();
	}
}



