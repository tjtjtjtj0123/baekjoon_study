package algorism;
import java.util.ArrayList;
public class decimelSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		for (String s : solution(n, arr1, arr2))
			System.out.println(s);
	}
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String ans = "";
        int[][] n1 = new int[n][n];
        int[][] n2 = new int[n][n];
        
        for (int i = 0; i < n; i++){
        	int[] temp1 = nToBinary(arr1[i], n);
        	int[] temp2 = nToBinary(arr2[i], n);
        	for (int j = 0; j < n; j++) {
        		n1[i][j] = temp1[j];
                n2[i][j] = temp2[j];
        	}
        }
        
        for (int i=0; i<n; i++){
            for (int j=0; j < n; j++){
                if (n1[i][j] == 0 && n2[i][j] == 0)
                    ans += " ";
                if (n1[i][j] == 1 && n2[i][j] == 1)
                    ans += "#";
            }
            answer[i] = ans;
            ans = "";
        }
                
        return answer;
    }
    
    public static int[] nToBinary(int n, int length){
        int[] arr = new int[length];
        int idx = 0;
        while(n > 0){
            arr[idx++] = n%2;
            n /= 2;
        }
        return arr;
    }

}
