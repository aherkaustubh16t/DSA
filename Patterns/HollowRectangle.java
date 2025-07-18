package DSA.Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int y = 5;
        int x = 8;

        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                if(i==0 || i==(y-1) || j==0 || j==(x-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
