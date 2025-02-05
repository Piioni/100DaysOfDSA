package Day_24;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

        String Str = """
                Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
                
                [4,5,6,7,0,1,2] if it was rotated 4 times.
                [0,1,2,4,5,6,7] if it was rotated 7 times.
                Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
                
                Given the sorted rotated array nums of unique elements, return the minimum element of this array.
                
                You must write an algorithm that runs in O(log n) time.
                """;

        String example = """
                Example 1:
                
                Input: nums = [4,5,6,7,0,1,2]
                Output: 0
                Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
                """;

        System.out.println(Str);
        System.out.println(example);

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println("The minimum element in the array is: " + findMin(nums));
        }
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        // Si el array no está rotado o tiene un solo elemento
        if (nums[right] > nums[left] || nums.length == 1) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2; // Evita overflow

            // Verificar si mid es el mínimo
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // Verificar si el siguiente elemento es el mínimo
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Ajustar los límites según la rotación
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
