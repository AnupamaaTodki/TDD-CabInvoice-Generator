package com.cabinvoicegen;

import org.junit.Test;

import junit.framework.Assert;

public class CabInvoiceTest {

	@Test
	public void givenDistanceAndTimeCalculateFare() {
	CabInvoiceMain cab = new CabInvoiceMain();
	double fare = cab.calculateFare(5,20);
	Assert.assertEquals(70.0, fare);
	}

}
