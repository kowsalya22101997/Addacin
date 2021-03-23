package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.Mavenbaseclass;

public class FirstPagePojo extends Mavenbaseclass{
	
	public FirstPagePojo() {
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement loginClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}
	
	
	
	
	
	
	
	 
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


