
# Xendit QA Assessment Instructions

*Please read the following instructions carefully to understand the assessment expectations, how to use the existing framework, evaluation criteria and tools to be used*

**Purpose of the assessment**

The purpose of this assessment is to evaluate the technical competency of the candidate in QA automation field along with the analytical and problem solving skills

**Assessment expectations**

This assessment is created with the objective to validate the automation scripting skills of the candidate. Expectations from this assessment are the following

-Candidate shall come up with the different test scenarios - such as positive, negative and boundary values-

-Candidate shall automate the generated test scenarios using any of the below mentioned automation tools sets-

**How to use the existing framework**

1. Clone/ download the complete framework repository from the following github path - https://github.com/xendit/xendit-qa-assessment

2. The folder names and its purpose is highlighted below

Folder name: *features*

Purpose : Contains the feature file where the cucumber scripts are written using gherkin syntax. Use this file to update the feature that are going to be automated using ‘Scenario Outline’,’given’, ‘When’ and ‘Then’ keywords

Folder name : *shared-objects*

Purpose : Maintain all shared objects within the scripts. such as test data, environment details,etc. This can be used if required, not necessarily to be updated 

 Folder name: *step-definitions*
 
Purpose : Step definitions file( function definitions). A Step Definition is a Java/javascript method with an expression that links it to one or more Gherkin steps. When Cucumber executes a Gherkin step in a scenario, it will look for a matching step definition to execute.
	
3. You may start building the automation scripts by updating the .feature file located under feature folder
4. Write the detailed steps and associated methods in step definition file locate under step definition folder
5. To execute and test the scripts, you may need node.js
6. Online calculator application is built using iframe objects. So, automation scripts will have difficulty in identifying and capturing the object locators. You will need to find an alternate solution to automate the same

**Evaluation criteria**
	
We would use the following criteria to evaluate the assessment

*Test scenario writing skills* : positive, negative and boundary conditions

*Automation script generation* : Usage of proper pass and fail conditions, report generation, screenshot capturing

*Solutioning skills* : Reaching the solutions by overcoming technical challenges using alternate method and work around solutions

**Tools to be used**
	
The current automation framework is built using the below mentioned technologies. You may use any of the below mentioned technologies to develop the automation scripts. Along with these, you may use any of the java based technologies as well.

*Cucumber*

*Selenium / Cypress*

*Javascripts / Java*

*Cucumber-js*
