package pack;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteCustomerList {

	public static void main(String[] args) throws IOException {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ID number.");
		String IDNumber = input.nextLine();
		System.out.println("Enter the First name.");
		String fname = input.nextLine();
		System.out.println("Enter the Last name.");
		String lname = input.nextLine();
		System.out.println("Enter the owed balance.");
		int balance = input.nextInt();
		File file = new File("./customer.txt"); 
		FileWriter fw = new FileWriter(file, true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write("ID:" + IDNumber + "\nFName:" + fname + "\nlName:" + lname + "\nbalance:" + balance);
	    bw.close();
	}

}
