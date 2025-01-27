package DSA.String;

import java.util.Scanner;

public class CountVowelsAndConsansts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine().toLowerCase();

        int vowels = t.replaceAll("[^aeiou]","").length();

        System.out.println("vowels are > "+vowels+" And Consants are > "+(t.length()-vowels));
        }
    }
