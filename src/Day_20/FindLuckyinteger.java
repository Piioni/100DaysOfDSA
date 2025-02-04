package Day_20;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyinteger {
    public static void main(String[] args) {

        String str = """
                Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
                Return the largest lucky integer in the array. If there is no lucky integer return -1.""";

        String Example = """
                Example 1:
                
                Input: arr = [2,2,3,4]
                Output: 2
                Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
                """;

        System.out.println(str);
        System.out.println(Example);

        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));

        int[] arr2 = {1,2,2,3,3,3};
        System.out.println(findLucky(arr2));
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i : arr){
            if (dic.containsKey(i)){
                dic.replace((i), dic.get(i) + 1);
            } else dic.put(i, 1);
        }

        int lucky = -1;
        for ( int i : dic.keySet()){
            if ( i == dic.get(i)){
                if( i > lucky){
                    lucky = i;
                }
            }
        }
        return lucky;
    }
}
