/*같은 숫자는 싫어*/

package algorithm1;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++) {
        	if(arr[i] != arr[i-1]) {
        		list.add(arr[i]);
        	}
        }
        
        int[] answer= new int[list.size()];
        for(int i=0; i<list.size(); i++)
        	answer[i]=list.get(i);
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution test = new Solution();
    	int []arr = {1,1,3,3,0,1,1};
    	for(int i:test.solution(arr)) {
    		System.out.print(i);
    	}
	}
}
