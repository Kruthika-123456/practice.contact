package com.comcast.crm.listenerutility;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;

public class Listimpclass implements ITestListener,ISuiteListener{
	
	public ExtentReports report;
	public static ExtentTest test;
	

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
				System.out.println("Report Confifguration");
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM Test Suite Results");
				spark.config().setReportName("CRM Report");
				spark.config().setTheme(Theme.DARK);
				
				//add ENV information and create test
				report=new ExtentReports();
				report.attachReporter(spark);
				report.setSystemInfo("OS", "Windows-10");
				report.setSystemInfo("BROWSER", "CHROME-100");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Report backup");
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("====== ===========>"+result.getMethod().getMethodName()+">===START===");
		test=report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		test.log(Status.INFO,result.getMethod().getMethodName()+"==> STARTED <==");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("===== ===>"+result.getMethod().getMethodName()+">===END===");
		test.log(Status.PASS,result.getMethod().getMethodName()+"====>COMPLETED<====");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		/*
		 * // TODO Auto-generated method stub String
		 * testName=result.getMethod().getMethodName(); TakesScreenshot
		 * eDriver=(TakesScreenshot)Basetest.sdriver; String
		 * filepath=eDriver.getScreenshotAs(OutputType.BASE64);
		 * 
		 * String time=new Date(0).toString().replace(" ","_").replace(":", "_");
		 * test.addScreenCaptureFromBase64String(filepath,testName+"_"+time);
		 * ITestListener.super.onTestFailure(result);
		 */
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	
	
	
	
	
	
	

}
