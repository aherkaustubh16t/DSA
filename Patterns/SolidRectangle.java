package DSA.Patterns;

public class SolidRectangle {
    public static void main(String[] args) {
        int y = 3;
        int x = 5;
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
