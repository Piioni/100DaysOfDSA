package Day_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        String message = """
                Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
                You may assume that each input would have exactly one solution, and you may not use the same element twice.
                You can return the answer in any order.
                """;

        String example = """
                Example 1:
                Input: nums = [2,7,11,15], target = 9
                Output: [0,1]
                Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
                """;


        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];
        int target = 0;
        try {
            System.out.println(message);
            System.out.println(example);
            System.out.println("Enter the target number: ");
            target = scanner.nextInt();
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            nums = new int[size];
            System.out.println("Enter the elements of the array one by one: ");
            for(int i = 0; i < size; i++){
                nums[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        int[] indexes = twoSumHashMap(nums, target);

        System.out.println("[" + indexes[0] + ", " + indexes[1] + "]");
    }



    // Metodo mediante dos bucles
    public static int[] twoSumBucles(int[] nums, int target) {
        int[] indexes = new int[2];
        // Recorremos el array dos veces para encontrar los dos numeros que sumados den el target
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // Si la suma de los dos numeros es igual al target y el índice no es el mismo
                if (nums[i] + nums[j] == target && i != j) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    // Metodo mediante HashMap
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculamos el complemento de cada número
            int complement = target - nums[i];
            // Si el complemento está en el HashMap, devolvemos los índices
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }return new int[] {0, 0};
    }
}

