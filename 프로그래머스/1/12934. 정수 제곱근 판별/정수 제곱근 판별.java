class Solution {
    public long solution(long n) {
			long answer = -1;
			long i = (long) Math.sqrt(n);
			if(i*i == n) {
				answer = i + 1;
				return answer*answer;
			}
			return answer;
		}
}