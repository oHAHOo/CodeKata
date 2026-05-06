import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(long n) {
			List<Integer> result = new ArrayList<>();
			while (n > 0) {
				result.add((int)(n % 10));
				n /= 10;
			}
			return result;
		}
}