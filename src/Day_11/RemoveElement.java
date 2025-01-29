package Day_11;

public class RemoveElement {
    public static void main(String[] args) {
        String str = """
                Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
                The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
                Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
                Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
                Return k.
                """;

        String example = """
                Example 1:
                
                Input: nums = [3,2,2,3], val = 3
                Output: 2, nums = [2,2,_,_]
                Explanation: Your function should return k = 2, with the first two elements of nums being 2.
                It does not matter what you leave beyond the returned k (hence they are underscores).
                """;

        System.out.println(str);
        System.out.println(example);

        try{
            int[] nums = {3,2,2,3};
            int val = 3;
            int result = removeElement(nums, val);
            System.out.println("Output: " + result);
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
