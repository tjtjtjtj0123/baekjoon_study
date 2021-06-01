package algorism;

public class zipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcdede";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
        int answer = zipping(s).length();
        return answer;
    }
    public static String zipping(String s){
        int count = 1;
        String result = "";
        char check = s.charAt(0);
        for (int i=1; i < s.length(); i++){
            if (check == s.charAt(i)) {
                count++;
            }
            else{
                if (count > 1)
                    result += count;
                result += check;
                check = s.charAt(i);
                count = 1;
            }
            if (i == s.length()-1) {
            	if (count > 1)
            		result += count;
            	result += check;
            }
        }
        System.out.println(result);
        return result;
    }

}
