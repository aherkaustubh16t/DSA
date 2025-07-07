package DSA.Patterns;

public class Practice {
    public static void main(String[] args) {
        for(int i=6; i>0; i--){
            for(int k=i; k<6; k++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
