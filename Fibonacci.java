
public class Fibonacci {

	public static void main(String[] args) {
		int input = 9;
		int sum = 1,n=0;
		while(input>0){
			n++;
			if(n==1){
				sum=sum+1;
			}
			else{
				sum=sum+n;
			}
			input--;
		}
		System.out.println(sum);
	}

}
