package org.frame;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Mavenbaseclass;
public class Day1 extends Mavenbaseclass {
public static void main(String[] args  ) throws IOException {
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/");
		pageurl();
		waits();
		WebElement userName = driver.findElement(By.xpath("(//input[@id='username'])[1]"));
		textBox(userName, readExcel(0, 0));
		WebElement pwdBox = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		textBox(pwdBox, readExcel(0, 1));
		WebElement click = driver.findElement(By.xpath("(//input[@id='login'])[1]"));
		clickButton(click);
		WebElement location = driver.findElement(By.xpath("(//select[@id='location'])[1]"));
		dropDownVisibleText(location, "Los Angeles");
	    WebElement hotel = driver.findElement(By.xpath("(//select[@id='hotels'])[1]"));
		dropDownVisibleText(hotel, "Hotel Sunshine");
	    WebElement roomType = driver.findElement(By.xpath("(//select[@id='room_type'])[1]"));
		dropDownVisibleText(roomType, "Deluxe");
		WebElement numberOf = driver.findElement(By.xpath("(//select[@id='room_nos'])[1]"));
		dropDownVisibleText(numberOf, "2 - Two");
		WebElement checkIn = driver.findElement(By.xpath("(//input[@id='datepick_in'])[1]"));
		clear(checkIn);
		WebElement checkIn1 = driver.findElement(By.xpath("(//input[@id='datepick_in'])[1]"));
	    textBox(checkIn1, readExcel(1, 0));		
	    WebElement checkOut = driver.findElement(By.xpath("(//input[@id='datepick_out'])[1]"));
		clear(checkOut);
		WebElement checkOut1 = driver.findElement(By.xpath("(//input[@id='datepick_out'])[1]"));
		textBox(checkOut1, readExcel(1, 1));
        WebElement adultsFrom = driver.findElement(By.xpath("(//select[@id='adult_room'])[1]"));
		dropDownVisibleText(adultsFrom, "2 - Two");
	    WebElement childrenPer = driver.findElement(By.xpath("(//select[@id='child_room'])[1]"));
		dropDownVisibleText(childrenPer, "1 - One");
		WebElement search = driver.findElement(By.xpath("(//input[@id='Submit'])[1]"));
		clickButton(search);
		WebElement radioButton = driver.findElement(By.xpath("(//input[@id='radiobutton_0'])[1]"));
		clickButton(radioButton);
		WebElement enter = driver.findElement(By.xpath("(//input[@name='continue'])[1]"));
		clickButton(enter);
		WebElement firstName = driver.findElement(By.xpath("(//input[@id='first_name'])[1]"));
		textBox(firstName, readExcel(2, 0));
		WebElement lastName = driver.findElement(By.xpath("(//input[@id='last_name'])[1]"));
		textBox(lastName, readExcel(2, 1));
		WebElement address = driver.findElement(By.xpath("(//textarea[@id='address'])[1]"));
		textBox(address, readExcel(3, 0));
		WebElement cardNum = driver.findElement(By.xpath("(//input[@id='cc_num'])[1]"));
		textBox(cardNum, readExcel(4, 0));
		WebElement cardType = driver.findElement(By.xpath("(//select[@id='cc_type'])[1]"));
		dropDownVisibleText(cardType, "Master Card");
		WebElement cardExpiryFrom = driver.findElement(By.xpath("(//select[@id='cc_exp_month'])[1]"));
		dropDownVisibleText(cardExpiryFrom, "January");
	    WebElement cardExpiryTo = driver.findElement(By.xpath("(//select[@id='cc_exp_year'])[1]"));
		dropDownVisibleText(cardExpiryTo, "2022");
		WebElement cvvNum = driver.findElement(By.xpath("(//input[@id='cc_cvv'])[1]"));
		textBox(cvvNum, readExcel(5, 0));
		WebElement bookNow = driver.findElement(By.xpath("(//input[@id='book_now'])[1]"));
		clickButton(bookNow);
		WebElement conformationNum = driver.findElement(By.xpath("(//input[@id='order_no'])[1]"));
		scrollDown(conformationNum);
		javaScriptClick(conformationNum);
		String text = returnAttribute(conformationNum);
		writeExcel(20, 0, text);
		
		
		
		
		
	    
	    
		
		
		
		
	 
		
  
		
		
		
	  
	}

}


		
	


	

