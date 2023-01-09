/**
 * 
 */
package SMS_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author LAP-2
 *
 */
public class MainApp {


	static LinkedList<Record> list = new LinkedList<Record>();

	// Default Constructor
	// list = new LinkedList<Record>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		File dataStore = new File(MainApp.DATA_FILE_PATH);
		Scanner input = new Scanner(new InputStreamReader(System.in));
		// Creating Object.
		MainApp sr = new MainApp();
		Record record = new Record();

		// Calling add() record
		sr.add(record);
		// Reload all records here
		ObjectInputStream ois =null;
		ObjectOutputStream oos=null;
				try {
		            if (dataStore.exists()) {
		            	Scanner inputScanner = new Scanner(dataStore);
		                while(inputScanner.hasNextLine())
		                {
		                	ois=new ObjectInputStream(new FileInputStream(dataStore));
		                	list=(LinkedList<Record>)ois.readObject();
		                	ois.close();
		                	//String[] data = inputScanner.nextLine().split(",");
		                	// int idNumber = Integer.parseInt(data[0]);
		                	// String name =data[1];
		                	// String Email =data[2];
		                	//Record r1=new Record(DATA_FILE_PATH, 0, DATA_FILE_PATH);
		                   
		                    //list.add(r1);
		}
		            
		 inputScanner.close();
		}}catch (IOException e) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				
				
		// Create Requirnments variable
		int Requirnments = 0;

		// Do While loop
		do {
			menu();
			Requirnments = Integer.parseInt(input.nextLine());
			// SwitchCase
			switch (Requirnments) {
			//case 1 for adding
			case 1:
				System.out.print("Input the Id Number:");
				int idNumber = Integer.parseInt(input.nextLine());

				System.out.print("Input the  Name:");
				String name = input.nextLine();

				System.out.print("Input the Email:");
				String Email = input.nextLine();

				// Create record object then I pass constructor
				record = new Record(name, idNumber, Email);
				list.add(record);
				// Call add() record
				//sr.add(record);
				//list.add(new Record ());
				System.out.println(record.toString());
				
				try (FileWriter fw = new FileWriter(dataStore, true)){
					fw.write(idNumber + "," + name + "," + Email + "," + "\n");
					// input.close();


				} catch (IOException e) {
					e.printStackTrace();
				} 

				break;

				//case 2 for searching
			case 2:
				System.out.print("Input the Id number : ");
				int sId =  Integer.parseInt(input.nextLine());
				if (!sr.find(sId))
					System.out.println("Student id does not exist\n");

				try {
					FileWriter fw = new FileWriter(dataStore, true);
					fw.write(sId);
					// input.close();
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

				break;
				
				//case 3 for deleting
			case 3:
				System.out.print("Input Student id number : ");
				int sId1 =  Integer.parseInt(input.nextLine());

				// delete record
				sr.delete(sId1);
				try (FileWriter fw = new FileWriter(dataStore, true)){
					fw.write(sId1);
					// input.close();
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
				
				//case 4 for updating
			case 4:
				System.out.print("Input Student id number:");

				int rIdNo =Integer.parseInt(input.nextLine());
				sr.update(rIdNo, input);
				//File dataStore = new File(MainApp.DATA_FILE_PATH);

				try (FileWriter fw = new FileWriter(dataStore, true)){
					//fw.write(idNumber + "," + name + "," + Email + "," + "\n");
					// input.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			default:

			}
		}

		// To Check
		while (Requirnments != 8);
	}

	public static void menu() {
		// Print the menu
		System.out.println("MENU");
		System.out.println("1: Add Student");
		System.out.println("2: search Student");
		System.out.println("3: Delete Student");
		System.out.println("4: Update Student");

	}

	// Adding Record
	public void add(Record record) {
		if (!find(record.getIdNumber())) {
			list.add(record);
		} else {
			System.out.println("Record already exists in the Record list");
		}

	}

	// Searching for the record
	// @param idNumber
	public boolean find(int idNumber) {

		// using for each loop
		for (Record lst : list) {
			// Checking record by id Number
			if (lst.getIdNumber() == idNumber) {
				System.out.println(lst);
				return true;
			}
		}
		return false;
	}

	public Record findRecord(int idNumber) {

		// using for each loop
		for (Record lst : list) {

			// Checking record by id Number.
			if (lst.getIdNumber() == idNumber) {
				return lst;
			}
		}
		return null;

	}

	// delete>>
	public void delete(int recIdNumber) {
		Record recordDel = null;

		// Iterating record list
		for (Record ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recIdNumber) {
				recordDel = ll;
			}
		}

		if (recordDel == null) {
			System.out.println("Invalid  Id");
		} else {
			list.remove(recordDel);
			System.out.println("Successfully removed !");
		}
	}

	// update>>
	public void update(int id, Scanner input) {

		if (find(id)) {
			Record rec = findRecord(id);

			// Display message only
			System.out.print("Input new Student id Number: ");
			int idNumber =  Integer.parseInt(input.nextLine());

			// Display message only
			System.out.print("Input new Student Email: ");
			String Email = input.nextLine();

			System.out.print("Input new Student Name :");
			String name = input.nextLine();

			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setEmail(Email);
			File dataStore = new File(MainApp.DATA_FILE_PATH);

			try (FileWriter fw = new FileWriter(dataStore, true)){
				fw.write(idNumber + "," + name + "," + Email + "," + "\n");
				// input.close();
				//fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(" Updated Successfully");
		} else {
			System.out.println("Record Not Found!!");
		}

	}

	public static final String DATA_FILE_PATH = "studentdata/data14.csv";

}
