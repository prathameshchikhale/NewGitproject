package Welcome;

import java.util.Scanner;

public class WelcomeToJava {

	public static void main(String[] args) {
		System.out.println("Welcome to java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is even");
		}
		else {
		System.out.println("The number is odd number");
		
	}
   }
}
