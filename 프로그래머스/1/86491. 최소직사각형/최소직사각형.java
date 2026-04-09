class Solution {
    public int solution(int[][] sizes) {
        int wmax = 0;
        int hmax = 0;
        for (int size[] : sizes){
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            wmax = Math.max(w, wmax);
            hmax = Math.max(h, hmax);
        }
        int answer = 0;
        answer = wmax*hmax;
        return answer;
    }
}