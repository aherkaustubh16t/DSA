package DSA.VariablesAndDataTypes;

import java.util.Scanner;

public class AverageOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers a,b,c to get the average: - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (float) (a + b + c) /3;
        System.out.println("The Average of 3 numbers is :- "+avg);
    }
}
