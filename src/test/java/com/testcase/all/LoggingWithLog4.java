package com.testcase.all;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;

public class LoggingWithLog4 {
	
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
