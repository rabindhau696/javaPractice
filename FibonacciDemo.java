
public class FibonacciDemo {

	public static void main(String[] args) {
		int num = 9;
		System.out.println(fibo(num));

	}
	public static int fibo(int number){
		if(number==0 || number==1){
			return number;
		}
		else{
			return fibo(number-1)+fibo(number-2);
		}
		
	}

}
