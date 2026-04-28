import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
			int[] first = {1, 2, 3, 4, 5};
			int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
			int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
			int firstCount = 0;
			int secondCount = 0;
			int thirdCount = 0;

			for (int i = 0; i < answers.length; i++) {
				if (answers[i] == first[i % first.length])
					firstCount++;
				if (answers[i] == second[i % second.length])
					secondCount++;
				if (answers[i] == third[i % third.length])
					thirdCount++;
			}
			int max = Math.max(firstCount, Math.max(secondCount, thirdCount));

			List<Integer> list = new ArrayList<>();
			if (firstCount == max)
				list.add(1);
			if (secondCount == max)
				list.add(2);
			if (thirdCount == max)
				list.add(3);

			return list.stream().mapToInt(Integer::intValue).toArray();
		}
}