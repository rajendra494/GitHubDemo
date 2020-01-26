package com.Pproperties.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoPrperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fin= new FileInputStream("./SeleniumPropert.properties");
		prop.load(fin);
		String data= prop.getProperty("BrowserKey");
		System.out.println(data);
		
		String data1= prop.getProperty("URL");
		System.out.println(data1);

	}

}
