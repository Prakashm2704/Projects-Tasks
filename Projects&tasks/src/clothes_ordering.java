//BIGBOSS CLOTHES ONLINE SHOPPING

import java.util.*;
class bigboss{
    String sec;
	Scanner s=new Scanner(System.in);
	void cus_details()
	{
	System.out.println("RESISTER FORM");	
	System.out.println("Enter your name ");
	String name=s.next();
	System.out.println("Enter your address ");
	String ad=s.next();
	System.out.println("Enter your phone number");
	long num=s.nextLong();
	System.out.println("select your section (boys/girls/kids)");
	sec=s.next();
	System.out.println("your register process done Enjoy your shopping");
	}
}
class section extends bigboss{
	String g; 
	String shirt;
	String k;
	section()
	{
		cus_details();
		if(sec.equals("boys"))
		{
			System.out.println("welcome to boys section");
			System.out.println("enter your shirt name (Shirt/Suit/pant)");
		     shirt=s.next();
		     if(shirt.equals("Shirt"))
		     {
		      System.out.println("size");
		      String sz=s.next();
		     }
		     else if(shirt.equals("Suit"))
		     {
		     System.out.println("Enter your suit color & size");
		     String szc=s.next(); 
		     }
		     else
		     {
		      System.out.println("enter your pant size");	
		      int si=s.nextInt();
		   }}
		     else if(sec.equals("girls")) 
		{
		System.out.println("welcome to girls section");
		System.out.println("select your section (sari/mini skirt/salwar)");
		   g=s.next();
		    if(g.equals("sari")) 
		    {
		    System.out.println(" your are selected color is :"+g);	
		    }
		    else if(g.equals("mini skirt"))
		    {
		    System.out.println("your selected is"+ g);	
		    }
		    else
		    {
		    	System.out.println("your selected is:"+g);
		    }
		}
		
	   else if(sec.equals("kids"))
		{
			System.out.println(" welcome to baby section");
			System.out.println("select your baby dress(mittens/singlet/beanie)");
			k=s.next();
			if(k.equals("mittens")) 
			{
				System.out.println("your selected is"+k);	
			}
			else if(k.equals("singlet")) 
			{
				System.out.println("your selected is "+k);
			}
			else if(k.equals("beanie"))
		    {
				System.out.println("your selected is"+k);
			}
		}
} 
}
class price extends section{
   price(){
if(sec.equals("boys"))
   {
    if(shirt.equals("shirts")) {
    System.out.println("your shirts price is :650");
    }
    else if (shirt.equals("Suit")) {
    	System.out.println("your suit price is :3999");
    }
    else if (shirt.equals("pant")) {
    	System.out.println("your pant price is :999");
    }
    }
    if(sec.equals("girls"))
    {
    	if(g.equals("sari")) {
        System.out.println("your sari is 6000"); 	
    	}
    	else if(g.equals("mini skirt"))
    	{
    	System.out.println("your mini skirt is 1500");	
    	}
    	else if(g.equals("salwar")) {
    		System.out.println("your salwar is 2000");
    	}
    }  
    if(sec.equals("kids"))
    {
    	if(k.equals("mittens")) {
    		System.out.println("your mittens is :600");
    	}
    	else if(k.equals("singlet")) {
    		System.out.println("your singlet  is :450");
    	}
    	else if (k.equals("beanie")){
    		System.out.println("your beanie is :499");
    	}
    }
	
}}
public class clothes_ordering {

	public static void main(String[] args) {
     new price();
     
	}

}
