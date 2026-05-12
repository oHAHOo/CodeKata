class Solution {
    public boolean solution(int x) {
			int sum = 0;
			String arr[] = String.valueOf(x).split("");
			for (String i : arr) {
				sum += Integer.parseInt(i);
			}
			if (x % sum == 0) {
				return true;
			}
			return false;
		}
}