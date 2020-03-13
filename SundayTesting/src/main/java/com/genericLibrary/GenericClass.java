package com.genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenericClass {
	WebDriver driver;
	GenericPageFactory pf;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ziaha\\eclipse-workspace\\SundayTesting\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getUrl() {
		driver.get("http://newtours.demoaut.com/");
	}
	public void getLogin() {	
		pf = PageFactory.initElements(driver, GenericPageFactory.class);
		pf.getUserName().sendKeys("selenium1994");
		pf.getPassWord().sendKeys("smarttech");
		pf.getLogin().click();		
	}
	
	public void getOneWay() {		
		pf.getOnwWay();
	}
	public void selectPassengers() {
		WebElement passengerDropDown = pf.getPassengerCount();
		Select obj = new Select(passengerDropDown);
		//obj.selectByIndex(1);
		obj.selectByVisibleText("1");
		//obj.selectByValue("3");		
	}
	
	public void departureInfo() {
		WebElement departingFromDD = pf.getDepartingFrom();
		Select objDepart = new Select(departingFromDD);
		objDepart.selectByVisibleText("Paris");
		
		WebElement departingMonthDD = pf.getDepartingMonth();
		Select objMonth = new Select(departingMonthDD);
		objMonth.selectByVisibleText("August");
		
		WebElement departingDateDD = pf.getDepartingDate();
		Select objDate = new Select(departingDateDD);
		objDate.selectByVisibleText("15");
	}	
	
	public void arrivingInfo() {
		WebElement arrivingToDD = pf.getArrivingTo();
		Select objArr = new Select(arrivingToDD);
		objArr.selectByVisibleText("New York");
		
		WebElement arrivingMonthDD = pf.getArrivingMonth();
		Select objMonth = new Select(arrivingMonthDD);
		objMonth.selectByVisibleText("October");
		WebElement arrivingDateDD = pf.getArrivingDate();
		Select objDate = new Select(arrivingDateDD);
		objDate.selectByVisibleText("25");
	}
		
	public void getAirlineInfo() {
		pf.getServiceClass().click();	
		WebElement airlineName = pf.getSelectAirline();
		Select obj = new Select(airlineName);
		obj.selectByVisibleText("Unified Airlines");
		
		pf.getGetFlights().click();	
	}	
	
	public void selectFlight() {
		pf.getSelectDepartingFlight().click();
		pf.getSelectReturnFlight().click();
		pf.getSelectFlight().click();
	}
	public void passInfo() {
		pf.getPassFirstName().sendKeys("Syed");	
		pf.getPassLastName().sendKeys("Hassan");
		WebElement passMeal = pf.getPassMeal();
		Select obj = new Select(passMeal);
		obj.selectByVisibleText("Muslim");
	}
		
	public void passCCInfo() {
		WebElement ccType = pf.getCcType();
		Select objType = new Select(ccType);
		objType.selectByVisibleText("Visa");
		pf.getCcNum().sendKeys("4142548796452158");
		WebElement ccExpMon = pf.getCcExpMon();
		Select objMonth = new Select(ccExpMon);
		objMonth.selectByVisibleText("12");
		WebElement ccExpYear = pf.getCcExpYear();
		Select objYear = new Select(ccExpYear);
		objYear.selectByVisibleText("2009");
		pf.getCcFirstName().sendKeys("Syed");
		pf.getCcMiddleName().sendKeys("Zia");
		pf.getCcLastName().sendKeys("Hassan");
		
	}
	public void passBillingInfo() {
		pf.getBillAddr1().sendKeys("3601 37th Ave");
		pf.getBillAddr2().sendKeys("Apt# 5G");
		pf.getBillCity().sendKeys("Forest Hills");
		pf.getBillState().sendKeys("NY");
		pf.getBillZip().sendKeys("11101");
		WebElement billCountry = pf.getBillCountry();
		Select objBillCounty = new Select(billCountry);
		objBillCounty.selectByVisibleText("BENIN");		
	}
	public void passShippingAddress() {
		String country = "ALGERIA";
		pf.getShipAddr1().sendKeys("3272 Gale Ave");
		pf.getShipAddr2().sendKeys("Apt# 5G");
		pf.getShipCity().sendKeys("Forest Hills");
		pf.getShipState().sendKeys("NY");
		pf.getShipZip().sendKeys("11101");
		WebElement shipCountry = pf.getShipCountry();
		Select objshipCounty = new Select(shipCountry);
		objshipCounty.selectByVisibleText(country);
		if(country != "UNITED STATES") {
			driver.switchTo().alert().accept();
		}		
	}
	public void purchaseTicket() {
		pf.getBuyFlight().click();
	}
	public void finalPrice() {
		//(//font[contains(text(),'Total')])[2]/following-sibling::td
		String fprice = pf.getFinalPrice().getText();
		System.out.println("Final Price: "+fprice);
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}
}
