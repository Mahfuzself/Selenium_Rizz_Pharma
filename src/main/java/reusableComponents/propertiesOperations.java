package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import io.opentelemetry.api.internal.StringUtils;

public class propertiesOperations {
	static Properties  prop = new Properties();
  public static String getPropertyValueByKey(String key) throws Exception {
	  //load data from properties file
	  //Localization
	  String propertiesFilePathString = System.getProperty("user.dir")+"/src/test/resource/config.properties";
	  FileInputStream fis = new FileInputStream(propertiesFilePathString);
	  prop.load(fis);
	  //read value
	  String value = prop.get(key).toString();
	  if(value.isEmpty()) {
		  throw new Exception("Value is not specified for key : " +key+ "in properties file");
	  }
	  return value;
  }
}
