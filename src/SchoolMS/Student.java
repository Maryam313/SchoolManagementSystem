/**
 * 
 */
package SchoolMS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LAP-2
 *
 */
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//	int StudentID;
		//String StudentName;
		//String studentEmail;

		// Add some names in the list:
		ArrayList<String> Menu = new ArrayList<String>();
		Menu.add("1- Register Student:");
		Menu.add("2- Manage Student:");
		Menu.add("3- Hire Teacher:");
		Menu.add("3- Manage Teacher:");

		// See all the elements in the list:
		for (int index = 0; index < Menu.size(); index++) {
			System.out.println(Menu.get(index));
		}

		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		System.out.println("Please Select the number from the Menu:");
		// Create Requirnments variable
		int Requirnments = 0;

		// Do While loop
		do {
			Requirnments = input.nextInt();
			// SwitchCase
			switch (Requirnments) {
			case 1:
				System.out.print("Input the Id Number : ");
				int StudentID = input.nextInt();
				System.out.print("Input the Email: ");
				String studentEmail = input.nextLine();
				input.nextLine();
				System.out.print("Input the  Name : ");
				String StudentName = input.nextLine();
				
				// Create record object then I pass constructor
			case 2:
				System.out.print("Input the Id number : ");
				int rId = input.nextInt();

			case 4:
				System.out.print("Input thet Id number:  ");
				int Id = input.nextInt();
			break;
			default:

			}
		}
		// To Check
		while (Requirnments != 8);
	}

}
