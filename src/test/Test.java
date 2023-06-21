package test;

import java.util.ArrayList;

public class Test {
	public void big(int n1, int n2) {
		System.out.print("큰수는 : ");
		if (n1 > n2) {
			System.out.println(n1);
			return;
		}
		System.out.println(n2);
	}
	
	public void evenOdd(int n) {
		if (n %2 == 0) {
			System.out.println("n1 = 짝수");
			return;
		}
		System.out.println("n1 = 홀수");
	}
	
	public ArrayList<Integer> three(int n) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		for (int i =1; i <=n; i++) {
			if (i % 3 == 0) {
				num.add(i);
			}
		}
		return num;
	}
	
	public boolean isPrime(int num){
		 for(int i=2; i<num; i++){
			 if(num % i == 0) 
				 return false;
	        }
	        return true;
	    }
			
	public void num2(int n) {
		if (n < 0) {
			System.out.println(-n);
			return;
		}
		System.out.println(n);
		
	}
	
}
