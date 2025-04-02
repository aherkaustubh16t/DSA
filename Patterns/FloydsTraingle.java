package DSA.Patterns;

public class FloydsTraingle {
    public static void main(String[] args) {
        int t = 5;
        int num  = 1;
        for (int i = 1; i <= t; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                if(num == 1){
                    num  = 0;
                } else if (num == 0) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}
