package method;

public class TestClass05 {
	
	// 매개변수를 받을때 같은 자료형으로 받아줘야한다
	public void sumFunc(int num) {
		
		int sum = 0;
		
		for (int i=1 ; i <= num; i++){
			sum += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + sum);
	} 
}
