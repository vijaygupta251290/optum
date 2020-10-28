package com.uhg.vijay.DashboardAndReportingDemo.extentReportDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(TestListener.class)
public class ReportTest {

	@Test
	public void myFirstTest() {

		ExtentTestManager.getTest().createNode("This is a child test").log(Status.INFO, "info");

		System.out.println("Hi This is Vijay Gupta, i am writing my first test to see extent report");
	}

}
