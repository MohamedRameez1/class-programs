package Collections;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements you want in array");
		int n = s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++)
		arr[i]= s.nextInt();
		System.out.println("Enter the element you want to find: ");
		   int p =s.nextInt();
		     for(int i=0;i<p;i++)
		    	 System.out.print(arr[i]);
		     for(int i=p;i<n;i++)
		    	 System.out.println(arr[i]);
		  
		}

		}
	


