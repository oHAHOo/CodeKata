class Solution {
    public int[] solution(String s) {
			int count = 0;
			int zero = 0;
			while(true){
				count++;
				int beforeLength = s.length();
				s = s.replaceAll("0", "");
				int afterLength = s.length();
				zero = zero + beforeLength - afterLength;
				s = Integer.toBinaryString(afterLength);
				if (s.equals("1"))
					break;
			}
			return new int[] {count, zero};
		}
}