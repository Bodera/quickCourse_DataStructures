package problem01;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Solution03Test {
    @Test
    public void TestCase1() {
        int[] input = new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    public void TestCase2() {
        int[] input = new int[] {4, 6};
        int targetSum = 10;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 6));
    }

    @Test
    public void TestCase3() {
        int[] input = new int[] {4, 6, 1};
        int targetSum = 5;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 1));
    }

    @Test
    public void TestCase4() {
        int[] input = new int[] {4, 6, 1, -3};
        int targetSum = 3;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 6));
        assertTrue(contains(output, -3));
    }

    @Test
    public void TestCase5() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 17;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 8));
        assertTrue(contains(output, 9));
    }

    @Test
    public void TestCase6() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int targetSum = 18;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 3));
        assertTrue(contains(output, 15));
    }

    @Test
    public void TestCase7() {
        int[] input = new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int targetSum = -5;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, 0));
        assertTrue(contains(output, -5));
    }

    @Test
    public void TestCase8() {
        int[] input = new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 163;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 2);
        assertTrue(contains(output, -47));
        assertTrue(contains(output, 210));
    }

    @Test
    public void TestCase9() {
        int[] input = new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 164;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 0);
    }

    @Test
    public void TestCase10() {
        int[] input = new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 15;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 0);
    }

    @Test
    public void TestCase11() {
        int[] input = new int[] {14};
        int targetSum = 15;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 0);
    }

    @Test
    public void TestCase12() {
        int[] input = new int[] {15};
        int targetSum = 15;

        int[] output = Solution03.twoNumberSum(input, targetSum);

        assertTrue(output.length == 0);
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
