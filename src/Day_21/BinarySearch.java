package Day_21;

public class BinarySearch {
    public static void main(String[] args) {

        String str = """
                Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
                You must write an algorithm with O(log n) runtime complexity.
                """;

        String example = """
                Example 1:
                
                Input: nums = [-1,0,3,5,9,12], target = 9
                Output: 4
                Explanation: 9 exists in nums and its index is 4
                """;

        System.out.println(str);
        System.out.println(example);

        // Test cases
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        System.out.println(search(nums2, target2));

        int[] nums3 = {5};
        int target3 = 5;
        System.out.println(search(nums3, target3));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }

            if (nums[mid] < target ){
                left = mid + 1;
            } else{
                right = mid -1;
            }

        }
        return -1;
    }
}
