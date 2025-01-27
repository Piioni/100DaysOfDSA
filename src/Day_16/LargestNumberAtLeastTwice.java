package Day_16;

import java.util.Scanner;

public class LargestNumberAtLeastTwice {
    public static void main(String[] args) {

        String str = """
                You are given an integer array nums where the largest integer is unique.
                Determine whether the largest element in the array is at least twice as much as every other number in the array.
                If it is, return the index of the largest element, or return -1 otherwise.
                """;

        String example = """
                Example 1:
                
                Input: nums = [3,6,1,0]
                Output: 1
                Explanation: 6 is the largest integer.
                For every other number in the array x, 6 is at least twice as big as x.
                The index of value 6 is 1, so we return 1.
                """;

        System.out.println(str);
        System.out.println(example);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int result = dominantIndex(nums);
            System.out.println("Output: " + result);
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }


    public static int dominantIndex(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return 0;

        int biggestValue = Integer.MIN_VALUE;
        int biggestIndex = -1;
        int nextBigger = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggestValue) {
                nextBigger = biggestValue;
                biggestValue = nums[i];
                biggestIndex = i;
            } else if (nums[i] > nextBigger) {
                nextBigger = nums[i];
            }
        }

        return (biggestValue >= 2 * nextBigger) ? biggestIndex : -1;
    }
}
