package com.genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenericPageFactory {
	
//	@FindBy(xpath= "(//input[@name='email_address'])")
//	private WebElement userNamex;

	@FindBy(xpath = "(//input[@name='userName'])")
		private WebElement userName;
	@FindBy(xpath="(//input[@name='password'])")
	private WebElement passWord;
	@FindBy(xpath="(//input[@name='login'])")
	private WebElement login;
	@FindBy(xpath="((//input[@name='tripType'])[2])")
	private WebElement onwWay;
	@FindBy(xpath="(//select[@name='passCount'])")
	private WebElement passengerCount;
	@FindBy(xpath="(//select[@name='fromPort'])")
	private WebElement departingFrom;
	@FindBy(xpath="(//select[@name='fromMonth'])")
	private WebElement departingMonth;
	@FindBy(xpath="(//select[@name='fromDay'])")
	private WebElement departingDate;
	@FindBy(xpath="(//select[@name='toPort'])")
	private WebElement arrivingTo;
	@FindBy(xpath="(//select[@name='toMonth'])")
	private WebElement arrivingMonth;
	@FindBy(xpath="(//select[@name='toDay'])")
	private WebElement arrivingDate;
	@FindBy(xpath="(//input[@value='Business'])")
	private WebElement serviceClass;
	@FindBy(xpath="(//select[@name='airline'])")
	private WebElement selectAirline;
	@FindBy(xpath="(//input[@name='findFlights'])")
	private WebElement getFlights;
	@FindBy(xpath="((//td[@class='frame_action_xrows']) [2])")
	private WebElement selectDepartingFlight;
	@FindBy(xpath="((//td[@class='frame_action_xrows']) [6])")
	private WebElement selectReturnFlight;
	@FindBy(xpath="(//input[@name='reserveFlights'])")
	private WebElement selectFlight;
	@FindBy(xpath="(//input[@name='passFirst0'])")
	private WebElement passFirstName;
	@FindBy(xpath="(//input[@name='passLast0'])")
	private WebElement passLastName;
	@FindBy(xpath="(//select[@name='pass.0.meal'])")
	private WebElement passMeal;
	@FindBy(xpath="(//select[@name='creditCard'])")
	private WebElement ccType;
	@FindBy(xpath="(//input[@name='creditnumber'])")
	private WebElement ccNum;
	@FindBy(xpath="(//select[@name='cc_exp_dt_mn'])")
	private WebElement ccExpMon;
	@FindBy(xpath="(//select[@name='cc_exp_dt_yr'])")
	private WebElement ccExpYear;
	@FindBy(xpath="(//input[@name='cc_frst_name'])")
	private WebElement ccFirstName;
	@FindBy(xpath="(//input[@name='cc_mid_name'])")
	private WebElement ccMiddleName;
	@FindBy(xpath="(//input[@name='cc_last_name'])")
	private WebElement ccLastName;
	
	@FindBy(xpath="(//input[@name='billAddress1'])")
	private WebElement billAddr1;
	@FindBy(xpath="(//input[@name='billAddress2'])")
	private WebElement billAddr2;
	@FindBy(xpath="(//input[@name='billCity'])")
	private WebElement billCity;
	@FindBy(xpath="(//input[@name='billState'])")
	private WebElement billState;  
	@FindBy(xpath="(//input[@name='billZip'])")
	private WebElement billZip;
	@FindBy(xpath="(//select[@name='billCountry'])")
	private WebElement billCountry;

	@FindBy(xpath="(//input[@name='delAddress1'])")
	private WebElement shipAddr1;
	@FindBy(xpath="(//input[@name='delAddress2'])")
	private WebElement shipAddr2;
	@FindBy(xpath="(//input[@name='delCity'])")
	private WebElement shipCity;
	
	@FindBy(xpath="(//input[@name='buyFlights'])")
	private WebElement buyFlight;
	
	@FindBy(xpath="((//font[contains(text(),'$')])[2])")
	private WebElement finalPrice;
	
	public WebElement getFinalPrice() {
		return finalPrice;
	}

	public WebElement getBuyFlight() {
		return buyFlight;
	}

	public WebElement getShipAddr1() {
		return shipAddr1;
	}

	public WebElement getShipAddr2() {
		return shipAddr2;
	}

	public WebElement getShipCity() {
		return shipCity;
	}

	public WebElement getShipState() {
		return shipState;
	}

	public WebElement getShipZip() {
		return shipZip;
	}

	public WebElement getShipCountry() {
		return shipCountry;
	}

	@FindBy(xpath="(//input[@name='delState'])")
	private WebElement shipState;  
	@FindBy(xpath="(//input[@name='delZip'])")
	private WebElement shipZip;
	@FindBy(xpath="(//select[@name='delCountry'])")
	private WebElement shipCountry;

	public WebElement getBillAddr1() {
		return billAddr1;
	}

	public WebElement getBillAddr2() {
		return billAddr2;
	}

	public WebElement getBillCity() {
		return billCity;
	}

	public WebElement getBillState() {
		return billState;
	}

	public WebElement getBillZip() {
		return billZip;
	}

	public WebElement getBillCountry() {
		return billCountry;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcExpMon() {
		return ccExpMon;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCcFirstName() {
		return ccFirstName;
	}

	public WebElement getCcMiddleName() {
		return ccMiddleName;
	}

	public WebElement getCcLastName() {
		return ccLastName;
	}

	public WebElement getPassFirstName() {
		return passFirstName;
	}

	public WebElement getPassLastName() {
		return passLastName;
	}

	public WebElement getPassMeal() {
		return passMeal;
	}

	public WebElement getServiceClass() {
		return serviceClass;
	}

	public WebElement getSelectAirline() {
		return selectAirline;
	}

	public WebElement getGetFlights() {
		return getFlights;
	}

	public WebElement getSelectDepartingFlight() {
		return selectDepartingFlight;
	}

	public WebElement getSelectReturnFlight() {
		return selectReturnFlight;
	}

	public WebElement getSelectFlight() {
		return selectFlight;
	}

	public WebElement getDepartingDate() {
		return departingDate;
	}

	public WebElement getArrivingTo() {
		return arrivingTo;
	}

	public WebElement getArrivingMonth() {
		return arrivingMonth;
	}

	public WebElement getArrivingDate() {
		return arrivingDate;
	}

	public WebElement getDepartingMonth() {
		return departingMonth;
	}

	public WebElement getDepartingFrom() {
		return departingFrom;
	}

	public WebElement getPassengerCount() {
		return passengerCount;
	}

	public WebElement getOnwWay() {
		return onwWay;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUserName() {
		return userName;
	}
}
