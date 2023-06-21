package method;

// TestClass : 입력, 출력, 연산하는 기능
// MainClass : 기본 호출 및 연동

public class MainClass07 {
	public static void main(String[] args) {
		
		TestClass07 t = new TestClass07();
		
		int num = t.inputData();
		int sum = t.opData(num);
		t.printData(num,sum);
		
	}
}
