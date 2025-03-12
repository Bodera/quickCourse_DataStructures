<div class="html">
<p>
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.
</p>
<p>
  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.
</p>
<p>
  You can assume that there will be at most one pair of numbers summing up to
  the target sum.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">array</span> = [3, 5, -4, 8, 11, 1, -1, 6]
<span class="CodeEditor-promptParameter">targetSum</span> = 10
</pre>
<h3>Sample Output</h3>
<pre>[-1, 11] <span class="CodeEditor-promptComment">// the numbers could be in reverse order</span>
</pre>
</div>

## Optimal Space & Time Complexity
O(n) time | O(n) space - where `n` is the length of the input array

### Solution 1

```java
import java.util.*;

class Program {
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

    return Arrays.stream(array).sum();
  }
}
```

This Java method finds two numbers in an array that add up to a given target sum. It uses a `HashMap` to store numbers as keys and their indices as values. For each number in the array, it checks if its complement (target sum minus the number) is already in the map. If it is, it returns an array containing the current number and its complement. If no such pair is found, it returns an empty array.

#### Good Space & Time Complexity
O(n log(n)) time | O(1) space - where `n` is the length of the input array

### Solution 2

```java
import java.util.*;

class Program {

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
  }
}
```

This Java method, `twoNumberSum()`, finds two numbers in a given array that add up to a specified target sum. It uses a two-pointer technique, sorting the array first and then moving the pointers from both ends towards the center until it finds a pair that sums up to the target. If no such pair is found, it returns an empty array.

#### Bad Space & Time Complexity
O(n^2) time | O(1) space - where `n` is the length of the input array

### Solution 3

```java
import java.util.*;

class Program {

  public static int[] twoNumberSum(int[] array, int targetSum) {

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == targetSum) {
          return new int[] { array[i], array[j] };
        }
      }
    }

    return new int[] {};
  }
}
```

This Java method, `twoNumberSum()`, finds two numbers in an input array that add up to a specified target sum. It uses a nested loop to check every pair of numbers in the array, returning the pair that sums up to the target. If no such pair is found, it returns an empty array.