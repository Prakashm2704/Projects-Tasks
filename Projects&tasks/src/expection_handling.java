import java.util.Scanner;

//exception handling
public class expection_handling  {

	public static void main(String[] args) {
	     Scanner n = new Scanner(System.in);
	     System.out.println("enter your divisible number");
	         int b=n.nextInt();
		 try                    //try block use contains error code
			{
			System.out.println(b/0);// here is arithmatic exception handling occurs
			}
			catch(Exception e)    //it accepts the error and allows to execute rest of code
			{
				System.out.println("arith matic expection");
			}
		 finally {
			 System.out.println(100/b);
		 }
		
      int a[]= {10,20,30};
      System.out.println("begains");
      try {
      System.out.println(a[3]);// here is no array index no at three(ArrayIndexOutOfBoundsException)
      }
      catch(ArrayIndexOutOfBoundsException e){
    	 System.out.println(e); 
      }
      finally{                                 // it contains error free code 
    	  System.out.println("error free code");
    	  System.out.println(a[0]);
      }
      
     
	}

}
