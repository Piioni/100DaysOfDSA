package Day_18;

public class IncreasingTriplet {
    public static void main(String[] args) {

        String str = """
                Given an integer array nums, return true if there exists a triple of indices (i, j, k)
                such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
                """;

        String example = """
                Example 1:
                
                Input: nums = [1,2,3,4,5]
                Output: true
                Explanation: Any triplet where i < j < k is valid.
                """;

        int[] nums = {1, 2, 1, 3};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int p1 = 0, p2 = -1;

        for (int i = 1; i < nums.length; i++) {
            if (p2 == -1) {
                if (nums[i] > nums[p1]) {
                    p2 = i;
                } else {
                    p1 = i;
                }
            } else {
                if (nums[i] > nums[p2]) {
                    return true;
                } else if (nums[i] > nums[p1]) {
                    p2 = i;
                } else {
                    p1 = i;
                }
            }
        }

        return false;
    }

    public static boolean increasingTripletForEach(int[] nums) {
        if (nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Encuentra el valor más pequeño
            } else if (num <= second) {
                second = num; // Encuentra el segundo valor más pequeño
            } else {
                return true; // Encuentra un tercer valor mayor que ambos
            }
        }

        return false;
    }
}
