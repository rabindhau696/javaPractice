class WordFormat {
	private String[] overHundred = { "", " thousand", " million", " billion", " trillion", " quadrillion",
			" quintillion" };
	private String[] tenDigit = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			" ninety" };
	private String[] singleDigit = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen",
			" eighteen", " nineteen" };
	
	public String convertDigitLessThanThousand(int number){
		String current;
		if(number%100<20){
			current= singleDigit[number%20];
			number/=100;
			//System.out.println(number);
		}
		else{
			current = singleDigit[number%10];
			number/=10;
			//System.out.println(number);
			
			current = tenDigit[number%10] + current;
			number/=10;
			//System.out.println(number);
		}
		if(number==0){
			return current;
		}
		return singleDigit[number] + " hundred" + current;
	}
	public String convert(int number){
		if(number==0){
			return "zero";
		}
		String prefix="";
		if(number<0){
			number=-number;
			prefix="negative";
		}
		String current="";
		int place =0;
		
		do{
			int n = number%1000;
			if(n!=0){
				String s= convertDigitLessThanThousand(n);
				current = s+overHundred[place]+current;
				
			}
			place++;
			number/=1000;
		}
		while(number>0);{
			return(prefix+current).trim();
			
		}
}
}

public class NumberConversion {

	public static void main(String[] args) {
		WordFormat myWord = new WordFormat();
		System.out.println(myWord.convert(10002011));

	}

}
