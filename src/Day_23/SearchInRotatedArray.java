package Day_23;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {

        String str = """
                There is an integer array nums sorted in ascending order (with distinct values).
                Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
                Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
                You must write an algorithm with O(log n) runtime complexity.
                """;

        String example = """
                Example 1:
                Input: nums = [4,5,6,7,0,1,2], target = 0
                Output: 4
                """;

        System.out.println(str);
        System.out.println(example);

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println("Enter the target element: ");
            int target = sc.nextInt();
            System.out.println("Output: " + search(nums, target));
        } finally {
            sc.close();
        }
    }


    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1 ;
        int mid;
        while( low <= high){
            mid = (low + high) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[low] <= nums[mid]){
                if (nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                } else low = mid+1;
            } else {
                if (nums[mid] <= target && target <= nums[high]){
                    low = mid +1;
                } else high = mid -1;
            }

        }
        return -1;
    }
}

