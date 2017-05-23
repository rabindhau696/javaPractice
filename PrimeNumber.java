import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner newScan = new Scanner(System.in);
		int input = newScan.nextInt();
		int m;
		m = input/2;
		boolean flag = true;
		for(int i = 2; i<=m; i++){
			if(input%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("Is prime number");
		}
		else{
			System.out.println("Not prime number");
		}
		

	}

}
