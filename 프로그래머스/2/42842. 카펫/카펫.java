class Solution {
    public int[] solution(int brown, int yellow) {
			int outline = (brown / 2) + 2;
			int x = outline - 3;
			int y = 3;

			while (x >= y) {
				if ((x - 2) * (y - 2) == yellow)
					return new int[] {x, y};
				x--;
				y++;
			}
			return null;
		}
}