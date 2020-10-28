package com.uhg.vijay.DashboardAndReportingDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uhg.vijay.DashboardAndReportingDemo.extentReportDemo.ExtentTestManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

@SpringBootTest
class DashboardAndReportingDemoApplicationTests {

	@Autowired
	ExtentTestManager test;

	@Test
	void contextLoads() {
	}

	@Given("I am writing a step")
	public void i_am_writing_a_step() {

		test.startTest("First Step");
		test.getTest().pass("My First Test is Passed");
	}

	@Then("Report should be generated")
	public void report_should_be_generated() {
		// Write code here that turns the phrase above into concrete actions
	
	}

}
