
public class FiboRecursion {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(fibo(num));
	}
	public static int fibo(int n){
		if(n==1 || n==0){
			return n;
		}
		else
			return fibo(n-1)+fibo(n-2);
		
	}

}
