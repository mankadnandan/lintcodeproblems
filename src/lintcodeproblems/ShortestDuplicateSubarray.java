package lintcodeproblems;

import java.util.HashMap;

/**
 * Created by Nandan Mankad on 27-09-20.
 */
public class ShortestDuplicateSubarray {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 1, 4, 5, 4, 6, 8};*/
        int[] arr = {1, 1};
        System.out.println(new ShortestDuplicateSubarray().getLength(arr));
    }

    public int getLength(int[] arr) {
        HashMap<Integer, Integer> valToIndexMap = new HashMap<>();
        int minResult = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (valToIndexMap.containsKey(arr[i])) {
                int len = i - valToIndexMap.get(arr[i]) + 1;
                minResult = Math.min(minResult, len);
            }
            valToIndexMap.put(arr[i], i);
        }
        return minResult == Integer.MAX_VALUE ? -1 : minResult;
    }
}
