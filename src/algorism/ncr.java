package algorism;

public class ncr {
	/*조합 알고리즘*/
	public static void main(String[] args) { 
		int[] arr = new int[5]; 
		combination(arr, 0, 5, 3, 0); 
	}

	/*n개 中 r개 고를 경우 리스트 생성*/
	/*
		arr : 결과적을 배열
		index : arr 크기
		target
	*/
	public static void combination(int[] arr, int index, int n, int r, int target) { 
		if (r == 0)
			print(arr, index); // 배열 최종 저장 
		else if (target == n) 
			return; 
		else { 
			arr[index] = target; 
			combination(arr, index + 1, n, r - 1, target + 1); 
			combination(arr, index, n, r, target + 1); 
		}
	} //end combination()

	/*리스트(arr) 출력하는 함수*/
	public static void print(int[] arr, int length) {
		for (int i = 0; i < length; i++) 
			System.out.print(arr[i]); System.out.println(""); 
		} 
}
