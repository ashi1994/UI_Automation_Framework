package com.common;

public class Exception_Selenium {
	/*
	 * 1. NoSuchElementException
	 * 2. StaleElemnetReferenceException
	 * 3. WebdriverException
	 * 4. TimeOutException
	 * 5. NoSuchWindowException
	 * 6. NoSuchFrameException
	 * 7. ElementNotVisibleException
	 * 8. NoAlertPresentException
	 * 9. ConnectionClosedException
	 * 
	 */
	public static void main(String...s){
		try{
			int a=10/0;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally{
			System.out.println("i always run");
		}
	
	}

}
