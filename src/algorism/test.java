package algorism;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		
		int answer = 0;
        int[] check = new int[n]; // ��ü �л� ��
        
        for (int i=0; i < n; i++) //�ʱ� ��
            check[i] = 1;
        
        for (int i : lost) // ü���� ���� ��� �Ÿ���
        	check[i-1] = 0;
        
        for (int i=0; i < lost.length; i++){
            for (int j=0; j < reserve.length; j++){
                if (reserve[j] == lost[i]){ // ���� ������ ������ �ִ� ���
                    check[lost[i]-1] = 1;
                    reserve[j] = -10; // �迭 ����ֱ�
                    break;
                } else if (reserve[j] == lost[i]-1 && check[lost[i]-2] == 1){ // �� �ջ���� ��
                	check[lost[i]-1] = 1;
                    reserve[j] = -10; // �迭 ����ֱ�
                    break;
                } else if (reserve[j] == lost[i]+1 && check[lost[i]] == 1){ // �� �޻���� ��
                    check[lost[i]-1] = 1;
                    reserve[j] = -10; // �迭 ����ֱ�
                    break;
                }
            }
        }
        
        for (int i : check)
            answer += i;
        System.out.print(answer);
	}

}
