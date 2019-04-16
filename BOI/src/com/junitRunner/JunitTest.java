package com.junitRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
                     features = {"C:\\WorkspaceBDD1\\BOI\\scenario-feature\\a.feature"},
                         glue = {"C:\\WorkspaceBDD1\\BOI\\src\\stepdef\\stepdef.java"} )

public class JunitTest {

}
