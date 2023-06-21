package method;

import java.util.Scanner;

public class TestClass07 {
	
	public int inputData() {

		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("수 입력: ");
		num = sc.nextInt();
		
		return num;
	}
	
	public int opData(int num) {
		int sum = 0;
		
		for (int i=0; i<=num; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public void printData(int num, int sum) {
		System.out.println("1~"+ num + "까지 합: " + sum);
		
	}
	
}
