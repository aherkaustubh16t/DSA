package DSA.Patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int t = 4;
        for(int i=1;i<=t;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 1;j<=t*2-i*2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=t;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 1;j<=t*2-i*2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
