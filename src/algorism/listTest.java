package algorism;
import java.util.ArrayList;
public class listTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();



		arrayList.add("Test1");

		arrayList.add("Test2");

		arrayList.add("Test3");



		String[] array = arrayList.toArray(new String[arrayList.size()]);

		for (String s : array)
			System.out.println(s);
	}

}
