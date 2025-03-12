package problem01;
import java.util.*;

class Solution01 {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                return new int[] { num, complement };
            }
            map.put(num, i);
        }

        return new int[] {};
    }
}