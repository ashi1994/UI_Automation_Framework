//The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
package com.designpattern;

public class Singlton_Design_Pattern_Late {

	private static Singlton_Design_Pattern_Late obj=null;
	// private constructor to force use of
    // getInstance() to create Singleton object
	
	private Singlton_Design_Pattern_Late(){}
	
	public static Singlton_Design_Pattern_Late getInstance(){
		if(obj==null)
			obj=new Singlton_Design_Pattern_Late();
		return obj;
	}
}


/*
Keep track of same driver instance throughout execution.
DBMS connectivity.
Loading external files like properties, excel etc once rather than loading again and again.
Logger.
*/