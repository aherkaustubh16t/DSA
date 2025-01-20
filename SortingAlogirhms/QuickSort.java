package DSA.SortingAlogirhms;

public class QuickSort {

    public static int partition(int arr[], int low, int high){
        int pi = arr[high];
        int i = low-1;
        for(int j=low; j<high;j++){
            if (arr[j]<=pi){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1 );
            quickSort(arr, pi+1, high);
        }

    }

    public static void main(String[] args) {

        int arr[] = {6,3,5,7,1,2,8};
        int n = arr.length;

        quickSort(arr,0, n-1);

        for(int e : arr){
            System.out.print(e+" ");
        }

        //        Quick Sort
    }
}
