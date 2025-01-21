package Day_10;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        String str = """
                Given an array nums containing n distinct numbers in the range [0, n],
                return the only number in the range that is missing from the array.
                """;

        String example = """
                Example 1:
                Input: nums = [3,0,1]
                Output: 2
                Explanation:
                n = 3 since there are 3 numbers,
                so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
                """;

        System.out.println(str);
        System.out.println(example);

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < size; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println("The missing number is: " + missingNumber(nums));
        } catch (Exception e){
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public static int missingNumber(int[] nums) {
        // Gauss formula
        int sumatoria = nums.length*(nums.length+1)/ 2;
        int sumArray = 0;
        for( int valor : nums){
            sumArray += valor;
        }
        return sumatoria - sumArray;

    }
}
