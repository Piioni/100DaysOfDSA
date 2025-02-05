package Day_22;

import java.util.Scanner;

public class FirstAndLastPositionInArray {
    public static void main(String[] args) {
        String str = """
                Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
                If target is not found in the array, return [-1, -1].
                You must write an algorithm with O(log n) runtime complexity.
                """;

        String example = """
                Example 1
                Input: nums = [5,7,7,8,8,10], target = 8
                Output: [3,4]
                """;

        System.out.println(str);
        System.out.println(example);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Enter the target element: ");
            int target = sc.nextInt();
            int[] result = searchRange(nums, target);
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1){
            if(nums[0] == target){
                return new int[] {0, 0};
            } else return new int[] {-1, -1};
        }

        int[] indexes = {-1, -1};
        int left = 0, right = nums.length -1 ;
        int mid;

        while (left <= right){
            mid = (left + right) / 2;
            if(nums[mid] == target){
                int temp = mid;
                while (mid > 0 && nums[mid -1] == target  ){
                    mid--;
                }
                indexes[0] = mid;

                while (temp < nums.length -1 && nums[temp + 1] == target){
                    temp++;
                }
                indexes[1] = temp;
                return indexes;
            }
            if (nums[mid] < target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return indexes;
    }
}
