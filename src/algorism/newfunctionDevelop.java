package algorism;
import java.util.*;
import java.util.stream.Collectors;
public class newfunctionDevelop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {93, 30, 55};
		int[] sp = {1, 30, 5};
		for (int s :  solution(p,sp))
			System.out.println(s);
	}
    public static int[] solution(int[] progresses, int[] speeds) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
//        ArrayList<Integer> p = (ArrayList<Integer>) Arrays.stream(progresses).boxed().collect(Collectors.toList());
        
        for (int pr :  progresses)
        	p.add(pr);
        System.out.println(p.size());
        while (p.size() > 0){ // 다 완료할때까지 검사
            for (int i=0; i < speeds.length; i++){
                p.add(p.get(0) + speeds[i]);
                p.remove(0);
            }
            if (p.get(0) == 100){
            	count = 0;
                for (int i=0; i < p.size(); i++)
                    if (p.get(i) == 100) // 100퍼 완료 한 경우
                        count++; // 100퍼 완료한 것들 개수 세기
                int idx = 0;
                while(idx < p.size()){
                    if (p.get(idx) == 100)
                        p.remove(idx); // 100퍼 완료한거 제거
                    else
                        idx++;
                }  
                ans.add(count); // 저장
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
