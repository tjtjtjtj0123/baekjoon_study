package algorism;
import java.util.*;
public class filterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1, 2, 3, 4, 5}; 
		int min = Arrays.stream(intArr) 
				.filter(n -> n%2 == 0) 
				.max() 
				.getAsInt(); 
			System.out.println(min);
	}

}
