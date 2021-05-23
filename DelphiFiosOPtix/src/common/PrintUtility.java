/*package common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import jdk.javadoc.doclet.Reporter;

public class PrintUtility {
	
	final static Logger logger = Logger.getLogger(PrintUtility.class);
	
	
	public static void debug_ss(WebDriver driver,String msg) {
		
		try {
			
			TakeScreenShot.takeScreenshot(driver,msg);
			
			Reporter.log(msg);
			logger.info(msg);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void takeScreenShot(WebDriver driver,String msg) throws Exception {
		
		TakeScreenShot.takeScreenshot(driver,msg); // takes screenshot
		Reporter.log(msg + "<br");
		logger.info(msg);
		
	}
	
	public static void failed(String  msg)
	{
		Reporter.log(msg);
		logger.error(msg + " \n is failed \n");
	}

	public static void passed(WebDriver driver,String  msg)
	{
		Reporter.log(msg);
		takeScreenShort(driver,msg);
		logger.debug(msg + " \n is passed \n");
	}
	
	public static void failed(WebDriver driver,String  msg)
	{
		Reporter.log(msg);
		takeScreenShort(driver,msg);
		logger.error(msg + " \n is passed \n");
	}
	
	public static String getCurrentDateTime() {
		
		String reportDate = null;
		DateFormat df = new SimpleDateFormat("MMddyyyy-HHmmssSSS");
		Date today = Calendar.getInstance().getTime();
		reportDate = df.format(today);
		return reportDate;
	}
	
	public static void takeScreenShort(WebDriver driver, String msg) {
		String data_uri = null;
		try {
			data_uri = TakeScreenShot.takeScreenshot(driver,msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}*/
