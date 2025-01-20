package DSA.SearchingAlgorithms;

public class BinnarySearch {
    public static int binnarySearch(int arr[], int startIndex, int endIndex, int targetValue){
        if(startIndex>endIndex) return startIndex;
        int mid;
            mid = (startIndex+endIndex)/2;

            if(arr[mid] == targetValue){
                return mid;
            } else if (arr[mid]<targetValue) {
                return binnarySearch(arr,mid+1,endIndex,targetValue);
            }
            else {
                return binnarySearch(arr,startIndex,mid-1,targetValue);
            }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,8,67,87,98,122,134,456};
        int targetValue = 4;
        int n = arr.length;
        int res = binnarySearch(arr, 0, n-1,targetValue);
        if(res<n && arr[res] == targetValue) {
            System.out.println("Element found at index: " + res);
        }
        else {
            System.out.println("Element Not Found in the array, we can insert the element at "+res+" index");
        }
    }
}
