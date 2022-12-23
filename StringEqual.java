package Practical;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();
		scanner.close();
		
		if (str1.equals(str2)) {
			System.out.println("Both strings are same.");
			
		}
		else {
			System.out.println("Both strings are not same.");
		}
	}
		
}
