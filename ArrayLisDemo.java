import java.util.*;

public class ArrayLisDemo {

	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("rabin");
		myArray.add("rabin");
		myArray.add("sabin");
		myArray.add("robert");
		myArray.add(null);
		myArray.add("niju");
		myArray.remove("niju");
		for(int i=0; i<myArray.size(); i++){
			System.out.println(myArray.get(i));
		}

	}

}
