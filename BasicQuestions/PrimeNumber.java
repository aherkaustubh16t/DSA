package DSA.BasicQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: - ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            System.out.println("1 is not Prime Number");
            return;
        }else {
            for(int i=2;i <= Math.sqrt(n);i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is Prime Number");
        }else{
            System.out.println(n+" is not Prime Number");
        }
    }
}
