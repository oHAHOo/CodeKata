class Solution {
    public String solution(String s) {
    String answer = "";
    String[] words = s.split(" ", -1);

    for (int i = 0; i < words.length; i++) {
        String[] chars = words[i].split("");

        for (int j = 0; j < words[i].length(); j++) {
            if (j % 2 == 0) {
                chars[j] = chars[j].toUpperCase();
            } else {
                chars[j] = chars[j].toLowerCase();
            }
            answer += chars[j];
        }
        if (i != words.length - 1) {
            answer += " ";
        }
    }
    return answer;
}
}