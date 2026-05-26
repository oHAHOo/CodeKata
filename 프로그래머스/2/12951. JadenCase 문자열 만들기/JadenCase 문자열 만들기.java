class Solution {
    public String solution(String s) {
			String[] arr = s.split(" ", -1);

			for(int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) continue;
				arr[i] = arr[i].toLowerCase();
				char ch = Character.toUpperCase(arr[i].charAt(0));
				arr[i] = ch + arr[i].substring(1);
			}

			return String.join(" ", arr);
		}
}