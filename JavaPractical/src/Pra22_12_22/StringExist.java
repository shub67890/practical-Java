package Pra22_12_22;

import java.util.Scanner;

public class StringExist {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first string: ");
			String str1 = sc.nextLine();
			System.out.println("Enter second string:");
			String str2 = sc.nextLine();
			
			if (str2.contains(str1)) {
				System.out.println(str1 + "exists in" + str2);
			}
			else {
				System.out.println(str1 + "not exists" + str2);
			
			}
			
		}

	}

}
