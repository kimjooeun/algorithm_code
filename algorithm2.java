/* 나누어 떨어지는 숫자 배열 */

package Solution;

import java.util.*;

public class Solution {
	public int[] solution(int[] arr, int divisor) {
	      
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0)
				list.add(arr[i]);
			
		}
		
		if(list.isEmpty()) {
			list.add(0, -1);
		}
		
		int answer[] = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
		
	  }
	
	public static void main(String[] args) {
		Solution test = new Solution();
		int[] arr= {5,9,7,10};
		int[] arr2= {2,36, 1,3};
		int[] arr3 = {3,2,6};
		
		for(int i: test.solution(arr, 5)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i: test.solution(arr2, 1)) {
			System.out.print(i + " ");
		}System.out.println();
		for(int i: test.solution(arr3, 10)) {
			System.out.print(i + " ");
		}
	}
}
