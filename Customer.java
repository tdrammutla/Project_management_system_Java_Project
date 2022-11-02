/*
 Customer class
 */

/**
 *
 * @author RammutlaT
 */
public class Customer
{
    //Customer class definition
    
    //Properties of Customer class
    String name;
    String surname;
    String telephone_number;
    String email_address;
    String physical_address;
    
    public Customer(String name,String surname,String telephone_number,String email_address,String physical_address )
    {
        //Customer class 's constructor initialising class properties
    this.name = name;
    this.surname = surname;
    this.telephone_number = telephone_number;
    this.email_address = email_address;
    this.physical_address = physical_address;   
    
    }
    
    public String toString()
    {
        //toString methods to display object 's data
        
        String customer = "\nCustomer name : " + name
                + "\nCustomer surname : " + surname
                + "\nCustomer telephone number : " + telephone_number
                + "\nCustomer email_address : " + email_address
                + "\nCustomer physical_address : " + physical_address + "\n";;
        
        return customer;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
}
