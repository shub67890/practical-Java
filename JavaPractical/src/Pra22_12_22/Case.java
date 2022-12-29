package Pra22_12_22;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		System.out.println("Enter name");
		sb.append(sc.nextLine().toUpperCase());
		sb.reverse();
		System.out.println("Reversed Data:"+sb);

	}

}
