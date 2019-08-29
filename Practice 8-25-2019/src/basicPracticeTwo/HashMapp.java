package basicPracticeTwo;

import java.util.HashMap;

public class HashMapp {
public static void main(String[] args) {
	int aa=12;
	int www=1;
	int ere=14;
	int jjj=42;
	HashMap<String, Integer> hashmapp =new HashMap<String, Integer>();
	hashmapp.put("aa", 12);
	hashmapp.put("www", 1);
	hashmapp.put("ere", 14);
	hashmapp.put("jjj", 42);
	System.out.println(hashmapp);
	System.out.println(hashmapp.get("www"));
	System.out.println(hashmapp.getOrDefault("xx", 12));
	System.out.println(hashmapp.get("jjj"));
	
}



}
