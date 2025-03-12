package problem02;

import java.util.List;

class Solution01 {

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
