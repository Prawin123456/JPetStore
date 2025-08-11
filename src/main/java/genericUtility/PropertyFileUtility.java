package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	
	public String toReadDataFromPropertyfile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\JPetStore_demo\\property.properties");
		Properties prop=new Properties();
		prop.load(fis);

		
    	String value = prop.getProperty(key);
    	return value;
	
		
	}

}
