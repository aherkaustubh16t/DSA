package DSA;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
//        int a = 3;
//        long b =a;

//        float a = 532.16f;
//        int b = (int) a;

//        for lowercase alphabets
        String s1 = "abcdefghijklmn0pqrstuvwxyz";
        String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<s1.length();i++){
            int a = s1.charAt(i);
            int b = s2.charAt(i);
            System.out.println(s1.charAt(i)+" - "+a + " "+s2.charAt(i)+" - "+b);
        }

        int k = 91;
        for(int i=k;i<=96;i++){
            char ch = (char)i;
            System.out.println(i+" - "+ch);
        }
        int a = 1;
        char ch =(char) a;
        System.out.println(ch);

        char a1 = 'a';
        short a2 = 50;
        System.out.println(a1+a2);

    }
}
