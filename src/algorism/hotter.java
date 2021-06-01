package algorism;

import java.util.*;
import java.util.stream.Collectors;

public class hotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sc = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(sc, K));
	}
    public static int solution(int[] scoville, int K) {
        ArrayList<Integer> sc = (ArrayList<Integer>) Arrays.stream(scoville).boxed().collect(Collectors.toList());
        int answer = check(sc, K, 0);
        return answer;
    }
    public static int check(ArrayList<Integer> sc, int K, int count) {
        if (allpass(sc, K))
            return count;
        else if (sc.size() == 1)
            return -1;
        else{
            Collections.sort(sc);
            sc.add(sc.get(0) + sc.get(1)*2);
            sc.remove(0);
            sc.remove(0);
            count++;
            return check(sc, K, count);
        }
    }
    public static boolean allpass(ArrayList<Integer> sc, int K){
        for (int i=0; i < sc.size(); i++){
            if (sc.get(i) < K)
                return false;
        }
        return true;
    }

}
