package Day_09;

import java.util.Scanner;

public class Mediana2Arrays {
    static int p1 = 0, p2 = 0;

    public static void main(String[] args) {
        String str = """
                Given two sorted arrays nums1 and nums2 of size m and n respectively,
                return the median of the two sorted arrays.
                The overall run time complexity should be O(log (m+n)).
                """;

        String example = """
                Example 1:
                
                Input: nums1 = [1,3], nums2 = [2]
                Output: 2.00000
                Explanation: merged array = [1,2,3] and median is 2.
                """;

        System.out.println(str);
        System.out.println(example);

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the first array: ");
            int m = sc.nextInt();
            int[] nums1 = new int[m];
            System.out.println("Enter the elements of the first array: ");
            for(int i = 0; i < m; i++){
                nums1[i] = sc.nextInt();
            }
            System.out.println("Enter the size of the second array: ");
            int n = sc.nextInt();
            int[] nums2 = new int[n];
            System.out.println("Enter the elements of the second array: ");
            for(int i = 0; i < n; i++){
                nums2[i] = sc.nextInt();
            }
            System.out.println("The median of the two sorted arrays is: " + findMedianSortedArrays(nums1, nums2));
        } catch (Exception e){
            System.out.println("Invalid Input");
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        // Si la suma de los dos arrays es par
        if((m + n) % 2 == 0){
            // Iteramos hasta la mitad de la suma de los dos arrays
            for(int i = 0; i < ((m+n)/ 2) -1  ; i++){
                int parallegar = getMin(nums1, nums2);
            }
            // Retornamos la suma de los dos elementos en la mitad de los dos arrays dividido entre 2
            return (double) (getMin(nums1, nums2) + getMin(nums1, nums2)) / 2;
        } else{
            // Si la suma de los dos arrays es impar iteramos hasta la mitad de la suma de los dos arrays
            for( int i = 0; i < (m + n )/2 ; i++){
                int parallegarxd = getMin(nums1, nums2);
            }
            return getMin(nums1, nums2);
        }
    }

    public static int getMin(int[] nums1, int[] nums2){
        // Si los punteros de los dos arrays son menores que la longitud de los arrays
        if(p1 < nums1.length && p2 < nums2.length){
            // Si el elemento en el puntero de nums1 es menor que el elemento en el puntero de nums2
            // entonces retornamos el elemento en el puntero de nums1 y aumentamos el puntero de nums1
            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        } else if (p1 < nums1.length){
            return nums1[p1++];
        } else if (p2 < nums2.length){
            return nums2[p2++];
        }
        return -1;
    }

}
