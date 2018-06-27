package com.framework.datadriven;
	
import java.io.IOException;
import com.common.*;
import java.util.*;

	public class csvfileRead {

	public static void main(String []args) throws IOException {
	String[] li=Helper.getAllcolumnValues("C://workspace//testashiwani.xlsx","Test",0);

	for(String s1:li)
	    System.out.print(s1+" ");
	
	List<String> l2=Helper.getAllValues("C://workspace//testashiwani.xlsx","Test");
	System.out.println(l2);
	   	
		
	}
	
}
  