package algorism;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		
		int answer = 0;
        int[] check = new int[n]; // 전체 학생 수
        
        for (int i=0; i < n; i++) //초기 값
            check[i] = 1;
        
        for (int i : lost) // 체육복 없는 사람 거르기
        	check[i-1] = 0;
        
        for (int i=0; i < lost.length; i++){
            for (int j=0; j < reserve.length; j++){
                if (reserve[j] == lost[i]){ // 내가 여벌을 가지고 있는 경우
                    check[lost[i]-1] = 1;
                    reserve[j] = -10; // 배열 비워주기
                    break;
                } else if (reserve[j] == lost[i]-1 && check[lost[i]-2] == 1){ // 내 앞사람이 有
                	check[lost[i]-1] = 1;
                    reserve[j] = -10; // 배열 비워주기
                    break;
                } else if (reserve[j] == lost[i]+1 && check[lost[i]] == 1){ // 내 뒷사람이 有
                    check[lost[i]-1] = 1;
                    reserve[j] = -10; // 배열 비워주기
                    break;
                }
            }
        }
        
        for (int i : check)
            answer += i;
        System.out.print(answer);
	}

}
