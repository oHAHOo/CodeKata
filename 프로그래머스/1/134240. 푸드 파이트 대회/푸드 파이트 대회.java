class Solution {
    public String solution(int[] food) {
            StringBuilder builder = new StringBuilder();
            builder.append('0');
            for(int i = food.length - 1; i >= 0; i--) {
                for(int j = 0; j < food[i]/2 ; j++){
                    builder.insert(0,i);
                    builder.insert(builder.length(),i);
                }
            }
            return builder.toString();
        }
}