/*package common;

import java.text.SimpleDateFormat;

public class TestNGCustomListener implements ITestListener  {
	
	
	private int m_count = 0;
	private String testResult;
	private String errorMessage = "No Error Reported";
	private String testCaseId;
	private String jiraTestCaseId;
	private String filename;
	private WebDriver driver;
	
	
	
	public static String mobilityPlatformInstanceValue = System.getProperty("mobilityPlatform");
	
	private static String  transactionId = System.getProperty("transactionId");
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
	private static Response response = null;
	
	public static String appPropFilePath = "application.properities";
	
	public  long testStartTime;
	public long testEndTime;
	
	
	@Override
	@Parameters({"username", "password","env"})
     public void onTestStart(ITestResult result) {
		
		PrintUtility.debug(result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		
		log(tr.getName() + "-- Test method failed\n");
		
		testCaseId = (String) tr.getTestContext().getAttribute("testCaseName");
		
		driver = (WebDriver) tr.getTestContext().getAttribute("driver");
		
		if(testCaseId!=null) {
			
			jiraTestCaseId = (String)tr.getTestContext().getAttribute("jiraTestCaseId");
			filename = (String)tr.getTestContext().getAttribute("filename");
			testResult = "FAILED";
			
			Throwable throwable = tr.getThrowable();
			
			errorMessage = throwable.getMessage();
			
			testStartTime = tr.getStartMillis();
			
			testEndTime = tr.getEndMillis();
			
			
			testLogger(testCaseID,JiraTestCaseId, testResult,filename);
			
			PrintUtility.failed(driver,"Test Case failed" + testCaseId + "Jira TC ID " + jiraTestCaseId + "Filename" + filename);
		}
		
		
		@Override
		public void onTestSkipped(ITestResult tr) {
			
			log(tr.getName() + "----Test method skipped\n");
			
			testStartTime = tr.getStartMillis();
			testEndTime = tr.getEndMillis();
			testCaseId = (String)tr.getTestContext().getAttribute("testCaseName");
			if(testCaseId != null) {
				
				jiraTestCaseId = (String tr.getTestContext().getAttribute(
						"jiraTestCaseId");
				
				filename = (String)tr.getTestContext().getAttribute("filename");
				testResult = "SKIPPED";
				testLogger(testCaseId,jiraTestCaseId, testResult,filename);
				
				PrintUtility.debug("Test Case Skipped " +testCaseId + "Jira TC ID:" + jiraTestCaseId + "Filename : "+ filename);
				
			}
		}
			
		@Override
		public void onTestSuccess(ITestResult tr) {
			
			log(tr.getName() + "----Test method success\n");
			
			testStartTime = tr.getStartMillis();
			testEndTime = tr.getEndMillis();
			
			testCaseId = (String)tr.getTestContext().getAttribute("testCaseName");
			
			if(testCaseId != null) {
				
				jiraTestCaseId = (String)tr.getTestContext().getAttribute(
						"jiraTestCaseId");
				
				filename = (String)tr.getTestContext().getAttribute("filename");
				testResult = "PASSED";
				testLogger(testCaseId,jiraTestCaseId, testResult,filename);
				
		driver = (WebDriver) tr.getTestContext().getAttribute("driver");
		
				
				PrintUtility.tc_passed(driver,"Test Case Passed" +testCaseId + "Jira TC ID:" + jiraTestCaseId + "Filename : "+ filename);
				
			}
			
		}
			
		}
		
	}
	

}*/
