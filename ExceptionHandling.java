
public class ExceptionHandling {

	public static void main(String[] args) {
		String i = "rabin";
		try{
			for(int j=0; j<i.length();j++){
				System.out.println("Inside the try block");
			}
			}
		catch(Exception e){
			System.out.println("Inside the catch blocks");
		}
		finally{
			System.out.println("Finally Block");
		}
		
	}

}
