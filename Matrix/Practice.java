package DSA.Matrix;

public class Practice {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        m1[0][0] = 1;
        m1[0][1] = 2;
        m1[0][2] = 3;
        m1[1][0] = 4;
        m1[1][1] = 5;
        m1[1][2] = 6;
        m1[2][0] = 7;
        m1[2][1] = 8;
        m1[2][2] = 9;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if((i == 0 && j == 0)|| i - j == 2 || (i - j == -2)){
                    m1[i][j] = 0;
                }
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
