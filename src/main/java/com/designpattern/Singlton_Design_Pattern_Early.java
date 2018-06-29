package com.designpattern;

public class Singlton_Design_Pattern_Early {

	private static Singlton_Design_Pattern_Early obj=new Singlton_Design_Pattern_Early();
	
	private Singlton_Design_Pattern_Early(){}
	
	public static Singlton_Design_Pattern_Early getInstance(){
		return obj;
		
	}
}

//It will help when we want to create a single object of class and that object is public accessible.

/*
Keep track of same driver instance throughout execution.
DBMS connectivity.
Loading external files like properties, excel etc once rather than loading again and again.
Logger.
*/