package algorism;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution(121));
	}
	public static long solution(long n) {
        if (Math.sqrt(n) % (long)1.0 == 0)
            return ((int)Math.sqrt(n)+1)*((int)Math.sqrt(n)+1);
        else
            return -1;
    }

}
