package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		// 1
		t.big(num1, num2);
		
		// 2
		t.evenOdd(num1);
		
		// 3
		ArrayList<Integer> arr = new ArrayList<>();
		arr = t.three(num2);
		System.out.println(arr);
		
		// 4
		boolean bool = t.isPrime(num1);
		System.out.println(bool);
		
		// 5
		t.num2(num3);
	}
}	
