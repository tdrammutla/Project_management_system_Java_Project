/*
Architect class
 */

/**
 *
 * @author RammutlaT
 */
public class Architect 
{
    //Architect class definition
    
    //Properties of Architect class
    String name;
    String surname;
    String telephone_number;
    String email_address;
    String physical_address;
    
    
    public Architect(String name,String surname,String telephone_number,String email_address,String physical_address )
    {
        //Architect class 's constructor initialising class properties
        
        this.name = name;
        this.surname = surname;
        this.telephone_number = telephone_number;
        this.email_address = email_address;
        this.physical_address = physical_address;   
    
    }    
    
       public String toString()
    {
        //toString methods to display object 's data
        
        String customer = "\nArchitect name : " + name
                + "\nArchitect surname : " + surname
                + "\nArchitect telephone number : " + telephone_number
                + "\nArchitect email_address : "  + email_address
                + "\nArchitect physical_address : " + physical_address + "\n";
        return customer;
    } 
}
