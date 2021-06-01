package algorism;

public class multify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2},{3,4}};
		int[][] B = {{5,6},{7,8}};
		int an = 1;
		int bn = 1;
		int[][] X = multiply(A,B,an,bn);
	}
	public static int[][] multiply(int[][] A, int[][] B, int an, int bn){
        int[][] r1 = new int[2][2];
        int[][] r2 = new int[2][2];
        int[][] result = new int[2][2];
        
        if (an > 1){
            for (int i=0; i < an-1; i++){
                r1[0][0] = A[0][0]*A[0][0] + A[0][1]*A[1][0];
                r1[0][1] = A[0][0]*A[0][1] + A[0][1]*A[1][1];
                r1[1][0] = A[1][0]*A[1][1] + A[0][0]*A[1][0];
                r1[1][1] = A[1][0]*A[0][1] + A[1][1]*A[1][1];
                
                A = r1;
            }
        } else{
            A = r1;
        }
        if (bn > 1){
            for (int i=0; i < bn-1; i++){
            	r2[0][0] = B[0][0]*B[0][0] + B[0][1]*B[1][0];
                r2[0][1] = B[0][0]*B[0][1] + B[0][1]*B[1][1];
                r2[1][0] = B[1][0]*B[1][1] + B[0][0]*B[1][0];
                r2[1][1] = B[1][0]*B[0][1] + B[1][1]*B[1][1];
                
                B = r2;
            }
        } else {
            B = r2;
        }
        
        result[0][0] = r1[0][0]*r2[0][0] + r1[0][1]*r2[1][0];
        result[0][1] = r1[0][0]*r2[0][1] + r1[0][1]*r2[1][1];
        result[1][0] = r1[1][0]*r2[1][1] + r1[0][0]*r2[1][0];
        result[1][1] = r1[1][0]*r2[0][1] + r1[1][1]*r2[1][1];
        
        return result;
    }
}
