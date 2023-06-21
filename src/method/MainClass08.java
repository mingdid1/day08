package method;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		
		TestClass08 t = new TestClass08();
		
		t.test1();
		
		String s = t.test2("aa");
		System.out.println(s);
		
		int[] a = t.test5();
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("안녕"); arr.add("하세");
		
		HashMap<String , String> m = t.test06(arr);
		System.out.println(m);
	}
}
