package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {
	// void : return 값이 없는 경우
	//		  메서드를 종료하는 기능

	public void test1() {
		int num = 1;
		if (num ==1) {
			System.out.println("if 실행");
			return;
		}
		System.out.println("다음 문장들 실행");	
	}
	
	public String test2(String s) {
		return null;
	}
	
	public int test3() {
		int num = 1;
		
		if (num == 1)
			return 100;
		else
			return 0;	
	}
	
	public String test4() {		// return 자료형을 통일해줘야함
		int num = 0;
		
		if (num ==1) {
			return "aaa";	// 문자열이면,
		}else {
			return "aa";	// 여기도 문자열로 반환
		}
	}
	
	public int[] test5() {
		int n1 = 100, n2 = 200;
		
		// return n1, n2;	=> 반환시 여러개를 보낼 수 없음
		int[] arr = {n1, n2};
		
		return arr;
	}
	
	public HashMap<String, String> test06(ArrayList<String> arr) {
		
		String s = arr.get(0);
		System.out.println("0 : " + s);
		System.out.println("1 : " + arr.get(1));
		
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "값111");
		String re = map.put("키2", "값222");
		
		System.out.println("re : " + re);
		
		return map;
		
	}
}
