/**
 * 
 */
package SMS_Classes;

import java.util.Scanner;

/**
 * @author LAP-2
 *
 */
public class StudentRecord {

	/**
	 * 
	 */
	public StudentRecord() {
	}

	public class StudentRecordLinkedList {
		 
	   
   public static void main(String[] args){
	 
	        // Creating  Object.
	        StudentRecord sr= new StudentRecord();
	        Record record = new Record();
	        
	         // Calling add() record method to
	        sr.add(record);
	 
	        // Create Scanner Object 
	        Scanner input = new Scanner(System.in);
	 
	        // Create Requirnments  variable
	        int Requirnments = 0;
	 
	        // Do While loop
	        	do {
	            menu();
	            Requirnments = input.nextInt();
	 
	            // SwitchCase
	            switch (Requirnments) {
	            case 1:
	                System.out.print("Input the Id Number : ");
	                int idNumber = input.nextInt();
	 
	                System.out.print( "Input the Email: ");
	                String Email = input.nextLine();
	                input.nextLine();
	 
	                System.out.print("Input the  Name : ");
	                String name = input.nextLine();
	 
	                // Create record object then I pass constructor
	              record = new Record(name, idNumber,Email);
	              
	                // Call add() record
	                sr.add(record);
	                System.out.println(record.toString());
	                break;
	 
	            	case 2:
	            	System.out.print( "Input the Id number : ");
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
	    
	    public static void menu() {
	    	// Print menu 
	        System.out.println("MENU");
	        System.out.println("1: Add Student");
	        System.out.println("2: Manage Student");
	        System.out.println("3: Delete Student");
	
	    }
	}

	public void add(Record record) {

		
	}
	public boolean find(int Id) {
		return false;
	}


	}