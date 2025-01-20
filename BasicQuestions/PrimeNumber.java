package DSA.BasicQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();
        int flag=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                flag = 1;
                return;
            }
            else{
                flag = 0;
            }
        }
        if(flag>1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
