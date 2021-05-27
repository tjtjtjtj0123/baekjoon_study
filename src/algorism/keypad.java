package algorism;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hand = "left";
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		int Lcheck = 10, Rcheck = 12; // 왼,오 손가락 현재 위치
        String answer = "";
        int rLength, lLength;

        for (int n : numbers){
            if (n == 1 || n == 4 || n == 7){ //왼손
                answer += 'L';
                Lcheck = n;
            } 
            else if (n == 3 || n == 6 || n == 9){ //오른손
                answer += 'R';
                Rcheck = n;
            }
            else{
            	int[] check = new int[2];
                if (Lcheck == n)
                    answer += 'L';
                else if (Rcheck == n)
                    answer += 'R';
                else {
                	if (n == 0)
                		n = 11;
                	
                	if ((Rcheck - n) == -1 || (Rcheck - n) == 1 || (Rcheck - n) == 3 || (Rcheck - n) == -3)
                		rLength = 1;
                	else if ((Rcheck - n) == 6 || (Rcheck - n) == -6)
                		rLength = 4;
                	else if ((Rcheck - n) == 9 || (Rcheck - n) == -9)
                		rLength = 9;
                	else {
                		if (Rcheck%3 == 0)
                			rLength = ((Rcheck/3-1) - n/3)*((Rcheck/3-1) - n/3) + (3 - n%3)*(3 - n%3);
                		else
                			rLength = (Rcheck/3 - n/3)*(Rcheck/3 - n/3) + (Rcheck%3 - n%3)*(Rcheck%3 - n%3);
                	}
                		
                	if ((Lcheck - n) == -1 || (Lcheck - n) == 1 || (Lcheck - n) == 3 || (Lcheck - n) == -3)
                		lLength = 1;
                	else if ((Rcheck - n) == 6 || (Rcheck - n) == -6)
                		lLength = 4;
                	else if ((Rcheck - n) == 9 || (Rcheck - n) == -9)
                		lLength = 9;
                	else 
                		lLength = (Lcheck/3 - n/3)*(Lcheck/3 - n/3) + (Lcheck%3 - n%3)*(Lcheck%3 - n%3);
                	
                	if (n == 11)
                		n = 0;
                    
                	if (rLength > lLength){
                        answer += 'L';
                        Lcheck = n;
                    } else if (rLength < lLength){
                        answer += 'R';
                        Rcheck = n;
                    } else{
                        if (hand.equals("right")){
                            answer += 'R';
                            Rcheck = n;
                        } else{
                            answer += 'L';
                            Lcheck = n;
                        }   
                    }
                }
            }
        }
        System.out.print(answer);
	}

}
