/*
Contractor Class
 */

/**
 *
 * @author RammutlaT
 */
public class Contractor 
{
    //Contractor class definition
    
    //Properties of Contractor class
    String name;
    String surname;
    String telephone_number;
    String email_address;
    String physical_address;
    
    public Contractor(String name,String surname,String telephone_number,String email_address,String physical_address )
    {
        //Contractor class 's constructor initialising class properties
        
        this.name = name;
        this.surname = surname;
        this.telephone_number = telephone_number;
        this.email_address = email_address;
        this.physical_address = physical_address;   
    
    }
    
        public String toString()
    {
        //toString methods to display object 's data
        
        String customer = "\nContractor name : " + name
                + "\nContractor surname : " + surname
                + "\nContractor telephone number : " + telephone_number
                + "\nContractor email_address : " + email_address
                + "\nContractor physical_address : " + physical_address + "\n";;
        
        return customer;
    }
    
    
}
