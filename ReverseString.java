
public class ReverseString {

	public static void main(String[] args) {
		String myString = "Rabin";
		char[] myArray = myString.toCharArray();
		int start = 0;
		int end = myArray.length-1;
		while(end>start){
			char temp = myArray[start];
			myArray[start]=myArray[end];
			myArray[end]=temp;
			start++;
			end--;
		}
		System.out.println(myArray);

	}

}
