package com.Pproperties.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	static{
		System.setProperty(GenericLib.getpropData("BrowserKey"), GenericLib.getpropData("Browser_Path"));
	}
	
	@Test
	public void tc_01(){
		WebDriver driver= new ChromeDriver();
		driver.get(GenericLib.getpropData("URL"));
	}

}
