package algorism;

import java.util.HashMap;

public class arrayList_test_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> s = new HashMap<>();
		s.put(1, "po");
		s.put(1, s.get(1)+ "po");
		for (Integer i : s.keySet())
		System.out.print(s.get(i));
	}

}
