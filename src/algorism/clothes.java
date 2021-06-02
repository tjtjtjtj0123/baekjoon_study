package algorism;
import java.util.*;

public class clothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] c = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.print(solution(c));
	}
	public static int solution(String[][] clothes) {
        int answer = 0;
        ArrayList<String> s = new ArrayList<>();
        
        for (int i=0; i < clothes.length; i++)
            if (!s.contains(clothes[i][1]))
                s.add(clothes[i][1]);
        int[] count = new int[s.size()];
        
        for (int i=0; i < clothes.length; i++)
            count[s.indexOf(clothes[i][1])]++;
        
        for (int i=1; i <= count.length; i++){
            int[] arr = new int[i];
            answer += ncr(count, arr, 0, count.length, i, 0);
        }
        return answer;
    }
    public static int ncr(int[] c, int[] arr, int idx, int n, int r, int tg){
        if (r == 0){
            int sum = 1;
            for (int i=0; i < arr.length; i++)
                sum *= c[arr[i]];
            return sum;
        }else if (n == tg)
            return 0;
        else{
            arr[idx] = tg;
            return ncr(c, arr, idx+1, n, r-1, tg+1) + ncr(c, arr, idx, n, r, tg+1);
        }
    }

}
