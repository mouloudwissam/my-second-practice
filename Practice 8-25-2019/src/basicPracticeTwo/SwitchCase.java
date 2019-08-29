package basicPracticeTwo;

public class SwitchCase {
	public static void main(String[] args ) {
		int a = 7;
		int day=9;
		if (a==1) {
			System.out.println("Monday");
		}else if  (a==2) {
			System.out.println("Tuesday");
		}else if (a==3) {
			System.out.println("Wedensday");
		}else if (a==4) {
			System.out.println("Thursday");
		} else if (a==5) {
			System.out.println("Friday");
		}else if (a==6) {
			System.out.println("Saturday");
		}else if (a==7) {
			System.out.println("Sunday");
		} 
		// when we use switch we have to use  case and break 
		switch (day) {
		case 1:System.out.println("Monday1");
			break;
		case 2:System.out.println("Tuesday1");
		break;
		case 3:System.out.println("Wesdanday 1");
		break;

		case 4:System.out.println("Thursday1");
		break;
		case 5:System.out.println("Friday1");
		break;
		case 6:System.out.println("Saturday1");
		break;
		case 7:System.out.println("Sunday1");
		break;
default :
	System.out.println(" this is not one of days :");
		}
	}

}
