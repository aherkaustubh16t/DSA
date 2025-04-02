package DSA.String;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        StringBuilder sb = new StringBuilder(t).reverse();
        if(t.equals(sb.toString())){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is Not Palindrome");
        }
    }
}
