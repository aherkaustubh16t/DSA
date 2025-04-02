package DSA.Patterns;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        int t = 5;
        for(int i =t;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
