package basicPracticeTwo;

import java.util.HashMap;

public class HashMapptwo {

	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("vvvvv", "12345ter");
		hash.put("babe123", "vave12");
		hash.put("dadmom1", " 12345jamal");
		hash.put("jamalzxc", "vivemaroc12");
		
		System.out.println(hash);
		System.out.println(hash.get("vvvvv"));
		System.out.println(hash.size());
		System.out.println(hash.replace("dadmom1", "yessss"));
		System.out.println(hash);
		System.out.println(hash.containsKey("babe123"));
		System.out.println(hash.containsValue("cash12"));
		System.out.println(hash.values());
		System.out.println(hash.keySet());
		
	}

}
