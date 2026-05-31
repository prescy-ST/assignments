package practice;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		//even numbers
		
		for(int i=2; i<=50; i+=2) {
			System.out.println("even numbers: " +i);
	}
		//salary 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the salary: ");
		int salary = sc.nextInt();
		
		if(salary>=80000) 
		{
			System.out.println("manager");
		}else if(salary<60000) 
		{
			System.out.println("associate");
		}else if(salary>=60000 && salary<=79000) 
		{
				System.out.println("lead");
		}

}
	}
