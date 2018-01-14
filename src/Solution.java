import java.util.Arrays;

public class Solution {
    /*
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {

        if(nums == null || nums.length < 2){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int diff;

        Arrays.sort(nums);
        while(left < right){
            diff = Math.abs(target - nums[left] - nums[right]);
            minDiff = Math.min(minDiff,diff);

            if(nums[left] + nums[right] > target){
                right--;
            }
            else {
                left++;
            }
        }
        return minDiff;
    }

}