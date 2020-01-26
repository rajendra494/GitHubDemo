package com.Pproperties.scripts;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericLib {
	public static String getpropData(String key){
		String data=null;
		try{
			Properties prop= new Properties();
			FileInputStream fin= new FileInputStream("./SeleniumPropert.properties");
			prop.load(fin);
			 data= prop.getProperty(key);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}

}
