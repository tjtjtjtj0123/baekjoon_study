package algorism;

public class hasad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution(10));
	}
	public static boolean solution(int x) {
        int answer = 0;
        int rx = x;
        while(x > 0){
            answer += x%10;
            x /= 10;
        }
        
        if (answer % rx == 0)
        	return true;
        else
        	return false;
    }

}
