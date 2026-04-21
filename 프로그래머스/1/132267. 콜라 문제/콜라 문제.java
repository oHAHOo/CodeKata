class Solution {
    public int solution(int a, int b, int n) {
            int answer = 0;
            while (n / a >= 1) {
                int rate = n / a;
                answer += rate * b;
                n = (n % a) + rate * b;
            }
            return answer;
        }
}