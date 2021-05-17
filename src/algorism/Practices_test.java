package algorism;
import java.util.ArrayList;

public class Practices_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1, 2, 3, 4, 5};

        int[] answer = {};
        /*수포자들 찍기 답안 초기화*/
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] check = new int[3]; // 맞은 개수
                
        for (int i=0; i < 3; i++) // 맞은 개수 초기화
            check[i] = 0;
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == p1[i%p1.length]) {check[0]++;}
            if(answers[i] == p2[i%p2.length]) {check[1]++;}
            if(answers[i] == p3[i%p3.length]) {check[2]++;}
        }
        
        int maxScore = Math.max(check[0], Math.max(check[1], check[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == check[0]) {list.add(1);}
        if(maxScore == check[1]) {list.add(2);}
        if(maxScore == check[2]) {list.add(3);}
        
        // list.stream().mapToInt(i->i.intValue()).toArray()
        for (int l : list)
        	System.out.print(l);
	}
}
