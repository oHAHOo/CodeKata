class Solution {
    public int solution(int n, int m, int[] section) {
			int answer = 0;
			int num = 0;

			for (int s : section) {
				if (s > num) {
					num = s + m - 1;
					answer++;
				}
			}
			return answer;
		}
}