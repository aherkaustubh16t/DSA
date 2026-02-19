package DSA.VariablesAndDataTypes;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:- ");
        int side = sc.nextInt();
        System.out.println("The Area of the square is:- "+side*side);
    }
}
