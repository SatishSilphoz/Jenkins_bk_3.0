//package com.Capium.Utilies;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.ExtentPdfReporter;
//import org.testng.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Properties;
//
//public class TestSuiteListeners implements ITestListener {
//
//	private static ExtentReports extent;
//	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//
//	@Override
//	public void onStart(ITestContext context) {
//		try {
//			extent = new ExtentReports();
//			Properties props = new Properties();
//			props.load(getClass().getClassLoader().getResourceAsStream("extent.properties"));
//
//			if (Boolean.parseBoolean(props.getProperty("extent.reporter.spark.start"))) {
//				String path = props.getProperty("extent.reporter.spark.out", "Reports/Spark.html");
//				ExtentSparkReporter spark = new ExtentSparkReporter(path);
//				spark.config().setTheme(Theme.STANDARD);
//				spark.config().setDocumentTitle("Automation Report");
//				spark.config().setReportName("TestNG Execution Report");
//				extent.attachReporter(spark);
//			}
//
//			if (Boolean.parseBoolean(props.getProperty("extent.reporter.pdf.start"))) {
//				String pdfPath = props.getProperty("extent.reporter.pdf.out", "PDFReport/ExtentPDF.pdf");
//				ExtentPdfReporter pdf = new ExtentPdfReporter(pdfPath);
//				extent.attachReporter(pdf);
//			}
//
//			extent.setSystemInfo("OS", props.getProperty("systeminfo.os", "unknown"));
//			extent.setSystemInfo("Engineer", props.getProperty("systeminfo.Engineer", "unknown"));
//			extent.setSystemInfo("Project", props.getProperty("systeminfo.Project", "unknown"));
//			extent.setSystemInfo("Browser", props.getProperty("systeminfo.Browser", "unknown"));
//
//		} catch (IOException e) {
//			throw new RuntimeException("Could not load extent.properties", e);
//		}
//	}
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
//		test.set(extentTest);
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		test.get().pass("Test Passed");
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		test.get().fail(result.getThrowable());
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		test.get().skip(result.getThrowable());
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		extent.flush();
//	}
//}
