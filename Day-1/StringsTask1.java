
import java.util.Scanner;

public class StringsTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname=sc.next();  // taking fname as input 
        String secoendname= sc.next().toUpperCase(); //while taking lastname as input, we are converting that to uppercase
        
        String firstletter= firstname.substring(0,1).toUpperCase(); // extracting first char from firstname and converting into Uppercase
        String remletter = firstname.substring(1);  // extracting remaining letters from firstname
        firstname = firstletter+remletter; // concatenating the capitalized later and remaining letters of the firstname
        
        System.out.println(firstname+" " +secoendname); //concatenating both the strings as mentioned in question.
    }
}
