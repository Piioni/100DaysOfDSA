package Day_08;

import java.util.Scanner;

public class MaxiumProductArray {
    public static void main(String[] args) {

        String str = """
                Given the array of integers nums, you will choose two different indices i and j of that array. 
                Return the maximum value of (nums[i]-1)*(nums[j]-1).
                """;

        String example = """
                Example 1:
                
                Input: nums = [3,4,5,2]
                Output: 12\s
                Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.\s
                """;

        System.out.println(str);
        System.out.println(example);

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter the elements of the array");
            for(int i = 0; i < size; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println("The maximum value of (nums[i]-1)*(nums[j]-1) is: " + maxProduct(nums));
        } catch (Exception e){
            System.out.println("Please enter a valid number");
        }
    }

    public static int maxProduct(int[] nums) {
        int biggerValue = 0;
        int nextBigger = 0;

        for(int value : nums){
            if( value > nextBigger ){
                if( value > biggerValue){
                    nextBigger= biggerValue;
                    biggerValue = value;
                } else{
                    nextBigger = value;
                }
            }

        }
        return ((biggerValue -1) * (nextBigger - 1));
    }
}
