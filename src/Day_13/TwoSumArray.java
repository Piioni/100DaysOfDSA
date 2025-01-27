package Day_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        String str = """
                Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
                find two numbers such that they add up to a specific target number. 
                Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
                Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
                The tests are generated such that there is exactly one solution. You may not use the same element twice.
                Your solution must use only constant extra space.
                """;

        String example1 = """
                Example 1:
                
                Input: numbers = [2,7,11,15], target = 9
                Output: [1,2]
                Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
                """;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        System.out.println(example1);

        try{
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < n; i++){
                numbers[i] = sc.nextInt();
            }
            System.out.println("Enter the target: ");
            int target = sc.nextInt();
            int[] result = twoSum(numbers, target);
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        for( int i = 0; i < numbers.length; i++){
            int left = target - numbers[i];
            if( values.containsKey(left)){
                return new int[] {values.get(left) + 1, i +1 };
            } else {
                values.put(numbers[i], i);
            }
        }return new int[2];
    }
}
