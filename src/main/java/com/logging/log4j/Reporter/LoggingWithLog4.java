package com.logging.log4j.Reporter;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingWithLog4 {
	public enum LogLevel {
		DEBUG, ERROR, FATAL, INFO, WARN
	}
	Logger log=Logger.getLogger(LoggingWithLog4.class);
	@Test
	public void testMethod() {
		log.debug("i am from testmethod");
		log.info("waht is this");
		log.error("unable to find the element");
		log.error("unable to find the issue");
		log.debug("i am from testmethod");
		log.info("waht is this");
		log.error("unable to find the element");
		log.error("unable to find the issue");
	}
	

}
/*
 * Download log4j jar file
 * Add log4j to your current project
 * Open notepad and copy the below code and save the file as log4j.properties.(http://learn-automation.com/how-to-create-log-files-in-selenium/)
 * Write the test case and Create a Logger class referencee and use that instnce for different level of log like info,debug,warn fatal
 * 
 */
