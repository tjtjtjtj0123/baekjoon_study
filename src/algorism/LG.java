package algorism;

import java.util.ArrayList;

public class LG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int s : solution(3,12))
			System.out.println(s);
	}
    public static int[] solution(int n, int m) {
        ArrayList<Integer> a = new ArrayList<>();
        int L = 1, G = 1;
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        for (int i=1; i <= n; i++)
            if (min % i == 0)
                a.add(i);
        
        for (int i=0; i < a.size(); i++){
            if (max % a.get(i) == 0)
                L *= a.get(i);
        }
        
        G = n*m/L;
        
        int[] answer = {L,G};
        
        return answer;
    }

}
