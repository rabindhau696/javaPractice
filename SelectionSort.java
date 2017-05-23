
public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray = {7,8,1,5,4,3,2,0,9,6};
		for(int i=0; i< myArray.length; i++){
			int min = myArray[i];
			int index = i;
			for(int j = i+1; j< myArray.length; j++){
				if(min>myArray[j]){
					min=myArray[j];
					index = j;
				}
			}
			int temp = myArray[i];
			myArray[i]= myArray[index];
			myArray[index]=temp;
			for(int abj: myArray){
				System.out.print(abj+" ");
			}
			System.out.println();
			
		}
	}

}
