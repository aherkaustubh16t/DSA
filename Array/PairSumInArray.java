package DSA.Array;

public class PairSumInArray {
    public static void findPair(int[] nums,int target){
        for(int i =0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Pair Found - "+nums[i]+","+ nums[j]);
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,4,2,8,1,9,5};
        int target = 10;

        findPair(nums,target);
    }
}
