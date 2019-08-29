package basicPracticeTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowToReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Achfri\\eclipse-workspace\\Practice 8-25-2019\\src\\basicPracticeTwo\\MyFirstFile");
		Scanner scan1 = new Scanner(file);
		//Scanner scan = new Scanner(source);
		System.out.println(scan1.hasNextLine());

	}
}
