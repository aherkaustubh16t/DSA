package DSA.BasicMaths;

import java.util.Scanner;

public class Number_Handling {
    public static int countDigits(long n) {
        // Write your code here
        int count = 0;
        if(n<0){
            n= -n;
        }
        if(n==0){
            return 1;
        }

        while(n>0){
            n = n/10;
            count++;
        }

        return count; // change this
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int result = countDigits(n);

        System.out.println(result);
    }
}
