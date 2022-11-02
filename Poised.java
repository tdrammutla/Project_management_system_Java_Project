/*
Project management system for a small structural engineering firm to keep track of the many projects on which they work
 */
import java.util.*;
/**
 *
 * @author RammutlaT
 */
public class Poised 
//Class definition
{ 
    //Properties of the class 
    
    Project project_details;
    Architect achitect;
    Contractor contractor;
    Customer customer;

      
    public Poised(Project project_details,Architect achitect,Contractor contractor,Customer customer)
    {
       //  Poised Class Constructor
        
        // Properties of Poised class
        this.project_details = project_details;
        this.achitect = achitect;
        this.contractor = contractor;
        this.customer = customer ;       

    }
    
    public Architect getArchitect()
    {   // returns achitecture object
        return this.achitect;  
    }
    
    public Customer getCustomer()
    {   // returns customer object
        return this.customer;  
    } 
    
        public Contractor getContractor()
    {   // returns Contracter object
        return this.contractor;  
    }
        
    public Project getProject_Details()
    {   // returns Project object
        return this.project_details;  
    }  
    
    public static void main(String [] args)
    {
      // main method of the class
        
        // Creating necessary objects of classes i created

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the project number : ");
        int project_no = scanner.nextInt();
        System.out.print("Enter the project name : ");
        String project_name = scanner.next();
        System.out.print("What type of building is being designed ? \n(House/apartment block/store etc): ");
        String building_type = scanner.next();
        System.out.print("What is the physical address for the project. : ");
        String physical_address = scanner.next();
        System.out.print("What is the ErfNo : ");
        String erf_no = scanner.next();
        System.out.print("What is the total fee being charged for the project? (Do not input currency symbol !!) : ");
        double project_total_fee = scanner.nextDouble();
        System.out.print("What is the total amount paid to date?(Do not input currency symbol !!) : ");
        double total_paid = scanner.nextDouble();
        System.out.print("What is the deadline for the project (dd Mon yyyy) : ");
        String project_deadline = scanner.next();        

        Project project1 = new Project(project_no,project_name,building_type,physical_address,erf_no,project_total_fee,total_paid,project_deadline);
        Customer paul = new Customer("Tebogo","Rammutla","015 564 3456","tebza@hotmail.com","23 Vilakazi Street,Soweto,Johannesburg");
        Architect jones = new Architect("Jones","Makgoka","012 564 3456","jonesM@yahoo.com","34 Mole Street,Montana,Pretoria");
        Contractor sara = new Contractor("Sara","Bartman","041 564 3456","sara.bartman@hotmail.com","11 Seapoint Street,Summerstrand,Port Elizaberth");
        
        //Creating Poised object for Project 1
        Poised poised1 = new Poised(project1,jones,sara,paul);
        
        
        System.out.print("Do you want to update the due date of the project ?(yes/no)");
        String update_due_date = scanner.next();
        if(update_due_date.equalsIgnoreCase("yes") )
        {
        // Asking user to change the due date of the project
            System.out.print("Enter the new due date of the project : ");
            String new_due_date = scanner.next();
        
        //Updating the due date of the project in Project class
            project1.project_deadline_date = new_due_date;
        }
        System.out.print("Do you want to update the total amount of the fee paid to date?(yes/no) : ");
        String update_amount_paid = scanner.next();
        if(update_amount_paid.equalsIgnoreCase("yes"))
        {       
        // Asking user to change the new total amount of the fee paid to date for the project
            System.out.println("Enter the new total amount of the fee paid to date : ");
            double total_paid_to_date = scanner.nextDouble();
        
        //Updating the new total amount of the fee paid to date in Project class
            project1.total_amount_paid_to_date = total_paid_to_date;
        }
        System.out.print("Do you want to update the contractor 's contact details details?(yes/no) : ");
        String update_contractor_details = scanner.next();
        if(update_contractor_details.equalsIgnoreCase("yes"))
        { 
            System.out.print("What would you like to change ?(telephone,email or both?) : ");
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("telephone"))
                {
                //Updating the contractor telephone details in contractor class                       
                System.out.print("Please enter the contractor telephone number : ");
                String telephone_no = scanner.next();
                sara.telephone_number = telephone_no;
                }
            else 
                if(choice.equalsIgnoreCase("email"))
                { 
                //Updating the contractor email details in contractor class    
                System.out.print("Please enter the contractor email address : ");
                String email_address = scanner.next();
                sara.email_address = email_address;
                }
            else
                if(choice.equalsIgnoreCase("both"))
                { 
                //Updating the contractor contact details in contractor class                   
                System.out.print("Please enter the contractor telephone number : ");
                String telephone_no = scanner.next();
                sara.telephone_number = telephone_no;                    
                  
                System.out.println("Please enter the contractor email address : ");
                String email_address = scanner.next();
                sara.email_address = email_address;
                }                    

        }
        //Displaying the data entered for fthe first project        
        System.out.println(poised1.getProject_Details());
        System.out.println(poised1.getArchitect());
        System.out.println(poised1.getContractor());       
        System.out.println(poised1.getCustomer());        
        
    }
    
}
