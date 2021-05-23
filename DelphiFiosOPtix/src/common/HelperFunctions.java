/*package common;

import java.util.List;

import org.testng.Assert;

// findWebElementAssert is used to poll the GUI until the element is found with the time specified.

public class HelperFunctions {
	
	 WebDriver driver;


	 Public WebElement findWebElementAssert(WebDriver driver,WebElement element, int timeOut) {
	  
	    WebElement webelement = null;
	    int attempts = 0;
	    
	    while(attempts < 1 ) {
	     
	           try {
	             webDriverWait wait = new WebDriverWait(driver, timeOut);
	             Webelement = wait.until(ExpectedConditions.visibilityOf(element));
	              if (webelement !=null) {
	 		  scrollTo(driver, element);
	                   break;
	 		}
	     
	               } catch(Exception e) {
	                   attempts++;
	                   PrintUtility.debug("Re-trying attempt : "+attempts+" to find " +element);
	                 }

	 }
	    if(webelement==null) {
	    	
	    	Assert.fail(+element+ "Not found in:" + timeOut + "Seconds, update webelement if this is a testcase/script issue or if this is a bonita issue");
	 }
	    return webelement;

	 }
	 
	 
	 Public List<WebElement> findElements(WebDriver driver,String locator, String elementValue, int timeOut) {
	 
	List<WebElement> webElement = new ArrayList<WebElement>();
	try {
		
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		
		switch(locator.toUpperCase()) {
		
		case "ID" :
			webElement = wait.until(ExpectedConditions.presenceofAllElementsLocatedBy(By.id(elementValue)));
			break;
			
		case "XPATH" :
			webElement = wait.until(ExpectedConditions.presenceofAllElementsLocatedBy(By.xpath(elementValue)));
			break;
			
		}
	}catch (Exception e) {
		
		PrintUtility.debug("====>>>"  + elementValue + "Not Found in:" + timeOut + "seconds,please check the webelement");
		
	}
		return webElement; 
	 }
	 
	 
	 public void pause(int timeInSec) {
		 
		 try {
			 
			 Thread.sleep(1000*timeInSec);
		 }
		 catch(InteruptedException e) {
			 
		 }
	 }
	 
	 public void scrollTo(WebDriver driver,WebElement element) {
		 
		 try {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript(element);
			 
		 } catch(WebDriverException e) {
			 Assert.fail(e.getMessage());
		 }
	 }
	 
public void javascriptClick(WebDriver driver,WebElement element,int timeOut) {
		 
		 try {
			 
			 WebDriverWait wait = new WebDriverWait(driver,timeOut);
			 WebElement el = wait.until(ExpectedConditions.visibilityOf(element));
			 scrollTo(driver,element);
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
			 
		 }catch(Exception e) {
			 Assert.fail("======>>>"+ element + "not found in :" + timeOut + "seconds,please check the webelement====<<<<<");
			 
		 }
}

public void waitForAlertAndAccept(WebDriver driver) {
	
	try {
		
		WebDriverWait  wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		PrintUtility.debug("Alert accepted successfully");
	}
	catch(NoAlertPresentException e) {
		PrintUtility.debug("");
		Assert.fail("no alert present to accept");
		
		e.printStackTrace();
	}
}

public void channelHasPixelizationButtonClick()  {
	
	List<WebElement> chnlhaspixelizationElements = findElements(driver,"id",chnlhaspixelizationBtn,30);
	int chnlhaspixelizationBtnSize = chnlhaspixelizationElements.size();
	scrollTo(driver,chnlhaspixelizationElements.get(chnlhaspixelizationBtnSize-1));
	javascriptClick(driver,chnlhaspixelizationElements.get(chnlhaspixelizationBtnSize-1),30);
	PrintUtility.debug("In Manual Task Sucessfully clicked on 'channel has pixelization");
}


}*/
