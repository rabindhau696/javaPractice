import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] myArray = {2,1,4,6,7,3,9,11,12,10};
		int num = 200;
		Arrays.sort(myArray);
		//System.out.println(myArray[0]);
		boolean flag = false;
		int low=0, high=myArray.length;
		while(low<high){
			int mid = (high+low)/2;
			if(myArray[mid]<num){
				low = mid+1;
			}
			else if(myArray[mid]>num){
				high = mid - 1;
			}
			else if(myArray[mid]==num){
				flag = true;
				break;
			}
			//System.out.println(flag);
		}
		System.out.println(flag);

	}

}
