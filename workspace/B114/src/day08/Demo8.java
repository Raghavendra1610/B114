package day08;

import java.util.Scanner;

public class Demo8 {
//write a java code to compare 2 variable 
//input a & b
//	output --> 'a is >'     'b is >'   'both are equal'
 	public static void main(String[] args) {
 		
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int a=sc.nextInt();
		
		System.out.println("Plz enter another number");
		int b=sc.nextInt();
		
		sc.close();
	
		if(a>b)
		{
			System.out.println("a is >");
		}
		else 
		{
			if(b>a)
			{
				System.out.println("b is >");
			}
			else
			{
				System.out.println("both are equal");
			}
		}
			
		System.out.println("Thank You");
	}

}
