package algorism;

import java.util.Arrays;

public class phoneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b = {"1195524421", "1195", "9767"};
		System.out.print(solution(b));
	}
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i=0; i < phone_book.length; i++){
            String check = phone_book[i];
            for (int j=i+1; j < phone_book.length; j++){
                String now = phone_book[j].substring(0,check.length());
                if (now.equals(check))
                    return false;
            }
        }
        return answer;
    }

}
