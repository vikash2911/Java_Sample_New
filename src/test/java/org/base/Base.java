package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

public static WebDriver driver;
	
	public static Actions action;
	
	public static Robot robot;
	
	public static Alert alert;
	
	public static JavascriptExecutor js;
	
	public static TakesScreenshot ts;
	
	
	public static void launchBrower() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
	public static void loadUrl(String name) {
		driver.get(name);

	}
	
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	
	public static void fill(WebElement e, String name) {
		
		e.sendKeys(name);

	}
	
	public static void moveTo(WebElement e) {
		action = new Actions(driver);
		
		action.moveToElement(e).perform();

	}
	
	public static void button(WebElement cl) {
		cl.click();

	}
	
	public static void attribute(WebElement at, String name) {
		String attributes = at.getAttribute(name);
		
		System.out.println(attributes);
	
	
	}
	public static void dragAnd(WebElement e, WebElement r) {
		
		
		action.dragAndDrop(e, r).perform();

	}
	
	public static void ddClick(WebElement e) {
		
		
		action.doubleClick(e).perform();

	}
	
	public static void conClick(WebElement e) {
		
		
		action.contextClick(e).perform();

	}
	
	public static void pressKey(int keycode) throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(keycode);
		

	}
	public static void releaseKey(int keycode) throws AWTException {
		
		
		robot.keyRelease(keycode);
		

	}
	public static void maxi() {
		driver.manage().window().maximize();

	}
	
	public static void exit() {
		driver.quit();
	}
	
	public static void downKey(WebElement txt, CharSequence key) {
		action.keyDown(txt, key);

	}
	public static void upKey(WebElement txt, CharSequence key) {
		action.keyDown(txt, key);

	}
	
	public static void acceptAlert() {
		alert = driver.switchTo().alert();
		
		alert.accept();

	}
	
	public static void dismissAlert() {
		alert.dismiss();

	}
	public static void Alert() {
		alert.dismiss();

	}
	public static void promptAlert(String name) {
		alert.sendKeys(name);
		alert.accept();
	}
	
	public static void prompt2Alert(String name) {
		alert.sendKeys(name);
		alert.dismiss();
	}
	
	
	public static void executeValue(String name, WebElement element) {
		js = (JavascriptExecutor) driver;
		
		js.executeScript("aruguments[0].setAttribute('value'," +name+")", element);

	}
	
	public static void screenShot(String na) throws IOException {
		
		ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File sas = new File("C:\\Users\\raj\\eclipse-workspace\\NewFrame\\screen"+na+".png");
		
		FileUtils.copyFile(screenshotAs, sas);
		
			

	}
	
	public static void scrolldown(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	
	
	public static void frameswitch(WebElement ele) {
		driver.switchTo().frame(ele);

	}
	
	public static String excealRead(int row, int cell ) throws IOException {
		
		
		File file = new File("C:\\Users\\raj\\eclipse-workspace\\NewFrame\\datas\\Book1.xlsx");
		
		FileInputStream in = new FileInputStream(file);
		
		
		Workbook book = new XSSFWorkbook(in);
		
		Sheet s = book.getSheet("Sheet1");
		
	     Row rows = s.getRow(row);
	     
	     Cell c = rows.getCell(cell);
	     
	     
	     //if CellType==1---string/ if is other than 1
	     int cellType = c.getCellType();
	   
	     String value;
	     
	         
	    if (cellType == 1) {
	    	
	    	//current cell value is string
	    value = c.getStringCellValue();
			
		}
	    
	    else if (DateUtil.isCellDateFormatted(c)) {
	    	
	    	//current cell value is in Date format
	    	
	    	Date d = c.getDateCellValue();
	    	
	    SimpleDateFormat sim = new SimpleDateFormat("DD-MM-YYYY");
	    
	     value = sim.format(d);	    	
			
		}
	    else {
			
	    	double dd = c.getNumericCellValue();
	    	
	    	//typecasting
	    	
	    	long l = (long) dd;
	    	
	    	value = String.valueOf(l);
	    	
		}
	     
	    return value;
	     
	     
	     
	     
	}
	
	
	
	
	
}
