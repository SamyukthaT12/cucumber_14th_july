package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature" ,
junit="--step-notifications" ,
glue= {"step_definitions"} ,
tags = {"@OrangeHRM"}
)
public class TestRunner {

}
