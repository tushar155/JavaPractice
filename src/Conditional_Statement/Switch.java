package Conditional_Statement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	int age;
	System.out.println("enter your age:");
	Scanner sc = new Scanner(System.in);
	age=sc.nextInt();
	switch(age) {
	case 1:
		System.out.println("you just born");
		break;
	case 20:
		System.out.println("Get a job");
		break;
	case 60:
		System.out.println("retrie");
		break;
		default:
			System.out.println("Enjoy your life");
			break;
	}
	}

}
