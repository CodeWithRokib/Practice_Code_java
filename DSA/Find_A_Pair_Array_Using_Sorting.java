package DSA;


import java.util.Arrays;

public class Find_A_Pair_Array_Using_Sorting {
    public static void findPair(int[] nums, int target){
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while (low < high)
        {

            if (nums[low] + nums[high] == target)
            {
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }

            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }

        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] nums = { 8,7, 2, 5, 3, 5};
        int target = 10;
        findPair(nums,target);
    }
}
