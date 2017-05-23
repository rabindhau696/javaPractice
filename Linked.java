import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("aba");
		myList.add("abc");
		myList.add("rabin");
		Iterator i = myList.iterator();
		while(i.hasNext()){
			String myString = i.next().toString();
			
			char[] myArray = myString.toCharArray();
			//System.out.println(myArray);
			int start = 0;
			int end = myArray.length-1;
			while(end>start){
				char temp = myArray[start];
				myArray[start] = myArray[end];
				myArray[end] = temp;
				start++;
				end--;
			}
			String myNew = String.valueOf(myArray);
			if(myString.equals(myNew)){
				System.out.println(myString);
			}
			
		}
	}
}
				