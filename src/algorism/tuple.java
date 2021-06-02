package algorism;
import java.util.*;
public class tuple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{{20,111},{111}}";
		for (int n : solution(s)) {
			System.out.print(n + " ");
		}
	}
	public static int[] solution(String s) { // 솔루션 함수
		String[] str = s.replaceAll("[\\{]", "").replaceAll("[\\}]", "").split(",");
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int[] count = new int[str.length];
		
		for (String st : str) {
			if (!a.contains(Integer.parseInt(st))) {
				a.add(Integer.parseInt(st));
				count[a.size()-1]++;
			} else 
				count[a.indexOf(Integer.parseInt(st))]++;
		}
		
		for (int i=0; i < a.size(); i++) {
			int max = i;
			for (int j = 0; j < a.size(); j++) {
				if (count[j] != -1)
					if (count[max] < count[j])
						max = j;
				
			}
			ans.add(a.get(max));
			count[max] = -1;
		}
		return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
