
public class LongestWord {

	public static void main(String[] args) {
		// How to find the longest word in the String
		String myString = "my name is rabin i am from oregon i am a student i am lookin from job";
		String[] myArray = myString.split(" ");
		int maxLength = 0;
		int index=0;
		for(int i=0; i<myArray.length; i++){
			if(maxLength<myArray[i].length()){
				maxLength = myArray[i].length();
				index = i;
			}
		}
		System.out.println("Longest word: "+myArray[index]);

	}

}
