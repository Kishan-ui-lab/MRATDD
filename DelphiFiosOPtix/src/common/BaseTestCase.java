/*package common;

public class BaseTestCase {
	
	
	Public webdriver driver;
	HelperFunctions helper = new HelperFunctions();
	public Utilities utility;
	
	  Public final string environment = system.getproperty("env","DMLFAKEUAT");
	  Public final string applpropfilepath = "application.properities";
	  public String url = null;


	system.setproperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
	String host = system.getproperty("user.name");
	Chromeoptions options = new chromeoptions();
	   
	driver.manage().window().maximize();
	driver.manage().window().maximize();

	switch(environment) {

	 Case "DMLFAKEUAT" :
	    Url = utilities.getDataFromProp(applPropFilePath,"DML_FAKE_UAT");
	    Sop("url is ..............................................." + url);
	    break;

	Case "DMLFAKEUATPAM" :
	    Url = utilities.getDataFromProp(applPropFilePath,"DML_FAKE_UAT_PAM");
	    Sop("url is ..............................................." + url);
	    break;
	}
	
	default:
		PrintUtility.debug("Please specify any one of the Environment(UAT/PROD/PILOT)");
		break;
}


if(url !=null && environment.equals("DMLFAKEUAT")) {
	driver.get(url);
	driver.get(url);
	
}

else if (url !=null && environment.equals("DMLFAKEUATPAM")) {
	driver.get(url);
	
}


	Public void closeBrowser() {
	   
	  driver.quit();

	}

}*/
