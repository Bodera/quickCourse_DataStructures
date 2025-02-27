import java.util.Arrays;

public class Solution02 {
    
    public static int[] twoNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
           
            if (sum == targetSum) {
                return new int[] { array[left], array[right] };
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { };
    }
}
