import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers) {
            HashSet<Integer> set = new HashSet<>();
            for(int i = numbers.length-1; i > 0; i--) {
                for(int j = 0; j <= i-1; j++) {
                    int num = numbers[i]+numbers[j];
                        set.add(num);
                }
            }
            ArrayList<Integer> answer = new ArrayList<>(set);
            Collections.sort(answer);
            return answer;
        }
}