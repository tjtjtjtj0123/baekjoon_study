package algorism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
public class Test_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
		Stream<Integer> stream = list.stream();
//		stream.mapToInt(num -> num.intValue());
		for (int l : list)
			System.out.println(l);
	}

}
