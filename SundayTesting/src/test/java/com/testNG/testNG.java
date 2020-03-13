package com.testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.genericLibrary.GenericClass;

public class testNG extends GenericClass {
	//unit testing
	
	testNG test;
	
	@BeforeTest
	public void runSetup() {
		
		test = new testNG();		
		test.openBrowser();
	//	test.maximizeBrowser();
		test.getUrl();		
	}	
	@Test
	public void runLogin() {
		test.getLogin();
		test.getOneWay();
		test.selectPassengers();
		test.departureInfo();
		test.arrivingInfo();		
		test.getAirlineInfo();		
		test.selectFlight();		
		test.passInfo();
		test.passCCInfo();
		test.passBillingInfo();
		test.passShippingAddress();
		test.purchaseTicket();
		test.finalPrice();
	}

}
