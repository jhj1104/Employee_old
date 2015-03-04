package webapp.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		
		Properties dbprop = new Properties();
		
		//FileInputStream inStream = new FileInputStream("db.properties");
		
		InputStream inStream = PropertiesTest.class.getResourceAsStream("/webapp/resource/db.properties");
		
		dbprop.load(inStream);
		
		String className = dbprop.getProperty("Oracle.className");
		String url = dbprop.getProperty("Oracle.url");
		String user = dbprop.getProperty("Oracle.user");
		String password = dbprop.getProperty("Oracle.password");
		
		System.out.println("className = " + className);
		System.out.println("url = " + url);
		System.out.println("user = " + user);
		System.out.println("password = " + password);

	}

}

