package basicPracticeTwo;

public class StringMethods {
	public static void main(String[] args ) {
		String lastName= " jamal de mouloud and de mohamed";
	long phoneNumber= 6463555354l;
	int intNmber =1234;
	int vive= 12;
		System.out.println(" the lastname :"+lastName.charAt(5));
		System.out.println("the lenght of name :"+ lastName.length());
		 System.out.println("the uppercase of last name:"+ lastName.toUpperCase() );
		 System.out.println("the lowercase of the name:"+ lastName.toLowerCase());
		 System.out.println(" the substring of the name:"+ lastName.substring(5, 11));
		 System.out.println(" the firsy Nmuber on My Phone:"+ phoneNumber);
		 System.out.println("the int Nmber is " + intNmber);
		 System.out.println("the upercase for intname: "+ intNmber * (vive));
	}
}
