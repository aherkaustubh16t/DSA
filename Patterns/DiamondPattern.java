package DSA.Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int t = 4;
        System.out.println("Diamond Pattern");
        for(int i=1; i<=t; i++){
            for(int j=1 ; j<=t-i ; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=t; i>=1; i--){
            for(int j=1 ; j<=t-i ; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
