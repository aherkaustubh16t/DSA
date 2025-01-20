package DSA.Recursion;

public class FactorialRecursion {
    public static int Factorialcal(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fatc_n_minus_1 = Factorialcal(n-1);
        int fact_n = n*fatc_n_minus_1;
        return fact_n;
    }
    public static void main(String[] args) {
        int factorail = Factorialcal(4);
        System.out.println(factorail);
    }
}
