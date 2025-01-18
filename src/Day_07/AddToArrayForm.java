package Day_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {

        String str = """
                The array-form of an integer num is an array representing its digits in left to right order.
                For example, for num = 1321, the array form is [1,3,2,1].
                Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
                """;
        String example = """
                Example 1:
                
                Input: num = [1,2,0,0], k = 34
                Output: [1,2,3,4]
                Explanation: 1200 + 34 = 1234
                """;

        System.out.println(str);
        System.out.println(example);

        int[] A = {9,9,9,9,9,9,9,9,9,9};
        int K = 1;
        System.out.println(addToArrayForm(A, K));


    }

    public static List<Integer> addToArrayFormE(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int i = A.length - 1;
        int carry = 0;
        while (i >= 0 || K > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += A[i];
            }
            if (K > 0) {
                sum += K % 10;
                K /= 10;
            }
            result.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        if (carry != 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        long number = 0L;
        for(int digit: num){
            number = number * 10 + digit;
        }
        number += k;
        List<Long> value = new ArrayList<>();
        while ( number > 0){
            value.addFirst(number % 10);
            number /= 10;
        }
//        return value;
        List<Integer> result = new ArrayList<>();
        for (Long val: value){
            result.add(val.intValue());
        }
        return result;

    }
}
