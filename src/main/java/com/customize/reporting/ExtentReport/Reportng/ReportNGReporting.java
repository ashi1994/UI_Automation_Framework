package com.customize.reporting.ExtentReport.Reportng;

public class ReportNGReporting {
	/*
	STEP 1: Download And Add Required Jar Files In Project’s Build Path guice-3.0.jar,reportng-1.1.4.jar and velocity-dep-1.4.jar
	STEP 2: Disable The Default Listeners Of TestNG
	   Right click on project > Click on Properties > Click on TestNG
       You will find an option as “Disable default listeners”, check the checbox.
       Now Click on “OK” button.
    STEP 3: Add ReportNG Listeners To Testng.Xml File
       <listeners>
          <listener class-name="org.uncommons.reportng.HTMLReporter" />
          <listener class-name="org.uncommons.reportng.JUnitXMLReporter" />
       </listeners>
    STEP 4: Execute Your Test And Look The ReportNG Reports.(test-output-->index.html)
*/

}
