import java.util.Scanner;

public class PalindromePractice {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String input = myScan.nextLine();
		palindrome(input);
		

	}
	public static void palindrome(String str){
		char[] myArray = str.toCharArray();
		int start = 0, end = myArray.length-1;
		while(end>start){
			char temp = myArray[start];
			myArray[start] = myArray[end];
			myArray[end] = temp;
			end--;
			start++;
			
		}
		String myString = new String(myArray);
		if(str.equals(myString)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

}
