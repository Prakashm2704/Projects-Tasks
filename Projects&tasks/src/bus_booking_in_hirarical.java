//busbooking using hierarchical inheritance  

import java.util.*;
class easybooking{   //base class
	String easyb;
	String type;
	String com;
	String srmt;
	static int n;
	Scanner bs= new Scanner(System.in);
	void bus_details() {
		System.out.println("welcome to easybooking ");
		System.out.println(" Chennai to Tiruvannamalai");
		System.out.println("timing:8:30 @ koyambedu bus stand opposite");
		System.out.println("select your bus (redbus /srmtravels)");
		easyb=bs.next();
		System.out.println(("ac/non-ac"));
		type=bs.next();
		System.out.println("select your range ");
		n=bs.nextInt();
	}
	}
	class redbus extends easybooking  //derived class 1
{
		redbus()
	{
			bus_details();
		if(easyb.equals("redbus"))
		{
		if(type.equals("ac")) 
			System.out.println(" yes ac bus available ");
		{
			System.out.println("our ac bus start from @1500");
			if(n>=1500) 
			{
			System.out.println("confirm the ticket yes /no");
			com =bs.next();
			if(com.equals("yes")) 
			{
			System.out.println("you are ticket booking successfully");	
			}
			else {
				System.out.println("oops!!!! try again");
			}
			}
			else if(n<1500) {
				System.out.println("sorry !!! we are not provide non-ac ");
			}
		}
		}	
	}
 }
	class srmtravel extends easybooking   //dervied class 2
{
		srmtravel()
	{
			bus_details();
     if(easyb.equals("srmtravels")) 
     {
    	 if(type.equals("non-ac"))
    	 {
        	 System.out.println("yes we are provide non-ac @750 & ac @1750");
    		 if(n>=750)
    		 {
             System.out.println("confirm the ticket yes/no");
             srmt =bs.next();
             if(srmt.equals("yes")) 
             {
            	 System.out.println("your ticket booked successfully");
             }
    	     }
    		 else {
    			 System.out.println("plz enter above @750");
    		      }
        }
      }		
      if(easyb.equals("srmtravels")) {
    	 if(type.equals("ac"))
    	 {
    		System.out.println("yes we are provide also ac @1750");
    		if(n>=1750)
    		{
            System.out.println("confirm the ticket yes/no");
    		srmt=bs.next();
    		if(srmt.equals("yes")) 
    		{
           	 System.out.println("your ticket booked successfully");
    	    }      
    		}
    	 } 
    	 if(n<1750) {
			 System.out.println("plz enter above @1750");
    	 }   	 
     }
	}
		
}
public class bus_booking_in_hirarical {

	public static void main(String[] args) 
	{
		new redbus();
		new srmtravel();
		new srmtravel();
	}

}
