package basicPracticeTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MySecondFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\Achfri\\eclipse-workspace\\Practice 8-25-2019\\src\\basicPracticeTwo\\MySecondFile");
		Scanner scan =new Scanner(file);
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());	
		}
	}

}
