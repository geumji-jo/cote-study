import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder str = new StringBuilder(my_string);
        for(int i = 0; i <queries.length; i ++) {
            String a = str.substring(queries[i][0],queries[i][1]+1);   
            StringBuilder s = new StringBuilder(a);
            s.reverse();
            str.replace(queries[i][0],queries[i][1]+1, s.toString());
        }
        return str.toString();
    }
}