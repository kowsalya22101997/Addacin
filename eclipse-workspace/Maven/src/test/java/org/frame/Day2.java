package org.frame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Mavenbaseclass;

public class Day2 extends Mavenbaseclass{

	public static void main(String[] args) throws IOException {
		
		chromeBrowser();
		launchUrl("https://www.facebook.com");
		pageurl();
		WebElement UserName = driver.findElement(By.id("email"));
		textBox(UserName, readExcel(0, 0));
		
		WebElement passWord = driver.findElement(By.id("pass"));
		textBox(passWord, readExcel(0, 1));
		
		WebElement click = driver.findElement(By.xpath("(//button[text()='Log In'])[1]"));
		clickButton(click);
		
		WebElement word = driver.findElement(By.xpath("//div[contains(text(),'password')]"));
		String text = getText(word);
		writeExcel(16, 0, text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
