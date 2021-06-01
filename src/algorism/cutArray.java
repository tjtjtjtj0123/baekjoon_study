package algorism;
import java.util.*;
public class cutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,1};
		for (int s : solution(arr))
		System.out.println(s);
	}
	public static int[] solution(int[] arr) {
        if (arr.length > 1){
            Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(a, Collections.reverseOrder());
            return Arrays.copyOfRange(arr, 0,arr.length-1);
        }
        else
            return new int[]{-1};
    }

}
