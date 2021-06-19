package algorism;

import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution("baabaa"));
	}
	public static int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (st.empty())
                st.push(s.charAt(i));
            else{
                if (st.peek() == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        
        if (st.empty())
            return 1;
        else
            return 0;
    }

}
