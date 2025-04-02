package DSA.Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int t =4;
        for (int i = 1; i <= t; i++) {
            for (int j = 1;j<=t-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
