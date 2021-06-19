package algorism;
import java.util.*;
public class opencheatting {

	public static void main(String[] args) {
		String[] s = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		// TODO Auto-generated method stub
		for(String srr : solution(s))
			System.out.println(srr);
	}
    public static String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, String> m = new HashMap<>();
        int[] state = new int[record.length];
        String[] name = new String[record.length];
        for (int i =0; i < record.length; i++){
            String[] arr = record[i].split(" ");
            switch(arr[0]){
                case "Enter": // 0
                    state[i] = 0;
                    m.put(arr[1], arr[2]);
                    break;
                case "Leave": // 1
                    state[i] = 1;
                    break;
                case "Change": // 2
                    state[i] = 2;
                    m.replace(arr[1], arr[2]);
                    break;
            }
            name[i] = arr[1];
        }
        for (int i=0; i < state.length; i++){
        	String result = "";
            switch(state[i]){
                case 0: // Enter
                	result = m.get(name[i]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
                    break;
                case 1: // Leave
                	result = m.get(name[i]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
                    break;
            }
            answer.add(result);
        }
        return answer.toArray(new String[answer.size()]);
    }

}
