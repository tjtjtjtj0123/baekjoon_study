package algorism;

public class budget {
	static int answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] d = {1, 3, 2, 5, 4};
		int[] d = {2, 2, 3, 3};
//		int b = 9;
		int b = 10;
		System.out.println(solution(d,b));
	}
	public static int solution(int[] d, int budget) {
        answer = -1;
        for (int i=d.length; i>0; i--){
            int[] arr = new int[i];
            c(d, arr, 0, d.length, i, 0, budget);
            if (answer != -1)
                return answer;
        }
        return answer;
    }
    
    public static void c(int[] d, int[] arr, int idx, int n, int r, int t, int budget){
        if (r == 0){
            // 완료시 실행부분
            int sum = 0;
            for (int a : arr)
                sum += d[a];
            if (sum <= budget)
                answer = n;
        } else if (n == t)
            return;
        else{
            arr[idx] = t;
            c(d, arr, idx+1, n, r-1, t+1, budget);
            c(d, arr, idx, n, r, t+1, budget);
        }
    }

}
