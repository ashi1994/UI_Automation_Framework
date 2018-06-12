package com.commands;

public class HandleDynamicXpath {

//1..  Single Attribute
	/*
<HTML tag>[@attribute_name='attribute_value'] 
or 
//*[@attribute_name='attribute_value']

    */

//2..   Multiple Atttribute
	/*
//<HTML tag>[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]

or

//*[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]
 
    */
	
//3..   AND and OR


    //input[@id='Email' and @name='Email']
    
	
//4..  Contains Method
	
	 //input[contains(@name,'Email')]
	
	

//5..  starts-with

	//input[starts-with(@id,'Ema')]

//6..  text()


	//*[text()='New look for sign-in coming soon']
	//*[conatains(@text(),"something")]
	
//7..	substring
	//*[substring(@id,6)='Hello']
	
	

	
	 
	
}
