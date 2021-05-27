package algorism;
import java.util.Arrays;
public class failed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		for (int n : solution(N, stages))
			System.out.print(n);
	}
    public static int[] solution(int N, int[] stages) {
        int[] arrived = new int[N];
        int[] passed = new int[N];
        double[] check = new double[N];
        
        Arrays.fill(arrived, 0); //0���� �ʱ�ȭ
        Arrays.fill(passed, 0);
        
        for (int s : stages){ // ���� ���������� �ִ�?
            for (int i = 1; i <= N; i++){
                if (s > N){ // ���������� ����
                    for (int j=0; j < N; j++) {
                    	passed[j]++;
                    	arrived[j]++;
                    }
                    break;
                }else if (s == i){ // �� ���������� ����
                    for (int j=0; j < s; j++){ // ��-1 �ε�������
                        arrived[j]++;
                        if (j < (i-1)) // ��-2 �ε�������
                            passed[j]++;
                    }
                    break;
                }
            }
        }
        
        for (int i = 0; i < N; i++){
            if (arrived[i] == 0)
                check[i] = 0;
            else
                check[i] = (arrived[i] - passed[i])/(double)arrived[i];
            System.out.println(check[i]);
        }
        return sort(check);
    }
    
    public static int[] sort(double[] check){
        int[] aIdx = new int[check.length];
        for (int i = 0; i < check.length; i++)
            aIdx[i] = i+1;
        
        for (int i=0; i < check.length; i++){
            int max = i;
            for (int j=i+1; j < check.length; j++){
                if (check[j] > check[max])
                    max = j;
            }
            swap(check, aIdx, i, max);
        }
        return aIdx;
    }
    public static void swap(double[] c, int[] aIdx, int idx1, int idx2){
        double temp1 = c[idx2];
        int temp2 = aIdx[idx2];

        
        for (int i=idx2; i >= idx1+1; i--){
            c[i] = c[i-1];
            aIdx[i] = aIdx[i-1];
        }
        c[idx1] = temp1;
        aIdx[idx1] = temp2;
    }

}
