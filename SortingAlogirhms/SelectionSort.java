package DSA.SortingAlogirhms;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8,7,3,1,2};

//        Selection Sort
        for(int i =0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[smallest];
            arr[smallest] = temp;


        }

        for(int i :arr){
            System.out.print(i+ " ");
        }

    }
}
