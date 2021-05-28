package algorism;
import java.util.*;
public class longtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long n = 118372;
			System.out.print(solution(n));
	}
	public static long solution(long n) {
        String answer = "";
        String s = Long.toString(n);
        String[] nrr = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++)
            nrr[i] = "" + s.charAt(i);
        Arrays.sort(nrr, Collections.reverseOrder());
        for (int i=0; i < nrr.length; i++)
            answer += nrr[i];
        return Long.parseLong(answer);
    }

}
