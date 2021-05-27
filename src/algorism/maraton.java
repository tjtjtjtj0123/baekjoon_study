package algorism;
import java.util.Arrays;
public class maraton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] completion = {"stanko", "ana", "mislav"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		Arrays.sort(completion);
		Arrays.sort(participant);
		for (String p : participant){
			int n = Arrays.binarySearch(completion, p);
            if (n < 0) {
            	System.out.print(p);
            	break;
            }
        }
	}

}
