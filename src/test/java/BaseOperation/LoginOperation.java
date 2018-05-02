package BaseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TODO Put here a description of what this class does.
 *
 * @author aranjan.
 *         Created Mar 27, 2018.
 */
public class LoginOperation {
	WebDriver driver;
	public LoginOperation(WebDriver driver){
		this.driver=driver;
	}
	
	By email=By.name("email");
	By password=By.name("password");
	By submit=By.xpath("//button[contains(text(),'Login')]");
	
	public void inputEmail(String input){
		driver.findElement(email).sendKeys(input);
		
	}
	public void inputPassword(String input){
		driver.findElement(password).sendKeys(input);
	}
	public void submitButton(){
		driver.findElement(submit).click();
	}
	public void login(){
		inputEmail("user@phptravels.com");
		inputPassword("demouser");
		submitButton();
		
	}
	

}
