<div class="BzHFKN85iSK6_k1lXqGC ae-workspace-dark"><div class="html">
<p>
  Given two non-empty arrays of integers, write a function that determines
  whether the second array is a subsequence of the first one.
</p>
<p>
  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For
  instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
  <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>. Note
  that a single number in an array and the array itself are both valid
  subsequences of the array.
</p>
<h3>Sample Input</h3>
<pre><span class="CodeEditor-promptParameter">array</span> = [5, 1, 22, 25, 6, -1, 8, 10]
<span class="CodeEditor-promptParameter">sequence</span> = [1, 6, -1, 10]
</pre>
<h3>Sample Output</h3>
<pre>true
</pre>
</div></div>

## Optimal Space & Time Complexity
O(n) time | O(1) space - where `n` is the length of the array

### Solution 1

```java
import java.util.*;

class Program {
  
  public static boolean isValidSubsequence(List<Integer> array, 
                                            List<Integer> sequence) {
    int arrIdx = 0;
    int seqIdx = 0;

    while (arrIdx < array.size() && seqIdx < sequence.size()) {
      if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
        ++seqIdx;
      }
      ++arrIdx;
    }

    return seqIdx == sequence.size();
  }
}
```

This Java function checks if a given `sequence` is a subsequence of the `array`. It iterates through both lists simultaneously, incrementing the `sequenceIndex` only when a match is found. The function returns true if all elements in the sequence are found in the array in the same order, and false otherwise.

#### Optimal Space & Time Complexity
O(n log(n)) time | O(1) space - where `n` is the length of the input array

### Solution 2

```java
import java.util.*;

class Program {

  public static boolean isValidSubsequence(List<Integer> array, 
                                            List<Integer> sequence) {
    int seqIdx = 0;

    for (int num : array) {
      if (seqIdx == sequence.size()) break;

      if (num == sequence.get(seqIdx)) ++seqIdx;
    }

    return seqIdx == sequence.size();
  }
}
```

This Java function uses the same logic presented on **Solution 01** using a for loop.

#### Optimal Space & Time Complexity
O(n log(n)) time | O(1) space - where `n` is the length of the input array
