package basicPracticeTwo;

import java.util.HashMap;

public class HashMappone {

	public static void main(String[] args) {

		HashMap<String, String> happy = new HashMap<String, String>();
		happy.put("testuser1", "abcd1234");
		happy.put("testuser2", "qwert123");
		happy.put("testuser3", "khij12");
		happy.put("testuser23", "love1234");
		System.out.println(happy);
		System.out.println(happy.containsKey("testuser3"));
		System.out.println(happy.containsValue("testuser1"));
		System.out.println(happy.get("testuser23"));
		System.out.println(happy.get("abcd1234"));
		System.out.println(happy.replace("testuser2", "mouloud12"));
		System.out.println(happy);
		System.out.println(happy.size());
		System.out.println(happy.values());
		System.out.println(happy.keySet());
		System.out.println(happy.containsKey("mould123"));
		System.out.println(happy.containsValue("care"));
		System.out.println(happy.keySet());
		System.out.println(happy.values());
	}

}
