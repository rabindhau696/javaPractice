import java.util.ArrayList;

public class PermutationOfString{
	public static ArrayList<String> myArray = new ArrayList<String>();
	public static void permutation(String input){
		permutation("", input);
	}
	private static void permutation(String perm, String word){
		if(word.isEmpty()){
			myArray.add(perm+word);
		}
		else{
			for(int i=0; i<word.length(); i++){
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
			}
		}
	}
	
	public static void main(String[] args){
		String myString = "abc";
		permutation(myString);
		for(String obj: myArray){
			System.out.println(obj);
		}
		//System.out.println(myArray.size());
		
	}
}