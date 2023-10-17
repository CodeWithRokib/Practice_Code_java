package DSA;

public class Find_A_Pair_Array {
    public static void findPair(int[] nums, int target){
        for(int i = 0; i<nums.length-1; i++){
            for (int j = 0; j<nums.length; i++){
                if(nums[i]+nums[j] == target ){
                    System.out.printf("Pair found (%d,%d)",nums[i],nums[j]);
                    return;
                }
            }
        }
        System.out.println("Pair Not Found");
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 3, 5};
        int target = 10;
        findPair(nums,target);
    }
}
