/*
Project class
 */

/**
 *
 * @author RammutlaT
 */
public class Project 
{
     //Project_Details  class definition
    
    //Properties of Project class
    int project_number;
    String project_name;
    String building_type;
    String physical_address;
    String erf_number;
    double project_total_fee;
    double total_amount_paid_to_date;
    String project_deadline_date; 
    
    
    public  Project(int project_number,String project_name,String building_type,String physical_address,String erf_number,double project_total_fee,double total_amount_paid_to_date,String project_deadline_date)
    {
                ////Projec_Details class 's constructor initialising class properties
                this.project_number = project_number;
                this.project_name = project_name;
                this.building_type = building_type;
                this.physical_address = physical_address;
                this.erf_number = erf_number;
                this.project_total_fee = project_total_fee;
                this.total_amount_paid_to_date = total_amount_paid_to_date;
                this.project_deadline_date = project_deadline_date;
       
    } 
    
    public String toString()
    {
          //toString methods to display object 's data
        
        String project_details = "\nProject number : " + project_number
                + "\nProject name : " + project_name
                + "\nProject building type : " + building_type
                + "\nProject pysical address : " + physical_address
                + "\nErf number : " + erf_number 
                + "\nProject total fee : R " + project_total_fee                
                + "\nTotal amount paid to date : R " + total_amount_paid_to_date
                + "\nProject deadline date : " + project_deadline_date + "\n";;  
        
        return project_details;
                
    }
   
    public String getProject_name()
    {
        return this.project_name;
    }
    
}
