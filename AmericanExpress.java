import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AmericanExpress {

    public static void main(String[] args) {
        Scanner type = new Scanner(System.in).useDelimiter("\\n");
        String[] myString = {"a","the","an","dates"};
        int num = type.nextInt();
        //String[] inputString = new String[num];
        String inputString = type.next();
        System.out.println(inputString);
    }
}