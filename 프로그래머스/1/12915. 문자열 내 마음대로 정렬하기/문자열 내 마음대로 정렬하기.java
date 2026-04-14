class Solution {
    public String[] solution(String[] strings, int n) {
        char[] chars = new char[strings.length];
        for(int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].charAt(n);
        }
        for(int i = strings.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(chars[j] > chars[j + 1] || (chars[j] == chars[j + 1] && strings[j].compareTo(strings[j + 1]) > 0)) {
                    char cnt = chars[j + 1];
                    chars[j + 1] = chars[j];
                    chars[j] = cnt;

                    String scnt = strings[j + 1];
                    strings[j + 1] = strings[j];
                    strings[j] = scnt;
                }
                if(chars[j] == chars[j + 1]) {

                }
            }
        }
        return strings;
    }
}