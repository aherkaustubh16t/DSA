package DSA.String;

import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Kaustubh";
        System.out.println(s);
        System.out.println("Enter which Letter occurence count to calculate : ");
        char c = sc.next().charAt(0);
        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
