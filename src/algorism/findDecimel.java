package algorism;

import java.util.ArrayList;

public class findDecimel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution(10));
	}
    public static int solution(int n) {
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 2; i <= n; i++)
            p.add(i);
        
        int c = 0;
        
        while (p.get(c) <= n){
            for (int j=c+1; j < p.size(); j++){
                if (p.get(j) % p.get(c) == 0)
                    p.remove(j);
            }
            c++;
        }
        return p.size();
    }

}
