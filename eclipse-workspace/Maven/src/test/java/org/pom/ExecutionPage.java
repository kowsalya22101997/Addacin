package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sample.Mavenbaseclass;

public class ExecutionPage extends Mavenbaseclass {

	public static void main(String[] args) throws IOException  {
		
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/");
		pageurl();
		waits();
		
		FirstPagePojo f1= new FirstPagePojo();
		
		WebElement txtUserName = f1.getTxtUserName();
		textBox(txtUserName, readExcel(0, 0));
		
		WebElement pwd = f1.getPwd();
		textBox(pwd, readExcel(0, 1));
		
		WebElement loginClick = f1.getLoginClick();
		clickButton(loginClick);
		
		
		SecondPagePojo s1=new SecondPagePojo();
		
		WebElement location = s1.getLocation();
		dropDownIndex(location, 1);
		
		WebElement hotel = s1.getHotel();
		dropDownIndex(hotel, 1);
		
		WebElement roomtype = s1.getRoomtype();
		dropDownIndex(roomtype, 1);
		
		WebElement numberOf = s1.getNumberOf();
		dropDownIndex(numberOf, 1);
		
		
		WebElement adultsRoom = s1.getAdultsRoom();
		dropDownIndex(adultsRoom, 1);
		
		WebElement childRoom = s1.getChildRoom();
		dropDownIndex(childRoom, 1);
		
		WebElement search = s1.getSearch();
		clickButton(search);
		
		
		ThirdPagePojo t1=new ThirdPagePojo();
		
		WebElement radioButton = t1.getRadioButton();
		clickButton(radioButton);
		
		WebElement enter = t1.getEnter();
		clickButton(enter);
		
		FourthPagePojo d1=new FourthPagePojo();
		
		WebElement firstName = d1.getFirstName();
		textBox(firstName,readExcel(2, 0) );
		
		WebElement lastName = d1.getLastName();
		textBox(lastName, readExcel(2, 1));
	
		WebElement address = d1.getAddress();
		textBox(address, readExcel(3, 0));
		
		WebElement ccNum = d1.getCcNum();
		textBox(ccNum, readExcel(4, 0));
		
		WebElement ccType = d1.getCcType();
		dropDownIndex(ccType, 2);
		
		WebElement ccMonth = d1.getCcMonth();
		dropDownIndex(ccMonth, 2);
		
		WebElement year = d1.getCcYear();
		dropDownIndex(year, 4);
		
		WebElement cvv = d1.getCvv();
		textBox(cvv, readExcel(5, 0));
		
		WebElement bookNow = d1.getBookNow();
		
		clickButton(bookNow);
		
		FifthPagePojo e1=new FifthPagePojo();
		
		WebElement orderNo = e1.getOrderNo();
		scrollDown(orderNo);
	    javaScriptClick(orderNo);
	     String attribute = returnAttribute(orderNo);
		
		writeExcel(28, 0, attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
