/*문자열 내 마음대로 정렬하기*/

package algorithm3;

import java.util.*;

class Solution {
	  public String[] solution(String[] strings, int n) {
	      String[] answer = {};
	      
	      LinkedList<String> list = new LinkedList<String>();
	     
	      for(int i=0; i<strings.length; i++) {
	    	  list.add(strings[i].charAt(n)+strings[i]);
	    	  
	      }
	      Collections.sort(list);
	      
	      answer = new String[list.size()];
	      for(int i=0; i<list.size(); i++) {
	    	  answer[i] = list.get(i).substring(1, list.get(i).length());
	      }
	      
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		Solution test = new Solution();
		String[] arr = {"sun", "bed", "car"};
		String[] arr2 = {"abcd", "abce", "cdx"};
		for(String i: test.solution(arr, 1)) {
			System.out.printf(i + " ");
		}
		System.out.println();
		for(String i: test.solution(arr2, 1)) {
			System.out.printf(i + " ");
		}
	}
}

