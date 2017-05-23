
public class FizzBUzz {

	public static void main(String[] args) {
		int num = 50;
		for(int i=1; i <= num; i++){
			if(i%3==0){
				System.out.print("Fizz,");
			}
			else if(i%5==0){
				System.out.print("Buzz,");
			}
			else{
				System.out.print(i+",");
			}
		}

	}

}
