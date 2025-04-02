package DSA.Patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int num = 1;
        int t = 5;
        System.out.println("Number Pyramid");
        for (int i = 1; i <= t; i++) {
            for(int j =1;j<=t-i ;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
    }
}
