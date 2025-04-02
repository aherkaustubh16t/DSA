package DSA.Patterns;

public class PalindromePattern {
    public static void main(String[] args) {
        int t =5;
        System.out.println("Palindrome Number Pattern");
        for(int i=1;i<=t;i++){
            for(int j=1; j<=t-i; j++){
                System.out.print(" "+" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }


            System.out.println();
        }
    }
}
