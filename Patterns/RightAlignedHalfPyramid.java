package DSA.Patterns;

public class RightAlignedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int s=n-i; s>=1; s--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
