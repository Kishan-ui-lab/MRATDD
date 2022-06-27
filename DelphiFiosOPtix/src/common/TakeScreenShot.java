package common;

import jdk.javadoc.doclet.Reporter;
import java.io.File;


public class TakeScreenShot {
	
	private static String OS = null;
	private static String reportPath = null;
	
	
	public static String takeScreenshot(WebDriver driver,String msg) throws Exception {
		
		int i=2;
		String data_uri = null;
		
		try {
			
			data_uri = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			
			Reporter.log(msg + "<br>");
			Reporter.log("<img src=\"data:image/png;base64," + data_uri );
			
		}
		
		catch(Exception e) {
			
			Reporter.log(e.getMessage());
			
		}
		
		return data_uri;
	}

	
	public static String getOsName() {
		
		if(OS==null)
		{
		    OS = System.getProperty("os.name");
		}
		return  OS;
	}
	
	public static boolean isWindows() {
		
		return getOsName().startsWith("Windows");
	}
	
	public static String getReportPath() {
		
		
		String loclDir = System.getProperty("user.dir");
		
		if(isWindows()) {
			
			reportPath = loclDir + "\\target\\ExtentReport\\ScreenShots\\";
			
		} else {
			
			System.out.println("Local Directory is" + localDir);
			reportPath = loclDir + File.separator + "target" + File.separator
					      + "surefire-reports" + File.separator + "ExtentReport"
					      + File.separator;
			
		}
		
		return reportPath;
	}
	
	
}
