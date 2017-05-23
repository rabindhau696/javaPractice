import java.util.HashMap;

public class TinyUrl {

	public static void main(String[] args) {
		HashMap<String,String> myUrl = new HashMap<String,String>();
		String baseUrl = "http://tinyurl.com/rabin";
	    String charSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    int base = charSet.length();
		System.out.println(shortUrl(6,base,myUrl));

	}
	public static String shortUrl(int id, int base, HashMap map){
		StringBuilder res = new StringBuilder();
		while(id>0){
			int digit = id%base;
			res.append(map.get(digit));
			id/=base;
		}
		while(res.length()<6){
			res.append("0");
		}
		return res.reverse().toString();
	}
}
