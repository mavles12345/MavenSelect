package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser jsonparser=new JSONParser();
		
		//Object obj=JSONparser.parse(new FileReader(System.getProperty("user.dir")+"C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\new.json"));
		Object obj=jsonparser.parse(new FileReader("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\new.json"));
		
		JSONObject jsonobject=(JSONObject)obj;
		
		String name=(String)jsonobject.get("name");
		System.out.println(name);
		
		String age=(String)jsonobject.get("age");
		System.out.println(age);
		
		String city=(String)jsonobject.get("city");
		System.out.println(city);
		
	}

}
