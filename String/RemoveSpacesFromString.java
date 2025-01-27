package DSA.String;

import java.util.Scanner;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();

        System.out.println(t.replace(" ",""));

    }
}
