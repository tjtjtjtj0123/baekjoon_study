package algorism;

public class kakaofriendsbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] solution(int m, int n, int[][] picture) {
        int maxSizeOfOneArea = 0;
        HashMap<Integer,String> m = new HashMap<>();
        for (int i=0; i < picture.length; i++){
            for (int j=0; j < picture[i].length; j++){
                int now = picture[i][j];
                if (!containsKey(now)) // 아예 없음
                    m.put(now, i + "-" + j); // 행-열
                else if (m.get(now).indexOf(i + "-") < 0) // 이번행에만 없음
                    m.replace(now, m.get(now) + "/" + i + "-" + j); // 행-열/행-열
                else
                    m.replace(now, m.get(now) + "," + j); // 다 있으면 그냥 추가
            }
        }
        int[] aSize = new int[m.size()];
        ArrayList<Integer> sTemp = new ArrayList<>();
        int i=0;
        for (Entry<Integer,String> s : m.entrySet()){
            String[] ij = s.getValue().split("/");
            for (String line : ij){
                String[] thing = line.split("-");
                
            }
        }
        Arrays.sort(aSize);
        int[] answer = new int[2];
        answer[0] = m.size();
        answer[1] = aSize[aSize.length-1];
        return answer;
    }

}
