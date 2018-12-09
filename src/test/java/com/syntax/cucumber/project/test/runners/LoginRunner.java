package com.syntax.cucumber.project.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features="/Users/AndreaRamirez/eclipse-workspace/CucumberProject/src/test/resources/features/Login.feature"
		,glue ="")
		
public class LoginRunner {

	
}
