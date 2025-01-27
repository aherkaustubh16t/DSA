package DSA.String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String t = "Kaustubh Aher";
        String t = sc.nextLine();
        int count = 0;
        for(char ch : t.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
