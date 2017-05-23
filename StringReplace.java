
import java.util.*;

public class StringReplace {

	public static void main(String[] args) {
		String mainString = "Amazon Web Services";
		String myString = mainString.replaceAll("[^a-zA-Z]", "").toLowerCase();
		char[] myArray = myString.toCharArray();
		HashMap<Character, Integer> myDictionary = new HashMap<Character, Integer>();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		char[] myAlphabets = alphabets.toCharArray();
		for (int i = 0; i < myAlphabets.length; i++) {
			int count = 0;
			for (int j = 0; j < myArray.length; j++) {
				if (myAlphabets[i] == myArray[j]) {
					count++;
				}
			}
			myDictionary.put(myAlphabets[i], count);
		}
		for (Character key : myDictionary.keySet()) {
			if (myDictionary.get(key) == 0 || myDictionary.get(key) == 0) {
				System.out.println("Character " + key + " repeat " + myDictionary.get(key) + " time");
			}
			else{
				System.out.println("Character " + key + " repeat " + myDictionary.get(key) + " times");
			}
		}
	}
}
