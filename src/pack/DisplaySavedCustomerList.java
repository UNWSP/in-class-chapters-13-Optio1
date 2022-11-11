package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySavedCustomerList {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./customer.txt");
		Scanner myReader = new Scanner(file);
		while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
		

	}

}
