package org.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonRead {

	public static void main(String[] args) throws FileNotFoundException {

		JSONObject jsonobject = new JSONObject();

		jsonobject.put("Team1", "Cricket");
		jsonobject.put("Team2", "FootBall");
		jsonobject.put("Team3", "Hockey3");

		Map m = new LinkedHashMap();
		m.put("player1", "selvam");
		m.put("player2", "Karthik");
		m.put("player3", "Guru");
		m.put("player4", "Dinesh");
		m.put("player5", "Prakash");

		jsonobject.put("player", m);

		JSONArray array = new JSONArray();
		Map m1 = new LinkedHashMap();
		m1.put("cricket", "Captain:Selvam");

		Map m2 = new LinkedHashMap();
		m2.put("Football", "Sasi");

		array.add(m1);
		array.add(m2);

		jsonobject.put("captain", array);
		PrintWriter write = new PrintWriter(
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\cricket.json");

		write.write(jsonobject.toJSONString());
		write.flush();

	}

}
