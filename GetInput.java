package practice;

import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = input.next();
		System.out.println("Enter Age: ");
        int age = input.nextInt();
        
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        input.close();
	}

}
