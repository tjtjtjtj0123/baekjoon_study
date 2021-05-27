package algorism;

public class dollcrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		int[] stack = new int[board.length*board.length];
		int n = 0;
		
		for (int m : moves){
		    for (int i=0; i < board.length; i++){
		        if (board[i][m-1] != 0){
		            if (n > 0){ // stack 內 자료 有
		                if (stack[n-1] == board[i][m-1]){ // 앞 자료와 값이 같다면
		                    stack[n-1] = 0; // pop
		                    n--;
		                    answer += 2;
		                } else {
		                	stack[n] = board[i][m-1]; // push
		                	n++;
		                }
		            } else { // 無
		            	stack[n] = board[i][m-1]; // push
		            	n++; // stack 內 자료 수++
		            }
		            board[i][m-1] = 0; // 해당 자료 비우기
		        }
		    }
		}
        
        System.out.print(answer);
	}

}
