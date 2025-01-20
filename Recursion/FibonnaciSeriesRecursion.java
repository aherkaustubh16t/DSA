package DSA.Recursion;

public class FibonnaciSeriesRecursion {

    public static void fibbonociSeries(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibbonociSeries(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0 , b=1;
        int n=16;
        System.out.println(a);
        System.out.println(b);
        fibbonociSeries(0, 1,n-2);
    }
}
