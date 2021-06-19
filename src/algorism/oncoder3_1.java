package algorism;

public class oncoder3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(producing(7,2,6));
	}
    public static int producing(int song, int length, int total){
        int count = 0; //한 CD에 들어갈 곡 수
        int cTotal = 0; // 총 CD 수
        int tlength; // CD 당 곡 길이
        
        while (song > 0){ // 체크할 곡 개수가 남아 있는 지 확인
            tlength = length; // 곡 1개 넣기
            count = 1; //1개
            song--; // song개수 --
            
            while(tlength <= (total-length) && song > 0){ // 총 길이가 수용할 수 있는 최대치 이하
                tlength += 1; // 1초 간격
                tlength += length; // 1곡 추가
                song--; // song수 --
                count++; // 곡 수 ++
            }
            if (count % 13 == 0){ // 다 체크했는데 수용된 곡 수가 13으로 나눠지면 한곡 빼기
                song++;
            }
            cTotal++; // CD 개수 ++
        }
        return cTotal;
    }

}
