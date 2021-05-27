package algorism;
import java.util.ArrayList;
public class itoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int p=0; p < commands.length; p++){
            int i = commands[p][0];
            int j = commands[p][1];
            int k = commands[p][2];
            
            int[] list = new int[j-i+1];
            int c = 0;
            for (int q=i-1; q<j; q++) // i부터 j까지 자르기
                list[c++] = array[q];
            result.add(sort(list, k));
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        for (int a : answer)
        	System.out.println(a);
	}
	public static int sort(int[] a, int k){ // sort하고, k번째 내보내는 함수
        for (int i=0; i < a.length; i++){
            int min = i;
            for (int j=i+1; j < a.length; j++){
                if (a[min] > a[j])
                    min = j;
            }
            swap(a, min, i);
        }
        
        return a[k-1];
    }
    
    public static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}
