package DSA.Array;

import java.util.Scanner;

public class Basic_Array_Traversal {

    public static boolean isSorted(int[] arr) {
        // Write your code here
//        Boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
            }else{
                return false;
            }
        }

        return true; // change this
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in your array:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elemnts of Arrays: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);

        if(result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
