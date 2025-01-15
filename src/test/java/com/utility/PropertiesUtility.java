package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	
	public static String getData(String key) throws IOException {
		
		//create file class object
		
		File file = new File("C:\\Users\\FU212CPA\\Desktop\\textdata.properties");
		
		//create fileReader class object
		
		FileReader reader = new FileReader(file); 
		
		//properties class object
		
		Properties prop =new Properties();
		
		//load properties file
		
		prop.load(reader);
		
		//call getValue()
		
	return	(String) prop.get(key);
	}
}
