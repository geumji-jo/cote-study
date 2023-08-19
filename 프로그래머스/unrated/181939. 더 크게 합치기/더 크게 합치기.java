class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String word1 = (a + "") + (b + "");
        String word2 = (b + "") + (a + "");
        if(Integer.parseInt(word1) >= Integer.parseInt(word2)) {
            answer = Integer.parseInt(word1);
        } else {
            answer = Integer.parseInt(word2);
            
        }
        return answer;
    }
}