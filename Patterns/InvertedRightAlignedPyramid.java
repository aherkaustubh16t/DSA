package DSA.Patterns;

public class InvertedRightAlignedPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<n; i++){
            for(int s=0; s<i; s++){
                System.out.print(" ");
            }
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
