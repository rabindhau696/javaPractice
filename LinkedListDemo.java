
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("rabin");
		myList.add("rabin");
		myList.add("suman");
		myList.add("sonit");
		myList.add("niju");
		myList.add("niju");
		myList.remove("niju");
		Iterator<String> i = myList.iterator();
		while(i.hasNext()){
			System.out.println(i.next().toUpperCase());
		}
		 

	}

}
