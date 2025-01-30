package Day_19;

public class MaximumAscendingSumArray {
    public static void main(String[] args) {

        String str = """
                Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
                A subarray is defined as a contiguous sequence of numbers in an array.
                A subarray [numsl, numsl+1, ..., numsr-1, numsr]
                is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.
                """;

        String example = """
                Example 1:
                
                Input: nums = [10,20,30,5,10,50]
                Output: 65
                Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
                """;


        // Test cases
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(nums)); // Output: 65

        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println(maxAscendingSum(nums2)); // Output: 150

        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        System.out.println(maxAscendingSum(nums3)); // Output: 33

        int[] nums4 = {100, 10, 1};
        System.out.println(maxAscendingSum(nums4)); // Output: 100

        int[] nums5 = {3, 6, 10, 1, 8, 9, 9, 8, 9};
        System.out.println(maxAscendingSum(nums5)); // Output: 19
    }

    public static int maxAscendingSum(int[] nums) {
        int maximumSum = nums[0], currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maximumSum = Math.max(maximumSum, currentSum);
                currentSum = nums[i];
            }
        }
        return Math.max(maximumSum, currentSum);
    }
}
