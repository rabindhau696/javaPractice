
public class ConvertFirstCap {

	public static void main(String[] args) {
		// Convert Every first Letter to capital
		String myString = "Happy birthday to you niju";
		char[] myArray = myString.toCharArray();
		for(int i = 0; i<myString.length(); i++){
			if(i==0){
				myArray[i] = Character.toUpperCase(myArray[i]);
			}
			else if(myArray[i]==' '){
				myArray[i+1]=Character.toUpperCase(myArray[i+1]);
			}
		}
		System.out.println(myArray);

	}

}
