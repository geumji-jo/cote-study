class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb_mid = new StringBuilder(my_string.substring(s, e+1));
        sb_mid.reverse();
        return my_string.substring(0,s) + sb_mid + my_string.substring(e+1, my_string.length());
    }
}