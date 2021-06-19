package algorism;
import java.util.*;
import java.util.stream.Collectors;
public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {2, 1, 3, 2};
		int l = 2;
		System.out.print(solution(p, l));
	}
    public static int solution(int[] priorities, int location) {
        int answer = 0;
		ArrayList<Integer> p = (ArrayList<Integer>) Arrays.stream(priorities).boxed().collect(Collectors.toList());
        int nIdx = location;
        int count = 0;
        while(p.size() > 0){
            int flag = 1;
            int now = p.get(0);
            for (int j=1; j < p.size(); j++){
                if (now < p.get(j)){ // 중요도 더 높은거 발견하면
                    p.add(now); // 맨앞 뒤에 넣어주고
                    p.remove(0); // 맨앞 지운다
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                count++;
                p.remove(0);
                if (Math.abs(nIdx)%priorities.length == 0)
                    return count;
            }
            nIdx--;
        }
        return answer;
    }

}
