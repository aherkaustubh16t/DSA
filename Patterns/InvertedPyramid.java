package DSA.Patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        int t = 5;
        System.out.println("\nInverted Pyramid\n");
        for (int i = t; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
