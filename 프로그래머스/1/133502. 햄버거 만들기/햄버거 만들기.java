class Solution {
    public int solution(int[] ingredient) {
			int answer = 0;

			int[] stack = new int[ingredient.length];
			int n = 0;

			for (int i : ingredient) {
				stack[n++] = i;

				if (n >= 4 &&
					stack[n - 4] == 1 &&
					stack[n - 3] == 2 &&
					stack[n - 2] == 3 &&
					stack[n - 1] == 1) {

					n -= 4;
					answer++;
				}
			}
			return answer;
		}
}