package DSA.Patterns;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        int n= 4;
        for(int i=0; i<n; i++){
            for(int s=0; s<i; s++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*(n-i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
