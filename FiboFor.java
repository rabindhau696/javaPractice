
public class FiboFor {

	public static void main(String[] args) {
		int num = 10;
		if(num==1){
			System.out.println(num);
		}
		else if(num==0){
			System.out.println(num);
		}
		else{
			int start = 1;
			int end = 1;
			for(int i=2;i<num;i++){
				int temp = start;
				start+=end;
				end = temp;
			}
			System.out.println(start);
		}

	}

}
