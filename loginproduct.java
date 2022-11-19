package product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	public WebDriver d;
	
	  public login(WebDriver d) {
	  
	  
		  this.d = d; 
	  }
	 
	//login
	By mail=By.id("sTestEmail");
	By pass=By.id("sTestPassword");
	By submit=By.id("sTestLoginBtn");
	
	
	
	//actions
	public void validate() {
		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS)	;
		
		d.findElement(mail).sendKeys("sivagayathri@recruitcrm.io");
		d.findElement(pass).sendKeys("Butterfly@001");
		d.findElement(submit).click();
	}
	
	
	
	
	
	

}
