//greatest number

import java.util.*;
public class greatest_array_element {

	public static void main(String[] args) {
		int n,g_num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of. array element :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		g_num =a[0];
		for(int i=0;i<n;i++) {
			if(g_num<a[i])
			{
				g_num=a[i];
			}
		}
		System.out.println("Greatest element is "+g_num);
		

	}

}
