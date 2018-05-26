package com.commands;

public class HandleCssSelector {
	
	//1..  Single Attribute
		/*
	<tagname>[attribute_name='attribute_value'] 
	or 
	input[attribute_name='attribute_value']

	    */

	//2..   Multiple Atttribute
		/*
	<tagname>[attribute_name1='attribute_value1'][attribute_name2='attribute_value2]

	or

	input[attribute_name1='attribute_value1'][attribute_name2='attribute_value2]
	 
	    */
		
	//3..   AND and OR
		/*

	input[id='Email' and name='Email']
	    */
		
	//4.. Contains
		/*
		 input[name*='Email']
		*/
		

	//5..  starts-with
         /*
		input[id^='Ema']
          */
	
	//6..  end-with
    /*
	input[id$='Ema']
     */
	
	//7..  text()


		//*[text()='New look for sign-in coming soon']

		
		 

}
