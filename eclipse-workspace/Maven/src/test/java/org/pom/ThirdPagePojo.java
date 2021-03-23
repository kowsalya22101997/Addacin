package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.Mavenbaseclass;

public class ThirdPagePojo extends Mavenbaseclass{
	
	public ThirdPagePojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(name="continue")
	private WebElement enter;
	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getEnter() {
		return enter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
