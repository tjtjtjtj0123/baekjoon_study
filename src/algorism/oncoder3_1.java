package algorism;

public class oncoder3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(producing(7,2,6));
	}
    public static int producing(int song, int length, int total){
        int count = 0; //�� CD�� �� �� ��
        int cTotal = 0; // �� CD ��
        int tlength; // CD �� �� ����
        
        while (song > 0){ // üũ�� �� ������ ���� �ִ� �� Ȯ��
            tlength = length; // �� 1�� �ֱ�
            count = 1; //1��
            song--; // song���� --
            
            while(tlength <= (total-length) && song > 0){ // �� ���̰� ������ �� �ִ� �ִ�ġ ����
                tlength += 1; // 1�� ����
                tlength += length; // 1�� �߰�
                song--; // song�� --
                count++; // �� �� ++
            }
            if (count % 13 == 0){ // �� üũ�ߴµ� ����� �� ���� 13���� �������� �Ѱ� ����
                song++;
            }
            cTotal++; // CD ���� ++
        }
        return cTotal;
    }

}
