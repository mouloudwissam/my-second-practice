package basicPracticeTwo;

import java.util.jar.Attributes.Name;

public class ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// it happened inide of method.
		preintAMessage();
		int sum = name(3, 4);
		System.out.println(sum);
		int divid = Divison(5, 8);
		System.out.println(divid);
		Mouloud();
		System.out.println(" Mouloud is my Man");
		String hand = JAMAL("THE Best is  TO PLAY FOOTBALL");
		System.out.println(hand);
	}

	public static void preintAMessage() {
		System.out.println(" this is our first method :");

	}

	public static int name(int a, int b) {
		return a + b;

	}

	public static int Divison(int c, int f) {
		return c * f;
	}

	public static void Mouloud() {
		return;
	}

	public static String JAMAL(String B) {
		return B.toLowerCase();
		
    //
	}

	
	}


