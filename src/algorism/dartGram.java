package algorism;

import java.util.ArrayList;

public class dartGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution("1D#2S*3S"));
	}
	public static int solution(String dartResult) {
        int answer = 0;
        char[] s = dartResult.toCharArray();
        int num = 0;
        ArrayList<Integer> score = new ArrayList<>();
        for (int i=0; i < s.length; i++){
            if (s[i] >= '0' && s[i] <= '9'){ // 숫자인 경우
                if (s[i+1] == '0' && s[i] == '1'){
                    num = 10;
                    i++;
                }
                else
                    num = s[i] - '0';
            } else if (s[i] == 'S' || s[i] == 'D' || s[i] == 'T'){
                switch(s[i]){
                    case 'S': 
                        score.add(num);
                        break;
                    case 'D':
                        score.add(num*num);
                        break;
                    case 'T':
                        score.add(num*num*num);
                        break;
                }
            } else if (s[i] == '*'){
                if (score.size() >= 2){
                	int temp1 = score.get(score.size()-1) * 2;
                    int temp2 = score.get(score.size()-2) * 2;
                    score.remove(score.size()-1);
                    score.remove(score.size()-1);
                    score.add(temp2);
                    score.add(temp1);
                } else if (i == 2){
                    score.add(score.get(0) * 2);
                    score.remove(0);
                }
            } else if (s[i] == '#'){
                int temp = score.get(score.size()-1) * -1;
                score.remove(score.size()-1);
                score.add(temp);
            }
        }
        if (score.size() > 0)
            for (int i=0; i < score.size(); i++)
                answer += score.get(i);
        return answer;
    }

}
