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
	
//6..  ends-with

	//input[ends-with(@id,'Some text')]--it will work with xpath engine 2.0 not with 1.0
	

//7..  text()

	//*[text()='New look for sign-in coming soon']  -- It will work for find fully matched.
	
	//*[conatains(@text(),"something")]--it will work for partial match
	
//8..	substring
	//*[substring(@id,6)='Hello']	 

	
//9..   parent:: & preceding-sibling & following-sibling
	//a[text()='David Cris']//parent::td[@class='datalistrow']//preciding-sibling::td[@class='datalistrow']//input
// 	Here David Cris is main element and before that thr is check box
// 		<td align="left" valign="top" class="datalistrow" width="1">
//                      <input type="checkbox" name="contact_id" value="52252018">
//                      </td>
// 		<td align="left" valign="top" class="datalistrow">
//                      <a href="https://www.freecrm.com/system/index.cfm?action=contact&amp;sub=load&amp;edit=0&amp;client_id=29191876&amp;contact_id=52252018" context="contact" _id="52252018" _name="David Cris" _cid="29191876" _haseml="N">David Cris</a>
//             &nbsp;</td>	
	
	
}
