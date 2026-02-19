package DSA.String;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static String reverseString(String s) {
        // Write your code here
        StringBuilder Reversed = new StringBuilder("");

        char [] chars = s.toCharArray();

        for(int i=chars.length-1; i>=0;i--){
            Reversed.append(chars[i]);
        }

        return Reversed.toString(); // change this
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = reverseString(s);

        System.out.println(result);

    }
}
