
public class ParticularWord {

	public static void main(String[] args) {
		// Program to find particular word
		String myString = "my name is rabin. i am from oregon. i am a student. i am lookin from job.";
		String myFind = "am";
		String[] myArray = myString.split(" ");
		for(int i=0; i<myArray.length; i++){
			if(myFind.equals(myArray[i])){
				System.out.println("True");
			}
		}

	}

}
