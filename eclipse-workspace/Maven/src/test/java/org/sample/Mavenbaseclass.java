package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mavenbaseclass {
	
public static  WebDriver driver;
public static  Actions a;
public static  Robot r;
public static Select s;

	 public static void chromeBrowser() {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kowsaly\\eclipse-workspace\\Maven\\Lib\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
		 
	 }
	 
	   public static void launchUrl(String url) {
		   
		   driver.get(url);

	}
	
	public static void pageurl() {

		driver.manage().window().maximize();
	}
	
    public static void pageTitle() {
	
	
	String url = driver.getTitle();
	System.out.println(url);

}
    
  public static String getText(WebElement element) {
    	 
     String text = element.getText();
     System.out.println(text);
     return text;
    	 
}
	public static void textBox(WebElement element ,String value) {
		
		element.sendKeys(value);
		
	}	
	
	public static void clickButton (WebElement element) {
		
		element.click();
		}
	
    public static void rightClick(WebElement element) {
	
	
	a=new Actions(driver);
	
	a.contextClick(element).perform();
    }
    
    public static void doubleClick(WebElement element) {
    	
    	a=new Actions(driver);
    	a.doubleClick(element).perform();

	}
    
public static void down() throws AWTException {
    	
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
}
    
    public static void enter() throws AWTException {
    	r=new Robot();
    	
        r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public static void copy() throws AWTException {
    	r=new Robot();
    	
    	r.keyPress(KeyEvent.VK_C);
    	r.keyRelease(KeyEvent.VK_C);

	}
    
    public static void paste() throws AWTException {
    	
    	r=new Robot();
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);

	}
    
    public static void tab() throws AWTException {

    	r=new Robot();
        r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);
	}
    
    public static void threadSleep() throws InterruptedException {
    	
    	Thread.sleep(5000);

	}
    
    public static void waits() {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    
    
     public static void alertAccept(String value) {
    	 
    	Alert a = driver.switchTo().alert();
    	a.accept();
    	
}
     
     public static void alertDismiss() {
    	 
    	 Alert a = driver.switchTo().alert();
    	 a.dismiss();

	}
     
     public static void alertSendKeys(String value) {
    	 
    	 Alert a = driver.switchTo().alert();
    	 a.sendKeys(value);
    	 String text = a.getText();
    	 System.out.println(text);
    	 

	}
     
public static void frames(WebElement element) {
	
	driver.switchTo().frame(element);

}   

public static void dropDownIndex(WebElement element,Integer value) {
	
	s=new Select(element);
	s.selectByIndex(value);

}

public static void dropDownValue(WebElement element,String value) {
   s=new Select(element);
   s.selectByValue(value);

}

public static void dropDownVisibleText(WebElement element,String value) {
	
	s=new Select(element);
	s.selectByVisibleText(value);

}

public static void scrollUp(WebElement element) {

	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

}

public static void scrollDown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	
}

public static void setAttribute(WebElement element,String name) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value', ' " +name+ " ')", element);
}

public static String returnAttribute(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Object obj = js.executeScript("return arguments[0].getAttribute('value')", element);
	String s1=(String)obj;
	System.out.println(s1);
	return s1;
	}

public static void javaScriptClick(WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", element);

    	 
}

public static void screenShot(String picname) throws IOException {
	TakesScreenshot tk =(TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\kowsaly\\eclipse-workspace\\Maven\\Screenshots\\"+picname+".png");
	FileUtils.copyFile(src, des);
	
}
public static void clear(WebElement element) {

	element.clear();    
}


public static String attributeMethod (WebElement element) {
	
	String text = element.getAttribute("value");
	System.out.println(text);
	return text;
}
	
public static String readExcel( int rowNo , int cellNo)  throws  IOException {

File f =new File("C:\\Users\\kowsaly\\eclipse-workspace\\Maven\\Excel\\Book1.xlsx");

FileInputStream fin=new FileInputStream(f);

Workbook book =new XSSFWorkbook(fin);

Sheet sh=book.getSheet("Sheet1");

  Row row = sh.getRow(rowNo);
  
  Cell c = row.getCell(cellNo);
  
  int type = c.getCellType();
  
  String name="";
  
  if (type==1) {
	  
	   name = c.getStringCellValue();
  }
	    else if (DateUtil.isCellDateFormatted(c)) {
		  Date d = c.getDateCellValue();
		  SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyy");
		  
		   name = s.format(d);
	  }
  
	  else {
		   double d = c.getNumericCellValue();
		   long l = (long) d;
		   name = String.valueOf(l);
		  }
  
return name;


}
	
public static void writeExcel(int rowNo,int cellNo, String value) throws IOException  {
		
		File f =new File("C:\\Users\\kowsaly\\eclipse-workspace\\Maven\\Excel\\Book1.xlsx");

		FileInputStream fin=new FileInputStream(f);

		Workbook book =new XSSFWorkbook(fin);

		Sheet sh=book.getSheet("Sheet1");

 		  Row row = sh.createRow(rowNo);
		  
		  Cell c = row.createCell(cellNo);
		  
		  c.setCellValue(value);
		  
		  FileOutputStream fo =new FileOutputStream(f);
		  
		  book.write(fo);
		  
		  
		 
}
	
	
		
}
	
	
	
	
	
	







		  
	  


  
  
  
  
  

























	 
  

    
    

	 
  

		
		
		
		
		
	
	
	
	
	
	
	
	
	




	
	
	
   





