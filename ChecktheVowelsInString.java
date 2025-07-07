package DSA;
import java.util.regex.*;
public class ChecktheVowelsInString {
    public static void main(String[] args) {
        String t = "Kaustubh Aher";
        String regex = ".*[aeiou].";

        if(t.toLowerCase().matches(regex)){
            System.out.println("Yes, Vowels are present in the String.");
        }else{
            System.out.println("No, Vowels are not present in the String.");
        }

    }
}
