import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (String str : intStrs) {
            int rs = Integer.parseInt(str.substring(s,s+l));
            if(rs > k) answer.add(rs);
        }
      
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}