package Day_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SquaresSortedArray {
    public static void main(String[] args) {

        String str = """
                Given an integer array nums sorted in non-decreasing order,
                return an array of the squares of each number sorted in non-decreasing order.
                """;

        String example = """
                Example 1:
                
                Input: nums = [-4,-1,0,3,10]
                Output: [0,1,9,16,100]
                Explanation: After squaring, the array becomes [16,1,0,9,100].
                After sorting, it becomes [0,1,9,16,100].
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

            int[] result = sortedSquares(nums);
            System.out.print("The sorted squares of the array are: ");
            for (int i : result) {
                System.out.print(i + " ");
            }

        }  catch (Exception e){
            System.out.println("Invalid input");
        }

        sc.close();



    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num * num);
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
