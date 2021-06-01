package algorism;
import java.util.*;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 26, 17, 25, 99, 44, 303};

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("Sorted arr[] : " + Arrays.toString(arr));
	}

}
