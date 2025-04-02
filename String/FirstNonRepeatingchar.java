package DSA.String;

import java.util.Scanner;

public class FirstNonRepeatingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "kaukstubh Aher";
        String s = string.toLowerCase();
        System.out.println("String is: "+s);
        for(int i=0;i<s.length();i++){
            int found = 0;
            for(int j =0;j<s.length();j++){
                if(i!=j && s.charAt(j) == s.charAt(i)){
                    found = 1;
                }
            }
            if(found == 0){
                System.out.println(s.charAt(i)+" found the first non repeating character in the string at position "+(i+1));
                break;
            }
        }

    }
}
