package basicPracticeTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFirstFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		File file = new File("C:\\Users\\Achfri\\eclipse-workspace\\Practice 8-25-2019\\src\\basicPracticeTwo\\MyFirstFile");
		Scanner scanner = new Scanner(file);
		// System.out.println(scanner.nextLine());
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

	}

}
