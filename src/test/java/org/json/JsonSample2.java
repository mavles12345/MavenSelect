package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSample2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\new1.json"));
		
		JSONObject jsonobject=(JSONObject)obj;
		
		String name=(String)jsonobject.get("Coach");
		System.out.println(name);
		
		String age=(String)jsonobject.get("Captain");
		System.out.println(age);
		String city=(String)jsonobject.get("Manager");
		System.out.println(city);
		
		Map address=(Map)jsonobject.get("TeamPlayers");
		
		Set entrySet=address.entrySet();
		Iterator iterator=entrySet.iterator();
		while(iterator.hasNext()) {
			Object object=(Object)iterator.next();
			System.out.println(object);
			
		}
		
		
		
		
		/*String name1=(String)address.get("Name1");
		System.out.println(name1);
		String name2=(String)address.get("Name2");
		System.out.println(name1);
		String name3=(String)address.get("Name3");
		System.out.println(name1);*/
	}

}
