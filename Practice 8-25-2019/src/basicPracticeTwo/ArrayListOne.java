package basicPracticeTwo;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Oussama");
		arraylist.size();
		arraylist.contains("jamal");
		arraylist.add("hassan");
		System.out.println(arraylist);
		System.out.println(arraylist);
		try {
			System.out.println(arraylist.get(1));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(" yes ");
		}

	}

}
