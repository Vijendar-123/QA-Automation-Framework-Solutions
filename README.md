QA-Automation-Framework-Solutions

##  Parallel Testing with Cucumber and TestNG
This project demonstrates how to perform parallel testing with Cucumber and TestNG.

## Test Scenario
The test scenario is defined in the following classes:

#### - BaseDefinition: Contains the base steps and hooks for the Cucumber tests;

#### - LoginStepDefinition: Contains the step definitions for the login feature.


## Configuration

#### To enable parallel execution, the following steps have been taken:

##### 1) The CucumberRunner.xml file is used to configure TestNG and define the test suite.

##### 2) The CucumberRunner class is the entry point for the Cucumber tests and extends AbstractTestNGCucumberTests from the Cucumber TestNG library.

##### 3) The @CucumberOptions annotation in the CucumberRunner class specifies the location of the feature files.

##### 4) The @DataProvider(parallel = true) annotation is added to the scenarios() method in the CucumberRunner class to enable parallel execution of scenarios.


## Running Tests

To run tests, run the following command

```bash
  gradle clean test
```
