
public class FindDublicateArray {

	public static void main(String[] args) {
		String[] myString = {"rabin","sonit","sabindra","pravin","rabin","pravin","rabin"};
		for(int i=0; i<myString.length; i++){
			for(int j=i+1; j<myString.length; j++){
				if(myString[i].equals(myString[j])){
					System.out.println(myString[i] + " has dublicate value in the array");
					break;
				}
			}
		}
		

	}

}
