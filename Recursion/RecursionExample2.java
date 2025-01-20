package DSA.Recursion;

public class RecursionExample2 {
    public static void sumOfNNaturalNumbers(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumOfNNaturalNumbers(i+1, n , sum);
    }
    public static void main(String[] args) {
        int n = 7;
        sumOfNNaturalNumbers(1,6,0);
    }
}
