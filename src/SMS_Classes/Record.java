package SMS_Classes;

//Importing  classes
import java.util.LinkedList;
import java.util.Scanner;

public class Record {
 
    // The  variables
    private String name;
    private int idNumber;
    private String Email;
 
    // Default Constructor
    public Record() {}
 
    //  Constructor
    //  name
    //  idNumber
    //  Email
    public Record(String name, int idNumber,String Email)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.Email = Email;
    }
 
    // Getting the value of Email
    public String getEmail() { 
    return Email;
    }
 
    // Set the value of Email
    
    public void setEmail(String Email){
    this.Email = Email;
    }
 
 
    public int getIdNumber() {
    return idNumber; }
 
    // Setting the value of idNumber

    public void setIdNumber(int idNumber2){
    this.idNumber = idNumber2;
    }
 
    // Getting the value of name
  
    	public String getName() {
    	return name; }
 
    // Setting the value of name
 
    public void setName(String name) { 
    this.name = name; }
 
    // toString() Method
    
    @Override
    public String toString()
    {
 
        // Return the record
        return "The Records{"
            + "name=" + name + ", IdNumber=" + idNumber+ "Email=" + Email + '}';
    }
}