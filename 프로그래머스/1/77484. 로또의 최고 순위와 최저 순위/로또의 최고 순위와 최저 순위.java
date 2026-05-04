class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
			int[] answer = new int[2];
			int count = 0;
			for(int i : win_nums) {
				for(int j : lottos) {
					if(i == j) {
						count++;
					}
				}
			}

			answer[1] = 7-count;
			for(int i : lottos) {
				if(i == 0) {
					count++;
				}
			}
			answer[0] = 7-count;
			if(answer[1] == 7)
				answer[1] = 6;
			if(answer[0] == 7)
				answer[0] = 6;
			return answer;
		}
}