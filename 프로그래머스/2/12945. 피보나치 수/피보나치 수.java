class Solution {
    public int solution(int n) {
			int[] F = new int[n + 1];
			F[0] = 0;
			F[1] = 1;
			for (int i = 0; i < n - 1; i++) {
				F[i + 2] = (F[i] + F[i + 1]) % 1234567;
			}
			return F[n] % 1234567;
		}
}