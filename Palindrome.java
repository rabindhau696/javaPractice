
public class Palindrome {

	public static void main(String[] args) {
		// String is palindrome or not
		String myString = "my name is rabin";
		char[] myArray = myString.toCharArray();
		int start = 0;
		int end = myArray.length-1;
		while(end>start){
			char temp = myArray[start];
			myArray[start] = myArray[end];
			myArray[end] = temp;
			end--;
			start++;
		}
		String newString = new String(myArray);
		System.out.println(newString);
		System.out.println(newString.equals(myString));
		
		}
	

}
