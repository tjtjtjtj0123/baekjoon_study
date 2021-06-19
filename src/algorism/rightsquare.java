package algorism;

public class rightsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution(8,12));
	}
	public static long solution(int w, int h) {
        long answer = 0;
        for (int i = 1; i <= w; i++)
            answer += (h-(h*i)/w);
        return answer*2;
    }

}
