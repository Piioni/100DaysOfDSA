package Extras.TupleWithSameProduct;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = """
                Given an array nums of distinct positive integers,
                return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.
                """;

        String example = """
                Example 1:
                
                Input: nums = [2,3,4,6]
                Output: 8
                Explanation: There are 8 valid tuples:
                (2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
                (3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
                """;

        System.out.println(str);
        System.out.println(example);

        int[] nums = new int[] {2,3,4,6};
        System.out.println(tupleSameProduct(nums));

        int [] nums2 = new int[] {2,3,4,6,8,12};
        System.out.println(tupleSameProduct(nums2));
    }

    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length ; i++){
            for (int j = 0 ; j < nums.length ; j++){
                if (i == j) continue;

                int product = nums[i] * nums[j];
                hash.put(product, hash.getOrDefault(product, 0) + 1);
            }
        }

        int permutaciones= 0;
        for (int count : hash.values()){
            permutaciones += count * (count - 2) ;
        }

        return permutaciones;
    }

    public static int tupleSameProduct2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                count += 8 * map.getOrDefault(product, 0);
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }

        return count;
    }
}
