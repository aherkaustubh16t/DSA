package DSA.Patterns;

public class FullPyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<n; i++){
            for(int s=i; s<n; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=1+(2*i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
