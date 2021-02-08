# Xendit QA Assessment

:point_right: <sub> Please read the below instructions to understand the scenarios for which the automation script has been developed and tools used. </sub>

## Tools to  used
	
Below mentioned technologies used to develop the automation scripts

*Eclipse IDE*

*Selenium*

*Java*

*TestNG*

*Maven(POM)*

*Ashot API*

*Extent Report*

Script if free of any particular IDE, can be run on Maven.

**Understanding the Framework**

1. Test Plan is present inside the extracted folder which contains the required details to undestand the Test Cases designed from the test scenarios which I was expected to test

2. You will find the following folders in the extracted folder. The names and its purpose are highlighted below

	Folder name: *original-SS*

	Purpose : Contains the expected/desired results one should get after performing a test. Nomenclature is as expected+TestCaseName.

	Folder name : *reports*

	Purpose : Contains the report of our script fetched using Extent Report. Once the script runs the report is saved in this folder.

 	Folder name: *screenshot*
 
	Purpose : Contains the Screenshots of our script execution. Once the script runs the screenshot of every test is saved in this folder.
	
	Folder name: *src\main*
 
	Purpose : Contains a page class for each addition/substraction/division where the objects and the handler functions are present
	
	Folder name: *src\test*
 
	Purpose : Contains test class .Every page class has a followup test class where I create tests for related use cases.
	
3. Script is designed to run on any of Chrome/Mozilla Firefox/Internet Explorer, but I have tested using the Chrome. So we need to add the drivers for any other Browser in the current working directory where the script is present.
	
4. If you dont want to run the script by any IDE. Goto CMD 

	cd path_to_the_project
	
	mvn test
	
5. Ashot API has been used to compare the expected and obtained Screenshots.

Thanks for reading the instructions!