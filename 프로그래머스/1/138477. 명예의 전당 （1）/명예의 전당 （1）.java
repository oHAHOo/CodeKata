import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < score.length; i++) {
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                if (arr.size() > k) {
                    arr.remove(arr.size() - 1);
                }
                answer[i] = arr.get(arr.size() - 1);
            }
            return answer;
        }
}