package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesReader {
	
	public static Properties property;
	
	static {
		
		File file = new File("./src/test/resources/testData/env_variables.properties");
		try {
			FileInputStream input = new FileInputStream(file);
			property = new Properties();
			property.load(input);
			input.close();
			
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
	public static String getProperty(String key){
		
		return property.getProperty(key);
	}
	
}
