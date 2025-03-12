package problem02;

import java.util.List;

public class Solution02 {

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
