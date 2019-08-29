package basicPracticeTwo;

import java.util.ArrayList;

public class ArryList {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(" mouloud");
		arraylist.add("hassan");
		arraylist.add("jamal");
		arraylist.add("Mohammed");
		arraylist.add("mhened");
		arraylist.remove(0);
		System.out.println(arraylist.contains("jamal"));
		System.out.println(arraylist.size());

		System.out.println(arraylist);
	}

}
