package algorism;

public class decimel {
	static int answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		int[] nums = {1,2,3,4};
        c(nums, arr, 0, nums.length, 3, 0);
        System.out.println(answer);
	}
    public static void c(int[] nums, int[] arr, int idx, int n, int r, int target) {
        if (r == 0){
            // arr 출력시, 작동되는 부분
            int total = 0;
            for (int i=0; i < arr.length; i++) 
                total += nums[arr[i]]; // 체크할 총값 계산
            
            for (int i=2; i < total; i++)
                if(total % i == 0)
                    return;
            answer++;
        } else if (target == n)
            return;
        else {
            arr[idx] = target;
            c(nums, arr, idx+1, n, r-1, target+1);
            c(nums, arr, idx, n , r, target+1);
        }
    }

}
