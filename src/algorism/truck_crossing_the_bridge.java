package algorism;
import java.util.*;
import java.util.stream.*;
public class truck_crossing_the_bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 2;
		int w = 10;
		int[] t = {7,4,5,6};
		System.out.println(solution(b,w,t));
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] st = new int[bridge_length];
        Arrays.fill(st, 0);
        int i = 0;
        while(i < truck_weights.length){
        	int flag = 0;
        	if (st[st.length-1] != 0)
        		flag = 1;
            for (int j = st.length-2; j >=0; j--) {
            	if (st[j] != 0)
            		flag = 1;
                st[j+1] = st[j];
            }
            st[0] = 0;
            int total = IntStream.of(st).sum();
            if (total+truck_weights[i] <= weight){
                st[0] = truck_weights[i];
                answer++;
                i++;
                flag = 0;
            }
            answer += flag;
        }
        if (IntStream.of(st).sum() != 0)
        	answer += st.length;
        return answer;
    }

}
