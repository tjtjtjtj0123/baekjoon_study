package algorism;

import java.util.*;

public class TheBiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {6, 10, 2};
		System.out.print(solution(n));
	}
    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for (int i=0; i < numbers.length; i++) // String으로 변환
            arr[i] = Integer.toString(numbers[i]);
        
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                char[] str1 = s1.toCharArray();
                char[] str2 = s2.toCharArray();
                
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                
                int sum1 = 0, sum2 = 0;

                for (char c1 : str1)
                    sum1 += c1 - '0';
                for (char c2 : str2)
                    sum2 += c2 - '0';
                if (str1[0] > str2[0])
                    return -1;
                else if (str1[0] == str2[0]){
                    if (str1.length == str2.length)
                        if (n1 > n2)
                            return -1;
                    else{
                        if (sum1 == sum2)
                            return n1 > n2 ? 1 : -1;
                        else{
                            if (str1.length > str2.length){
                                for (int i=str2.length; i < str1.length; i++)
                                    n2 *= 10;
                                return n1 > n2 ? -1 : 1;
                            } else{
                                for (int i=str1.length; i < str2.length; i++)
                                    n1 *= 10;
                                return n1 < n2 ? -1 : 1;
                            }
                        }
                    }
                }
                return -1;
            }
        });
        
        for (String a : arr)
            answer += a;
        
        return answer;
    }

}
