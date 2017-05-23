
public class FibonacciForLoop {

	public static void main(String[] args) {
		int num = 9;
		if(num<=1){
			System.out.println(num);
		}
		else{
			int start = 1;
			int next = 1;
		for(int i=2; i<=num; i++){
			int temp = start;
			start+=next;
			next = temp;
		
		}
		System.out.println(next);	
		}
		}

}