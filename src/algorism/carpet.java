package algorism;

public class carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int s : solution(24,24))
			System.out.println(s);
	}
	public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for (int i=3; i <= total/3; i++){
        	if (total % i != 0)
        		continue;
        	int check = i/2*((total/i)/2);
            if (check == yellow)
                return new int[]{total/i, i};
        }
        return answer;
    }

}
