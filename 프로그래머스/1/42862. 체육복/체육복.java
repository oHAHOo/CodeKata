import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int count = 0;
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) continue;
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == -1) continue;
                if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        for (int l : lost) {
            if (l != -1) count++;
        }
        
        return n - count;
    }
}