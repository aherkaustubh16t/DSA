package DSA.Patterns;

public class SolidRohmbus {
    public static void main(String[] args) {
        System.out.println("Solid Rhombus");
        int t = 5;
        for(int i = 1;i<=t;i++){
            for(int j =i;j<t;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=t;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
