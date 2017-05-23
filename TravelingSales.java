import java.util.HashMap;
import java.util.TreeMap;

public class TravelingSales {

	public static void main(String[] args) {
		String[] myString = {"AB2","AC3","AB2","AD5","BC2","BD7"};
		TreeMap<char[],Integer> myMap = new TreeMap<char[], Integer>();
		for(int j=0; j<myString.length; j++){
			char[] subString = myString[j].toCharArray();
			char[] newString = new char[2];
			for(int i=0; i<2; i++){
				newString[i]=subString[i];
			
			}
			myMap.put(newString,Character.getNumericValue((myString[j].charAt(2))));
		}
		for(char[] key: myMap.keySet()){
			for(Character obj: key){
				System.out.println("key: " + obj + " value: " + myMap.get(key));
			}
			
		}
		
	}

}
