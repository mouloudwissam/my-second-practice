package basicPracticeTwo;

public class Methods {
	public static void main(String[] args) {
		additions(12, 13);
		happybirthday();
		additions(3, 5);
		additions(31, 5);
		happybirthday();
		multiply(12, 34);
		multiply(3, 5);
		happybirthday();
		multiply(7, 4);
		multiply(5, 45);
		happybirthday();
	}

	public static void happybirthday() {
		System.out.println("HAPPY BIRTHDAY MY WIFE");
	}

	public static void additions(int a, int b) {
		System.out.println(a + b);
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

}
