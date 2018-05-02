package com.framework.datadriven;

import org.testng.annotations.Test;

import com.common.CustomDataProvider;

public class DataProviderOtherClass {
	@Test(dataProvider="LoginDataProvider",dataProviderClass= CustomDataProvider.class)
	public void TestLogin(String user,String password){
		System.out.println(user +"--"+password);
	}

}
