package method;

public class TestClass06 {
	public int sumFunc(int num) {
		
		int sum = 0;
		
		for (int i=1 ; i <= num; i++){
			sum += i;
		}
		return sum;

		/*
		 	return
		 	- return 다음에 값이 있으면 해당 값을 돌려주는 역할, 메소드 종료
		 	- return 다음에 값이 없으면 메소드를 종료하는 역할
		 */
		
	} 
}
