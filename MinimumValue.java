
public class MinimumValue {
	public static void main(String[] args){
		Integer[] myArray = {2,6,12,3,4,7,8,10,3};
		int max = myArray[0];
		int min = myArray[0];
		for(int i=0; i<myArray.length; i++){
			if(min>myArray[i]){
				min = myArray[i];
			}
			else if(max<myArray[i]){
				max=myArray[i];
			}
		}
		System.out.println("Maximum Number is: "+ max);
		System.out.println("Minimum Number is: "+ min);
		System.out.println("Following are the value greater than or equal to " + min);
		for(int i=0; i<myArray.length; i++){
			if(myArray[i]>=min){
				System.out.println(myArray[i]);
			}
		}
	
	}

}
