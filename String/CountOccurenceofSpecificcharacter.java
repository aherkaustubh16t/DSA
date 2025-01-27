package DSA.String;

import java.util.Scanner;

public class CountOccurenceofSpecificcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println("Enter to count the occurence of specific character");
        String c = sc.next();
        int count=0;
        for (char ch : t.toCharArray()){
            if(c.charAt(0)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
